import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class GUI_restaurant extends JFrame {

	private JPanel contentPane;
	private JTextField txtRestaurantManagingSystem;
	private JTextField quan_com;
	private JTextField quan_bun;
	private JTextField quan_pho;
	
	//Variable List
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;
	double[] i = new double[5];
	double[] j = new double[5];
	double[] k = new double[5];
	double[] l = new double[5];
	double tax_price;
	double Total_price;
	double sub_total_price;
	double pCom = 1;
	double pBun = 2;
	double pPho = 3;
	double pBanhMi = 4;
	double pMien = 5;
	double pNclc = 1;
	double pCaphe = 6;
	double pCocacola = 3;
	double pPepsi = 3;
	double pMirinda = 4;
	
	private JTextField quan_BanhMi;
	private JTextField quan_mien;
	private JTextField txtDrinkCost;
	private JTextField txtDeliveryCost;
	private JTextField txtFoodCost;
	private JTextField food;
	private JTextField Drink;
	private JTextField Delivery;
	private JTextField sbTotal;
	private JTextField Taxes;
	private JTextField sum;
	private JTextField txtSubTotal;
	private JTextField txtTax;
	private JTextField txtTotal;
	private JTextField txtCm;
	private JTextField txtBn;
	private JTextField txtPh;
	private JTextField txtBnhM;
	private JTextField txtMin;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField quan_Nclc;
	private JTextField quan_CaPhe;
	private JTextField quan_Coca;
	private JTextField quan_pepsi;
	private JTextField quan_Mirinda;
	private JTextField txtNcLc;
	private JTextField txtCPh;
	private JTextField TxtCoca;
	private JTextField txtPepsi;
	private JTextField txtMirinda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_restaurant frame = new GUI_restaurant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_restaurant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Mien = new JPanel();
		Mien.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Mien.setBounds(10, 83, 309, 220);
		contentPane.add(Mien);
		Mien.setLayout(null);
		
		quan_com = new JTextField();
		quan_com.setText("0");
		quan_com.setHorizontalAlignment(SwingConstants.CENTER);
		quan_com.setBounds(240, 17, 59, 25);
		Mien.add(quan_com);
		quan_com.setColumns(10);
		
		quan_bun = new JTextField();
		quan_bun.setText("0");
		quan_bun.setHorizontalAlignment(SwingConstants.CENTER);
		quan_bun.setColumns(10);
		quan_bun.setBounds(240, 52, 59, 23);
		Mien.add(quan_bun);
		
		quan_pho = new JTextField();
		quan_pho.setText("0");
		quan_pho.setHorizontalAlignment(SwingConstants.CENTER);
		quan_pho.setColumns(10);
		quan_pho.setBounds(240, 85, 59, 21);
		Mien.add(quan_pho);
		
		quan_BanhMi = new JTextField();
		quan_BanhMi.setText("0");
		quan_BanhMi.setHorizontalAlignment(SwingConstants.CENTER);
		quan_BanhMi.setColumns(10);
		quan_BanhMi.setBounds(240, 115, 59, 23);
		Mien.add(quan_BanhMi);
		
		quan_mien = new JTextField();
		quan_mien.setText("0");
		quan_mien.setHorizontalAlignment(SwingConstants.CENTER);
		quan_mien.setColumns(10);
		quan_mien.setBounds(240, 148, 59, 25);
		Mien.add(quan_mien);
		
		JCheckBox Tax_choice = new JCheckBox("Tax");
		Tax_choice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cTotal1 = Double.parseDouble(food.getText());
				double cTotal2 = Double.parseDouble(Drink.getText());
				double cTotal3 = Double.parseDouble(Delivery.getText());
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3)/100;
				
				String iTotal = String.format("%.2f", allTotal);
				Taxes.setText(iTotal);
			}
		});
		Tax_choice.setFont(new Font("Tahoma", Font.BOLD, 18));
		Tax_choice.setBounds(6, 182, 125, 21);
		Mien.add(Tax_choice);
		
		JCheckBox Home_deliver_choice = new JCheckBox("Home delivery");
		Home_deliver_choice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double delivery = 3;
				
				if(Home_deliver_choice.isSelected()) {
					String pDelivery = String.format("%.2f", delivery);
					Delivery.setText(pDelivery);
				}
				else {
					double zero = 0;
					String setBack = String.format("%.2f", zero);
					Delivery.setText(setBack);
				}
			}
		});
		Home_deliver_choice.setFont(new Font("Tahoma", Font.BOLD, 18));
		Home_deliver_choice.setBounds(133, 182, 159, 21);
		Mien.add(Home_deliver_choice);
		
		JButton plus1 = new JButton("+");
		plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_com.getText());
				
				num = num + 1;
				quan_com.setText(Double.toString(num));
				
				i[0] = pCom * num;
			}
		});
		plus1.setBounds(166, 16, 64, 24);
		Mien.add(plus1);
		
		JButton minus1 = new JButton("-");
		minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_com.getText());
				
				if(num > 0) {
					num = num -1;
					quan_com.setText(Double.toString(num));
				}
				
				i[0] = i[0] - pCom;
				
			}
		});
		minus1.setBounds(92, 16, 64, 24);
		Mien.add(minus1);
		
		txtCm = new JTextField();
		txtCm.setHorizontalAlignment(SwingConstants.CENTER);
		txtCm.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCm.setText("Cơm");
		txtCm.setBounds(3, 17, 79, 22);
		Mien.add(txtCm);
		txtCm.setColumns(10);
		
		txtBn = new JTextField();
		txtBn.setText("Bún");
		txtBn.setHorizontalAlignment(SwingConstants.CENTER);
		txtBn.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtBn.setColumns(10);
		txtBn.setBounds(3, 52, 79, 22);
		Mien.add(txtBn);
		
		txtPh = new JTextField();
		txtPh.setText("Phở");
		txtPh.setHorizontalAlignment(SwingConstants.CENTER);
		txtPh.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPh.setColumns(10);
		txtPh.setBounds(3, 84, 79, 22);
		Mien.add(txtPh);
		
		txtBnhM = new JTextField();
		txtBnhM.setText("Bánh Mì");
		txtBnhM.setHorizontalAlignment(SwingConstants.CENTER);
		txtBnhM.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtBnhM.setColumns(10);
		txtBnhM.setBounds(3, 114, 79, 22);
		Mien.add(txtBnhM);
		
		txtMin = new JTextField();
		txtMin.setText("Miến");
		txtMin.setHorizontalAlignment(SwingConstants.CENTER);
		txtMin.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMin.setColumns(10);
		txtMin.setBounds(3, 148, 79, 25);
		Mien.add(txtMin);
		
		JButton plus2 = new JButton("+");
		plus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_bun.getText());
				
				
				num = num + 1;
				quan_bun.setText(Double.toString(num));
				
				i[1] = pBun * num;
			}
		});
		plus2.setBounds(166, 50, 64, 24);
		Mien.add(plus2);
		
		JButton plus3 = new JButton("+");
		plus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_pho.getText());
				
				
				num = num + 1;
				quan_pho.setText(Double.toString(num));
				
				i[2] = pPho * num;
			}
		});
		plus3.setBounds(166, 84, 64, 24);
		Mien.add(plus3);
		
		JButton plus4 = new JButton("+");
		plus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_BanhMi.getText());
				
				num = num + 1;
				quan_BanhMi.setText(Double.toString(num));
				
				i[3] = pBanhMi * num;
			}
		});
		plus4.setBounds(166, 114, 64, 24);
		Mien.add(plus4);
		
		JButton plus5 = new JButton("+");
		plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_mien.getText());
				
				
				num = num + 1;
				quan_mien.setText(Double.toString(num));
				
				i[4] = pMien * num;
			}
		});
		plus5.setBounds(166, 148, 64, 24);
		Mien.add(plus5);
		
		JButton minus2 = new JButton("-");
		minus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_bun.getText());
				
				if(num > 0) {
					num = num - 1;
					quan_bun.setText(Double.toString(num));
				}
				i[1] = i[1] - pBun;
			}
		});
		minus2.setBounds(92, 52, 64, 24);
		Mien.add(minus2);
		
		JButton minus3 = new JButton("-");
		minus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_pho.getText());
				
				if(num > 0) {
					num = num - 1;
					quan_pho.setText(Double.toString(num));
				}
				i[2] = i[2] - pPho;
			}
		});
		minus3.setBounds(92, 85, 64, 24);
		Mien.add(minus3);
		
		JButton minus4 = new JButton("-");
		minus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_BanhMi.getText());
				
				if(num > 0) {
					num = num - 1;
					quan_BanhMi.setText(Double.toString(num));
				}
				i[2] = i[2] - pBanhMi;
			}
		});
		minus4.setBounds(92, 116, 64, 24);
		Mien.add(minus4);
		
		JButton minus5 = new JButton("-");
		minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double num = Double.parseDouble(quan_mien.getText());
				
				if(num > 0) {
					num = num - 1;
					quan_mien.setText(Double.toString(num));
				}
				i[2] = i[2] - pMien;
			}
		});
		minus5.setBounds(92, 148, 64, 24);
		Mien.add(minus5);
		
		JPanel Mien_1 = new JPanel();
		Mien_1.setLayout(null);
		Mien_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Mien_1.setBounds(0, 0, 309, 220);
		Mien.add(Mien_1);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(240, 17, 59, 25);
		Mien_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(240, 52, 59, 23);
		Mien_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(240, 85, 59, 21);
		Mien_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(240, 115, 59, 23);
		Mien_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(240, 148, 59, 25);
		Mien_1.add(textField_4);
		
		JCheckBox Tax_choice_1 = new JCheckBox("Tax");
		Tax_choice_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Tax_choice_1.setBounds(6, 182, 125, 21);
		Mien_1.add(Tax_choice_1);
		
		JCheckBox Home_deliver_choice_1 = new JCheckBox("Home delivery");
		Home_deliver_choice_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Home_deliver_choice_1.setBounds(133, 182, 159, 21);
		Mien_1.add(Home_deliver_choice_1);
		
		JButton plus1_1 = new JButton("+");
		plus1_1.setBounds(166, 16, 64, 24);
		Mien_1.add(plus1_1);
		
		JButton btnNewButton_1_5 = new JButton("-");
		btnNewButton_1_5.setBounds(92, 16, 64, 24);
		Mien_1.add(btnNewButton_1_5);
		
		textField_5 = new JTextField();
		textField_5.setText("Cơm");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(3, 17, 79, 22);
		Mien_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Bún");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(3, 52, 79, 22);
		Mien_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("Phở");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(3, 84, 79, 22);
		Mien_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("Bánh Mì");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_8.setColumns(10);
		textField_8.setBounds(3, 114, 79, 22);
		Mien_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("Miến");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_9.setColumns(10);
		textField_9.setBounds(3, 148, 79, 25);
		Mien_1.add(textField_9);
		
		JButton plus2_1 = new JButton("+");
		plus2_1.setBounds(166, 50, 64, 24);
		Mien_1.add(plus2_1);
		
		JButton plus3_1 = new JButton("+");
		plus3_1.setBounds(166, 84, 64, 24);
		Mien_1.add(plus3_1);
		
		JButton plus4_1 = new JButton("+");
		plus4_1.setBounds(166, 114, 64, 24);
		Mien_1.add(plus4_1);
		
		JButton plus5_1 = new JButton("+");
		plus5_1.setBounds(166, 148, 64, 24);
		Mien_1.add(plus5_1);
		
		JButton btnNewButton_1_1_1 = new JButton("-");
		btnNewButton_1_1_1.setBounds(92, 52, 64, 24);
		Mien_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("-");
		btnNewButton_1_2_1.setBounds(92, 85, 64, 24);
		Mien_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("-");
		btnNewButton_1_3_1.setBounds(92, 116, 64, 24);
		Mien_1.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_4_1 = new JButton("-");
		btnNewButton_1_4_1.setBounds(92, 148, 64, 24);
		Mien_1.add(btnNewButton_1_4_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 313, 309, 183);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtDrinkCost = new JTextField();
		txtDrinkCost.setBackground(new Color(240, 240, 240));
		txtDrinkCost.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDrinkCost.setHorizontalAlignment(SwingConstants.CENTER);
		txtDrinkCost.setText("Drink Cost");
		txtDrinkCost.setColumns(10);
		txtDrinkCost.setBounds(10, 72, 134, 41);
		panel_1.add(txtDrinkCost);
		
		txtDeliveryCost = new JTextField();
		txtDeliveryCost.setBackground(new Color(240, 240, 240));
		txtDeliveryCost.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDeliveryCost.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeliveryCost.setText("Delivery Cost");
		txtDeliveryCost.setColumns(10);
		txtDeliveryCost.setBounds(10, 132, 134, 41);
		panel_1.add(txtDeliveryCost);
		
		txtFoodCost = new JTextField();
		txtFoodCost.setBackground(new Color(240, 240, 240));
		txtFoodCost.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtFoodCost.setText("Food Cost");
		txtFoodCost.setHorizontalAlignment(SwingConstants.CENTER);
		txtFoodCost.setColumns(10);
		txtFoodCost.setBounds(10, 10, 134, 41);
		panel_1.add(txtFoodCost);
		
		food = new JTextField();
		food.setText("0");
		food.setHorizontalAlignment(SwingConstants.CENTER);
		food.setFont(new Font("Tahoma", Font.BOLD, 18));
		food.setColumns(10);
		food.setBounds(165, 10, 134, 41);
		panel_1.add(food);
		
		Drink = new JTextField();
		Drink.setText("0");
		Drink.setHorizontalAlignment(SwingConstants.CENTER);
		Drink.setFont(new Font("Tahoma", Font.BOLD, 18));
		Drink.setColumns(10);
		Drink.setBounds(165, 72, 134, 41);
		panel_1.add(Drink);
		
		Delivery = new JTextField();
		Delivery.setText("0");
		Delivery.setHorizontalAlignment(SwingConstants.CENTER);
		Delivery.setFont(new Font("Tahoma", Font.BOLD, 18));
		Delivery.setColumns(10);
		Delivery.setBounds(165, 132, 134, 41);
		panel_1.add(Delivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(329, 313, 309, 183);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		sbTotal = new JTextField();
		sbTotal.setText("0");
		sbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		sbTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		sbTotal.setColumns(10);
		sbTotal.setBounds(160, 10, 134, 41);
		panel_3.add(sbTotal);
		
		Taxes = new JTextField();
		Taxes.setText("0");
		Taxes.setHorizontalAlignment(SwingConstants.CENTER);
		Taxes.setFont(new Font("Tahoma", Font.BOLD, 18));
		Taxes.setColumns(10);
		Taxes.setBounds(160, 69, 134, 41);
		panel_3.add(Taxes);
		
		sum = new JTextField();
		sum.setText("0");
		sum.setHorizontalAlignment(SwingConstants.CENTER);
		sum.setFont(new Font("Tahoma", Font.BOLD, 18));
		sum.setColumns(10);
		sum.setBounds(160, 132, 134, 41);
		panel_3.add(sum);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtSubTotal.setText("Sub Total");
		txtSubTotal.setBackground(new Color(240, 240, 240));
		txtSubTotal.setBounds(10, 10, 95, 41);
		panel_3.add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTax = new JTextField();
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setText("Tax");
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTax.setColumns(10);
		txtTax.setBackground(SystemColor.menu);
		txtTax.setBounds(10, 69, 95, 41);
		panel_3.add(txtTax);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setText("Total");
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTotal.setColumns(10);
		txtTotal.setBackground(SystemColor.menu);
		txtTotal.setBounds(10, 132, 95, 41);
		panel_3.add(txtTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(643, 83, 309, 486);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 291, 454);
		panel_4.add(tabbedPane);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_8, null);
		panel_8.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 266, 407);
		panel_8.add(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(10, 506, 623, 63);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btn_total = new JButton("Total");
		btn_total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Total_food = i[0] + i[1] + i[2] + i[3] + i[4];
				double Total_drink = j[0] + j[1] + j[2] + j[3] + j[4];
				double Sub_total = Total_food + Total_drink;
				double tax = Double.parseDouble(Taxes.getText());
				double delivery = Double.parseDouble(Delivery.getText());
				double All_total = Sub_total + tax + delivery;
				
				String pFood = String.format("%.2f", Total_food);
				String pDrink = String.format("%.2f", Total_drink);
				String pSubTotal = String.format("%.2f", Sub_total);
				String pAllTotal = String.format("%.2f", All_total);
				
				food.setText(pFood);
				Drink.setText(pDrink);
				sbTotal.setText(pSubTotal);
				sum.setText(pAllTotal);
				
			}
		});
		btn_total.setBounds(10, 10, 93, 43);
		panel_5.add(btn_total);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(483, 10, 85, 43);
		panel_5.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zero = 0;
				String reset = String.format("%.2f", zero);
				quan_com.setText(reset);
				quan_bun.setText(reset);
				quan_pho.setText(reset);
				quan_BanhMi.setText(reset);
				quan_mien.setText(reset);
				quan_Nclc.setText(reset);
				quan_CaPhe.setText(reset);
				quan_Coca.setText(reset);
				quan_pepsi.setText(reset);
				quan_Mirinda.setText(reset);
				food.setText(reset);
				Drink.setText(reset);
				Delivery.setText(reset);
				sbTotal.setText(reset);
				Taxes.setText(reset);
				sum.setText(reset);
			}
		});
		btnReset.setBounds(330, 10, 85, 43);
		panel_5.add(btnReset);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double subP = Double.parseDouble(sbTotal.getText());
				double tax = Double.parseDouble(Taxes.getText());
				double pdelivery = Double.parseDouble(Delivery.getText());
				double P = Double.parseDouble(sum.getText());
				
				textArea.append("\tRestaurant Managing system\n\n" +  
								"\nTổng trước thuế\t" + subP + 
								"\nPhí vận chuyển\t\t" + pdelivery+
								"\nThuế\t\t" + tax + 
								"\nTổng cộng\t\t" + P);
			}
		});
		btnReceipt.setBounds(174, 10, 85, 43);
		panel_5.add(btnReceipt);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(10, 10, 899, 63);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		txtRestaurantManagingSystem = new JTextField();
		txtRestaurantManagingSystem.setFont(new Font("Tahoma", Font.BOLD, 26));
		txtRestaurantManagingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		txtRestaurantManagingSystem.setText("Restaurant Managing system");
		txtRestaurantManagingSystem.setBounds(0, 0, 939, 63);
		panel_6.add(txtRestaurantManagingSystem);
		txtRestaurantManagingSystem.setColumns(10);
		
		JPanel Mien_1_1 = new JPanel();
		Mien_1_1.setLayout(null);
		Mien_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Mien_1_1.setBounds(329, 83, 309, 220);
		contentPane.add(Mien_1_1);
		
		quan_Nclc = new JTextField();
		quan_Nclc.setText("0");
		quan_Nclc.setHorizontalAlignment(SwingConstants.CENTER);
		quan_Nclc.setColumns(10);
		quan_Nclc.setBounds(240, 17, 59, 25);
		Mien_1_1.add(quan_Nclc);
		
		quan_CaPhe = new JTextField();
		quan_CaPhe.setText("0");
		quan_CaPhe.setHorizontalAlignment(SwingConstants.CENTER);
		quan_CaPhe.setColumns(10);
		quan_CaPhe.setBounds(240, 52, 59, 23);
		Mien_1_1.add(quan_CaPhe);
		
		quan_Coca = new JTextField();
		quan_Coca.setText("0");
		quan_Coca.setHorizontalAlignment(SwingConstants.CENTER);
		quan_Coca.setColumns(10);
		quan_Coca.setBounds(240, 85, 59, 21);
		Mien_1_1.add(quan_Coca);
		
		quan_pepsi = new JTextField();
		quan_pepsi.setText("0");
		quan_pepsi.setHorizontalAlignment(SwingConstants.CENTER);
		quan_pepsi.setColumns(10);
		quan_pepsi.setBounds(240, 115, 59, 23);
		Mien_1_1.add(quan_pepsi);
		
		quan_Mirinda = new JTextField();
		quan_Mirinda.setText("0");
		quan_Mirinda.setHorizontalAlignment(SwingConstants.CENTER);
		quan_Mirinda.setColumns(10);
		quan_Mirinda.setBounds(240, 148, 59, 25);
		Mien_1_1.add(quan_Mirinda);
		
		JButton plus6 = new JButton("+");
		plus6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_Nclc.getText());
				
				num = num + 1;
				quan_Nclc.setText(Double.toString(num));
				
				j[0] = pCom * num;
			}
		});
		plus6.setBounds(166, 16, 64, 24);
		Mien_1_1.add(plus6);
		
		JButton minus6 = new JButton("-");
		minus6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_Nclc.getText());
				
				if(num > 0) {
					num = num -1;
					quan_Nclc.setText(Double.toString(num));
				}
				
				j[0] = j[0] - pNclc;
			}
		});
		minus6.setBounds(92, 16, 64, 24);
		Mien_1_1.add(minus6);
		
		txtNcLc = new JTextField();
		txtNcLc.setText("Nước Lọc");
		txtNcLc.setHorizontalAlignment(SwingConstants.CENTER);
		txtNcLc.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNcLc.setColumns(10);
		txtNcLc.setBounds(3, 17, 79, 22);
		Mien_1_1.add(txtNcLc);
		
		txtCPh = new JTextField();
		txtCPh.setText("Cà phê");
		txtCPh.setHorizontalAlignment(SwingConstants.CENTER);
		txtCPh.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCPh.setColumns(10);
		txtCPh.setBounds(3, 52, 79, 22);
		Mien_1_1.add(txtCPh);
		
		TxtCoca = new JTextField();
		TxtCoca.setText("Cocacola");
		TxtCoca.setHorizontalAlignment(SwingConstants.CENTER);
		TxtCoca.setFont(new Font("Tahoma", Font.BOLD, 14));
		TxtCoca.setColumns(10);
		TxtCoca.setBounds(3, 84, 79, 22);
		Mien_1_1.add(TxtCoca);
		
		txtPepsi = new JTextField();
		txtPepsi.setText("Pepsi");
		txtPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		txtPepsi.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPepsi.setColumns(10);
		txtPepsi.setBounds(3, 114, 79, 22);
		Mien_1_1.add(txtPepsi);
		
		txtMirinda = new JTextField();
		txtMirinda.setText("Mirinda");
		txtMirinda.setHorizontalAlignment(SwingConstants.CENTER);
		txtMirinda.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMirinda.setColumns(10);
		txtMirinda.setBounds(3, 148, 79, 25);
		Mien_1_1.add(txtMirinda);
		
		JButton plus7 = new JButton("+");
		plus7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_CaPhe.getText());
				
				num = num + 1;
				quan_CaPhe.setText(Double.toString(num));
				
				j[1] = pCaphe * num;
			}
		});
		plus7.setBounds(166, 50, 64, 24);
		Mien_1_1.add(plus7);
		
		JButton plus8 = new JButton("+");
		plus8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_Coca.getText());
				
				num = num + 1;
				quan_Coca.setText(Double.toString(num));
				
				j[2] = pCocacola * num;
			}
		});
		plus8.setBounds(166, 84, 64, 24);
		Mien_1_1.add(plus8);
		
		JButton plus9 = new JButton("+");
		plus9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_pepsi.getText());
				
				num = num + 1;
				quan_pepsi.setText(Double.toString(num));
				
				j[3] = pPepsi * num;
			}
		});
		plus9.setBounds(166, 114, 64, 24);
		Mien_1_1.add(plus9);
		
		JButton plus10 = new JButton("+");
		plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_Mirinda.getText());
				
				num = num + 1;
				quan_Mirinda.setText(Double.toString(num));
				
				j[4] = pMirinda * num;
			}
		});
		plus10.setBounds(166, 148, 64, 24);
		Mien_1_1.add(plus10);
		
		JButton minus7 = new JButton("-");
		minus7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_CaPhe.getText());
				
				if(num > 0) {
					num = num -1;
					quan_CaPhe.setText(Double.toString(num));
				}
				
				j[1] = j[1] - pCaphe;
			}
		});
		minus7.setBounds(92, 52, 64, 24);
		Mien_1_1.add(minus7);
		
		JButton minus8 = new JButton("-");
		minus8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_Coca.getText());
				
				if(num > 0) {
					num = num -1;
					quan_Coca.setText(Double.toString(num));
				}
				
				j[2] = j[2] - pCocacola;
			}
		});
		minus8.setBounds(92, 85, 64, 24);
		Mien_1_1.add(minus8);
		
		JButton minus9 = new JButton("-");
		minus9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_pepsi.getText());
				
				if(num > 0) {
					num = num -1;
					quan_pepsi.setText(Double.toString(num));
				}
				
				j[3] = j[3] - pPepsi;
			}
		});
		minus9.setBounds(92, 116, 64, 24);
		Mien_1_1.add(minus9);
		
		JButton minus10 = new JButton("-");
		minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cFood = Double.parseDouble(Drink.getText());
				double num = Double.parseDouble(quan_Mirinda.getText());
				
				if(num > 0) {
					num = num -1;
					quan_Mirinda.setText(Double.toString(num));
				}
				
				j[4] = j[4] - pMirinda;
			}
		});
		minus10.setBounds(92, 148, 64, 24);
		Mien_1_1.add(minus10);
	}
}
