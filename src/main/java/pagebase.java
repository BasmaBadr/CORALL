import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class pagebase  {
    public WebDriver driver;
   public Select optionlist;
    public pagebase(WebDriver driver)  {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickbutton(WebElement button){
        button.click();

    }
    public void Selectbyvisibletext(WebElement element,String value){
        optionlist= new Select(element);
        optionlist.selectByVisibleText(value);
    }


}
