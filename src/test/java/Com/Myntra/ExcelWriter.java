package Com.Myntra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) {
		try(XSSFWorkbook workbook=new XSSFWorkbook()){
			Sheet sheet=workbook.createSheet("sheet1");
			Object[][] data= {
					{"name","age","city"},
					{"pavan",45,"bengalore"},
					{"priya",30,"chennai"}
			};
			int rowNum=0;
			for(Object[] rowdata:data) {
				Row row =sheet.createRow(rowNum++);
				int colNum=0;
				for(Object field:rowdata) {
					Cell cell=row.createCell(colNum++);
					if(field instanceof String ) {
						cell.setCellValue((String)field);
					}else if(field instanceof Integer) {
						cell.setCellValue((Integer)field);
					}
				}
			}
		try(FileOutputStream os=new FileOutputStream("data.xlsx")){
			workbook.write(os);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}
}