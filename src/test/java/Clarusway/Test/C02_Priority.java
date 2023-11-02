package Clarusway.Test;

import org.testng.annotations.Test;

public class C02_Priority {
    // priority: Öncelik sırası
    // Bir priority belirlenmez ise alfabetik execution gerceklesir.
    // Priority si en dusuk degere sahip olan test ilk once calisir.
    // Priority nin default degeri 0 dir.
    // Priority negatif deger alabilir.
    // Ayni priority ye sahip testler varsa alfabetik sirayla calisir.
    @Test(priority = -100)
    void test1(){System.out.println("test1 run");}
    @Test//default priority :0
    void test2(){System.out.println("test2 run");}
    @Test(priority = 7)
    void test3(){System.out.println("test3 run");}
    @Test(priority = 1)
    void test4(){System.out.println("test4 run");}
    @Test
//default priority :0
    void test5(){System.out.println("test5 run");}
}

