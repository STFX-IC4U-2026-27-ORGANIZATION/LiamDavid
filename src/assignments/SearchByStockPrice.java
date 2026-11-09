package assignments;
import templates.Company;

public class SearchByStockPrice {
	
	// DESCRIPTION - returns index of Comapny[] matching StockPrice
	// PARAMETERS - Company[]a String companyName int index
	// RETURN - String
	public static String SearchStockPrice(Company[]a, String stockPrice, int index) {
		
		if(index >= a.length)
			return "Match not found. Please try agian.";
		
		if(a[index].getStockPrice().equals(stockPrice))
			return a[index].getName();
					
		return SearchStockPrice(a,stockPrice, index + 1);

		
	}
	
}
