package Practice4.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MouseOverPage extends BasePage {

    SelenideElement linkClick = $x( "//a[@title='Active Link']" );
    SelenideElement clickCount = $x( "//span[@id='clickCount']" );

    // методы взаимодействия"
    public void doubleClick(int count) {
        for ( int i = 0; i < count; i++ ) { //Добавили счетчик даблкликов
            linkClick.doubleClick();
        }

    }

    public String getClickCount() {
        return clickCount.getText();
    }
}
