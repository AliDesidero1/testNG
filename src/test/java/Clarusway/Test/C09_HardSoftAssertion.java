package Clarusway.Test;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C09_HardSoftAssertion extends TestBase {
    /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Click Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
     */
    @Test
    public void testLoginHard(){
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Type username student into Username field
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
        //Type password Password123 into Password field
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.cssSelector("button#submit")).click();//Click Submit button.
        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"), "URLde belirtilen text bulunamadı");
        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String text = driver.findElement(By.tagName("strong")).getText();
        Assert.assertTrue(text.contains("Congratulations")||text.contains("successfully logged in"),"metinleri içermiyore.");
        //Verify button Log out is displayed on the new page.
        Assert.assertTrue(driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed(), "Log out butonu gözükmüyore.");
    }
    @Test
    public void testLoginSoft(){
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Type username student into Username field
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
        //Type password Password123 into Password field
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.cssSelector("button#submit")).click();//Click Submit button.
        SoftAssert sa = new SoftAssert();
        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        sa.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"), "URLde belirtilen text bulunamadı");
        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String text = driver.findElement(By.tagName("strong")).getText();
        sa.assertTrue(text.contains("Congratulations")||text.contains("successfully logged in"),"metinleri içermiyore.");
        //Verify button Log out is displayed on the new page.
        sa.assertTrue(driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed(), "Log out butonu gözükmüyore.");
        sa.assertAll();
    }
}