package com.it.util;

import com.it.pojo.TestLog;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class InputUtil {

    public static void add(){
        try {

            String path="C:\\Work\\mysql.xlsx";
            // 获取文件输入流
            InputStream inputStream = new FileInputStream(path);
            // 定义一个org.apache.poi.ss.usermodel.Workbook的变量
            Workbook workbook = null;

            workbook = new XSSFWorkbook(inputStream);

            // 获取第一张表
            Sheet sheet = workbook.getSheetAt(0);

            // sheet.getPhysicalNumberOfRows()获取总的行数
            // 循环读取每一行
            List<TestLog> list=new ArrayList<>();
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                // 循环读取每一个格
                Row row = sheet.getRow(i);
                // row.getPhysicalNumberOfCells()获取总的列数
                int index = 0;
                TestLog testLog=new TestLog();
                for (; index < 4; index++) {
                    String id="N/A";
                    // 获取数据，但是我们获取的cell类型
                    // 代码上的内容自己根据实际需要自己调整就可以，这里只是展示一个样式···~
                    Cell cell = row.getCell(index);
                    if (cell!=null){
                        // 转换为字符串类型
                        cell.setCellType(CellType.STRING);
                        // 获取得到字符串
                        id = cell.getStringCellValue();
                        System.out.println(id);
                    }

                }


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
