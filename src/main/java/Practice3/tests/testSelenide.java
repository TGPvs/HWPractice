package Practice3.tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class testSelenide {
    @Test
    public void testSelenide() {
        open( "https://www.google.by/?hl=ru" );
    }
}
