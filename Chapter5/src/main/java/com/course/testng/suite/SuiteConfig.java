package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//该Java文件用来进行所有suite套件配置的
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite 运行啦");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite 运行啦");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest 运行啦");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest 运行啦");
    }
}
