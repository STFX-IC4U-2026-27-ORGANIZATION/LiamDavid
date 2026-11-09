package assignments;
import assignments.CompanyDBMethods;
import templates.Company;

public class loadFileTest {

	public static void main(String[] args) {
		
		Company [] myCompany = CompanyDBMethods.loadFiles("C:\\Users\\s404364\\git\\LiamDavid\\src\\Company.txt");
		System.out.println(myCompany[4]);
		

	}

}
