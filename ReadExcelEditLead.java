package week5.day2;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelEditLead {

	public static String[][] readData(String filename) throws IOException {
		// TODO Auto-generated method stub

//		Steps to read from excel

//       * 1) Open the workbook using file name and path

		XSSFWorkbook wb = new XSSFWorkbook("C://Course/Selenium/data/" + filename + ".xlsx");

//       * 2) Go to the specific sheet (bysheet name or index) 

		XSSFSheet sheetAt = wb.getSheetAt(0);

		int rowNum = sheetAt.getLastRowNum();
		System.out.println("Number of rows presented :" + rowNum);

//        * 3) Go to the specific row (by index) 

		int cellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("Number of cell presented :" + cellNum);

		// * 4) Go to the specific column (by index) -- cell
//        XSSFCell cell = sheetAt.getRow(1).getCell(3);
//        String stringCellValue = cell.getStringCellValue();
		// System.out.println(stringCellValue);

		String[][] data = new String[rowNum][cellNum];

		// * 5) Read the content
		for (int i = 1; i <= rowNum; i++) {

			XSSFRow row = sheetAt.getRow(i);

			for (int j = 0; j < cellNum; j++) {
				String stringCellValue2 = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);

				data[i - 1][j] = stringCellValue2;
			}

		}

		wb.close();

		return data;
	}

}
