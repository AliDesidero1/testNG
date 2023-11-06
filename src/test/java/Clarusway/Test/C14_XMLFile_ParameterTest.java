package Clarusway.Test;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C14_XMLFile_ParameterTest extends TestBase {
    //Go to URL: https://www.amazon.com
    //Search words: Java, Selenium
    //Assert get text result test that the result text contains the searched Word.
    //Run tests from XML file.

        /*    @Test
            public void test1(){
                driver.navigate().to("https://www.amazon.com");
                WebElement searchArea = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
                searchArea.sendKeys("Java"+ Keys.ENTER);
                WebElement result = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
                Assert.assertTrue(result.getText().toLowerCase().contains("java"));
                driver.navigate().back();
                searchArea.sendKeys("Selenium"+ Keys.ENTER);
                Assert.assertTrue(result.getText().toLowerCase().contains("selenium"));
            }*/

    @Test
    @Parameters("aranacakKelime")
    public void test2(String keyword){
        driver.get("https://www.amazon.com");
        WebElement searchArea = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchArea.sendKeys(keyword+ Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(result.getText().toLowerCase().contains(keyword.toLowerCase()));
    }
}