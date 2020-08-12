/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LuisT
 */
public class DefaultToRemove {


    /**
     * @param exclusions
     * @return
     */
    public static List<String> mergeToDefaultList(List<String> exclusions) {

        exclusions.removeAll(Arrays.asList("", null));

        List<String> standardList = new ArrayList<>();
        //others
        standardList.add("**/*~");
        standardList.add("**/#*#");
        standardList.add("**/.#*");
        standardList.add("**/%*%");
        standardList.add("**/._*");
        standardList.add("*.cbl");
        standardList.add("*.ec");
        standardList.add("*.component");
        standardList.add("*.project");
        standardList.add("*.MF");
        standardList.add("PSQL.dll");
        standardList.add("*Test.*");
        //fonts
        standardList.add("*.eot");
        standardList.add("*.ttf");
        standardList.add("*.woff");
        standardList.add("*.woff2");
        // Visual SourceSafe
        standardList.add("**/vssver.scc");
        // Subversion
        standardList.add("**/.svn");
        standardList.add("**/.svn/**");
        standardList.add("*.gitignore");
        standardList.add("*.dockerignore");
        // Mac
        standardList.add("**/.DS_Store");
        //exec fils and compile
        standardList.add("*.exe");
        standardList.add("*.msi");
        standardList.add("*.cmd");
        standardList.add("*.dll");
        standardList.add("*.bat");
        standardList.add("*.sln");
        standardList.add("*.md");
        standardList.add("*.csproj");
        standardList.add("*.cache");
        standardList.add("*.ini");
        // js/css minifile
        standardList.add("*.min.js");
        standardList.add("*.min.js.map");
        standardList.add("*jquery.js");
        standardList.add("*.bootstrap.js");
        standardList.add("*jquery.min.map");
        standardList.add("*.css");
        standardList.add("*.min.css");
        standardList.add("*.min.css.map");
        //files
        standardList.add("*.jpeg");
        standardList.add("*.png");
        standardList.add("*.bmp");
        standardList.add("*.ico");
        standardList.add("*.svg");
        standardList.add("*.mp3");
        standardList.add("*.mp4");
        standardList.add("*.webm");
        standardList.add("*.avi");
        standardList.add("*.zip");
        standardList.add("*.rar");
        standardList.add("*.7z");
        standardList.add("*.pdf");
        standardList.add("*.iso");
        standardList.add("*.jar");
        standardList.add("*.apk");
        standardList.add("*.yml");
        //documentation
        standardList.add("*.docx");
        standardList.add("*.doc");
        standardList.add("*.xlsx");
        standardList.add("*.csv");
        //database file
        standardList.add("*.db");
        standardList.add("*.sqlite");
        standardList.add("*.dylib");


        return new ArrayList<String>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                addAll(exclusions);
                addAll(standardList);
            }
        };

    }

    ;

}
