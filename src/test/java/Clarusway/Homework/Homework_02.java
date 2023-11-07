package Clarusway.Homework;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homework_02 extends TestBase {
    //Open the site: http://opencart.abstracta.us/index.php?route=account/login
//Login with that credentials
//Email: clarusway@gmail.com
//Password: 123456789
//Using the Search function do it with Data Provider for Mac, iPad and Samsung.

    @Test(dataProvider = "MarsaBas")
    public void getter(String MarsaBas) {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        driver.findElement(By.xpath("//input[@id='input-email']"))
                .sendKeys("clarusway@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']"))
                .sendKeys("123456789");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']"))
                .sendKeys(MarsaBas + Keys.ENTER);
    }

    @DataProvider
    public Object[][] MarsaBas() {
        Object[][] gonderGelsin = new Object[3][1];
        gonderGelsin[0] = new Object[]{"Mac"};
        gonderGelsin[1] = new Object[]{"iPad"};
        gonderGelsin[2] = new Object[]{"Samsung"};

        return gonderGelsin;
    }


}
