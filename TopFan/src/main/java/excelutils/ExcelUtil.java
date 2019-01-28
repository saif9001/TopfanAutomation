package excelutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;


public class ExcelUtil {
	
	
	private static XSSFWorkbook excelWBook;
	
	//public static final String currentDir = System.getProperty("user.dir");
	public static String testDataExcelPath="/Users/kiwitech/Documents/New Automation copy/Automation copy/src/main/java/excelutils/UserData.xlsx";
	public static String sheetName="sheet1";
	
	
	
	
	
	private static XSSFSheet excelWSheet;
	private static XSSFRow row;
	
	private static XSSFCell cell;
	
	private static XSSFCell cell1;
	String currentdata;
	
    public static String [][] userdata=new String[18][2];
	


	
	//public static String testDataExcelFileName="TestData.xlsx";
	
	public static String[][] setExcelFile(String Path,String SheetName) throws Exception {

			try {

   			// Open the Excel file
            //In this statetment we are setting the path of excel file
				
			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			excelWBook = new XSSFWorkbook(ExcelFile);

			excelWSheet = excelWBook.getSheet(SheetName);

			} catch (Exception e){

				throw (e);

			}
			
	//Method to read data from excel..
			cell=excelWSheet.getRow(1).getCell(1);
			String s=cell.getStringCellValue();
			//System.out.println(s);
			
			try{
			 row=excelWSheet.getRow(1);
			 
			//final  XSSFCell cell2=row.getCell(1, Row.RETURN_BLANK_AS_NULL);

			 
				 
				 cell1=row.createCell(3);
				 
				 
				 cell.setCellType(cell.CELL_TYPE_STRING);
				 
				 
				 cell1.setCellValue("false");
			 
			 
			
			 FileOutputStream fileOut = new FileOutputStream(Path);

			 excelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();
			 
			
			}
			catch(Exception e){
				
				
			}
			int row=0;
			int col=0;
			
			for(int i=1;i<=18;i++){
				
				
				boolean b=false;
				
				//int i2=0;
				
				
				
				boolean cellnull=false;
				

				for(int j=0;j<=1;j++){
					
				cell=	excelWSheet.getRow(i).getCell(j);
				if(cell==null){
					cellnull=true;
					
					System.out.println("Inside First IF");
					
					break;
				}
				else{
				String celldata=cell.getStringCellValue();
				
				
			/*	if(j==0){
			
				if(celldata.equals(testdatatopick ))
				{
					
					
				
				}
				else{
					
					break;
				}}
				*/
				ExcelUtil.userdata[row][col]=celldata;
				
				System.out.println(ExcelUtil.userdata[row][col]);
				
				//System.out.println(ExcelUtil.userdata[i2]);
				
				
		
				
			//	System.out.println(ExcelUtil.userdata[row][col]);
			
				
				
				
				
				
				
				
				}
			
				
				col++;
				
				
				
				}
				
			//	System.out.println("row before increament"+row);
				row++;
				col=0;
			}
			
		//	cell=excelWSheet.getRow(1).getCell(3);
			
	//		String s1=cell.getStringCellValue();
			
			//System.out.println(s1);
			
			
			
			
			for(int i=0;i<2;i++){
				
				for (int j=0;j<2;j++){
					
			//		System.out.println(ExcelUtil.userdata[i][j]);
				}
			}
			System.out.println("Before return statement");
			
		/*The returned 2d String should be same as the number of data returned from excel ..If there will be mismatch of size of string declared
			we will get data mismatch error */
			return ExcelUtil.userdata;
			
			
			

	}
	public static void main(String[] args) throws Exception{
		
		
		ExcelUtil.setExcelFile(ExcelUtil.testDataExcelPath,"sheet1");
		
		System.out.println("hello");
		
		
		
		
	}
}


