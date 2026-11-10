package assignments;
import templates.Company;

public class SearchAllDataMember {
	
	// DESCRIPTION - Returns index of any data member in Company[] matching any data member, -1 if not found.
	// PARAMETERS - Company[] a, String target
	// RETURN - int
	public static int indexFinder(Company [] a, String target) {
		
		int temp = 0;
		int index = 0;
		
		if((index = SearchByName.findName(a, target, temp)) != -1)
			
			return index;
		
		if((index = SearchByStockPrice.SearchStockPrice(a, target, temp)) != -1) 
			
			return index; 
		
		if((index = SearchByCEO.findCEO(a, target, temp)) != -1)
			
			return index; 
		
		if((index = SearchByNetPrice.findNetPrice(a, target, temp)) != -1)
			
			return index; 
		
		return -1;
	}

}
