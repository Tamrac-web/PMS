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
@TableName("WaterMeterReadings")
public class WaterMeterReadings implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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
    @TableField("room_number")
    private String roomNumber;

    /**
     * 自定义房号，例如：A101
     */
    @TableField("custom_room_number")
    private String customRoomNumber;

    /**
     * 抄表日期
     */
    @TableField("read_date")
    private Date readDate;

    /**
     * 用水量
     */
    @TableField("water_useage")
    private BigDecimal waterUseage;

    /**
     * 抄表图片
     */
    @TableField("read_images")
    private String readImages;

    /**
     * 抄表人
     */
    @TableField("reader")
    private String reader;

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
