ECHO ON
CALL color b9
CALL Powershell.exe -executionpolicy remotesigned -File  allure-results-folder-deletion.ps1
CALL mvn clean verify
CALL mvn allure:report
PAUSE