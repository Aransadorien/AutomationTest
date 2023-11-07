import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CheckoutTest extends Hooks {

    public CheckoutPage checkoutPage;


    @Before
    public void setupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void checkout() throws InterruptedException {
        checkoutPage.getFoodMenu();
        checkoutPage.getAddToCart();
        checkoutPage.completeAndSubmitCart();
        checkoutPage.assertTextWhenReady(checkoutPage.pageTitle, "CHECKOUT");
        checkoutPage.completeAllMandatoryFieldsInCheckoutPage();
        checkoutPage.clickAllContinueButtonsOnCheckoutPage();
        checkoutPage.assertTextWhenReady(checkoutPage.pageTitle, "YOUR ORDER HAS BEEN RECEIVED.");


    }

    @Test

    public void checkoutMandatoryFieldsExcept() throws InterruptedException {
        checkoutPage.getFoodMenu();
        checkoutPage.getAddToCart();
        checkoutPage.completeAndSubmitCart();
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.firstNameField);
        checkoutPage.clickWhenReady(checkoutPage.billingContinue);
        checkoutPage.assertTextWhenReady(checkoutPage.mandatoryFirstName,"This is a required field.");

    }

    @Test

    public void  checkoutMandatoryFirstNameTest() throws InterruptedException {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.firstNameField);
        checkoutPage.assertTextWhenReady(checkoutPage.mandatoryFirstName, "This is a required field.");

    }

    @Test

    public void  checkoutMandatoryLastNameTest() throws InterruptedException {

        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.lastNameField);
        checkoutPage.assertTextWhenReady(checkoutPage.mandatoryLastName, "This is a required field.");
    }

    @Test

    public void checkoutMandatoryEmailAddress() throws InterruptedException {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.emailField);
        checkoutPage.assertTextWhenReady(checkoutPage.mandatoryEmail, "This is a required field.");

    }

}
