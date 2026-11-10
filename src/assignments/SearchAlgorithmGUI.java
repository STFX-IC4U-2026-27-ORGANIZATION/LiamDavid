package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import templates.Company;

public class SearchAlgorithmGUI {

	private JFrame frame;
	private JTextField txtSearchCriteria;
	private JTextField txtName;
	private JTextField txtStockPrice;
	private JTextField txtCeo;
	private JTextField txtNetPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchAlgorithmGUI window = new SearchAlgorithmGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchAlgorithmGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewTitle = new JLabel("Company Database");
		lblNewTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewTitle.setBounds(136, 11, 169, 14);
		frame.getContentPane().add(lblNewTitle);
		
		txtSearchCriteria = new JTextField();
		txtSearchCriteria.setBounds(125, 41, 156, 20);
		frame.getContentPane().add(txtSearchCriteria);
		txtSearchCriteria.setColumns(10);
		
		JLabel lblSearchCriteria = new JLabel("Search Criteria");
		lblSearchCriteria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSearchCriteria.setBounds(44, 44, 84, 14);
		frame.getContentPane().add(lblSearchCriteria);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(125, 93, 156, 20);
		frame.getContentPane().add(txtName);
		
		txtStockPrice = new JTextField();
		txtStockPrice.setColumns(10);
		txtStockPrice.setBounds(125, 126, 156, 20);
		frame.getContentPane().add(txtStockPrice);
		
		txtCeo = new JTextField();
		txtCeo.setColumns(10);
		txtCeo.setBounds(125, 157, 156, 20);
		frame.getContentPane().add(txtCeo);
		
		txtNetPrice = new JTextField();
		txtNetPrice.setColumns(10);
		txtNetPrice.setBounds(125, 188, 156, 20);
		frame.getContentPane().add(txtNetPrice);
		
		JLabel lblComapnyName = new JLabel("Comapny Name:");
		lblComapnyName.setBounds(44, 96, 84, 14);
		frame.getContentPane().add(lblComapnyName);
		
		JLabel lblStockPrice = new JLabel("Stock Price:");
		lblStockPrice.setBounds(44, 129, 84, 14);
		frame.getContentPane().add(lblStockPrice);
		
		JLabel lblCeoName = new JLabel("CEO Name:");
		lblCeoName.setBounds(44, 160, 84, 14);
		frame.getContentPane().add(lblCeoName);
		
		JLabel lblNetPrice = new JLabel("Net Price:");
		lblNetPrice.setBounds(44, 191, 84, 14);
		frame.getContentPane().add(lblNetPrice);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String target = txtSearchCriteria.getText();
				Company[] companies = CompanyDBMethods.loadFiles("C:\\Users\\s404364\\git\\LiamDavid\\src\\Company.txt");
				int index = SearchAllDataMember.indexFinder(companies, target);
				
				if(index != -1) {
		
					txtName.setText(companies[index].getName());
					txtStockPrice.setText(companies[index].getStockPrice());
					txtCeo.setText(companies[index].getCeo());
					txtNetPrice.setText(companies[index].getNetPrice());
					
				}
				else {
					txtName.setText("Error 404");
					txtStockPrice.setText("Error 404");
					txtCeo.setText("Error 404");
					txtNetPrice.setText("Error 404");
				}
				
				
				
			}
		});
		btnSearch.setBounds(308, 40, 89, 23);
		frame.getContentPane().add(btnSearch);
	}
}
