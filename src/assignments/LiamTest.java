package assignments;
import templates.Company;

public class LiamTest {

	public static void main(String[] args) {
		
		Company [] something = CompanyDBMethods.loadFiles(":)");
		Company [] myCompany = CompanyDBMethods.loadFiles("C:\\Users\\s501327\\git\\LiamDavid\\src\\Company.txt");
		System.out.println(myCompany[0].getName());
		System.out.println(myCompany[0].getStockPrice());
		System.out.println(myCompany[0].getCeo());
		System.out.println(myCompany[0].getNetPrice());
		System.out.println(myCompany[9].getName());
		System.out.println(myCompany[9].getStockPrice());
		System.out.println(myCompany[9].getCeo());
		System.out.println(myCompany[9].getNetPrice());
		System.out.println(myCompany[4]);
	}

}
