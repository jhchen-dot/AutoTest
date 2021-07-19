package com.course.utils;


import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DatabaseUtil {
//写数据库读取用户信息，需要获取执行SQL语句的一个对象
// Case每次调用一次，都需要写一次代码
//所以在此编辑一个util类，用来处理这种情况，
//不再需要多次调用case类

    public static SqlSession getSqlSession() throws IOException {
        //获取配置的资源文件
        //此处的Resources需要调用org.apache.ibatis.io.Resources;
        Reader reader = Resources.getResourceAsReader("databaseConfig.xml");

        //下面这句话：使用类加载器加载配置文件
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

        //sqlSession就是能够执行配置文件中的sql语句
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }

}
