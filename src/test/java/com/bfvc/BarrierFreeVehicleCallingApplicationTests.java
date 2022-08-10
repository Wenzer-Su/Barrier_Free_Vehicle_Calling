package com.bfvc;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.bfvc.dao.entity.User;
import com.bfvc.dao.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BarrierFreeVehicleCallingApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testUpdateUser() {
        User user = userMapper.selectById(6);
        //user.setVersion(3);
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("nick_name","version manager");
        updateWrapper.eq("id",6);
        userMapper.update(user,updateWrapper);

    }

    @Test
    public void testUser() {
        //User user = new User();
        //user.setUserName("admin");
        //user.setPassword("CRH380AL");
        //user.setNickName("超级管理员");
        //user.setRoleId(1);
        //user.setStaffStatus(1);
        //user.setRemarks("新创建的超级管理员");
        //System.out.println(user);
        //int insertResult = userMapper.insert(user);
        //
        //System.out.println("插入结果-->" + insertResult);
        User user = new User();
        user.setUserName("admin6");
        user.setPassword("CRH380AL");
        user.setNickName("插入的超级管理员6");
        user.setStaffStatus(1);
        user.setRoleId(1);
        user.setRemarks("6");
        System.out.println(user);
        int result = userMapper.insert(user);
        System.out.println("插入结果-->" + result);
    }

    @Test
    void contextLoads() {
    }

}
