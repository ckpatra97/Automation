package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getExcelData(String sheetName,int rowNum,int ColNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Chinmay\\Desktop\\New XLS Worksheet.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row r=sh.getRow(rowNum);
		String data=r.getCell(ColNum).getStringCellValue();
		return data;
	}
	
	public Properties getPropertyObj() throws IOException
	{
		FileInputStream fis1=new FileInputStream("E:\\data\\newData.properties");
		Properties pObj=new Properties();
		pObj.load(fis1);
		return pObj;
	}

}
