package Practice2.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;


public class FramesTest extends BaseTest {


    @Test
    public void framesTest() {
        driver.switchTo().newWindow( WindowType.TAB );
        driver.get(getFromProperties( "frameUrl"   ));


        driver.switchTo().frame(0).findElement( framesPage.frame1Input ).sendKeys( "Я" );
        driver.switchTo().defaultContent(); // чтобы попасть в след фрейм надо вернуться на главную страницу
        driver.switchTo().frame(1).findElement( framesPage.frame2Input ).sendKeys( "Разобрался" );
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2).findElement( framesPage.frame3Input ).sendKeys( "Как" );
        driver.switchTo().defaultContent();
        driver.switchTo().frame(3).findElement( framesPage.frame4Input ).sendKeys( "Это" );
        driver.switchTo().defaultContent();
        driver.switchTo().frame(4).findElement( framesPage.frame5Input ).sendKeys( "Делать" );
        driver.switchTo().defaultContent();



        System.out.println("Test OK");

    }
}
