import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class LoginPage extends BasePage {
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 5);

    }

    @FindBy(css = ".account-cart-wrapper")

    public WebElement account;

    @FindBy(linkText = "Log In")
    public WebElement login;

    @FindBy(id ="email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "send2")
    private WebElement loginButton;







    public void getAccount() { account.click();

    }
    public void getLogin() { login.click();

    }

    public void getEmail() { emailField.click();

    }

    public void getPassword() {passwordField.click();

    }

    public void setEmail(String email) {emailField.sendKeys(email);}
    public void setPassword(String password) {passwordField.sendKeys(password);}

    public void getLoginButton() {loginButton.click();

    }

    public void completAndLogin() {
        setEmail("asdf@example.com");
    }








































//    @FindBy(xpath = "//a[text()='Food']") // (css = ".nav-16 > .level0")
//    private WebElement foodMenu;





//    public void setStreet1(String address) {
//        street1Field.sendKeys(address);
//    }

    public void assertTextWhenReady(WebElement locator,String expectedText) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        wait.until(ExpectedConditions.textToBePresentInElement(locator, expectedText));
        assertEquals(expectedText, locator.getText());
    }



}




