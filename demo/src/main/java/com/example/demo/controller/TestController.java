package com.example.demo.controller;

import com.example.demo.model.SystemUser;
import com.example.demo.service.SystemUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FanYunzhe
 * @date 2018/11/16
 */
@RestController
@RequestMapping("/userInfo")
public class TestController {

    @Autowired
    private SystemUserService systemUserService;

    @RequestMapping("/all")
    @ResponseBody
    public PageInfo<SystemUser> test(int pageNum, int pageSize){

    	PageInfo<SystemUser> pageInfo = systemUserService.selectAllUser(pageNum, pageSize);

        return pageInfo;

    }

}
