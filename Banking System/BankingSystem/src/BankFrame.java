import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JOptionPane;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class BankFrame implements WindowListener,ActionListener{
	
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
	
	private JTextField memberName;
	private JTextField Address;
	private JTextField PhoneNumber;
	private JTextField Email;
	private JTextField Amount;
	private JTextField Username;
	private JTextField PersonId;
	
	String var1;//Person name
	String var2;//Address
	String var3;//phoneNumber
	String var4;//Email
	double var5;//Amount
	String var6;//UserName
	String var7;//Password
	String var8;//PasswordConformation
	String var9;//PersonId
	String var10;//Gender
	
	private JPasswordField password;
	private JPasswordField PasswordConformation;
	
	private JRadioButton JRadioButton1;
	private JRadioButton JRadioButton2;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	Scanner scan = new Scanner(System.in);
	Random rnd = new Random();
	
	public BankFrame(){
		
		frame = new JFrame("Bank Application Form");
		
		memberName = new JTextField(70);
		Address = new JTextField(70);
		PhoneNumber = new JTextField(70);
		Email = new JTextField(70);
		Amount = new JTextField(70);
		Username = new JTextField(70);
		PersonId = new JTextField(70);
		
		password = new JPasswordField(70);
		PasswordConformation = new JPasswordField(70);
		
		
		button1 = new JButton();
		button1.setText("Submit");
		
		button2 = new JButton();
		button2.setText("Reset");
		
		button3 = new JButton();
		button3.setText("IDGenerate");
		
		label1 = new JLabel("Name");
		label2 = new JLabel("Address");
		label3 = new JLabel("PhoneNumber");
		label4 = new JLabel("Email");
		label5 = new JLabel("Amount");
		label6 = new JLabel("Please Fill Up The Form");
		label7 = new JLabel("Username");
		label8 = new JLabel("Password");
		label9 = new JLabel("Re-Password");
		label10 = new JLabel("Gender");
		label11 = new JLabel("PersonId");
		
		JRadioButton1 = new JRadioButton("Male");
		JRadioButton2 = new JRadioButton("Female");
	}
	
	public void show(){
		
		frame.addWindowListener(this);
		frame.setSize(900, 800);
		frame.setBackground(Color.GRAY);
		frame.setLayout(null);
		
		frame.setResizable(true);
		frame.setVisible(true);
		
		label6.setBounds(250,50, 330, 40);
		label6.setForeground(Color.RED);
		label6.setFont(new Font("Serif", Font.BOLD,30));
		
		label1.setBounds(50,150, 100, 30);
		label1.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label2.setBounds(50,200, 100, 30);
		label2.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label3.setBounds(50,250, 145, 30);
		label3.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label4.setBounds(50,300, 100, 30);
		label4.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label5.setBounds(50,350, 100, 30);
		label5.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label7.setBounds(50,400, 100, 30);
		label7.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label8.setBounds(50,450, 100, 30);
		label8.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label9.setBounds(50,500, 120, 30);
		label9.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label10.setBounds(50,600, 100, 30);
		label10.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		label11.setBounds(50,550, 100, 30);
		label11.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,20));
		
		memberName.setBackground(Color.WHITE);
		memberName.setForeground(Color.BLACK);
		memberName.setFont(new Font("Consolas", Font.PLAIN,16));
		memberName.setBounds(250, 150, 550, 35);
		memberName.setEditable(true);
		
		Address.setBackground(Color.WHITE);
		Address.setForeground(Color.BLACK);
		Address.setFont(new Font("Consolas", Font.PLAIN,16));
		Address.setBounds(250, 200, 550, 35);
		Address.setEditable(true);
		
		PhoneNumber.setBackground(Color.WHITE);
		PhoneNumber.setForeground(Color.BLACK);
		PhoneNumber.setFont(new Font("Consolas", Font.PLAIN,16));
		PhoneNumber.setBounds(250, 250, 550, 35);
		PhoneNumber.setEditable(true);
		
		Email.setBackground(Color.WHITE);
		Email.setForeground(Color.BLACK);
		Email.setFont(new Font("Consolas", Font.PLAIN,16));
		Email.setBounds(250, 300, 550, 35);
		Email.setEditable(true);
		
		Amount.setBackground(Color.WHITE);
		Amount.setForeground(Color.BLACK);
		Amount.setFont(new Font("Consolas", Font.PLAIN,16));
		Amount.setBounds(250, 350, 550, 35);
		Amount.setEditable(true);
		
		Username.setBackground(Color.WHITE);
		Username.setForeground(Color.BLACK);
		Username.setFont(new Font("Consolas", Font.PLAIN,16));
		Username.setBounds(250, 400, 550, 35);
		Username.setEditable(true);
		
		password.setBackground(Color.WHITE);
		password.setForeground(Color.BLACK);
		password.setFont(new Font("Consolas", Font.PLAIN,16));
		password.setBounds(250, 450, 550, 35);
		password.setEditable(true);
		
		PasswordConformation.setBackground(Color.WHITE);
		PasswordConformation.setForeground(Color.BLACK);
		PasswordConformation.setFont(new Font("Consolas", Font.PLAIN,16));
		PasswordConformation.setBounds(250, 500, 550, 35);
		PasswordConformation.setEditable(true);
		
		PersonId.setBackground(Color.WHITE);
		PersonId.setForeground(Color.BLACK);
		PersonId.setFont(new Font("Consolas", Font.PLAIN,16));
		PersonId.setBounds(250, 550, 400, 35);
		PersonId.setEditable(false);
		PersonId.setEnabled(true);
		PersonId.setFocusable(true);
		
		JRadioButton1.addActionListener(this);
		JRadioButton1.setBounds(250, 600, 100, 35);
		JRadioButton1.setFont(new Font("Consolas",Font.BOLD,16));
		
		JRadioButton2.addActionListener(this);
		JRadioButton2.setBounds(350, 600, 100, 35);
		JRadioButton2.setFont(new Font("Consolas",Font.BOLD,16));
		
		button1.addActionListener(this);
		button1.setBackground(Color.WHITE);
		button1.setForeground(Color.BLACK);
		button1.setBounds(300, 650, 100, 30);
		button1.setFont(new Font("Consolas",Font.PLAIN,16));
		
		button2.addActionListener(this);
		button2.setBackground(Color.WHITE);
		button2.setForeground(Color.BLACK);
		button2.setBounds(430, 650, 100, 30);
		button2.setFont(new Font("Consolas",Font.PLAIN,16));
		
		button3.addActionListener(this);
		button3.setBackground(Color.WHITE);
		button3.setForeground(Color.BLACK);
		button3.setBounds(670, 550, 130, 35);
		button3.setFont(new Font("Consolas",Font.PLAIN,16));
		
		frame.add(label1);
		frame.add(memberName);
		
		frame.add(label2);
		frame.add(Address);
		
		frame.add(label3);
		frame.add(PhoneNumber);
		
		frame.add(label4);
		frame.add(Email);
		
		frame.add(label5);
		frame.add(Amount);
		
		frame.add(label6);
		
		
		frame.add(label7);
		frame.add(JRadioButton1);
		frame.add(JRadioButton2);
		
		frame.add(label8);
		frame.add(Username);
		
		frame.add(label9);
		frame.add(password);
		
		frame.add(label10);
		frame.add(PasswordConformation);
		
		frame.add(label11);
		frame.add(PersonId);
		frame.add(button3);
		
		frame.add(button1);
		frame.add(button2);
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
	//Connecting to Database
	public void DatabaseConnection(){
		
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
			System.out.println("Connected");
			PreparedStatement posted = (PreparedStatement) conn.prepareStatement("INSERT INTO member(Name,Address,PhoneNumber,Email,Amount,Username,Password,RePassword,PersonId,gender) "
					+ "VALUES ('"+var1+"','"+var2+"','"+var3+"','"+var4+"','"+var5+"','"
							+var6+"','"+var7+"','"+var8+"','"+var9+"','"+var10+"')");
					
					posted.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("Insertion Complete");
		}
	}
	//Matches Name Pattern
	public String NamePattern(String n){
		
		String name = "[A-Z .a-z]{1,20}";
		Pattern p = Pattern.compile(name);
		Matcher m = p.matcher(n);
		if(!m.matches()){
			JOptionPane.showMessageDialog(null,"Name not valid");
		}
		else{
			JOptionPane.showMessageDialog(null,"Name valid");
		}
		return n;
	}
	
	//Phone number pattern
      public String PhoneNumberPattern(String n){
		
		String number = "0[1][6-9][0-9]{1,20}";
		Pattern p = Pattern.compile(number);
		Matcher m = p.matcher(n);
		if(!m.matches()){
			JOptionPane.showMessageDialog(null,"Phone Number not valid");
		}
		else{
			JOptionPane.showMessageDialog(null,"Phone Number valid");
		}
		return n;
	}
      //Email Pattern
      public String EmailPattern(String n){
    	  
    	  String number = "[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z0-9]{1,20}";
    	  Pattern p = Pattern.compile(number);
    	  Matcher m = p.matcher(n);
    	  if(!m.matches()){
  			JOptionPane.showMessageDialog(null,"Email not valid");
  		}
  		else{
  			JOptionPane.showMessageDialog(null,"Email valid");
  		}
    	  return n;
      }
      
      
      
      //Username pattern
      public String UserNamePattern(String n){
    	  
    	  String number = "[a-zA-Z]{1,20}_[0-9]{1,20}";
    	  Pattern p = Pattern.compile(number);
    	  Matcher m = p.matcher(n);
    	  if(!m.matches()){
  			JOptionPane.showMessageDialog(null,"Username not valid");
  		}
  		else{
  			JOptionPane.showMessageDialog(null,"Username valid");
  		}
    	  return n;
      }
	
     //password pattern
     public String PasswordPattern(String n){
    	 
      String number = "[a-zA-Z0-9]{1,20}";
   	  Pattern p = Pattern.compile(number);
   	  Matcher m = p.matcher(n);
   	  //Matcher m = p.
   	  if(!m.matches()){
 			JOptionPane.showMessageDialog(null,"Password not valid");
 		}
 		else{
 			JOptionPane.showMessageDialog(null,"Password valid");
 		}
   	  return n;
     }
     
   //password pattern
     public String PasswordConformationPattern(String n){
    	 
         String number = "[a-zA-Z0-9]{1,20}";
      	  Pattern p = Pattern.compile(number);
      	  Matcher m = p.matcher(n);
      	  if(!m.matches()){
    			JOptionPane.showMessageDialog(null,"Password Confirm not valid");
    		}
    		else{
    			JOptionPane.showMessageDialog(null,"Password Confirm valid");
    		}
      	  return n;
        }
     
     public int PersonIDConformation(){
    	 Random rnd = new Random();
    	 int number = rnd.nextInt(9999999);
    	 //System.out.println("The number is:"+number);
    	 return number;
     }
 
     
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button3){
			String n = String.valueOf(PersonIDConformation());
		     PersonId.setText(n);
		}
		
	    if(e.getSource() == button1){
	    	
	    	var1 = NamePattern(memberName.getText());
	    	var2 = Address.getText();
	    	var3 = PhoneNumberPattern(PhoneNumber.getText());
	    	var4 = EmailPattern(Email.getText());
	    	var5 = Double.parseDouble(Amount.getText());
	    	var6 = UserNamePattern(Username.getText());
	    	var7 = PasswordPattern(password.getText());
	    	var8 = PasswordConformationPattern(PasswordConformation.getText());
	    	var9 = PersonId.getText();
	    	if(JRadioButton1.isSelected()){
				var10 = "Male";
			}
			else{
				var10 = "Female";
			}
	    	if(password.getText().equals(PasswordConformation.getText())){
	    		DatabaseConnection();
	    	}
	    	else{
	    		//System.out.println("Password mismatch!!!");
	    		JOptionPane.showMessageDialog(null,"Passwords mismatch");
	    	}
	    }
	    
		if(e.getSource() == button2){
			memberName.setText(null);
			Address.setText(null);
			PhoneNumber.setText(null);
			Email.setText(null);
			Amount.setText(null);
			Username.setText(null);
			PersonId.setText(null);
			password.setText(null);
			PasswordConformation.setText(null);
			JRadioButton1.setSelected(false);
			JRadioButton2.setSelected(false);
		}
	}

}
