package emploee;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class DemoEmploee {

	public static void main(String[] args) {
	    String currentDir = System.getProperty("user.dir") + "/src/main/resources/";
	    String pathFileToRead = currentDir + "emploee.json";

		try {
            ArrayList <emploee> arrayEmpl1 = ReaderFile.readFileToArray(pathFileToRead);
            Collections.sort(arrayEmpl1);
            System.out.println("List sorted by Name");
            ReaderFile.arrayPrint(arrayEmpl1);
            System.out.println();

            arrayEmpl1.sort(emploee.salaryComparator);
            System.out.println("List sorted by Salary");
            ReaderFile.arrayPrint(arrayEmpl1);
            System.out.println();

            arrayEmpl1.sort(emploee.positionComparator);
            System.out.println("List sorted by Position");
            ReaderFile.arrayPrint(arrayEmpl1);
		}
		catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
	}

}
