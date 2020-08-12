# SharkZip
Make the folder zip, already with application of deletions.


#
We recommend having Java as up-to-date as possible ever. 
This application is being compiled in version (52 = Java 8), taking into account the popularity of this version.

To use:
1. downloads the current version [SharkZip](https://github.com/mikusher/SharkZip/releases/download/v2/SharkZip_v2.jar) 

2. Runs the jar file normally
![image](https://user-images.githubusercontent.com/3151021/89665479-af0ec780-d8d0-11ea-9019-ee2b59fb03df.png)
![image](https://user-images.githubusercontent.com/3151021/89665056-f8124c00-d8cf-11ea-9520-f5beb12866ed.png)

#
## Another option
-> Executes the command, on your terminal:
$ java -jar SharkZip_v1.jar
![image](https://user-images.githubusercontent.com/3151021/89664977-db761400-d8cf-11ea-82c5-f72c61323801.png)


### Adds the files that you want to remove.
It can be done using expressions and each element must be separated by semicolon ( ; )


😄
``` x
Data entry in the application:
💬 Folder Dir: 
- you need to click Browser and choose the folder you want.

💬 Files to Excluding: 
- adds the names of the desired files to be removed, separated by point and virgula.
You can use expressions as an example (*.json or *.min.*) to remove all files that end with json or that have .min.

💬 Apply Default Exclusion: 
- we have an internal list already pre defined with some files that could be found and deleted, 
👋 recommend enabling this option if you want to remove more unwanted elements.  

💬 Zip Dir:
- zips the desired folder by applying the exclusions.

```
## Final Execution
![image](https://user-images.githubusercontent.com/3151021/89667613-5b05e200-d8d4-11ea-89cb-3e47e072932d.png)

### Default Exclusion List:
// Others
- *.cbl 
- *.ec 
- *Test.* 
- **/*~ 
- **/#*# 
- **/.#* 
- **/%*% 
- **/._* 

// Fonts
- *.eot 
- *.ttf 
- *.woff 
- *.woff2 

// Visual SourceSafe
- **/vssver.scc 

// Subversion
- **/.svn 
- **/.svn/** 
- *.gitignore 
- *.dockerignore 

// Mac
- **/.DS_Store 

// Exec fils and compile
- *.exe 
- *.msi 
- *.cmd 
- *.dll 
- *.bat 
- *.sln 
- *.md 
- *.csproj 
- *.cache 

// Js/Css minifile
- *.min.js 
- *.min.js.map 
- *jquery.js 
- *.bootstrap.js 
- *jquery.min.map 
- *.css 
- *.min.css 
- *.min.css.map 

//Files
- *.jpeg 
- *.png 
- *.bmp 
- *.ico 
- *.svg 
- *.mp3 
- *.mp4 
- *.webm 
- *.avi 
- *.zip 
- *.rar 
- *.7z 
- *.pdf 
- *.iso 
- *.jar 
- *.apk 
- *.yml 

//Documentation
- *.docx 
- *.doc 
- *.xlsx 
- *.csv 

//Database files
- *.db 
- *.sqlite 
- *.dylib 
