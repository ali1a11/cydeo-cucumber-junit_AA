package com.cydeo.tests_POI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";

        // File file = new File(path); //??

        // to read from excel file we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook > sheet > row > cell

        // <1> Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // <2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // <3> Select row and cell
        // Print out Mary's cell
        // indexes starts from 0
        System.out.println(sheet.getRow(1).getCell(0));

        // print out Developer
        System.out.println(sheet.getRow(3).getCell(2));

        // .getPhysicalNumberOfRows() method
        // Return the count of used cell only
        // Starts counting from 1

        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows getPhysicalNumberOfRows() " + usedRows);


        // .getLastRowNum() method
        // Returns the number from top cell to bottom cell
        // it doesn't care if the cell is empty or not
        // Starts counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("lastUsedRow .getLastRowNum() " + lastUsedRow);


        //TODO: Create a logic to print Vinod's last name and job ID
        for (int rowNum = 0; rowNum < lastUsedRow; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")) {
                System.out.println("Vinod's last name: " + sheet.getRow(rowNum).getCell(1) + " , job ID: " + sheet.getRow(rowNum).getCell(2));
            }
        }


    }
}
