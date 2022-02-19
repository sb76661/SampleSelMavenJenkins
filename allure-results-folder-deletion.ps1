$currentLocation = (Get-Location).Path
$allureResultsFolderLocation1 = $currentLocation+ '\allure-results'
$screenshotsFolderLocation1 = $currentLocation+ '\Screenshots'

if ((Test-Path $screenshotsFolderLocation1)) {
Remove-Item -Path $screenshotsFolderLocation1 -Force -Recurse -ErrorAction SilentlyContinue
}

if ((Test-Path $allureResultsFolderLocation1)) {
Remove-Item -Path $allureResultsFolderLocation1 -Force -Recurse -ErrorAction SilentlyContinue
}

