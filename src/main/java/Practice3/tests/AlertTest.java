package Practice3.tests;


import Practice3.pages.HomePage;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;


public class AlertTest extends BaseTest {

    @Test
    public void alertTest() {
        homePage.getTestDirectory( HomePage.Links.ALERTS );

        alertsPage.clickAlert();
        Selenide.switchTo().alert().accept();

        //5 = это Пятница
        int day = LocalDate.now().getDayOfWeek().getValue();

        if (day == 5) {
            Selenide.switchTo().alert().accept();
        } else {
          Selenide.switchTo().alert().dismiss();
            Selenide.switchTo().alert().accept();
        }

        String textToType = "cats";
        String expected = "User value: %s";

        alertsPage.clickPrompt();
        Selenide.switchTo().alert().sendKeys(textToType);
        Selenide.switchTo().alert().accept();
        Selenide.switchTo().alert().accept();
        String actual = Selenide.switchTo().alert().getText();
        Selenide.switchTo().alert().accept();


        Assert.assertEquals(String.format(expected,textToType), actual);
    }
}