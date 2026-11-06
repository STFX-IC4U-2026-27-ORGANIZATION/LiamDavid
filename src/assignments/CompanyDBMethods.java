package assignments;
import java.util.ArrayList;
import templates.Company;
import java.io.*;

public class CompanyDBMethods {
	
	// DESCRIPTION - Returns Company[] populated with Company objects from file. 
	// PARAMETERS - String fileName 
	// RETURN - Company[]
	public static Company[] loadFiles(String fileName) {
		
		ArrayList <Company> myList = new ArrayList <> ();
		BufferedReader br = null;
		String word = "";
		
		try {
			
			br = new BufferedReader(new FileReader(fileName));
			while((word = br.readLine()) != null) {
				
				myList.add(new Company(word, br.readLine(), br.readLine(), br.readLine()));
			}
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				
				br.close();
			}
			
			catch(Exception f) {
				
				f.printStackTrace();
			}
		}
		
		Company [] myArray = new Company [myList.size()];
		myList.toArray(myArray);
		return myArray;
	}
}