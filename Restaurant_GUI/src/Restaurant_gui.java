import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Restaurant_gui extends JFrame {

	private JPanel contentPane;
	private JTextField Tax;
	private JTextField Sub_total;
	private JTextField Total;
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
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminum.AluminumLookAndFeel");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant_gui frame = new Restaurant_gui();
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
	public Restaurant_gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBounds(10, 10, 740, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant management system");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 720, 44);
		panel.add(lblNewLabel);
		
		JPanel food = new JPanel();
		food.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		food.setBounds(10, 84, 222, 223);
		contentPane.add(food);
		food.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(177, 46, 35, 29);
		food.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Foods");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(76, 10, 69, 26);
		food.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(143, 83, 69, 29);
		food.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(143, 122, 69, 29);
		food.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(143, 161, 69, 29);
		food.add(textField_6);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bún chả");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 44, 59, 29);
		food.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cơm tấm");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 83, 123, 29);
		food.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Phở");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 122, 123, 29);
		food.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Bánh mì");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(10, 161, 123, 29);
		food.add(lblNewLabel_1_5);
		
		JButton btn_plus = new JButton("+");
		btn_plus.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_plus.setBounds(128, 46, 39, 27);
		food.add(btn_plus);
		
		JPanel drink = new JPanel();
		drink.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		drink.setBounds(242, 84, 222, 223);
		contentPane.add(drink);
		drink.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Drinks");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(72, 10, 69, 26);
		drink.add(lblNewLabel_1_1);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(143, 46, 69, 29);
		drink.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(143, 85, 69, 29);
		drink.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(143, 124, 69, 29);
		drink.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(143, 163, 69, 29);
		drink.add(textField_10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nước lọc");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 46, 122, 29);
		drink.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Trà đá");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(10, 85, 122, 29);
		drink.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Cocacola");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(10, 124, 122, 29);
		drink.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Sting");
		lblNewLabel_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_3.setBounds(10, 163, 122, 29);
		drink.add(lblNewLabel_1_1_1_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		panel_1_2.setBounds(10, 432, 454, 57);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JButton btn_total = new JButton("Total");
		btn_total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_total.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_total.setBounds(10, 10, 91, 37);
		panel_1_2.add(btn_total);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReceipt.setBounds(121, 12, 91, 37);
		panel_1_2.add(btnReceipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(353, 10, 91, 37);
		panel_1_2.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(238, 10, 91, 37);
		panel_1_2.add(btnReset);
		
		JPanel receipt = new JPanel();
		receipt.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		receipt.setBounds(474, 84, 276, 405);
		contentPane.add(receipt);
		receipt.setLayout(null);
		
		textField_11 = new JTextField();
		textField_11.setBounds(10, 10, 256, 385);
		receipt.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel Meal_cost = new JPanel();
		Meal_cost.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		Meal_cost.setBounds(10, 317, 222, 105);
		contentPane.add(Meal_cost);
		Meal_cost.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		textField.setBounds(116, 10, 96, 19);
		Meal_cost.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(116, 39, 96, 19);
		Meal_cost.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setColumns(10);
		textField_2.setBounds(116, 68, 96, 19);
		Meal_cost.add(textField_2);
		
		JLabel lblNewLabel_Tax_FoodCost = new JLabel("Food Cost");
		lblNewLabel_Tax_FoodCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Tax_FoodCost.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Tax_FoodCost.setBounds(10, 9, 96, 19);
		Meal_cost.add(lblNewLabel_Tax_FoodCost);
		
		JLabel lblNewLabel_Tax_DrinkCost = new JLabel("Drink Cost");
		lblNewLabel_Tax_DrinkCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Tax_DrinkCost.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Tax_DrinkCost.setBounds(10, 38, 96, 19);
		Meal_cost.add(lblNewLabel_Tax_DrinkCost);
		
		JLabel lblNewLabel_MealPrice = new JLabel("Meal Cost");
		lblNewLabel_MealPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_MealPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_MealPrice.setBounds(10, 67, 96, 19);
		Meal_cost.add(lblNewLabel_MealPrice);
		
		JPanel Total_cost = new JPanel();
		Total_cost.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0)));
		Total_cost.setBounds(242, 317, 222, 105);
		contentPane.add(Total_cost);
		Total_cost.setLayout(null);
		
		Tax = new JTextField();
		Tax.setBounds(116, 10, 96, 19);
		Tax.setHorizontalAlignment(SwingConstants.RIGHT);
		Total_cost.add(Tax);
		Tax.setColumns(10);
		
		Sub_total = new JTextField();
		Sub_total.setHorizontalAlignment(SwingConstants.RIGHT);
		Sub_total.setColumns(10);
		Sub_total.setBounds(116, 39, 96, 19);
		Total_cost.add(Sub_total);
		
		Total = new JTextField();
		Total.setHorizontalAlignment(SwingConstants.RIGHT);
		Total.setColumns(10);
		Total.setBounds(116, 68, 96, 19);
		Total_cost.add(Total);
		
		JLabel lblNewLabel_Tax = new JLabel("Tax");
		lblNewLabel_Tax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Tax.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Tax.setBounds(10, 9, 58, 19);
		Total_cost.add(lblNewLabel_Tax);
		
		JLabel lblNewLabel_SubTotal = new JLabel("SubTotal");
		lblNewLabel_SubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_SubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_SubTotal.setBounds(10, 39, 58, 19);
		Total_cost.add(lblNewLabel_SubTotal);
		
		JLabel lblNewLabel_Total = new JLabel("Total");
		lblNewLabel_Total.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Total.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Total.setBounds(10, 68, 58, 19);
		Total_cost.add(lblNewLabel_Total);
	}
}
