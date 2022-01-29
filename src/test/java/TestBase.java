import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {
   public  WebDriver driver;
    @BeforeSuite
    public void OpenURL()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
//    @AfterSuite
//    public void closedriver(){
//        driver.close();
//    }



}
