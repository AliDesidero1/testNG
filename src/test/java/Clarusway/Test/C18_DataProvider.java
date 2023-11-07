package Clarusway.Test;

import Clarusway.Utilities.TestBase;
import org.testng.annotations.Test;

public class C18_DataProvider  {
    //farkli bir class dan datalarimizi da alarak kullanbilirz, bunun icin data provider olan
    //methodu dogru sekilde parametre olarak test methoduna entegre etmeliyiz.

    @Test(dataProvider = "getData",dataProviderClass = C19_DataProviderClass.class)
    public void test(String username, String password){
        System.out.println("username : " + username + ",  password : " + password);
    }
}








