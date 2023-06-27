package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车间信息对象 car_carinfo
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
public class CarCarinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long carId;

    /** 车间名 */
    @Excel(name = "车间名")
    private String carTitle;

    /** 负责人 */
    @Excel(name = "负责人")
    private String carHead;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String carStatus;

    /** 备注 */
    @Excel(name = "备注")
    private String carNote;

    public void setCarId(Long carId) 
    {
        this.carId = carId;
    }

    public Long getCarId() 
    {
        return carId;
    }
    public void setCarTitle(String carTitle) 
    {
        this.carTitle = carTitle;
    }

    public String getCarTitle() 
    {
        return carTitle;
    }
    public void setCarHead(String carHead) 
    {
        this.carHead = carHead;
    }

    public String getCarHead() 
    {
        return carHead;
    }
    public void setCarStatus(String carStatus) 
    {
        this.carStatus = carStatus;
    }

    public String getCarStatus() 
    {
        return carStatus;
    }
    public void setCarNote(String carNote) 
    {
        this.carNote = carNote;
    }

    public String getCarNote() 
    {
        return carNote;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("carId", getCarId())
            .append("carTitle", getCarTitle())
            .append("carHead", getCarHead())
            .append("carStatus", getCarStatus())
            .append("createTime", getCreateTime())
            .append("carNote", getCarNote())
            .toString();
    }
}
