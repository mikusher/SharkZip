# SharkZip
Make the folder zip, already with application of deletions.


#
We recommend having Java as up-to-date as possible ever. 
This application is being compiled in version (52 = Java 8), taking into account the popularity of this version.

### Release version:
💬 [**v3**](https://github.com/mikusher/SharkZip/releases/download/v3/SharkZip_v3.jar) 
- *Add more files to exclusion list*
- *Add check box, folder exclusion*
- Standard Folder Excluded:
    - .*
    - debug
    - *test
    - *spec
    - dist
    - swagger
    - docs
    - *tests
    - lib
    - node_modules
    - plugins
    - build
    - deploy
    - dist
    - unit
    - logs
    - coverage
    - cache
    - .git
<img src="https://user-images.githubusercontent.com/3151021/94705424-f2b60880-0338-11eb-8fb8-e74fbf336515.png" width="450" height="120">


💬 [**v2**](https://github.com/mikusher/SharkZip/releases/download/v2/SharkZip_v2.jar) 
- *fix count total files excluded;*
- *add new exclusion file (.ini, .cbl, Test., PSQL.dll, .MF, .project, .component, .ec, .cbl);*
- *add folder exclusion by semicolon ( ; ) -> "uses the folder name without wildcard character";*
<img src="https://user-images.githubusercontent.com/3151021/90055862-ed8ff200-dcd5-11ea-8a78-5aa591d022ca.png" width="450" height="120">


💬 [**v1**](https://github.com/mikusher/SharkZip/releases/download/v01/SharkZip_v1.jar) 
- *delete files from folders;*
- *create the **Zip** of a folder;*


### How to use:
1. Downloads the last version [SharkZip](https://github.com/mikusher/SharkZip/releases/download/v2/SharkZip_v2.jar) 

2. Runs the jar file normally
- Right click on the Jar file
- goes on Open With:
- Java(TM) Platform SE Binary

<img src="https://user-images.githubusercontent.com/3151021/89665056-f8124c00-d8cf-11ea-9520-f5beb12866ed.png" width="450" height="120">

#
## Another option
-> Executes the command, on your terminal:
$ java -jar SharkZip_vXX.jar
<img src="https://user-images.githubusercontent.com/3151021/89664977-db761400-d8cf-11ea-82c5-f72c61323801.png" width="450" height="120">


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
<img src="https://user-images.githubusercontent.com/3151021/89667613-5b05e200-d8d4-11ea-89cb-3e47e072932d.png" width="450" height="120">

### Default Exclusion List:
//others
- **/*~
- **/#*#
- **/.#*
- **/%*%
- **/._*
- *.cbl
- *.ec
- *.component
- *.project
- *.MF
- PSQL.dll
- *Test.*

//fonts
- *.eot
- *.ttf
- *.woff
- *.woff2

//Visual SourceSafe
- **/vssver.scc

//Subversion
- **/.svn
- **/.svn/**
- *.gitignore
- *.dockerignore

//Mac
- **/.DS_Store

//exec fils and compile
- *.exe
- *.msi
- *.cmd
- *.dll
- *.bat
- *.sln
- *.md
- *.csproj
- *.cache
- *.ini

// js/css minifile
- *.min.js
- *.min.js.map
- *jquery.js
- *.bootstrap.js
- *jquery.min.map
- *.css
- *.min.css
- *.min.css.map

//files
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

//documentation
- *.docx
- *.doc
- *.xlsx
- *.csv

//database file
- *.db
- *.sqlite
- *.dylib
