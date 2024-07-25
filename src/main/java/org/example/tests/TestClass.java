package org.example.tests;

import org.testng.annotations.Test;


public class TestClass extends BaseTest {

    @Test
    public void openBrowser() {

        driver.get( getFromProperties( "homeUrl" ) );
        System.out.println( "Браузер успешно запущен c нужной страницы" );
    }
}
