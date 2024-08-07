package Practice2.tests;


import Practice2.pages.FramesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;

    protected FramesPage framesPage = new FramesPage(setUp());


    private WebDriver setUp() {
        WebDriverManager.chromedriver().setup();

        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }


    @BeforeClass
    public void StartTest() {
        driver.get( getFromProperties( "homeUrl" ) );
    }

    @AfterClass
    public void tearDawn() {
        driver.quit();//
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

