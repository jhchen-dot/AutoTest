package com.course.controller;

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RestController
@Api(value = "v1", description = "这是我第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行sql语句的对象

    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount", method = RequestMethod.GET)
    @ApiOperation(value = "可以获取到用户数", httpMethod = "GET")
    public int getUserCount() {
//        System.out.println((char[]) template.selectOne("getUserCount"));
        return template.selectOne("getUserCount");
    }

    //为什么必须要使用POST方法，因为POST需要添加信息过来，所以需要POST方法
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    //此处需要用户将数据传输进来，故添加参数RequestBody
    public int addUser(@RequestBody User user) {
        int result = template.insert("addUser", user);
        return result;
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public int updateUser(@RequestBody User user) {
        return template.update("updateUser", user);
    }

//  需要method么？ method = RequestMethod.POST
    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public int delUser(@RequestParam Integer id) {
        return template.delete("deleteUser", id);
    }
}
