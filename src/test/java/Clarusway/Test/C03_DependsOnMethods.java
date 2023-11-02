package Clarusway.Test;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {
    // Dependsonmethods attribute u icerisine {} arasinda test isimleri alir
    // ve bu testler basirili olursa asil testimiz calisir
    // cok sayida testimiz varsa bagimli testleri her seferinde kontrol etmek yerine
    // testNg once bagimsiz olanları calistirir, sona bagimli testleri birakir, bu sekilde bir mantik gelistrmistir..
    @Test
    public void loginTest(){System.out.println("login tested successfully");}
    @Test(dependsOnMethods = {"loginTest"})
    public void homepageTest(){System.out.println("homepage tested successfully");}
    @Test(dependsOnMethods = {"loginTest","homepageTest"})
    public void smokeTest(){
        System.out.println("smoke tests were done successfully");
    }
}
/*
homepage tested successfully
login tested successfully
smoke tests were done successfully
 */

