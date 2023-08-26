package com.cbzone.pms.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cbzone7
 * @since 2023-08-11
 */
@ToString
@Getter
@Setter
@TableName("Owners")
public class Owners implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业主ID
     */
    @TableId(value = "OwnerID", type = IdType.AUTO)
    private Integer ownerID;

    /**
     * 小区名
     */
    @TableField("CommunityName")
    private String communityName;

    /**
     * 单元号
     */
    @TableField("UnitNumber")
    private String unitNumber;

    /**
     * 房间号
     */
    @TableField("RoomNumber")
    private String roomNumber;

    /**
     * 自定义房号，例如：A101
     */
    @TableField("custom_room_number")
    private String customRoomNumber;

    /**
     * 住宅面积
     */
    @TableField("Area")
    private BigDecimal area;

    /**
     * 业主姓名
     */
    @TableField("Name")
    private String name;

    /**
     * 手机号码
     */
    @TableField("PhoneNumber")
    private String phoneNumber;

    /**
     * 邮箱
     */
    @TableField("Email")
    private String email;

    /**
     * 车牌号
     */
    @TableField("PlateNumber")
    private String plateNumber;

    /**
     * 第二个车牌号
     */
    @TableField("PlateNumber2")
    private String plateNumber2;

    /**
     * 门禁卡号
     */
    @TableField("CardNumber")
    private String cardNumber;

    /**
     * 第二个门禁卡号
     */
    @TableField("CardNumber2")
    private String cardNumber2;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;

    /**
     * 门禁过期时间
     */
    @TableField("AccessExpireTime")
    private Date accessExpireTime;

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
