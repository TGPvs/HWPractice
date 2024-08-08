package Practice3.tests;


import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class FramesTest extends BaseTest {


    @Test
    public void framesTest() {


        Selenide.switchTo().newWindow(WindowType.TAB);
        open(getFromProperties("frameUrl"));  // тут не уверен нужен ли он, потому что чутка путаюсь если мы в бифо классе бейс теста вызываем

        Selenide.switchTo().frame(0);
        $(framesPage.frame1Input).setValue("Я");
        switchTo().defaultContent();

        Selenide.switchTo().frame(1);
        $(framesPage.frame2Input).setValue("Разобрался");
        switchTo().defaultContent();

        Selenide.switchTo().frame($x("//frame[@src='frame_3.html']"));
        $(framesPage.frame3Input).setValue("Как");
        Selenide.switchTo().defaultContent();

        Selenide.switchTo().frame(3);
        $(framesPage.frame4Input).setValue("Это");
        Selenide.switchTo().defaultContent();

        Selenide.switchTo().frame(4);
        $(framesPage.frame5Input).setValue("Делать");
        Selenide.switchTo().defaultContent();

        System.out.println("TEST OK");
    }
}
