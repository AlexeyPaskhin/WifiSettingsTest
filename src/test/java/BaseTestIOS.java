import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTestIOS {

    public WebDriver driver = null;


    MainPage mainPage;

    @BeforeClass
    public void setUp() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();


        File appDir = new File("/src/main/java/resources");
        File app = new File(appDir, "[TITLE OF THE APP].app");


        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.2");
        caps.setCapability(MobileCapabilityType.PLATFORM, "MAC");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "xxxxx");
        caps.setCapability("udid", "xxxxxxxxxxxxxxxxxxxxxxxxx");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());


        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
    }


    @AfterClass
    public void shutDown() {
        driver.quit();
    }
}
