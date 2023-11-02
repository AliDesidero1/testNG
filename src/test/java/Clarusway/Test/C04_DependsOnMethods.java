package Clarusway.Test;

import org.testng.annotations.Test;

public class C04_DependsOnMethods {
    // Dependsonmethods attribute u icerisine {} arasinda test isimleri alir
    // ve bu testler basirili olursa asil testimiz calisir
    // cok sayida testimiz varsa bagimli testleri her seferinde kontrol etmek yerine
    // testNg once bagimsiz olanları calistirir, sona bagimli testleri birakir, bu sekilde bir mantik gelistrmistir..
    @Test
    void startCar(){
        System.out.println("araba calistir");//bu test bağımsız tes
    }
    @Test (dependsOnMethods = {"startCar"})//bu testin calismasi startCar testinin hatasiz calismasina bagli
    void driveCar(){
        System.out.println("araba sur");
    }
    @Test(dependsOnMethods = {"parkCar"})
    void stopCar(){
        System.out.println("araba durdur");
    }
    @Test(dependsOnMethods = {"driveCar"})//bu testin calismasi driveCar testinin hatasiz calismasina bagli
    void parkCar(){
        System.out.println("araba park et");
    }
    /*
    araba calistir
    araba sur
    araba park et
    araba durdur
     */
}
