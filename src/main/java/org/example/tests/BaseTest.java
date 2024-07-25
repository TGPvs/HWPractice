package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty( "webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe" );
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("Драйвер успешно запущен");
    }

    public String getFromProperties(String propertyKey) {
        Properties props = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream( "src/main/resources/application.properties" );
            props.load( inputStream );
        } catch (IOException e) {
            System.out.println( "Не удалось загрузить файл!" );
        }
        return props.getProperty( propertyKey );
    }

    @AfterSuite
    public void tearDawn() {
        driver.quit();
        System.out.println("Браузер закрыт");
    }
}

