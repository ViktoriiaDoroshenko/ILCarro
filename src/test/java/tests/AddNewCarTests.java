package tests;

import models.Car;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCarTests extends TestBase{

    @BeforeMethod
   public void precondition (){
        if(isLogged() == false){
            login(new User()
                    .withEmail("anna19@gmail.com")
                    .withPassword("Anna2005!"));
        }
    }
    @Test
    public void addNewCarPositive(){

        int i = (int)(System.currentTimeMillis()/100)%3600;

        Car car = Car.builder()
                .location("Tel Aviv")
                .manufacture("KIA")
                .model("Sportage")
                .year("2020")
                .fuel("'Petrol")
                .seats("5")
                .carClass("B")
                .carRegNumber("100-200-" +i)
                .price("150")
                .about("New car")
                .build();
    openCarForm();
    fillCarForm(car);
    pause(5000);
    }
}
