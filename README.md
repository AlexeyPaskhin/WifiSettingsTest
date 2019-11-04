# WifiSettingsTest

How to run the code: 
1. set up the env for running tests for android (java, android stuff, appium etc.)
2. launch appium server
3. go to src/main/resources/app-debug.apk - copy this app - it will be out AUT, install it on your android emulator
4. go to the WifiSettingsTest class - that is the class containing the driver code. run the test() method to start the test
 P.S. if you wanna launch the test for iOS device - firstly set up the env for it and change parent class for the WifiSettingsTest class.
 currently it extends the BaseTestAndroid class, you will need to extend the BaseTestIOS class 
