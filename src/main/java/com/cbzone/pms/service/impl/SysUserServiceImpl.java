package com.cbzone.pms.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cbzone.pms.entity.SysUser;
import com.cbzone.pms.mapper.SysUserMapper;
import com.cbzone.pms.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cbzone7
 * @since 2023-08-18
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public boolean addUser(SysUser user) {
        int insert = this.baseMapper.insert(user);
        return insert>0;
    }

    @Override
    public boolean deleteUser(Integer id) {
        int i = this.baseMapper.deleteById(id);
        return i>0;
    }

    @Override
    public boolean updateUser(SysUser user) {
        int i = this.baseMapper.updateById(user);
        return i>0;
    }

    @Override
    public SysUser queryUser(Integer id) {
        return this.baseMapper.selectById(id);
    }

    @Override
    public Page queryAllUser(Integer page, Integer limit) {
//        分页查询
        Page Qpage = new Page(page,limit);
        Page<SysUser> sysUserPage = this.baseMapper.selectPage(Qpage, null);
        return sysUserPage;

    }

}
