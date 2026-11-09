package assignments;
import templates.Company;

public class SearchByNetPrice {
	
	// DESCRIPTION - Returns index of CEO in Company[] matching CEO, -1 if not found.
	// PARAMETERS - Company[] a, String ceo, int index
	// RETURN - int
	public static int findNetPrice(Company [] a, String netPrice, int index) {
		
		// error case
		if(index >= a.length)
			return -1;
		
		// base case
		if(a[index].getNetPrice().equalsIgnoreCase(netPrice))
			return index;
		
		// processing
		return findNetPrice(a, netPrice, ++index);
	}

}
