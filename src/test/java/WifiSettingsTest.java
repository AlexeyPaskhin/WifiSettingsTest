import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.UUID;

public class WifiSettingsTest extends BaseTestAndroid {



    @Test
    public void test() {

        String succesfulStatusMessage = "Selected network enabled successfully";
        String testNetWorkName = UUID.randomUUID().toString();
        System.out.println(testNetWorkName);

        mainPage.clickAddWifi()
                .fillNewNetworkName(testNetWorkName)
                .submitNewNetwork();

        List<WebElement> drawedTitles = driver.findElements(By.xpath("//android.widget.ListView/android.widget.TextView"));
        boolean newNetAppeared = false;
        WebElement newNet = null;
        for (WebElement el : drawedTitles) {
            if (el.getText().equals(testNetWorkName)) {
                newNetAppeared = true;
                newNet = el;
                break;
            }
        }
        Assert.assertTrue(newNetAppeared, "newly added network isn't displayed!!!");

        newNet.click();

        Assert.assertTrue(mainPage.statusMessage.getText().equalsIgnoreCase(succesfulStatusMessage));

    }
}
