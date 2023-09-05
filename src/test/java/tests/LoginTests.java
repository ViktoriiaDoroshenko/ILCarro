package tests;

import org.testng.annotations.Test;

public class LoginTests  extends TestBase{
    @Test
    public void loginPositiveTest() {
    openLoginForm();
    fillLoginForm("anna19@gmail.com", "Anna2005!");
    submitLogin();
    loggedSuccess();
    }
}
