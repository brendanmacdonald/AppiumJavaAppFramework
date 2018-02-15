package Framework;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    @BeforeMethod
    @Parameters({"localTest", "serverURL", "deviceName", "platformName", "platformVersion", "testobject_api_key", "appLocation"})
    public void setUpDeviceDriver( String localTest,
                            String serverURL,
                            String deviceName,
                            String platformName,
                            String platformVersion,
                            String testobject_api_key,
                            String appLocation) throws MalformedURLException {

        // Define the URL for the Appium or TestObject server.
        URL url = new URL(serverURL);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM, platformName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.APP, appLocation);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);

        // Only required to launch local emulators.
        if (Boolean.parseBoolean(localTest) ) {
            capabilities.setCapability("avd", deviceName);
        }
        else {
            // Only relevant when running tests remotely on https://testobject.com/.
            capabilities.setCapability("testobject_api_key", testobject_api_key);
        }

        // Initialize the driver.
        App.driver = new AndroidDriver<MobileElement>(url, capabilities);

        // Implicit timeout.
        App.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDownAppium() {
        App.driver.quit();
    }

    @AfterTest
    public void restartApp() {
        //App.driver.resetApp();
    }
}
