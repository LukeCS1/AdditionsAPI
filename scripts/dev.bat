@Echo off
rem THIS BATCH SCRIPT SIMPLY MAKES TESTING EASIER
rem IT IS NOT REQUIRED FOR COMPILATION
rem IF YOU WANT TO USE IT, CHANGE THE DIRECTORIES TO YOUR TEST SERVER'S PLUGIN FOLDER
rem THE SCRIPT WILL COPY THE MAVEN BUILD INTO THE FOLDER AUTOMAGICALLY
rem DON'T FORGET TO USE THE 'development' PROFILE!
echo Apply Script: COPY
echo %1
echo F|xcopy /y /s /f /q "%1" "C:\Users\chris\Test Servers\Spigot 1.9\plugins\AdditionsAPI.jar"
echo F|xcopy /y /s /f /q "%1" "C:\Users\chris\Test Servers\Spigot 1.12.2\plugins\AdditionsAPI.jar"