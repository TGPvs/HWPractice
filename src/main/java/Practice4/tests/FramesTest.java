package Practice4.tests;//package Lesson4.tests;
//
//
//import com.codeborne.selenide.Selenide;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WindowType;
//import org.testng.annotations.Test;
//
//import static com.codeborne.selenide.Selenide.open;
//
//public class FramesTest extends BaseTest {
//
//
//    @Test
//    public void framesTest() {
//        Selenide.switchTo().newWindow( WindowType.TAB );
//        open(getFromProperties( "frameUrl"   ));
//
//        Selenide.switchTo().frame(0).findElement( framesPage.frame1Input.sendKeys( "Это фрейм 1" );
//        Selenide.switchTo().defaultContent();
//        Selenide.switchTo().frame(1).findElement( framesPage.frame2Input ).sendKeys( "Это фрейм 2" );
//        Selenide.switchTo().defaultContent();
//        Selenide.switchTo().frame(driver.findElement( By.xpath("//frame[@src='frame_3.html']")));
//        Selenide.findElement( framesPage.frame3Input ).sendKeys( "Это фрейм 3" );
//        Selenide.switchTo().defaultContent();
//        Selenide.switchTo().frame(3).findElement( framesPage.frame4Input ).sendKeys( "Это фрейм 4" );
//        Selenide.switchTo().defaultContent();
//        Selenide.switchTo().frame(4).findElement( framesPage.frame5Input ).sendKeys( "Это фрейм 5" );
//        Selenide.switchTo().defaultContent();
//
//
//        System.out.println("test");
//
//    }
//}
