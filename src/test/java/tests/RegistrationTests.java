package tests;

import models.User;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

 @Test
    public void registrationPositive(){
     int i = (int)(System.currentTimeMillis()/100)%3600;
     User user = new User(
             "Kire",
             "Silver",
             "kire_" +i+ "@gmail.com",
             "123$Kire");

     openRegistrationForm();
     fillRegistrationForm(user);
     submitRegistration();

 }
}
