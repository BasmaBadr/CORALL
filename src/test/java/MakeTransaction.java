import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class MakeTransaction extends TestBase {
    public MakeTransaction() throws IOException {
        super();
    }
    LoginPage loginPage;
    @BeforeClass
    public void Class(){
        loginPage = new LoginPage(driver);

    }
//    CustomerPage customerPage = new CustomerPage();

    @Test(priority = 1)
    public void Depositeactiontransaction()
    {
        loginPage.Depositeactios("Albus Dumbledore");
        Assert.assertTrue(loginPage.DepositMessage.isDisplayed());

    }

    @Test(priority = 2)
    public void Withdrawactions()
    {
        loginPage.Withdrawactions();
        Assert.assertTrue(loginPage.Withdrawmessage.isDisplayed());
    }
    @Test(priority = 3)
    public void Checktranactionamount(){

        System.out.println(loginPage.Balance600.getText());
        Assert.assertTrue(loginPage.Balance600.isDisplayed());

    }

}
