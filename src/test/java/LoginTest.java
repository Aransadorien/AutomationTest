import org.junit.Before;
import org.junit.Test;


public class LoginTest extends Hooks {

    public LoginPage loginPage;
    public CheckoutPage checkoutPage;


    @Before
    public void setupPageObject() {
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);
        driver.manage().window().maximize();

    }

    @Test
    public void checkout() throws InterruptedException {
        loginPage.getAccount();
        loginPage.getLogin();
        loginPage.getEmail();
        loginPage.setEmail("asdf@example.com");
        loginPage.getPassword();
        loginPage.setPassword("123456");
        Thread.sleep(3000);
        loginPage.getLoginButton();
        Thread.sleep(3000);

    }

    @Test
    public void checkoutAnotherTest() {

    }
}
