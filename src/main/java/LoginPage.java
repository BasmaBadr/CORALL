import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends pagebase {



    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement Customerlogin;
    @FindBy(id="userSelect")
    WebElement userSelect;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement Login;
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    WebElement Deposit;

    @FindBy(xpath = "//input[@type='number']")
    WebElement amount;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Deposit2;

    @FindBy(xpath = "//span[@ng-show='message']")
   public WebElement DepositMessage;

     @FindBy(xpath = "//button[@ng-click='withdrawl()']")
     WebElement Withdraw;

     @FindBy(xpath = "//button[@type='submit']")
     WebElement Withdraw2;

     @FindBy(xpath = "//span[@ng-show='message']")
     WebElement Withdrawmessage;

    @FindBy(xpath = "//button[@ng-click='transactions()']")
    WebElement Transaction;
    @FindBy(xpath = "//strong[contains(text(),'1400')]")
    WebElement Balance1400;

    @FindBy(id = "accountSelect")
    WebElement account1011;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void Depositeactios(String name){
     clickbutton(Customerlogin);
     Selectbyvisibletext(userSelect,name);
     clickbutton(Login);
     clickbutton(Deposit);
     amount.sendKeys("1000");
     clickbutton(Deposit2);

    }
    public void Withdrawactions(){

        clickbutton(Withdraw);
        amount.sendKeys("400");
        clickbutton(Withdraw2);
    }
    public void Transactionamount(String name){
        Selectbyvisibletext(account1011,name);

        //clickbutton(Transaction);
    }







}
