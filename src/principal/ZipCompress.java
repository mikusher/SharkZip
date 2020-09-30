/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * @author Luis Tavares
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.tools.ant.DirectoryScanner;

public class ZipCompress {

    static int countFiles;

    public static int compressRx(String dirPath, List<String> exclusions, boolean applyDefault, boolean userDefaultFolder, List<String> directoriesExclusions) {
        final Path sourceDir = Paths.get(dirPath);
        String zipFileName = dirPath.concat(".zip");


        List<String> finalExclusionList = (applyDefault) ? DefaultToRemove.mergeToDefaultList(exclusions) : exclusions;
        List<String> finalDirectoriesExclusions = (userDefaultFolder) ? DefaultToRemove.mergeToFolderDir(directoriesExclusions) : directoriesExclusions;

        System.out.println("Exclusion Applied:\n" + finalExclusionList.toString() + "\n");
        System.out.println("Folder to Ignore:\n" + finalDirectoriesExclusions.toString() + "\n");

        File[] fRm = filesToExcluding(sourceDir.toString(), finalExclusionList);
        List<File> filesToRemove = Arrays.asList(fRm);

        try {
            countFiles = 0;

            final ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFileName));

            Files.walkFileTree(sourceDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    String dirName = dir.getFileName().toString();
                    if (!finalDirectoriesExclusions.isEmpty()) {
                        for (String excl : finalDirectoriesExclusions) {
                            if (excl != null && !excl.equals("") && dirName.equals(excl)) {
                                System.out.println("Dir Ignored: " + dir.toString());
                                return FileVisitResult.SKIP_SUBTREE;
                            }
                        }
                        outputStream.closeEntry();
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {

                    if (filesToRemove.contains(file.toFile())) {
                        countFiles++;
                        System.out.println("File Ignored: " + file.toString());
                    } else {
                        try {
                            Path targetFile = sourceDir.relativize(file);
                            outputStream.putNextEntry(new ZipEntry(targetFile.toString()));
                            byte[] bytes = Files.readAllBytes(file);
                            outputStream.write(bytes, 0, bytes.length);
                            outputStream.closeEntry();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return FileVisitResult.CONTINUE;
                    }
                    return FileVisitResult.CONTINUE;
                }

            });
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countFiles;
    }

    private static File[] filesToExcluding(final String sourceDir, List<String> exlcusions) {
        List<String> myList = new ArrayList<>();

        DirectoryScanner scanner = new DirectoryScanner();

        for (Object exlcusion : exlcusions) {
            myList.add(String.format("**/%s", exlcusion.toString()));
        }

        String[] arr = myList.toArray(new String[myList.size()]);
        scanner.setIncludes(arr);

        scanner.setBasedir(sourceDir);
        scanner.setCaseSensitive(false);
        scanner.scan();

        String[] allPaths = scanner.getIncludedFiles();
        List<File> allFiles = new ArrayList<>();
        String[] directories = scanner.getIncludedDirectories();
        for (String directory : directories) {
            allFiles.add(new File(sourceDir, directory));
        }

        for (int i = 0; i < allPaths.length; i++) {
            File file = new File(sourceDir, allPaths[i]);
            if (!allFiles.contains(file.getParentFile())) {
                allFiles.add(file);
            }
        }
        return allFiles.toArray(new File[]{});
    }
}
