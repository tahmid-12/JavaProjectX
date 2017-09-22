import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;


public class UserPage implements WindowListener,ActionListener{

	private JFrame frame;
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JLabel label19;
	
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield;
	
	private JButton button1;
	private JButton button2;
	
	public UserPage(){
		
		frame = new JFrame("User Page");
		
		label1 = new JLabel("Name");
		label2 = new JLabel("Name Field");
		label3 = new JLabel("Address");
		label4 = new JLabel("Address Field");
		label5 = new JLabel("PhoneNumber");
		label6 = new JLabel("Number Field");
		label7 = new JLabel("Email");
		label8 = new JLabel("Email Field");
		label9 = new JLabel("Amount");
		label10 = new JLabel("Amount Field");
		label11 = new JLabel("UserName");
		label12 = new JLabel("UserName Field");
		label13 = new JLabel("PersonID");
		label14 = new JLabel("ID Field");
		label15 = new JLabel("Deposit");
		label16 = new JLabel("Withdraw");
		label17 = new JLabel("Gender");
		label18 = new JLabel("Gender Field");
		label19 = new JLabel("Personal Information");
		
		textfield1 = new JTextField(30);
		textfield2 = new JTextField(30);
		textfield = new JTextField(70);
		
		button1 = new JButton();
		button1.setText("Deposit");
		
		button2 = new JButton();
		button2.setText("Withdraw");
	}

	public void show(){
		
		frame.addWindowListener(this);
		frame.setSize(900, 800);
		frame.setBackground(Color.GRAY);
		frame.setLayout(null);
		
		frame.setResizable(true);
		frame.setVisible(true);
		
		label19.setBounds(300,70, 290, 30);//Name
		label19.setFont(new Font("Serif", Font.BOLD,30));
		label19.setForeground(Color.RED);
		
		label1.setBounds(50,150, 100, 30);//Name
		label1.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label2.setBounds(250,150, 300, 30);
		label2.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label3.setBounds(50,200, 100, 30);//Address
		label3.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label4.setBounds(250,200, 450, 30);
		label4.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		/*textfield.setBounds(250,200, 450, 30);
		textfield.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));*/
		
		label5.setBounds(50,250, 145, 30);//Phone Number
		label5.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label6.setBounds(250,250, 150, 30);
		label6.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label7.setBounds(50,300, 100, 30);//Email
		label7.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label8.setBounds(250,300, 300, 30);
		label8.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		
		label9.setBounds(50,350, 100, 30);//Amount
		label9.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label10.setBounds(250,350, 150, 30);
		label10.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label11.setBounds(50,400, 100, 30);//Username
		label11.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label12.setBounds(250,400, 150, 30);
		label12.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label13.setBounds(50,450, 100, 30);//Id
		label13.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));

		label14.setBounds(250,450, 190, 30);
		label14.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label17.setBounds(50,500, 100, 30);//Gender
		label17.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label18.setBounds(250,500, 250, 40);//
		label18.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label15.setBounds(50,550, 100, 30);//Deposit
		label15.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label16.setBounds(510,550, 100, 30);//Withdraw
		label16.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		textfield1.setBackground(Color.WHITE);
		textfield1.setForeground(Color.BLACK);
		textfield1.setFont(new Font("Consolas", Font.PLAIN,16));
		textfield1.setBounds(250, 550, 250, 30);
		textfield1.setEditable(true);
		
		textfield2.setBackground(Color.WHITE);
		textfield2.setForeground(Color.BLACK);
		textfield2.setFont(new Font("Consolas", Font.PLAIN,16));
		textfield2.setBounds(620, 550, 250, 30);
		textfield2.setEditable(true);
		
		button1.addActionListener(this);
		button1.setBackground(Color.WHITE);
		button1.setForeground(Color.BLACK);
		button1.setBounds(250, 580, 100, 30);
		button1.setFont(new Font("Consolas",Font.PLAIN,16));
		
		button2.addActionListener(this);
		button2.setBackground(Color.WHITE);
		button2.setForeground(Color.BLACK);
		button2.setBounds(620, 580, 115, 30);
		button2.setFont(new Font("Consolas",Font.PLAIN,16));
		
		frame.add(label19);
		
		frame.add(label1);
		frame.add(label2);
		
		frame.add(label3);
		frame.add(label4);
		//frame.add(textfield);
		
		frame.add(label5);
		frame.add(label6);
		
		frame.add(label7);
		frame.add(label8);
		
		
		frame.add(label9);
		frame.add(label10);
		
		frame.add(label11);
		frame.add(label12);
		
		frame.add(label13);
		frame.add(label14);
		
		frame.add(label17);
		frame.add(label18);
		
		frame.add(label15);
		frame.add(textfield1);
		frame.add(button1);
		
		frame.add(label16);
		frame.add(textfield2);
		frame.add(button2);
		
	}
	
	public void DatabaseConnection(){
		
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
			System.out.println("Connected");
			
	}catch(Exception e){
		System.out.println(e);
	}
	}
	
	//Name
	public void setLabel2(String n){
		label2.setText(n);
	}
	
	//Address
	public void setLabel4(String n){
		label4.setText(n);
	}
	
	/*public void setTextfield(String n){
		textfield.setText(n);
	}*/
	
	//Number
	public void setLabel6(String n){
		label6.setText(n);
	}
	
	//Email
	public void setLabel8(String n){
		label8.setText(n);
	}
	
	//Amount
	public void setLabel10(String n){
		label10.setText(n);
	}
	
	//UserName
	public void setLabel12(String n){
		label12.setText(n);
	}
	
	//PersonId
	public void setLabel14(String n){
		label14.setText(n);
	}
	
	//Gender
	public void setLabel18(String n){
		label18.setText(n);
	}
	
	public String Deposit(String n){
		
		//DatabaseConnection();
		double d = Double.parseDouble(label10.getText());
		double i = Double.parseDouble(n);
		d = d + i;
		String p = String.valueOf(d);
		label10.setText(p);
		try{
			//DatabaseConnection();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
			System.out.println("Connected");
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("Update member set Amount=?");
			ps.setDouble(1, d);
			ps.executeUpdate();
			ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return p;
	}
	
	public String Withdraw(String n){
		
		//DatabaseConnection();
		String p;
		double d = Double.parseDouble(label10.getText());
		double i = Double.parseDouble(n);
		if(d<i){
			JOptionPane.showMessageDialog(null,"You can not withdraw");
		}else{
			d = d - i ;
		    p = String.valueOf(d);
			label10.setText(p);
		try{
			//DatabaseConnection();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
			System.out.println("Connected");
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("Update member set Amount=?");
			ps.setDouble(1, d);
			ps.executeUpdate();
			ps.close();
		}catch(Exception e){
			System.out.println(e);
		}
		//DatabaseConnection();
		
		//return null;
		}
		return null;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button1){
			Deposit(textfield1.getText());
		}
        if(e.getSource() == button2){
			Withdraw(textfield2.getText());
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
