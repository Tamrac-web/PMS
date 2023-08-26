package com.cbzone.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cbzone.pms.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cbzone7
 * @since 2023-08-18
 */
public interface SysUserService extends IService<SysUser> {

//    添加用户
    public boolean addUser(SysUser user);

//    删除用户
    public boolean deleteUser(Integer id);

//    修改用户
    public boolean updateUser(SysUser user);

//    查询用户
    public SysUser queryUser(Integer id);

//    分页查询所有用户
    public Page queryAllUser(Integer page, Integer limit);




}
