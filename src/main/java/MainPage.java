import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @FindBy(id = "addWifi")
    WebElement addWifiButton;
    @FindBy(id = "statusMessage") WebElement statusMessage;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public EnterNewNetworkPage clickAddWifi() {
        addWifiButton.click();
        return new EnterNewNetworkPage(driver);
    }
}
