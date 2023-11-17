package com.evs.qucode.readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	public static void main(String[] args) throws IOException {
		FileInputStream filobj = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\poi data.xlsx");// selenium have no any method
																							// how to read data in excel
																							// file.
		// with help of this class we can take data from excel sheet
		// inputStream -AbstratClass -1) fileInputStream . 2) fileOutputStream with help
		// of this class we can give input data in excel sheet
		XSSFWorkbook wbook = new XSSFWorkbook(filobj); // this class is overloaded,there are many constructor but we use
														// FileInputStream.
		XSSFSheet sheet = wbook.getSheet("Sheet1"); // parent sheet
		// this class use to focus on excel sheet.
		// Workbook--interface
		// XSSFWorkbook ---xlsx read......always import org.apache.poi.ss(Sprees
		// Sheet).usermodel //
		// HSSFWorkbook-----xls
		XSSFRow rowobj = sheet.getRow(0);// parent Row
		XSSFCell cellobj = rowobj.getCell(0);// parent cell
		String getFirstRowFirstcellData = cellobj.getStringCellValue();

		System.out.println(getFirstRowFirstcellData);
		System.out.println(".............print first------");
		try {
			Thread.sleep(4000);
			FileInputStream filobj2 = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\poi data.xlsx");// selenium have no any
																								// method how to read
																								// data in excel file.

			Workbook wbookobj = new XSSFWorkbook(filobj2); // there are two type class with same name but first have no
															// parameterize and second class have parameterize
			Sheet sheetobj = (XSSFSheet) wbook.getSheet("Sheet1"); // parent sheet
			for (int i = 0; i <= sheetobj.getLastRowNum(); i++) {// this class use to focus on excel sheet.
				System.out.print(i + "row data :");
				Row rowobj1 = sheet.getRow(i);// parent Row
				for (int j = 0; j <= rowobj.getLastCellNum(); j++) {

					Cell cellobj1 = rowobj.getCell(j);// parent cell
					String getFirstRowFirstcellData2 = cellobj.getStringCellValue();
					System.out.print(j + "cell:" + getFirstRowFirstcellData);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("END>>>>>>>>>");
		}

	}

}
