package com.it.controller;

import com.it.Application;
import com.it.pojo.TestLog;
import com.it.service.TestLogService;
import com.it.util.R;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class TestController {

    @Autowired
    private TestLogService testLogService;



    @Test
    public void add(){
        String test = "正常≤0.5mA                （       0.0551       mA）";
        String[] split = test.split("（");
        for (String s : split) {
//            System.out.println(s);
        }
//        System.out.println(split[1].trim());
        String[] s = split[1].trim().split(" ");
        System.out.println(s[0]);




    }

    @Test
    public void out() throws IOException {
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

//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        int count = 1;
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Work\\excel"+count+".xlsx");
        count++;
        //5.输出
        workbook.write(fileOutputStream);
        //6.关闭
        workbook.close();


    }
}
