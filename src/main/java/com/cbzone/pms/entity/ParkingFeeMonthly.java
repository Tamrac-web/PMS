package com.cbzone.pms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("ParkingFeeMonthly")
public class ParkingFeeMonthly implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车牌号
     */
    @TableField("plate_number")
    private String plateNumber;

    /**
     * 自定义房号，例如：A101
     */
    @TableField("custom_room_number")
    private String customRoomNumber;

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
