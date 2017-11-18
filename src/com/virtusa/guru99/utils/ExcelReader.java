package com.virtusa.guru99.utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
	
//	public static String fileName="/Users/nandakishoreannavajjala/Documents/sample test data/testdata1.xlsx";
//	public static String sheetName = "sheet1";
	
	//Method1:To get column data for each row
	
	public List<TestRepository> readDataFromExcel(String fileName, String sheetName) throws Exception {
		
	    Map<Integer, Map<String, String>> rowDataAsMap = new HashMap<>();

	    Workbook workbook = loadExcelWorkBook(fileName);
	    Sheet sheet = workbook.getSheet(sheetName);
	    Iterator<Row> rowIterator = sheet.iterator();
	    Row headerRow = rowIterator.next();

	    while (rowIterator.hasNext()) {
	      Row nextRow = rowIterator.next();
	      if (nextRow == null) {
	        continue;
	      } else {
	          Map<String, String> columnDataAsMap = getColumnDataAsMap(headerRow, nextRow);
	          rowDataAsMap.put(nextRow.getRowNum(), columnDataAsMap);
	        }
	    }
	    closeWorkbook(workbook);
	    
	    //System.out.println(rowDataAsMap.size());
	    
	    List<TestRepository> testRepList= new ArrayList<>();
	    
	    for(Map.Entry<Integer, Map<String,String>> MapsingleRowData : rowDataAsMap.entrySet())
	    {
	    		testRepList.add(new TestRepository(MapsingleRowData.getKey(),MapsingleRowData.getValue()));
	    }
	    
	    return testRepList;
	  }



	//Menthod2: To  get all the column data
	  private Map<String, String> getColumnDataAsMap(Row headerRow, Row nextRow) {
	    Map<String, String> columnDataAsMap = new HashMap<>();
	    DataFormatter dataformatter = new DataFormatter(Locale.US);
	    int numberOfColumns = nextRow.getLastCellNum();
	    int colIndexStart = 1;
	    String columnValue;
	    for (int colIndex = colIndexStart; colIndex < numberOfColumns; colIndex++) {
	      try {
	        columnValue = nextRow.getCell(colIndex).getStringCellValue();
	      } catch (Exception e) {
	        columnValue = dataformatter.formatCellValue(nextRow.getCell(colIndex));
	      }
	      columnDataAsMap.put(headerRow.getCell(colIndex).getStringCellValue().replaceAll("\\s+", "")
	          .replaceAll("\\.", "_"), columnValue);
	    }
	    return columnDataAsMap;
	  }


		

		private void closeWorkbook(Workbook workbook) throws Exception {
			
			workbook.close();
			
		}



		private Workbook loadExcelWorkBook(String fileName) throws Exception {
			
			FileInputStream fis= new FileInputStream(fileName);
			
			XSSFWorkbook workbook= new XSSFWorkbook(fis);
			
			return workbook;
		}
		
		/*public static void main(String[] args) throws Exception {
			ExcelReader details = new ExcelReader();
	        System.out.println("Method Details : "+details.readDataFromExcel(fileName,sheetName));
			
	    }*/

		
}

