package com.it.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.it.pojo.TestLog;
import com.it.service.TestLogService;
import com.it.util.PageCommon;
import com.it.util.R;
import com.it.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/testLog")
public class TestLogController {
    @Autowired
    private TestLogService testLogService;

    @PostMapping("/init")
    @ResponseBody
    public R<Page> page(PageCommon pageCommon){
        //分页构造器
        Page pageInfo = new Page(pageCommon.getPage(),pageCommon.getPageSize());

        LambdaQueryWrapper<TestLog> queryWrapper =new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(TestLog::getId);
        testLogService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }


    @PostMapping("/test")
    @ResponseBody
    public R<String> test(@RequestBody TestLog testLog){
        System.out.println(testLog);
        TestLog log = StringUtil.give(testLog);
        System.out.println(log);
        boolean save = testLogService.save(log);

        if (save){
            return R.success("ok");
        }
        return R.error("上传失败");
    }

    @PostMapping("/out")
    @ResponseBody
    public R<String> out() {
        // 1.创建工作簿
        Workbook workbook = new XSSFWorkbook();
        // 2.创建表名
        Sheet sheet = workbook.createSheet("整合表");
        //3.创建单元格并写入数据
        Row rowHead = sheet.createRow(0);
        rowHead.createCell(0).setCellValue("operator");
        rowHead.createCell(1).setCellValue("SN");
        rowHead.createCell(2).setCellValue("TestName");
        rowHead.createCell(3).setCellValue("对地漏电流1");
        rowHead.createCell(4).setCellValue("对地漏电流2");
        rowHead.createCell(5).setCellValue("外壳漏电流1");
        rowHead.createCell(6).setCellValue("外壳漏电流2");
        rowHead.createCell(7).setCellValue("患者漏电流I DC+ AC1");
        rowHead.createCell(8).setCellValue("患者漏电流I DC+ AC2");
        rowHead.createCell(9).setCellValue("患者漏电流I  DC+AC1");
        rowHead.createCell(10).setCellValue("患者漏电流I  DC+AC2");
        rowHead.createCell(11).setCellValue("患者漏电流Ⅲ");
        rowHead.createCell(12).setCellValue("患者辅助电流 DC+AC1");
        rowHead.createCell(13).setCellValue("患者辅助电流 DC+AC2");
        rowHead.createCell(14).setCellValue("患者辅助电流 DC+AC1");
        rowHead.createCell(15).setCellValue("患者辅助电流 DC+AC2");
        rowHead.createCell(16).setCellValue("保护接地阻抗");
        rowHead.createCell(17).setCellValue("输入功率");

        List<TestLog> list = testLogService.list();

        for (int i = 0; i < list.size(); i++) {
            int j = 0;

            Row row = sheet.createRow(i + 1);
            row.createCell(j++).setCellValue(list.get(i).getOperator());
            row.createCell(j++).setCellValue(list.get(i).getSn());
            row.createCell(j++).setCellValue(list.get(i).getTestName());
            row.createCell(j++).setCellValue(list.get(i).getFloorCurrent1());
            row.createCell(j++).setCellValue(list.get(i).getFloorCurrent2());
            row.createCell(j++).setCellValue(list.get(i).getShellCurrent1());
            row.createCell(j++).setCellValue(list.get(i).getShellCurrent2());
            row.createCell(j++).setCellValue(list.get(i).getPatientCurrent1());
            row.createCell(j++).setCellValue(list.get(i).getPatientCurrent2());
            row.createCell(j++).setCellValue(list.get(i).getPatientCurrent3());
            row.createCell(j++).setCellValue(list.get(i).getPatientCurrent4());
            row.createCell(j++).setCellValue(list.get(i).getPatientCurrent5());
            row.createCell(j++).setCellValue(list.get(i).getPatientAssistCurrent1());
            row.createCell(j++).setCellValue(list.get(i).getPatientAssistCurrent2());
            row.createCell(j++).setCellValue(list.get(i).getPatientAssistCurrent3());
            row.createCell(j++).setCellValue(list.get(i).getPatientAssistCurrent4());
            row.createCell(j++).setCellValue(list.get(i).getImpedance());
            row.createCell(j++).setCellValue(list.get(i).getInputPower());
        }
        //4.创建流用于输出
        int count = 1;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Work\\excel"+count+".xlsx");
            count++;
            //5.输出
            workbook.write(fileOutputStream);
            //6.关闭
            workbook.close();
            return R.success("ok");
        } catch (FileNotFoundException e) {

            return R.error("error");
        } catch (IOException e) {

            return R.error("error");
        }




    }

}
