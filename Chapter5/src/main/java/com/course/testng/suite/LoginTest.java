package com.course.testng.suite;

import org.testng.annotations.Test;

//该Java文件来写所有Test标签下包含的方法
public class LoginTest {

    @Test
    public void loginTaoBao() {
        System.out.println("淘宝登录成功");
    }
}
