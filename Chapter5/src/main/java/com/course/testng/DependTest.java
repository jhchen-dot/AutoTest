package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1() {
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    //test2运行需要依赖test1的正常运行，否则test2不能运行
    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2 run");
    }
}
