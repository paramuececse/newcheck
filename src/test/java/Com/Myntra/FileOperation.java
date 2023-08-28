package Com.Myntra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class FileOperation {
public static void main(String[] args) throws IOException {
		//Creating  an object of file
		Workbook wb=new XSSFWorkbook();
		try {
			//create a excel file with specified location
			FileOutputStream file=new FileOutputStream("F:\\java eclipse\\MavenProject\\src\\com"
					+ "\\mavencheck\\TaskExcel.xlsx");
			System.out.println("File successfully created");
			//creating a Sheet in excel 
			Sheet sheet1=wb.createSheet("Sheet1");
			System.out.println("Sheets Has been Created successfully");
			Object[][] data= {
					{"Name",   "Age","Email"},
					{"John Doe",   30,"john@test.com"},{"John Doe",   28,"john@test.com"},{"Bob smith",  35,"jacky@examle.com"},
					{"swapnil",    37,"joe@example.com"},{
					"parameshwari",24,"paramu99@.com"             //write a new name in the excel
					}
			};
			int rowNum=0;
			for(Object[] rowdata:data) {
				// Creating a new row in the sheet
				Row row =sheet1.createRow(rowNum++);         
				
				int colNum=0;
				for(Object field:rowdata) {
					// This line create a cell in the next column of that row
					Cell cell=row.createCell(colNum++);
					
					if(field instanceof String ) {
						cell.setCellValue((String)field);
					}else if(field instanceof Integer) {
						cell.setCellValue((Integer)field);
					}
				}
			}
			System.out.println("data added successfully");
			System.out.println("_______________________");
			wb.write(file);
			//read data from excel
	FileInputStream intputstream=new FileInputStream("F:\\java eclipse\\MavenProject\\src\\com"
					+ "\\mavencheck\\TaskExcel.xlsx");
		
	XSSFWorkbook workbook=new XSSFWorkbook();
		
		for(Row row:sheet1) {
			for(Cell cell:row) {
				//to check if cell contains is string or numeric
				if(cell.getCellType()==CellType.STRING) {
					System.out.print(cell.getStringCellValue()+"\t");	
			}else 
				System.out.print(cell.getNumericCellValue()+"\t");
			}
			
			System.out.println();
			}	
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
