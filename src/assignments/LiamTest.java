package assignments;
import templates.Company;

public class LiamTest {

	public static void main(String[] args) {
		
		Company [] myCompany = CompanyDBMethods.loadFiles("C:\\Users\\s501327\\git\\LiamDavid\\src\\Company.txt");
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "5.08T", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "4.83T", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "340B", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "5.08", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "Satya Nadella", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "TSMC", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "3.55T", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "3.55t", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "123", 0));
		System.out.println(SearchByNetPrice.findNetPrice(myCompany, "2T", 0));
	}
}
