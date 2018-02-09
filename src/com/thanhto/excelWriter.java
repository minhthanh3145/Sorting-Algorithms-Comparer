package com.thanhto;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelWriter {
    long[][]table;
    excelWriter(long[][]table){
        this.table = table;
    }

    void write(){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("runtime");

        int rowCount = 0;

        for (long[] aRow : table) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for (Long field : aRow) {
                Cell cell = row.createCell(++columnCount);

                    cell.setCellValue(((double)field)/1000000000);

            }

        }

        System.out.println("Print successfully");

        try (FileOutputStream outputStream = new FileOutputStream("runtime.xlsx")) {
            workbook.write(outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
