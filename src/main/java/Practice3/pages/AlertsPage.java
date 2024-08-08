package Practice3.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class AlertsPage extends BasePage {

    SelenideElement alertButton = $x( "//button[@id='alertButton']" );
    SelenideElement alertConfirm = $x( "//button[@id='alertButton']" );
    SelenideElement alertPrompt = $x( "//button[@id='promptButton']" );


    public void clickAlert() {
        alertButton.click();

    }

    public void clickConfirm() {
        alertConfirm.click();

    }

    public void clickPrompt() {
        alertPrompt.click();

    }

}
