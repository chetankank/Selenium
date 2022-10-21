package utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameter {

	public static String getexcelData(String name, int row , int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\backup\\e\\software java\\eclipse\\NopCom\\src\\test\\resources\\parameterization.xlsx");
		String data = WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}

}
