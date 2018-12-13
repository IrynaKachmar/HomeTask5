package emploee;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DemoEmploee {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir") + "/src/main/resources/";
		String pathFileToRead = currentDir + "emploee.json";
		try 
		{
			ArrayList <emploee> arrayEmpl = ReaderFile.readFileToArray(pathFileToRead);
			ReaderFile.arrayPrint(arrayEmpl);
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		}
		
	}
}
