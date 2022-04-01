package FileReading.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FilesReading {
	
	public static void readdata() throws IOException {
		File f = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\ModelFile\\sa.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetat = wb.getSheetAt(0);
		Row row = sheetat.getRow(1);
		Cell cell = row.getCell(0);
		CellType typeofcell = cell.getCellType();
		if(typeofcell.equals(CellType.STRING))
		{
			String stringcellvalue=cell.getStringCellValue();
			System.out.println(stringcellvalue);
		}
		else if(typeofcell.equals(CellType.NUMERIC))
		{
			double numericcellvalue = cell.getNumericCellValue();
			int nvalue = (int) numericcellvalue;
			System.out.println(nvalue);
			
			
		}
		else
		{
			System.out.println("Invalid Cell Type");
		}
	}
	public static void main(String[] args) throws IOException {
		readdata();
	}

}
