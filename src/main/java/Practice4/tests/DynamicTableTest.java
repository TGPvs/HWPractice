package Practice4.tests;


import Lesson4.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicTableTest extends BaseTest {

    @Test
    public void TableTest(){
       homePage.getTestDirectory(HomePage.Links.DYNAMIC_TABLE );


        String expectedCpu = dynamicTablePage.getExpectedValue();
        String tableValue = dynamicTablePage.getTableValue();

        Assert.assertEquals(expectedCpu, tableValue);
    }

}
