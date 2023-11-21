package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests  extends TestBase {
    @BeforeMethod
    public void precondition() {

        if (isLogged()) logout();
    }

    @Test
    public void loginPositiveTest() {
        logger.info("ghfh");
        openLoginForm();
        fillLoginForm("anna19@gmail.com", "Anna2005!");
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());

    }

    @Test
    public void loginPositiveTestModel() {
        User user = new User()
                .withEmail("anna19@gmail.com")
                .withPassword("Anna2005!");
        openLoginForm();
        fillLoginForm(user.getEmail(), user.getPassword());
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());

    }

    @Test
    public void loginPositiveTestProper() {
        logger.info("ghfh");
        openLoginForm();
        fillLoginForm(getEmail(), getPassword());
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());

        @AfterMethod
        public void postcondition() {
            clickOkButtons();
        }

    }
}
