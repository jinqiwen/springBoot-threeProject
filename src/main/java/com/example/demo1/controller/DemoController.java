package com.example.demo1.controller;

import com.example.demo1.pojo.SysUser;
import com.example.demo1.service.UserService;
import com.example.demo1.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private UserServiceImpl userService;
	@RequestMapping("/index")
    public String index() {
        return "hello world";
    }
    @RequestMapping("/queryUserList")
    public String queryUserList() {

        SysUser user = new SysUser();
        user.setUsername("imooc");
        user.setNickname("lee");

        List<SysUser> userList = userService.queryUserList(user);

        return "查询成功";
    }

}