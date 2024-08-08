package Practice4.tests;

import Lesson4.pages.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected HomePage homePage = new HomePage();
    protected TextInputPage textInputPage = new TextInputPage();
    protected DynamicTablePage dynamicTablePage = new DynamicTablePage();
    protected MouseOverPage mouseOverPage = new MouseOverPage();
    protected FramesPage framesPage = new FramesPage();
    protected AlertsPage alertsPage = new AlertsPage();


//    private WebDriver setUp() {
//
//        switch (System.getProperty("browser", "Chrome")) {
//            case "Chrome":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//                break;
//            case "Firefox":
//                WebDriverManager.firefoxdriver().setup();
//                FirefoxOptions options ;
//                driver = new FirefoxDriver();
//                break;
//            default: {
//                System.out.println( "Неверное имя браузера" );
//            }
//        }
//
//
//        if (driver == null) {
//            driver = new ChromeDriver();
//        }
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 20 ) );
//        return driver;
//    }


    @BeforeClass
    public void StartTest() {
        open( getFromProperties( "homeUrl" ) );
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
}
