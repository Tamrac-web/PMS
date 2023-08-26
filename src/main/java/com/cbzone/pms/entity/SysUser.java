package com.cbzone.pms.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cbzone7
 * @since 2023-08-18
 */
@Getter
@Setter
@ToString
@TableName("SysUser")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 手机号码
     */
    @TableField("phone")
    private String phone;

    /**
     * 登陆账号
     */
    @TableField("username")
    private String username;

    /**
     * 登陆密码
     */
    @TableField("password")
    private String password;

    /**
     * 头像
     */
    @TableField("image")
    private String image;

    /**
     * 是否删除
     */
    @TableField("IsDeleted")
    @TableLogic
    private Byte isDeleted;

    /**
     * 创建人
     */
    @TableField("CreatedBy")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField("CreatedTime")
    private Date createdTime;

    /**
     * 更新人
     */
    @TableField("UpdatedBy")
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField("UpdatedTime")
    private Date updatedTime;
}
