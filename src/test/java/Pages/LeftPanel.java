package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftPanel extends Parent{
    public LeftPanel() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(linkText = "Register")
    private WebElement register;
    @FindBy(linkText = "Bill Pay")
    private WebElement billPay;
    @FindBy(xpath = "//div[@class='login'][1]//input")
    private WebElement userName;
    @FindBy(xpath = "//div[@class='login'][2]//input")
    private WebElement password;
    @FindBy(xpath = "//div[@class='login'][3]//input")
    private WebElement loginButton;
    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logOut;

    public WebElement getLogOut() {
        return logOut;
    }
    public WebElement getWebElement(String str){

        switch(str){
            case "userName"   : return userName;
            case "password"   : return password;
            case "register"   : return register;
            case "loginButton" : return loginButton;
            case "logOut"     : return logOut;
            case "billPay"    : return billPay;
        }
        return null;

    }

}
