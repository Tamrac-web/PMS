package com.cbzone.pms;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbzone.pms.entity.SysUser;
import com.cbzone.pms.service.SysUserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class PmsApplicationTests {

    @Resource
    SysUserService sysUserService;
    @Test
    void contextLoads() {
    }

    @Test
    void testAddUser(){
        SysUser user = new SysUser();
        user.setName("Test2");
        user.setUsername("Test2");
        user.setPassword("Test2");
        user.setCreatedBy("admin");
        boolean b = sysUserService.addUser(user);
        log.info("添加用户结果：{}",b);
    }

    @Test
    void testDeleteUser(){
        boolean b = sysUserService.deleteUser(1);
        log.info("删除用户结果：{}",b);
    }

    @Test
    void testUpdateUser(){
        SysUser user = new SysUser();
        user.setId(2);
        user.setName("Test2");
        user.setUsername("Test2");
        user.setPassword("Test2");
        boolean b = sysUserService.updateUser(user);
        log.info("修改用户结果：{}",b);
    }

    @Test
    void testQueryUser(){
        SysUser user = sysUserService.queryUser(2);
        log.info("查询用户结果：{}",user);
    }

    @Test
    void testQueryAllUser(){

        Page page = sysUserService.queryAllUser(1, 5);
        log.info("分页查询用户结果：{}",page.getRecords());

    }

}
