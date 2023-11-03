package Clarusway.Test;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C10_SoftAssertion extends TestBase {
    //Test Case2: Negative Username Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username incorrectUser into Username field.
    //Type password Password123 into Password field.
    //Click Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your username is invalid!
    @Test
    public void negativeUserNameTestSoft(){
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Type username student into Username field
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("incorrectUser");
        //Type password Password123 into Password field
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.cssSelector("button#submit")).click();//Click Submit button.
        SoftAssert sa = new SoftAssert();
        //Verify error message is displayed.
        sa.assertTrue(driver.findElement(By.id("error")).isDisplayed());
        //Verify error message text is Your username is invalid!
        sa.assertEquals(driver.findElement(By.id("error")).getText(), "Your username is invalid!");
        sa.assertAll();
    }
}