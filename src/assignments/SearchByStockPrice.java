package assignments;
import templates.Company;

public class SearchByStockPrice {
	
	// DESCRIPTION - returns index of Comapny[] matching StockPrice
	// PARAMETERS - Company[]a String companyName int index
	// RETURN - String
	public static int SearchStockPrice(Company[]a, String stockPrice, int index) {
		
		if(index >= a.length)
			return -1;
		
		if(a[index].getStockPrice().equals(stockPrice))
			return index;
					
		return SearchStockPrice(a,stockPrice, index + 1);

		
	}
	
}
