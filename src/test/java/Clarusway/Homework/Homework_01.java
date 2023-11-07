package Clarusway.Homework;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homework_01 extends TestBase {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
//Login with negative credentilas by Data Provider.
//Then assert that ''Invalid credentials'’ is displayed.


    @Test(dataProvider = "kullaniciAdiveSifre")
    public void test1(String kullaniciAdi, String kullaniciSifre) {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//input[@placeholder='Username']"))
                .sendKeys(kullaniciAdi + Keys.ENTER);

        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys(kullaniciSifre + Keys.ENTER);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"))
                .getText().contains("Invalid credentials"));
    }

    @DataProvider
    public Object[][] kullaniciAdiveSifre(){
        Object [][] bilgiGetir = new Object[3][2];
        bilgiGetir [0] =new Object[]{"alig123","babacan123"};
        bilgiGetir [1] =new Object[]{"alig344","babacan344"};
        bilgiGetir [2] =new Object[]{"alig999","babacan999"};
        return bilgiGetir;
    }


}
