package com.example.demo.service.imp;

import com.example.demo.mapper.SystemUserMapper;
import com.example.demo.model.SystemUser;
import com.example.demo.model.SystemUserExample;
import com.example.demo.service.SystemUserService;
import com.example.demo.util.RedisUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FanYunzhe
 * @date 2018/11/16
 */
@Service("systemUserService")
public class SystemUserServiceImp implements SystemUserService {

    @Resource
    private SystemUserMapper systemUserMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public PageInfo<SystemUser> selectAllUser(int pageNum, int pageSize){

        PageInfo<SystemUser> systemUserPageInfo = null;

        String key = "selectAllUser:" + pageNum + ":" + pageSize;

        try{
            //判断该键是否存在
            boolean contains = redisUtil.contains(key);

            if(contains) {

                //从redis中获取
                systemUserPageInfo = (PageInfo<SystemUser>)redisUtil.getObject(key);

            }else{
                //pagehelper分页---开始
                String orderBy = "id" + " asc";//按照排序字段 倒序 排序
                PageHelper.startPage(pageNum, pageSize, orderBy);

                SystemUserExample systemUserExample = new SystemUserExample();

                List<SystemUser> list = systemUserMapper.selectByExample(systemUserExample);

                systemUserPageInfo = new PageInfo<>(list);
                //pagehelper分页---结束

                //存入redis
                redisUtil.set(key, systemUserPageInfo, 300);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return systemUserPageInfo;

    }

}
