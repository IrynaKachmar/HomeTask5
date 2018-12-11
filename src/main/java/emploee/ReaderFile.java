package emploee;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
 
	public static ArrayList <emploee> readFileToArray(String fileToRead) throws FileNotFoundException {	
		JSONParser parser = new JSONParser();
		ArrayList <emploee> result = new ArrayList <emploee> ();
		try {
			Object obj = parser.parse(new FileReader(fileToRead));
			JSONArray arr =  (JSONArray) obj;
			
			int i=0;
			while (i<arr.size()) {
				JSONObject empl = (JSONObject) arr.get(i);
				emploee p = new emploee((String) empl.get("name"), (String) empl.get("position"), (String) empl.get("salary"));
				result.add(p);
				
				i++;
			}	
		}
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();  }
		catch(ParseException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		 
		return result;
	} 

	public static void arrayPrint(ArrayList <emploee> e) {
		for (emploee s : e) {
			System.out.println(s.toString());
		}
	}

}
