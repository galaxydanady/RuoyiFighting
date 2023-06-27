package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WorkWorksetting;

/**
 * 工序设置Service接口
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
public interface IWorkWorksettingService 
{
    /**
     * 查询工序设置
     * 
     * @param workId 工序设置主键
     * @return 工序设置
     */
    public WorkWorksetting selectWorkWorksettingByWorkId(Long workId);

    /**
     * 查询工序设置列表
     * 
     * @param workWorksetting 工序设置
     * @return 工序设置集合
     */
    public List<WorkWorksetting> selectWorkWorksettingList(WorkWorksetting workWorksetting);

    /**
     * 新增工序设置
     * 
     * @param workWorksetting 工序设置
     * @return 结果
     */
    public int insertWorkWorksetting(WorkWorksetting workWorksetting);

    /**
     * 修改工序设置
     * 
     * @param workWorksetting 工序设置
     * @return 结果
     */
    public int updateWorkWorksetting(WorkWorksetting workWorksetting);

    /**
     * 批量删除工序设置
     * 
     * @param workIds 需要删除的工序设置主键集合
     * @return 结果
     */
    public int deleteWorkWorksettingByWorkIds(Long[] workIds);

    /**
     * 删除工序设置信息
     * 
     * @param workId 工序设置主键
     * @return 结果
     */
    public int deleteWorkWorksettingByWorkId(Long workId);
}
