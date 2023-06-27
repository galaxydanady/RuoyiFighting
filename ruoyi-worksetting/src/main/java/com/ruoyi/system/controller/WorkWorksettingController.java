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
import com.ruoyi.system.domain.WorkWorksetting;
import com.ruoyi.system.service.IWorkWorksettingService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工序设置Controller
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
@RestController
@RequestMapping("/workset/worksetting")
public class WorkWorksettingController extends BaseController
{
    @Autowired
    private IWorkWorksettingService workWorksettingService;

    /**
     * 查询工序设置列表
     */
    @PreAuthorize("@ss.hasPermi('workset:worksetting:list')")
    @GetMapping("/list")
    public TableDataInfo list(WorkWorksetting workWorksetting)
    {
        startPage();
        List<WorkWorksetting> list = workWorksettingService.selectWorkWorksettingList(workWorksetting);
        return getDataTable(list);
    }

    /**
     * 导出工序设置列表
     */
    @PreAuthorize("@ss.hasPermi('workset:worksetting:export')")
    @Log(title = "工序设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WorkWorksetting workWorksetting)
    {
        List<WorkWorksetting> list = workWorksettingService.selectWorkWorksettingList(workWorksetting);
        ExcelUtil<WorkWorksetting> util = new ExcelUtil<WorkWorksetting>(WorkWorksetting.class);
        util.exportExcel(response, list, "工序设置数据");
    }

    /**
     * 获取工序设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('workset:worksetting:query')")
    @GetMapping(value = "/{workId}")
    public AjaxResult getInfo(@PathVariable("workId") Long workId)
    {
        return success(workWorksettingService.selectWorkWorksettingByWorkId(workId));
    }

    /**
     * 新增工序设置
     */
    @PreAuthorize("@ss.hasPermi('workset:worksetting:add')")
    @Log(title = "工序设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WorkWorksetting workWorksetting)
    {
        return toAjax(workWorksettingService.insertWorkWorksetting(workWorksetting));
    }

    /**
     * 修改工序设置
     */
    @PreAuthorize("@ss.hasPermi('workset:worksetting:edit')")
    @Log(title = "工序设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WorkWorksetting workWorksetting)
    {
        return toAjax(workWorksettingService.updateWorkWorksetting(workWorksetting));
    }

    /**
     * 删除工序设置
     */
    @PreAuthorize("@ss.hasPermi('workset:worksetting:remove')")
    @Log(title = "工序设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{workIds}")
    public AjaxResult remove(@PathVariable Long[] workIds)
    {
        return toAjax(workWorksettingService.deleteWorkWorksettingByWorkIds(workIds));
    }
}
