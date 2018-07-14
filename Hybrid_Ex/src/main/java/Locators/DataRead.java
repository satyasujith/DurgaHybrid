package Locators;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	XSSFWorkbook wb;
	XSSFSheet st;
	XSSFCell cell;
public void data() throws IOException
{
	FileInputStream ExcelFile = new FileInputStream("D:\\Durga_proj\\Hybrid_Ex\\src\\main\\java\\Locators\\Data.xlsx");
	wb = new XSSFWorkbook(ExcelFile);
    st = wb.getSheetAt(0);
}

public String getCellData(int RowNum, int ColNum) throws Exception
{
	  cell = st.getRow(RowNum).getCell(ColNum);
    String CellData = cell.getStringCellValue();
    return CellData;
}
}
 