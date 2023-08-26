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
@TableName("PropertyFeePrice")
public class PropertyFeePrice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物业收费价格ID
     */
    @TableId(value = "PropertyFeePriceID", type = IdType.AUTO)
    private Integer propertyFeePriceID;

    /**
     * 小区名
     */
    @TableField("CommunityName")
    private String communityName;

    /**
     * 管理费单价
     */
    @TableField("ManagementFeePrice")
    private BigDecimal managementFeePrice;

    /**
     * 水费单价
     */
    @TableField("WaterFeePrice")
    private BigDecimal waterFeePrice;

    /**
     * 电费单价
     */
    @TableField("ElectricityFeePrice")
    private BigDecimal electricityFeePrice;

    /**
     * 公共卫生费
     */
    @TableField("PublicHealthFeePrice")
    private BigDecimal publicHealthFeePrice;

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
