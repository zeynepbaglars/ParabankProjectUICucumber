package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RightPanel extends Parent{

    public RightPanel() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//form[@id='customerForm']//input)[1]")
    private WebElement firstName;
    @FindBy(xpath = "(//form[@id='customerForm']//input)[2]")
    private WebElement lastName;
    @FindBy(xpath = "//*[text()='Address:']/../following-sibling::td/input")
    private WebElement address;
    @FindBy(xpath = "//*[text()='City:']/../following-sibling::td/input")
    private WebElement city;
    @FindBy(xpath = "//*[text()='State:']/../following-sibling::td/input")
    private WebElement state;
    @FindBy(xpath = "//*[text()='Zip Code:']/../following-sibling::td/input")
    private WebElement zipCode;
    @FindBy(xpath = "//*[text()='Phone #:']/../following-sibling::td/input")
    private WebElement phone;
    @FindBy(xpath = "(//form[@id='customerForm']//input)[8]")
    private WebElement ssn;
    @FindBy(xpath = "(//form[@id='customerForm']//input)[9]")
    private WebElement userName;
    @FindBy(xpath = "(//form[@id='customerForm']//input)[10]")
    private WebElement password;
    @FindBy(xpath = "(//form[@id='customerForm']//input)[11]")
    private WebElement confirmPassword;
    @FindBy(xpath = "(//form[@id='customerForm']//input)[12]")
    private WebElement registerButton;
    @FindBy(xpath = "//*[text()='Payee Name:']/../following-sibling::td/input")
    private  WebElement payeeName;
    @FindBy(xpath = "//*[text()='Account #:']/../following-sibling::td/input")
    private  WebElement account;
    @FindBy(xpath = "//*[text()='Verify Account #:']/../following-sibling::td/input")
    private  WebElement verifyAccount;
    @FindBy(xpath = "//*[text()='Amount: $']/../following-sibling::td/input")
    private  WebElement amount;
    @FindBy(css = "input[value='Send Payment']")
    private  WebElement sendPaymentButton;
    @FindBy(xpath = "//div[@id='rightPanel']//p")
    private WebElement message;
    @FindBy(xpath = "(//h1[@class='title'])[2]")
    private WebElement paymentMessage;

    public WebElement getPaymentMessage() {
        return paymentMessage;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getWebElement(String str){
        switch (str){
            case "firstName"         : return firstName;
            case "lastName"          : return lastName;
            case "address"           : return address;
            case "city"              : return city;
            case "state"             : return state;
            case "zipCode"           : return zipCode;
            case "phone"             : return phone;
            case "ssn"               : return ssn;
            case "userName"          : return userName;
            case "password"          : return password;
            case "confirmPassword"   : return confirmPassword;
            case "registerButton"    : return registerButton;
            case "payeeName"         : return payeeName;
            case "account"           : return account;
            case "verifyAccount"     : return verifyAccount;
            case "amount"            : return amount;
            case "sendPaymentButton" : return sendPaymentButton;
        }
        return null;
    }
}
