package Practice3.tests;

import Lesson4.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseOverTest extends BaseTest {

    @Test
    public void doubleClickTest() throws InterruptedException {
        homePage.getTestDirectory(HomePage.Links.MOUSE_OVER);

        int clickCount = 6;
        int expectedClickCount = clickCount * 2;

        mouseOverPage.doubleClick(clickCount);
        String actual = mouseOverPage.getClickCount();

        Assert.assertEquals(actual,String.valueOf(expectedClickCount));
    }
}