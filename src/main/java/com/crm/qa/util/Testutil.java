package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.crm.qa.base.Testbase;

public class Testutil extends Testbase {

    public static String TESTDATA_SHEET_PATH = "C:\\Users\\hinai\\New workspace\\freeCRM\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCRMTestData.xlsx";
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;

    private static Workbook book;
    private static Sheet sheet;

    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
            book = WorkbookFactory.create(file);
            sheet = book.getSheet(sheetName);

            if (sheet == null) {
                return new Object[0][0]; // return empty array if sheet not found
            }

            Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
            
            for (int i = 0; i < sheet.getLastRowNum(); i++) {
                for (int k = 0; k < sheet.getRow(i + 1).getLastCellNum(); k++) {
                    data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                    System.out.println(data[i][k]);
                }
            }
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return new Object[0][0]; // return empty array if error occurs
        } finally {
            try {
                if (file != null) {
                    file.close(); // Ensure the file input stream is closed
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void takeScreenshotAtEndOfTest(WebDriver driver) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        try {
            FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
