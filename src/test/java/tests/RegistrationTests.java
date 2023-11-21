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
 /*@Test
  public void registrationNegativeTestWrongName(){
  int i = (int)(System.currentTimeMillis()/100)%3600;
   User user = new User(
         "",
         "Silver",
         "kire_" +i+ "@gmail.com",
         "123$Kire");

   openRegistrationForm();
   fillRegistrationForm(user);
   submitRegistration();
}
   @Test
   public void registrationNegativeTestWrongLastName() {
    int i = (int) (System.currentTimeMillis() / 100) % 3600;
    User user = new User(
            "Sara",
            " ",
            "kire_" + i + "@gmail.com",
            "123$Kire");

    openRegistrationForm();
    fillRegistrationForm(user);
    submitRegistration();
   }
 @Test
 public void registrationNegativeTestWrongEmail() {
  int i = (int) (System.currentTimeMillis() / 100) % 3600;
  User user = new User(
          "Sara",
          "Das",
          "kire_" + i + "gmail.com",
          "123$Kire");

  openRegistrationForm();
  fillRegistrationForm(user);
  submitRegistration();
 }
 @Test
 public void registrationNegativeTestWrongPassword() {
  int i = (int) (System.currentTimeMillis() / 100) % 3600;
  User user = new User(
          "Sara",
          "Das",
          "kire_" + i + "@gmail.com",
          "123Kire");

  openRegistrationForm();
  fillRegistrationForm(user);
  submitRegistration();
 }*/
}
