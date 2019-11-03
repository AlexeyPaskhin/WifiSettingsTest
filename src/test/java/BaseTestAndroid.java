





import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTestAndroid {

    public WebDriver driver = null;


    MainPage mainPage;

    @BeforeClass
    public void setUp() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        caps.setCapability("appPackage", "com.example.myapplication");
        caps.setCapability("appActivity", "MainActivity");


        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
    }


    @AfterClass
    public void shutDown() {
        driver.quit();
    }

}
