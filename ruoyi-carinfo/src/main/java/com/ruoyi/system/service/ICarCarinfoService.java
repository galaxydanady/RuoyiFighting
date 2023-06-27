package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CarCarinfo;

/**
 * 车间信息Service接口
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
public interface ICarCarinfoService 
{
    /**
     * 查询车间信息
     * 
     * @param carId 车间信息主键
     * @return 车间信息
     */
    public CarCarinfo selectCarCarinfoByCarId(Long carId);

    /**
     * 查询车间信息列表
     * 
     * @param carCarinfo 车间信息
     * @return 车间信息集合
     */
    public List<CarCarinfo> selectCarCarinfoList(CarCarinfo carCarinfo);

    /**
     * 新增车间信息
     * 
     * @param carCarinfo 车间信息
     * @return 结果
     */
    public int insertCarCarinfo(CarCarinfo carCarinfo);

    /**
     * 修改车间信息
     * 
     * @param carCarinfo 车间信息
     * @return 结果
     */
    public int updateCarCarinfo(CarCarinfo carCarinfo);

    /**
     * 批量删除车间信息
     * 
     * @param carIds 需要删除的车间信息主键集合
     * @return 结果
     */
    public int deleteCarCarinfoByCarIds(Long[] carIds);

    /**
     * 删除车间信息信息
     * 
     * @param carId 车间信息主键
     * @return 结果
     */
    public int deleteCarCarinfoByCarId(Long carId);
}
