package Practice4.tests;

import Lesson4.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextInputTest extends BaseTest {

    // для тестов нужны конкретные страницы. Поэтому нужно их Инициализивровать.




    @Test
    public void textInputTest() {
        homePage.getTestDirectory( HomePage.Links.TEXT_INPUT ); //найти импут
        String startButtonValue = textInputPage.getTextFromButton(); // проверить начальный текст копки


        String expectedText = textInputPage.setText( "HelloWorld" ); // ввести текст
        String actualText = textInputPage.getTextFromButton(); // сравнить текст на кнопке с виденой

        Assert.assertEquals( expectedText, actualText );
        Assert.assertNotEquals( startButtonValue, actualText );

    }
}
