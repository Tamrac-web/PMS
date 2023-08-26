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
@TableName("ParkingFeeTemporary")
public class ParkingFeeTemporary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车辆类型
     */
    @TableField("vehicle_type")
    private String vehicleType;

    /**
     * 车牌号
     */
    @TableField("plate_number")
    private String plateNumber;

    /**
     * 入场时间
     */
    @TableField("entry_time")
    private Date entryTime;

    /**
     * 出场时间
     */
    @TableField("exit_time")
    private Date exitTime;

    /**
     * 停车时长
     */
    @TableField("parking_duration")
    private String parkingDuration;

    /**
     * 入场值班员
     */
    @TableField("entry_attendant")
    private String entryAttendant;

    /**
     * 出场值班员
     */
    @TableField("exit_attendant")
    private String exitAttendant;

    /**
     * 应收金额
     */
    @TableField("receivable_amount")
    private BigDecimal receivableAmount;

    /**
     * 实收金额
     */
    @TableField("actual_amount")
    private BigDecimal actualAmount;

    /**
     * 收费方式
     */
    @TableField("payment_method")
    private String paymentMethod;

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
