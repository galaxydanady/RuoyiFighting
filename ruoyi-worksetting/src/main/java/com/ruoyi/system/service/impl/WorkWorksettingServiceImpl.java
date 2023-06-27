package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WorkWorksettingMapper;
import com.ruoyi.system.domain.WorkWorksetting;
import com.ruoyi.system.service.IWorkWorksettingService;

/**
 * 工序设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
@Service
public class WorkWorksettingServiceImpl implements IWorkWorksettingService 
{
    @Autowired
    private WorkWorksettingMapper workWorksettingMapper;

    /**
     * 查询工序设置
     * 
     * @param workId 工序设置主键
     * @return 工序设置
     */
    @Override
    public WorkWorksetting selectWorkWorksettingByWorkId(Long workId)
    {
        return workWorksettingMapper.selectWorkWorksettingByWorkId(workId);
    }

    /**
     * 查询工序设置列表
     * 
     * @param workWorksetting 工序设置
     * @return 工序设置
     */
    @Override
    public List<WorkWorksetting> selectWorkWorksettingList(WorkWorksetting workWorksetting)
    {
        return workWorksettingMapper.selectWorkWorksettingList(workWorksetting);
    }

    /**
     * 新增工序设置
     * 
     * @param workWorksetting 工序设置
     * @return 结果
     */
    @Override
    public int insertWorkWorksetting(WorkWorksetting workWorksetting)
    {
        return workWorksettingMapper.insertWorkWorksetting(workWorksetting);
    }

    /**
     * 修改工序设置
     * 
     * @param workWorksetting 工序设置
     * @return 结果
     */
    @Override
    public int updateWorkWorksetting(WorkWorksetting workWorksetting)
    {
        return workWorksettingMapper.updateWorkWorksetting(workWorksetting);
    }

    /**
     * 批量删除工序设置
     * 
     * @param workIds 需要删除的工序设置主键
     * @return 结果
     */
    @Override
    public int deleteWorkWorksettingByWorkIds(Long[] workIds)
    {
        return workWorksettingMapper.deleteWorkWorksettingByWorkIds(workIds);
    }

    /**
     * 删除工序设置信息
     * 
     * @param workId 工序设置主键
     * @return 结果
     */
    @Override
    public int deleteWorkWorksettingByWorkId(Long workId)
    {
        return workWorksettingMapper.deleteWorkWorksettingByWorkId(workId);
    }
}
