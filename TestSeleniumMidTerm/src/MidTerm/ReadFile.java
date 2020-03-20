package MidTerm;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFile {
	 public static void main(String[] args) throws IOException
	 {
	        FileInputStream wrkbook =new FileInputStream("C:\\Users\\14169\\Desktop\\college\\input.xlsx");
	        XSSFWorkbook page =new XSSFWorkbook(wrkbook);
	        XSSFSheet sheet=page.getSheetAt(0);
	        Row row= sheet.getRow(0);
	        Cell cell=row.getCell(0);
	        Cell cell2=row.getCell(1);
	        System.out.println(cell);
	        System.out.println(cell2);
	    }


}
