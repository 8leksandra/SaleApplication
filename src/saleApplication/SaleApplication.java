package saleApplication;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.text.MessageFormat;

public class SaleApplication {

	private JFrame frame;
	private JTable table;
	private JTextField txtBarCode, txtTax, txtSubtotal, txtTotal, txtDisplayCash, txtChange;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleApplication window = new SaleApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public SaleApplication() {
		initialize();
	}
	
	public void ItemCost() {
		double sum = 0;
		double tax = 1.23;
		
		for(int i = 0; i < table.getRowCount(); i++) {
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		txtTotal.setText(Double.toString(sum));
		
		double cTotal = Double.parseDouble(txtTotal.getText());
		double cTax = cTotal - (cTotal / tax);
		
		String iTaxTotal = String.format("%.2f", cTax);
		txtTax.setText(iTaxTotal);
		
		String iSubTotal = String.format("%.2f", cTotal / tax);
		txtSubtotal.setText(iSubTotal);
		
		String iTotal = String.format("%.2f", cTotal);
		txtTotal.setText(iTotal);
		
		String BarCode = String.format("Total is %.2f", cTotal);
		txtBarCode.setText(BarCode);
	}

	public void Change() {
		double sum = 0;
		double cash = Double.parseDouble(txtDisplayCash.getText());
		
		for(int i = 0; i < table.getRowCount(); i++) {
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		txtTotal.setText(Double.toString(sum));
		
		double cTotal = Double.parseDouble(txtTotal.getText());
		double cChange = cash - cTotal;
		
		String ChangeGiven = String.format("%.2f", cChange);
		txtChange.setText(ChangeGiven);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(6, 36, 280, 425);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn0.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn0.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn0.setBounds(6, 267, 90, 90);
		panel.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn1.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn1.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn1.setBounds(6, 180, 90, 90);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn2.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn2.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn2.setBounds(94, 180, 90, 90);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn3.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn3.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn3.setBounds(182, 180, 90, 90);
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn4.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn4.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn4.setBounds(6, 93, 90, 90);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn5.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn5.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn5.setBounds(94, 93, 90, 90);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn6.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn6.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn6.setBounds(182, 93, 90, 90);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn7.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn7.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn7.setBounds(6, 6, 90, 90);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn8.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn8.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn8.setBounds(94, 6, 90, 90);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayCash.getText();
				if(EnterNumber == "") {
					txtDisplayCash.setText(btn9.getText());
				}
				else {
					EnterNumber = txtDisplayCash.getText() + btn9.getText();
					txtDisplayCash.setText(EnterNumber);
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 48));
		btn9.setBounds(182, 6, 90, 90);
		panel.add(btn9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplayCash.setText(null);
				txtChange.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnC.setBounds(182, 267, 90, 90);
		panel.add(btnC);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtDisplayCash.getText().contains(".")) {
					txtDisplayCash.setText(txtDisplayCash.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnDot.setBounds(94, 267, 90, 90);
		panel.add(btnDot);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(721, 36, 702, 425);
		frame.getContentPane().add(panel_1);
		
		JButton btnCake1 = new JButton("");
		btnCake1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 6.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Tarta Kajmakowa", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake1.setIcon(new ImageIcon("res/alex-loup-aX_ljOOyWJY-unsplash.jpg"));
		btnCake1.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake1.setBounds(6, 6, 140, 140);
		panel_1.add(btnCake1);
		
		JButton btnCake2 = new JButton("");
		btnCake2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 4.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Złote Babeczki", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake2.setIcon(new ImageIcon("res/charisse-kenion-PYZ2whV1u8c-unsplash.jpg"));
		btnCake2.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake2.setBounds(6, 142, 140, 140);
		panel_1.add(btnCake2);
		
		JButton btnCake3 = new JButton("");
		btnCake3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 8.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Ciasto Malinowe", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake3.setIcon(new ImageIcon("res/christiann-koepke-AigxB1zfRVo-unsplash.jpg"));
		btnCake3.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake3.setBounds(6, 278, 140, 140);
		panel_1.add(btnCake3);
		
		JButton btnCake4 = new JButton("");
		btnCake4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 7.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Ptasie mleczko", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake4.setIcon(new ImageIcon("res/diana-akhmetianova-OYKZNEwdZus-unsplash-3.jpg"));
		btnCake4.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake4.setBounds(143, 6, 140, 140);
		panel_1.add(btnCake4);
		
		JButton btnCake5 = new JButton("");
		btnCake5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 5.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Muffinka", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake5.setIcon(new ImageIcon("res/dilyara-garifullina-t75mCGkAqDk-unsplash.jpg"));
		btnCake5.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake5.setBounds(143, 142, 140, 140);
		panel_1.add(btnCake5);
		
		JButton btnCake6 = new JButton("");
		btnCake6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 4.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Babeczka z truskawkami", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake6.setIcon(new ImageIcon("res/dilyara-garifullina-THMuaASAP5Y-unsplash.jpg"));
		btnCake6.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake6.setBounds(143, 278, 140, 140);
		panel_1.add(btnCake6);
		
		JButton btnCake7 = new JButton("");
		btnCake7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 6.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Tarta Jabłkowa", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake7.setIcon(new ImageIcon("res/dilyara-garifullina-TOSfAhyIEJA-unsplash.jpg"));
		btnCake7.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake7.setBounds(280, 6, 140, 140);
		panel_1.add(btnCake7);
		
		JButton btnCake8 = new JButton("");
		btnCake8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 7.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Tarta Serowa z Owocami", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake8.setIcon(new ImageIcon("res/frosty-ilze-lD0JFJDXBfQ-unsplash.jpg"));
		btnCake8.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake8.setBounds(280, 142, 140, 140);
		panel_1.add(btnCake8);
		
		JButton btnCake9 = new JButton("");
		btnCake9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 6.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Tarta z Malinami", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake9.setIcon(new ImageIcon("res/irina-K1LdlEj0QrY-unsplash.jpg"));
		btnCake9.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake9.setBounds(280, 278, 140, 140);
		panel_1.add(btnCake9);
		
		JButton btnCake10 = new JButton("");
		btnCake10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 3.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Babeczki Orzechowe", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake10.setIcon(new ImageIcon("res/leo-roza-5uerZn9OXTA-unsplash.jpg"));
		btnCake10.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake10.setBounds(417, 6, 140, 140);
		panel_1.add(btnCake10);
		
		JButton btnCake11 = new JButton("");
		btnCake11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 4.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Babeczki Czekoladowe", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake11.setIcon(new ImageIcon("res/owen-bruce-0Lgv3plF_I8-unsplash.jpg"));
		btnCake11.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake11.setBounds(417, 142, 140, 140);
		panel_1.add(btnCake11);
		
		JButton btnCake12 = new JButton("");
		btnCake12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 5.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Brownie", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake12.setIcon(new ImageIcon("res/shania-pinnata-Ikd6YJVofEE-unsplash.jpg"));
		btnCake12.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake12.setBounds(417, 278, 140, 140);
		panel_1.add(btnCake12);
		
		JButton btnCake13 = new JButton("");
		btnCake13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 11.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Tort Czekoladowy", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake13.setIcon(new ImageIcon("res/taylor-kiser-s7Vh1kg-clM-unsplash.jpg"));
		btnCake13.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake13.setBounds(554, 6, 140, 140);
		panel_1.add(btnCake13);
		
		JButton btnCake14 = new JButton("");
		btnCake14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 7.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Szarlotka", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake14.setIcon(new ImageIcon("res/toa-heftiba-jjZsHhEtees-unsplash.jpg"));
		btnCake14.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake14.setBounds(554, 142, 140, 140);
		panel_1.add(btnCake14);
		
		JButton btnCake15 = new JButton("");
		btnCake15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 10.99;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Ciasto Czekoladowe", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake15.setIcon(new ImageIcon("res/uliana-kopanytsia-ySxSlqeC0YM-unsplash.jpg"));
		btnCake15.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnCake15.setBounds(554, 278, 140, 140);
		panel_1.add(btnCake15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(6, 513, 1417, 234);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(24, 12, 450, 173);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTax.setBounds(25, 20, 142, 37);
		panel_3.add(lblTax);
		
		txtTax = new JTextField();
		txtTax.setBounds(179, 20, 233, 37);
		panel_3.add(txtTax);
		txtTax.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubtotal.setBounds(25, 69, 142, 37);
		panel_3.add(lblSubtotal);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(179, 69, 233, 37);
		panel_3.add(txtSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBounds(25, 118, 142, 37);
		panel_3.add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(179, 118, 233, 37);
		panel_3.add(txtTotal);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(484, 12, 450, 173);
		panel_2.add(panel_3_1);
		
		JLabel lblDisplayCash = new JLabel("Display Cash");
		lblDisplayCash.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDisplayCash.setBounds(31, 71, 155, 37);
		panel_3_1.add(lblDisplayCash);
		
		txtDisplayCash = new JTextField();
		txtDisplayCash.setColumns(10);
		txtDisplayCash.setBounds(198, 71, 220, 37);
		panel_3_1.add(txtDisplayCash);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChange.setBounds(31, 118, 155, 37);
		panel_3_1.add(lblChange);
		
		txtChange = new JTextField();
		txtChange.setColumns(10);
		txtChange.setBounds(198, 118, 220, 37);
		panel_3_1.add(txtChange);
		
		JLabel lblPayMethod = new JLabel("Pay Method");
		lblPayMethod.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPayMethod.setBounds(31, 26, 155, 37);
		panel_3_1.add(lblPayMethod);
		
		JComboBox cmbPayMethod = new JComboBox();
		cmbPayMethod.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Card"}));
		cmbPayMethod.setBounds(198, 26, 220, 38);
		panel_3_1.add(cmbPayMethod);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBounds(944, 12, 450, 173);
		panel_2.add(panel_3_2);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbPayMethod.getSelectedItem().equals("Cash")) {
					Change();
				}
				else {
					txtChange.setText("");
					txtDisplayCash.setText("");
				}
			}
		});
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnPay.setBounds(6, 6, 144, 69);
		panel_3_2.add(btnPay);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplayCash.setText(null);
				txtChange.setText(null);
				txtTax.setText(null);
				txtSubtotal.setText(null);
				txtTotal.setText(null);
				txtBarCode.setText(null);

				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnReset.setBounds(153, 6, 144, 69);
		panel_3_2.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				try {
					table.print(JTable.PrintMode.NORMAL, header, footer);	
				}
				catch(PrinterException ex) {
					System.err.format("No Printer found", ex.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnPrint.setBounds(300, 6, 144, 69);
		panel_3_2.add(btnPrint);
		
		JButton btnRemoveItem = new JButton("Remove Item");
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int RemoveItem = table.getSelectedRow();
				if(RemoveItem >= 0) {
					model.removeRow(RemoveItem);
				}
				ItemCost();
				
				if(cmbPayMethod.getSelectedItem().equals("Cash")) {
					Change();
				}
				else {
					txtChange.setText("");
					txtDisplayCash.setText("");
				}
			}
		});
		btnRemoveItem.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnRemoveItem.setBounds(6, 98, 282, 69);
		panel_3_2.add(btnRemoveItem);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Point of Sale", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnExit.setBounds(300, 98, 144, 69);
		panel_3_2.add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(293, 36, 418, 425);
		frame.getContentPane().add(scrollPane);
	
		table = new JTable();
		table.setModel(new DefaultTableModel( 
				new Object[][] {}, 
				new String[] {"Items", "Quantity", "Amount"}));
		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		table.getColumnModel().getColumn(0).setMinWidth(125);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		scrollPane.setViewportView(table);
		
		txtBarCode = new JTextField();
		txtBarCode.setFont(new Font("C39HrP24DlTt", Font.PLAIN, 36));
		txtBarCode.setBounds(291, 459, 424, 49);
		frame.getContentPane().add(txtBarCode);
		txtBarCode.setColumns(10);
	}
}

