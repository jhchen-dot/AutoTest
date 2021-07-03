package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    //    invocationCount 表明执行次数
//    threadPoolSize  表示线程池的内线程的个数
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test() {
        System.out.println(1);
//        Thread.currentThread()是Thread的一个静态方法，用来获取当前线程对象的一个引用
        //只能用printf输出数据，不能使用println输出，否则出现错误结果
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }
}