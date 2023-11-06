package Clarusway.Test;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C15_DataProvider extends TestBase {
/*
@DataProvider bir TestNG annotation'idir.
Dolayisiyla sadece TestNG ile kullanilir.
Veri sağlamak için kullanılır/ TestNG'deki verilerin listesini almak için kullanılır
DDT (Data Driven Test) yapilir
Cucumber'daki Scenario Outline ile ayni isleve sahiptir
DataProvider ile bir yöntemden test yöntemine veri nasıl geçirilir?
-Test yönteminde dataProvider kullanın ve acıklamayı yöntem adına eşit olarak ayarlayın
   name ="alternative name" kullanarak alternatif isim verebiliriz.
 */

    @Test(dataProvider = "getData")
    public void test1(String kelime) {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime+ Keys.ENTER);
    }
    @DataProvider
    public Object[][] getData(){
        Object [][]  data = {{"iphone"},{"headphone"},{"mouse"}, {"nikon"}};
        return data;
    }
    @Test(dataProvider = "aranacakKelime")
    public void test2(String kelime) {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime+ Keys.ENTER);
    }
    @DataProvider(name="aranacakKelime")
    public Object[][] getData2(){
        Object [][]  data = {{"java"},{"javascript"},{"mantı"}};
        return data;
    }
    @Test(dataProvider = "dataStore")
    public void test3(String kelime) {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime+ Keys.ENTER);
    }
    @DataProvider
    public Object[][] dataStore(){
        Object [][]  data =new Object[2][1];
        data[0]=new Object[]{"nutella"};
        data[1]=new Object[]{"computer"};

        return data;
    }
}
