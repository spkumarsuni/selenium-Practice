package com.virtusa.guru99.utils;

import java.util.Map;

public class TestRepository {
	
	public static int rowNum;
	public static Map<String,String> rowData;
	
	public Map<String,String> getRowData()
	{
		return rowData;
	}
	
	public int getRowNum()
	{
		return rowNum;
	}
	
	public TestRepository(int rowNum,Map<String,String>rowData)
	{
		TestRepository.rowData=rowData;
		TestRepository.rowNum=rowNum;
	
	}

}
