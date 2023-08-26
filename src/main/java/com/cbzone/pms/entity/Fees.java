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
@Getter
@Setter
@ToString
@TableName("Fees")
public class Fees implements Serializable {

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
     * 账单生成日期
     */
    @TableField("bill_date")
    private Date billDate;

    /**
     * 上月水费读数
     */
    @TableField("last_water_reading")
    private BigDecimal lastWaterReading;

    /**
     * 本月水费读数
     */
    @TableField("current_water_reading")
    private BigDecimal currentWaterReading;

    /**
     * 本月水费用量
     */
    @TableField("water_useage")
    private BigDecimal waterUseage;

    /**
     * 本月水费
     */
    @TableField("water_fee")
    private BigDecimal waterFee;

    /**
     * 卫生费
     */
    @TableField("public_health_fee")
    private BigDecimal publicHealthFee;

    /**
     * 分摊电费
     */
    @TableField("electricity_fee")
    private BigDecimal electricityFee;

    /**
     * 房屋面积
     */
    @TableField("area")
    private BigDecimal area;

    /**
     * 管理费
     */
    @TableField("management_fee")
    private BigDecimal managementFee;

    /**
     * 合计费用
     */
    @TableField("total_fee")
    private BigDecimal totalFee;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 账单状态
     */
    @TableField("status")
    private String status;

    /**
     * 缴费日期
     */
    @TableField("payment_date")
    private Date paymentDate;

    /**
     * 缴费金额
     */
    @TableField("payment_amount")
    private BigDecimal paymentAmount;

    /**
     * 缴费方式
     */
    @TableField("payment_method")
    private String paymentMethod;

    /**
     * 收费员
     */
    @TableField("cashier")
    private String cashier;

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
