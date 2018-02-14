# Appium Java Framework

Sample framework for running tests on Android emulators and real Android devices.
All of the tests run in an app, and perform some basic tests.

## Requirements
1. Install the Android SDK.
2. Create an emulator.
3. Install Appium.
4. Install NodeJS.
5. Get the sample ContactManager.apk from here: https://github.com/appium/sample-apps/tree/master/pre-built.

## Execution
1. Start Appium Server:
```
appium
```
2. Execute the tests:
```
mvn test -DdeviceName=Nexus_5X_API_26 -Dplatform=Android -DappLocation="<your local path to the .apk file>ContactManager.apk"
```
3. To run on a physical device, execute the following to get a connected device name, and substitute it in point 2 above:
```
adb devices
```





