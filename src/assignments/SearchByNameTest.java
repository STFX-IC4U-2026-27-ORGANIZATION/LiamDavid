package assignments;
import templates.Company;
import assignments.SearchByNetPrice;

public class SearchByNameTest {

	public static void main(String[] args) {
		
		Company [] myCompany = CompanyDBMethods.loadFiles("C:\\Users\\s404364\\git\\LiamDavid\\src\\Company.txt");	
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "5.08T", 0));










	}

}
