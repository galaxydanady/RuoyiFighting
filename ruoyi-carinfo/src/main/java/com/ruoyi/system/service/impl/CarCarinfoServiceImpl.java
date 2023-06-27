package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CarCarinfoMapper;
import com.ruoyi.system.domain.CarCarinfo;
import com.ruoyi.system.service.ICarCarinfoService;

/**
 * 车间信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
@Service
public class CarCarinfoServiceImpl implements ICarCarinfoService 
{
    @Autowired
    private CarCarinfoMapper carCarinfoMapper;

    /**
     * 查询车间信息
     * 
     * @param carId 车间信息主键
     * @return 车间信息
     */
    @Override
    public CarCarinfo selectCarCarinfoByCarId(Long carId)
    {
        return carCarinfoMapper.selectCarCarinfoByCarId(carId);
    }

    /**
     * 查询车间信息列表
     * 
     * @param carCarinfo 车间信息
     * @return 车间信息
     */
    @Override
    public List<CarCarinfo> selectCarCarinfoList(CarCarinfo carCarinfo)
    {
        return carCarinfoMapper.selectCarCarinfoList(carCarinfo);
    }

    /**
     * 新增车间信息
     * 
     * @param carCarinfo 车间信息
     * @return 结果
     */
    @Override
    public int insertCarCarinfo(CarCarinfo carCarinfo)
    {
        carCarinfo.setCreateTime(DateUtils.getNowDate());
        return carCarinfoMapper.insertCarCarinfo(carCarinfo);
    }

    /**
     * 修改车间信息
     * 
     * @param carCarinfo 车间信息
     * @return 结果
     */
    @Override
    public int updateCarCarinfo(CarCarinfo carCarinfo)
    {
        return carCarinfoMapper.updateCarCarinfo(carCarinfo);
    }

    /**
     * 批量删除车间信息
     * 
     * @param carIds 需要删除的车间信息主键
     * @return 结果
     */
    @Override
    public int deleteCarCarinfoByCarIds(Long[] carIds)
    {
        return carCarinfoMapper.deleteCarCarinfoByCarIds(carIds);
    }

    /**
     * 删除车间信息信息
     * 
     * @param carId 车间信息主键
     * @return 结果
     */
    @Override
    public int deleteCarCarinfoByCarId(Long carId)
    {
        return carCarinfoMapper.deleteCarCarinfoByCarId(carId);
    }
}
