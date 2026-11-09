package assignments;
import templates.Company;

public class SearchByCEO {
	
	// DESCRIPTION - Returns index of CEO in Company[] matching CEO, -1 if not found.
	// PARAMETERS - Company[] a, String ceo, int index
	// RETURN - int
	public static int findCEO(Company [] a, String name, int index) {
		
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
