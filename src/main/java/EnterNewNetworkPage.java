import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterNewNetworkPage extends AbstractPage {

    @FindBy(id = "enterSsidField")
    WebElement enterSsidField;
    @FindBy(id = "submitNewWifiButton")
    WebElement submitNewWifiButton;


    public EnterNewNetworkPage(WebDriver driver) {
        super(driver);
    }

    public EnterNewNetworkPage fillNewNetworkName(String title) {
        enterSsidField.sendKeys(title);
        driver.navigate().back();
        return this;
    }

    public MainPage submitNewNetwork() {
//        submitNewWifiButton.sendKeys("kj");
        submitNewWifiButton.click();
        return new MainPage(driver);
    }

}
