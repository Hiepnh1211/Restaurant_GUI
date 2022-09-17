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
	private JTextField textField_3;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;
	double[] i = new double[5];
	double[] j = new double[5];
	double tax_price;
	double Total_price;
	double sub_total_price;
	
	private JTextField quan_BanhMi;
	private JTextField quan_mien;
	private JTextField quan_lavie;
	private JTextField quan_caphe;
	private JTextField quan_coca;
	private JTextField quan_pepsi;
	private JTextField quan_mirinda;
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
		setBounds(100, 100, 938, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Mien = new JPanel();
		Mien.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Mien.setBounds(10, 83, 309, 220);
		contentPane.add(Mien);
		Mien.setLayout(null);
		
		JCheckBox Com = new JCheckBox("Cơm");
		Com.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double rice = Double.parseDouble(quan_com.getText());
				double pRice = 2.5;
				
				if(Com.isSelected()) {
					i[0] = (rice * pRice) + cFood;
					String pMeal = String.format("%.2f", i[0]);
					food.setText(pMeal);
				}
			}
		});
		Com.setFont(new Font("Tahoma", Font.BOLD, 18));
		Com.setBounds(6, 16, 93, 21);
		Mien.add(Com);
		
		JCheckBox Bun = new JCheckBox("Bún");
		Bun.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double bun = Double.parseDouble(quan_bun.getText());
				double pBun = 2;
				
				if(Bun.isSelected()) {
					i[1] = (bun * pBun) + cFood;
					String pMeal = String.format("%.2f", i[1]);
					food.setText(pMeal);
				}
			}
		});
		Bun.setFont(new Font("Tahoma", Font.BOLD, 18));
		Bun.setBounds(6, 52, 93, 21);
		Mien.add(Bun);
		
		JCheckBox Pho = new JCheckBox("Phở");
		Pho.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double pho = Double.parseDouble(quan_pho.getText());
				double pPho = 3;
				
				if(Pho.isSelected()) {
					i[2] = (pho * pPho) + cFood;
					String pMeal = String.format("%.2f", i[2]);
					food.setText(pMeal);
				}
			}
		});
		Pho.setFont(new Font("Tahoma", Font.BOLD, 18));
		Pho.setBounds(6, 84, 93, 21);
		Mien.add(Pho);
		
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
		quan_bun.setBounds(240, 54, 59, 23);
		Mien.add(quan_bun);
		
		quan_pho = new JTextField();
		quan_pho.setText("0");
		quan_pho.setHorizontalAlignment(SwingConstants.CENTER);
		quan_pho.setColumns(10);
		quan_pho.setBounds(240, 87, 59, 21);
		Mien.add(quan_pho);
		
		JCheckBox BanhMi = new JCheckBox("Bánh mì");
		BanhMi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double BanhMi = Double.parseDouble(quan_BanhMi.getText());
				double pBanhMi = 1.5;
				
				if(Com.isSelected()) {
					i[3] = (BanhMi * pBanhMi) + cFood;
					String pMeal = String.format("%.2f", i[3]);
					food.setText(pMeal);
				}
			}
		});
		BanhMi.setFont(new Font("Tahoma", Font.BOLD, 18));
		BanhMi.setBounds(6, 115, 125, 21);
		Mien.add(BanhMi);
		
		quan_BanhMi = new JTextField();
		quan_BanhMi.setText("0");
		quan_BanhMi.setHorizontalAlignment(SwingConstants.CENTER);
		quan_BanhMi.setColumns(10);
		quan_BanhMi.setBounds(240, 118, 59, 21);
		Mien.add(quan_BanhMi);
		
		JCheckBox mien = new JCheckBox("Miến");
		mien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cFood = Double.parseDouble(food.getText());
				double Mien = Double.parseDouble(quan_mien.getText());
				double pMien = 3.5;
				
				if(Com.isSelected()) {
					i[4] = (Mien * pMien) + cFood;
					String pMeal = String.format("%.2f", i[4]);
					food.setText(pMeal);
				}
			}
		});
		mien.setFont(new Font("Tahoma", Font.BOLD, 18));
		mien.setBounds(6, 149, 125, 21);
		Mien.add(mien);
		
		quan_mien = new JTextField();
		quan_mien.setText("0");
		quan_mien.setHorizontalAlignment(SwingConstants.CENTER);
		quan_mien.setColumns(10);
		quan_mien.setBounds(240, 149, 59, 21);
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
					Delivery.setText(null);
				}
			}
		});
		Home_deliver_choice.setFont(new Font("Tahoma", Font.BOLD, 18));
		Home_deliver_choice.setBounds(133, 182, 159, 21);
		Mien.add(Home_deliver_choice);
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(329, 83, 259, 220);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox lavie1 = new JCheckBox("Lavie");
		lavie1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double Lavie = Double.parseDouble(quan_lavie.getText());
				double pLavie = 1.25;
				
				if(lavie1.isSelected()) {
					j[0] = (Lavie * pLavie) + cDrink;
					String pDrink = String.format("%.2f", j[0]);
					Drink.setText(pDrink);
				}
			}
		});
		lavie1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lavie1.setBounds(6, 19, 125, 21);
		panel_2.add(lavie1);
		
		JCheckBox Caphe1 = new JCheckBox("Cà phê");
		Caphe1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double Caphe = Double.parseDouble(quan_caphe.getText());
				double pCaphe = 3;
				
				if(Caphe1.isSelected()) {
					j[1] = (Caphe * pCaphe) + cDrink;
					String pDrink = String.format("%.2f", j[1]);
					Drink.setText(pDrink);
				}
			}
		});
		Caphe1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Caphe1.setBounds(6, 55, 125, 21);
		panel_2.add(Caphe1);
		
		JCheckBox coca1 = new JCheckBox("Cocacola");
		coca1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double coca = Double.parseDouble(quan_coca.getText());
				double pcoca = 2;
				
				if(coca1.isSelected()) {
					j[2] = (coca * pcoca) + cDrink;
					String pDrink = String.format("%.2f", j[2]);
					Drink.setText(pDrink);
				}
			}
		});
		coca1.setFont(new Font("Tahoma", Font.BOLD, 18));
		coca1.setBounds(6, 88, 125, 21);
		panel_2.add(coca1);
		
		JCheckBox Pepsi1 = new JCheckBox("Pepsi");
		Pepsi1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double Pepsi = Double.parseDouble(quan_pepsi.getText());
				double pPepsi = 2;
				
				if(Pepsi1.isSelected()) {
					j[3] = (Pepsi * pPepsi) + cDrink;
					String pDrink = String.format("%.2f", j[3]);
					Drink.setText(pDrink);
				}
			}
		});
		Pepsi1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Pepsi1.setBounds(6, 121, 125, 21);
		panel_2.add(Pepsi1);
		
		JCheckBox Mirinda1 = new JCheckBox("Mirinda");
		Mirinda1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double cDrink = Double.parseDouble(Drink.getText());
				double Mirinda = Double.parseDouble(quan_mirinda.getText());
				double pMirinda = 1.5;
				
				if(Mirinda1.isSelected()) {
					j[4] = (Mirinda * pMirinda) + cDrink;
					String pDrink = String.format("%.2f", j[4]);
					Drink.setText(pDrink);
				}
			}
		});
		Mirinda1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Mirinda1.setBounds(6, 153, 125, 21);
		panel_2.add(Mirinda1);
		
		quan_lavie = new JTextField();
		quan_lavie.setText("0");
		quan_lavie.setHorizontalAlignment(SwingConstants.CENTER);
		quan_lavie.setColumns(10);
		quan_lavie.setBounds(190, 19, 59, 25);
		panel_2.add(quan_lavie);
		
		quan_caphe = new JTextField();
		quan_caphe.setText("0");
		quan_caphe.setHorizontalAlignment(SwingConstants.CENTER);
		quan_caphe.setColumns(10);
		quan_caphe.setBounds(190, 56, 59, 25);
		panel_2.add(quan_caphe);
		
		quan_coca = new JTextField();
		quan_coca.setText("0");
		quan_coca.setHorizontalAlignment(SwingConstants.CENTER);
		quan_coca.setColumns(10);
		quan_coca.setBounds(190, 89, 59, 25);
		panel_2.add(quan_coca);
		
		quan_pepsi = new JTextField();
		quan_pepsi.setText("0");
		quan_pepsi.setHorizontalAlignment(SwingConstants.CENTER);
		quan_pepsi.setColumns(10);
		quan_pepsi.setBounds(190, 122, 59, 25);
		panel_2.add(quan_pepsi);
		
		quan_mirinda = new JTextField();
		quan_mirinda.setText("0");
		quan_mirinda.setHorizontalAlignment(SwingConstants.CENTER);
		quan_mirinda.setColumns(10);
		quan_mirinda.setBounds(190, 154, 59, 25);
		panel_2.add(quan_mirinda);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(329, 313, 259, 183);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		sbTotal = new JTextField();
		sbTotal.setText("0");
		sbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		sbTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		sbTotal.setColumns(10);
		sbTotal.setBounds(115, 10, 134, 41);
		panel_3.add(sbTotal);
		
		Taxes = new JTextField();
		Taxes.setText("0");
		Taxes.setHorizontalAlignment(SwingConstants.CENTER);
		Taxes.setFont(new Font("Tahoma", Font.BOLD, 18));
		Taxes.setColumns(10);
		Taxes.setBounds(115, 69, 134, 41);
		panel_3.add(Taxes);
		
		sum = new JTextField();
		sum.setText("0");
		sum.setHorizontalAlignment(SwingConstants.CENTER);
		sum.setFont(new Font("Tahoma", Font.BOLD, 18));
		sum.setColumns(10);
		sum.setBounds(115, 132, 134, 41);
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
		panel_4.setBounds(598, 83, 311, 486);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 291, 454);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 27));
		textField_3.setBounds(10, 10, 266, 55);
		panel_7.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btndel = new JButton("<-");
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField_3.getText().length() > 0) {
					StringBuilder StrB = new StringBuilder(textField_3.getText());
					StrB.deleteCharAt(textField_3.getText().length() - 1);
					backspace = StrB.toString();
					textField_3.setText(backspace);
				}
				
			}
		});
		btndel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btndel.setBounds(10, 75, 58, 55);
		panel_7.add(btndel);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText(null);
			}
		});
		btnC.setBounds(78, 75, 58, 55);
		panel_7.add(btnC);
		
		JButton btnops = new JButton("+/-");
		btnops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField_3.getText()));
				ops = ops * (-1);
				textField_3.setText(String.valueOf(ops));
			}
		});
		btnops.setBounds(146, 75, 58, 55);
		panel_7.add(btnops);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operation = "+";
			}
		});
		btn_add.setBounds(218, 75, 58, 55);
		panel_7.add(btn_add);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn7.getText();
				textField_3.setText(enterNumber);
				}
		});
		btn7.setBounds(10, 140, 58, 55);
		panel_7.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn8.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn8.setBounds(78, 140, 58, 55);
		panel_7.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn9.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn9.setBounds(146, 140, 58, 55);
		panel_7.add(btn9);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operation = "-";
			}
		});
		btn_sub.setBounds(218, 140, 58, 55);
		panel_7.add(btn_sub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn4.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn4.setBounds(10, 205, 58, 55);
		panel_7.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn5.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn5.setBounds(78, 205, 58, 55);
		panel_7.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn6.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn6.setBounds(146, 205, 58, 55);
		panel_7.add(btn6);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operation = "*";
			}
		});
		btn_multiply.setBounds(218, 205, 58, 55);
		panel_7.add(btn_multiply);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn1.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn1.setBounds(10, 270, 58, 55);
		panel_7.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn2.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn2.setBounds(78, 270, 58, 55);
		panel_7.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn3.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn3.setBounds(146, 270, 58, 55);
		panel_7.add(btn3);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operation = "/";
			}
		});
		btn_divide.setBounds(218, 270, 58, 55);
		panel_7.add(btn_divide);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField_3.getText() + btn0.getText();
				textField_3.setText(enterNumber);
			}
		});
		btn0.setBounds(10, 335, 58, 55);
		panel_7.add(btn0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField_3.getText().contains("."))
		          {
					textField_3.setText(textField_3.getText() + btn_dot.getText());
		          }
			}
		});
		btn_dot.setBounds(78, 335, 58, 55);
		panel_7.add(btn_dot);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField_3.getText());
				if(operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField_3.setText(answer);
				}
				
				if(operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField_3.setText(answer);
				}
				
				if(operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField_3.setText(answer);
				}
				
				if(operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField_3.setText(answer);
				}
			}
		});
		btn_equal.setBounds(146, 335, 130, 55);
		panel_7.add(btn_equal);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_8, null);
		panel_8.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 266, 407);
		panel_8.add(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(10, 506, 578, 63);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btn_total = new JButton("Total");
		btn_total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cTotal1 = Double.parseDouble(food.getText());
				double cTotal2 = Double.parseDouble(Drink.getText());
				double cTotal3 = Double.parseDouble(Delivery.getText());
				double cTotal4 = Double.parseDouble(Taxes.getText());
				
				double allTotal1 = cTotal1 + cTotal2 + cTotal3 + cTotal4;
				double allTotal2 = cTotal1 + cTotal2 + cTotal3;
				
				tax_price = cTotal4;
				Total_price = allTotal1;
				sub_total_price = allTotal2;
				
				String iTotal1 = String.format("%.2f", allTotal1);
				String iTotal2 = String.format("%.2f", allTotal2);
				String iTaxtotal = String.format("%.2f", cTotal4);
				
				sum.setText(iTotal1);
				sbTotal.setText(iTotal2);
				Taxes.setText(iTaxtotal);
				
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
		btnReset.setBounds(330, 10, 85, 43);
		panel_5.add(btnReset);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\tRestaurant Managing system\n\n" +  
								"\nTổng trước thuế\t" + sub_total_price + 
								"\nThuế\t\t" + tax_price + 
								"\nTổng cộng\t\t" + Total_price);
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
		txtRestaurantManagingSystem.setBounds(0, 0, 899, 63);
		panel_6.add(txtRestaurantManagingSystem);
		txtRestaurantManagingSystem.setColumns(10);
	}
}
