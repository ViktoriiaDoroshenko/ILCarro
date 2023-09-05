package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    ChromeDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro.web.app/search");
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        pause(5000);
        wd.quit();
    }
    public void pause (int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void openLoginForm (){
        wd.findElement(By.xpath("//*[.=' Log in ']")).click();
    }
    public void fillLoginForm(String email, String password){
        type(By.xpath("//*[@id='email']"), email);
        type(By.xpath("//*[@id='password']"), password);
}
    public void submitLogin(){
        wd.findElement(By.xpath("//*[.='Y’alla!']")).click();
    }
    public void type(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }
    public void loggedSuccess(){
        wd.findElement(By.xpath("//button[@type='button']")).click();
    }
}
