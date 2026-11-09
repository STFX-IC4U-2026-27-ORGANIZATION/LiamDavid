package assignments;
import templates.Company;

public class LiamTest {

	public static void main(String[] args) {
		
		Company [] myCompany = CompanyDBMethods.loadFiles("C:\\Users\\s501327\\git\\LiamDavid\\src\\Company.txt");
		System.out.println(SearchByCEO.findCEO(myCompany, "John Ternus", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "jensEn huang", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "jensEn huang!", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "JENSEN HUANG", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "Satya Nadella", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "TSMC", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "Han Jong-hee", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "620.15", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "asdfg", 0));
		System.out.println(SearchByCEO.findCEO(myCompany, "2T", 0));
	}
}
