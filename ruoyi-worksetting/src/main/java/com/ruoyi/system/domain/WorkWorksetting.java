package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工序设置对象 work_worksetting
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
public class WorkWorksetting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long workId;

    /** 工序名 */
    @Excel(name = "工序名")
    private String workTitle;

    /** 工序描述 */
    @Excel(name = "工序描述")
    private String workDescription;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String workStatus;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workTime;

    public void setWorkId(Long workId) 
    {
        this.workId = workId;
    }

    public Long getWorkId() 
    {
        return workId;
    }
    public void setWorkTitle(String workTitle) 
    {
        this.workTitle = workTitle;
    }

    public String getWorkTitle() 
    {
        return workTitle;
    }
    public void setWorkDescription(String workDescription) 
    {
        this.workDescription = workDescription;
    }

    public String getWorkDescription() 
    {
        return workDescription;
    }
    public void setWorkStatus(String workStatus) 
    {
        this.workStatus = workStatus;
    }

    public String getWorkStatus() 
    {
        return workStatus;
    }
    public void setWorkTime(Date workTime) 
    {
        this.workTime = workTime;
    }

    public Date getWorkTime() 
    {
        return workTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("workId", getWorkId())
            .append("workTitle", getWorkTitle())
            .append("workDescription", getWorkDescription())
            .append("workStatus", getWorkStatus())
            .append("workTime", getWorkTime())
            .toString();
    }
}
