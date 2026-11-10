package assignments;
import templates.Company;

public class LiamTest {

	public static void main(String[] args) {
		
		Company [] myCompany = CompanyDBMethods.loadFiles("C:\\Users\\s501327\\git\\LiamDavid\\src\\Company.txt");
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "apple"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "351.56"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "John Ternus"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "5.08T"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "Samsung"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "45.10"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "Han Jong-hee"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "340B"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "Liam Huang"));
		System.out.println(SearchAllDataMember.indexFinder(myCompany, "!"));
		
	}
}
