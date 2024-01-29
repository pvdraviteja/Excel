package sheet;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Wastepaper {
@DataProvider(name = "datas")
	
	public Object[][] Employe() throws Throwable {
   	 
   	 File file= new File("./Excelsheet/Pen.xlsx");
   	 
   	 FileInputStream stream = new FileInputStream(file);
   	 
   	 XSSFWorkbook wb = new XSSFWorkbook(stream);
   	 XSSFSheet sheet = wb.getSheetAt(0);
   	 
   	 int rows = sheet.getPhysicalNumberOfRows();
   	 int cols = sheet.getRow(1).getLastCellNum();
   	 
   	 Object [][] data = new Object[rows-1][cols];
   	 
   	    for(int i=0;i<rows-1; i++) {
   	    	
   	    	for(int j=0;j<cols; j++) {
   	    		
   	    		DataFormatter df= new DataFormatter();
   	    		
   	    		data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
   	    		
   	    		System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
   	    	}
   	    }
   	 
   	 
		return data;
   	 
}
}
