package Practice3.pages;


import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {



    String linkPattern = "//h3/a[text()='%s']";

    public void getTestDirectory(Links targetLinks) {
       $x(String.format(linkPattern, targetLinks.linkValue)).click();
    }



    public enum Links{
        TEXT_INPUT( "Text Input"),
        DYNAMIC_TABLE( "Text Input"),
        MOUSE_OVER( "Mouse Over"),
        ALERTS("Alerts");


        final String  linkValue;
        Links(String s) {
            linkValue = s;
        }
    }
}