package MidTerm;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteClass {
	
	 public static void main(String[] args) throws IOException
	    {

	            File file = new File("C:\\Users\\14169\\Desktop\\college\\input.xlsx");
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet first_sheet = workbook.createSheet("First Sheet");

	        first_sheet.createRow(0).createCell(0).setCellValue("arana51@gmail.com");
	        first_sheet.getRow(0).createCell(1).setCellValue("Pass123");

	        try {
	            FileOutputStream fos = new FileOutputStream(file);
	            workbook.write(fos);
	        }catch (Exception e)
	        {
	            e.printStackTrace();
	        }

	    }
}


