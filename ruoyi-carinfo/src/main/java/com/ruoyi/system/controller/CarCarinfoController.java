package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.CarCarinfo;
import com.ruoyi.system.service.ICarCarinfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车间信息Controller
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
@RestController
@RequestMapping("/car/carinfo")
public class CarCarinfoController extends BaseController
{
    @Autowired
    private ICarCarinfoService carCarinfoService;

    /**
     * 查询车间信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:carinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(CarCarinfo carCarinfo)
    {
        startPage();
        List<CarCarinfo> list = carCarinfoService.selectCarCarinfoList(carCarinfo);
        return getDataTable(list);
    }

    /**
     * 导出车间信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:carinfo:export')")
    @Log(title = "车间信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CarCarinfo carCarinfo)
    {
        List<CarCarinfo> list = carCarinfoService.selectCarCarinfoList(carCarinfo);
        ExcelUtil<CarCarinfo> util = new ExcelUtil<CarCarinfo>(CarCarinfo.class);
        util.exportExcel(response, list, "车间信息数据");
    }

    /**
     * 获取车间信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:carinfo:query')")
    @GetMapping(value = "/{carId}")
    public AjaxResult getInfo(@PathVariable("carId") Long carId)
    {
        return success(carCarinfoService.selectCarCarinfoByCarId(carId));
    }

    /**
     * 新增车间信息
     */
    @PreAuthorize("@ss.hasPermi('car:carinfo:add')")
    @Log(title = "车间信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CarCarinfo carCarinfo)
    {
        return toAjax(carCarinfoService.insertCarCarinfo(carCarinfo));
    }

    /**
     * 修改车间信息
     */
    @PreAuthorize("@ss.hasPermi('car:carinfo:edit')")
    @Log(title = "车间信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CarCarinfo carCarinfo)
    {
        return toAjax(carCarinfoService.updateCarCarinfo(carCarinfo));
    }

    /**
     * 删除车间信息
     */
    @PreAuthorize("@ss.hasPermi('car:carinfo:remove')")
    @Log(title = "车间信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{carIds}")
    public AjaxResult remove(@PathVariable Long[] carIds)
    {
        return toAjax(carCarinfoService.deleteCarCarinfoByCarIds(carIds));
    }
}
