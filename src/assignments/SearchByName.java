package assignments;
import templates.Company;

public class SearchByName {
	
	// DESCRIPTION - Returns index of company in Company[] matching name, -1 if not found.
	// PARAMETERS - Company[] a, String name, int index
	// RETURN - int
	public static int findName(Company [] a, String name, int index) {
		
		// error case
		if(index >= a.length)
			return -1;
		
		// base case
		if(a[index].getName().equalsIgnoreCase(name))
			return index;
		
		// processing
		return findName(a, name, index++);
	}

}
