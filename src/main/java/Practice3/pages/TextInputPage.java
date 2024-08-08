package Practice3.pages;


import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage extends BasePage {

    private SelenideElement inputText = $x( "//input[@id='newButtonName']" );
    private SelenideElement button = $x( "//button[@id='updatingButton']" );


    public String setText(String textToType) {

        inputText.sendKeys( textToType );
        button.click();
        return textToType;
    }

    public String getTextFromButton() {

        return button.getText();
    }
}
