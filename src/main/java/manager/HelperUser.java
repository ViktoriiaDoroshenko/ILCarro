package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public interface HelperUser extends HelperBase {
    default void openLoginForm (){
        wd.findElement(By.xpath("//*[.=' Log in ']")).click();
    }

    default void openRegistrationForm (){
        wd.findElement(By.xpath("//*[.=' Sign up ']")).click();
    }
    default void fillLoginForm(String email, String password){
        type(By.xpath("//*[@id='email']"), email);
        type(By.xpath("//*[@id='password']"), password);
    }
    default void fillLoginForm(User user){
        type(By.xpath("//*[@id='email']"), user.getEmail());
        type(By.xpath("//*[@id='password']"), user.getPassword());
    }
    default void fillRegistrationForm(User user){
        type(By.id("name"), user.getName());
        type(By.id("lastName"), user.getLastName());
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());
        clickCheckbox();
    }
    default void clickCheckbox(){
        //variant 1
        //click(By.cssSelector("label[for='terms-of-use']"));
        //variant 2
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('#terms-of-use').click();");

    }

    default void submitLogin(){
        wd.findElement(By.xpath("//button[@type='submit']")).click();
    }
    default void submitRegistration(){
        wd.findElement(By.xpath("//button[@type='submit']")).click();
    }
    default boolean isLoggedSuccess(){
        return isElementPresent(By.xpath("//h2[contains(text(), 'success')]"));
    }
    default void clickOkButtons(){
        click(By.xpath("//button[@type='button']"));
    }
    default boolean isLogged(){
        return isElementPresent(By.xpath("//*[.=' Logout ']"));
    }

    default void logout(){
        click(By.xpath("//*[.=' Logout ']"));
    }

    default void login(User user){
        openLoginForm();
        fillLoginForm(user);
        submitLogin();
        clickOkButtons();
    }
}
