package Clarusway.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C13_UsingParameters {

    @Test
    @Parameters("isim")
    public void parameterizedTest(String name){
        System.out.println("Hello "+name);
    }

    @Test
    @Parameters({"isim", "soyisim", "yaş"})
    public void threeparameterizedTest(String name, String surname, String age){

        System.out.println("Hello "+name+" "+surname+" "+age);
    }
}