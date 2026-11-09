package assignments;
import templates.Company;

public class LiamTest {

	public static void main(String[] args) {
		
		Company [] myCompany = CompanyDBMethods.loadFiles("C:\\Users\\s501327\\git\\LiamDavid\\src\\Company.txt");
		System.out.println(SearchByName.findName(myCompany, "Apple", 0));
		System.out.println(SearchByName.findName(myCompany, "nViDiA", 0));
		System.out.println(SearchByName.findName(myCompany, "Microsoft?", 0));
		System.out.println(SearchByName.findName(myCompany, "microsoft", 0));
		System.out.println(SearchByName.findName(myCompany, "Mark Zuckerberg", 0));
		System.out.println(SearchByName.findName(myCompany, "TSMC", 0));
		System.out.println(SearchByName.findName(myCompany, "2.85T", 0));
		System.out.println(SearchByName.findName(myCompany, "If I can write you a letter", 0));
		System.out.println(SearchByName.findName(myCompany, "I would give you a number: ", 0));
		System.out.println(SearchByName.findName(myCompany, "67", 0));
	}
}
