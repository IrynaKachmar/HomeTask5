package emploee;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class DemoEmploee {

	public static void main(String[] args) {
	    String currentDir = System.getProperty("user.dir") + "/src/main/resources/";
	    String pathFileToRead = currentDir + "emploee.json";
		try {
		    ArrayList <emploee> arrayEmpl = ReaderFile.readFileToArray(pathFileToRead);
		    Collections.sort(arrayEmpl);
		    ReaderFile.arrayPrint(arrayEmpl);
		} 
		catch (FileNotFoundException e) {	
		    e.printStackTrace();
		}
	}

}
