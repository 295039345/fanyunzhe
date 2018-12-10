package com.example.demo.service;

import com.github.pagehelper.PageInfo;

/**
 * @author FanYunzhe
 * @date 2018/11/16
 */
public interface SystemUserService {

    PageInfo selectAllUser(int pageNum, int pageSize);

}
