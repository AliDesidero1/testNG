package Clarusway.Test;

import org.testng.annotations.Test;

public class C21_ParallelTest {
    //Thread.currentThread().getId(): kenidisni calistiran methodun threadinin id sini verir
    //bu class calistirildiginda herhangi bir mudahale olmadigi icin execution sequential(sirali)dir.
    //bu class ta testleri parallel yapmak istersek xml dosyasinda konfigurasyon yapabiliriz
    @Test
    public void test01(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
    @Test
    public void test02(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
    @Test
    public void test03(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
    @Test
    public void test04(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
    @Test
    public void test05(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
    @Test
    public void test06(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
    @Test
    public void test07(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
    @Test
    public void test08(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test icin calisan thread - " + id);
    }
}

