package Clarusway.Test;

import org.testng.annotations.Test;

public class C12_XMLFilesGroups {
    @Test(groups = {"smoke"})
    void test1() {
        System.out.println("test1 smoke çalıştı");
    }

    @Test(groups = {"smoke"})
    void test2() {
        System.out.println("test2 smoke çalıştı");
    }

    @Test
    void test3() {
        System.out.println("test3 çalıştı");
    }

    @Test(groups = {"smoke", "regression"})
    void test4() {
        System.out.println("test4 smoke, regression çalıştı");
    }

    @Test(groups = {"regression"})
    void test5() {
        System.out.println("test5 regression çalıştı");
    }

    @Test(groups = {"regression"})
    void test6() {
        System.out.println("test6 regression çalıştı");
    }

    @Test(groups = {"smoke"})
    void test7() {
        System.out.println("test7 smoke çalıştı");
    }
}