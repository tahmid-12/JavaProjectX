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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class UserLogin implements ActionListener,WindowListener{

	private JFrame frame2;
	
	private JLabel label19;
	private JLabel label20;
	
	private JTextField textfield;
	
	String username = null;
	String password = null;
	
	String var1;
	String var2;
	
	private JPasswordField pass;
	
	private JButton button;
	
	public UserLogin(){
		
		frame2 = new JFrame("Log In");
		
		label19 = new JLabel("UserName");
		label20 = new JLabel("Password");
		
		textfield = new JTextField(70);
		
		pass = new JPasswordField(70);
		
		button = new JButton();
		button.setText("Submit");
	}
	
	public void show(){
		
		frame2.addWindowListener(this);
		frame2.setSize(800, 300);
		frame2.setBackground(Color.GRAY);
		frame2.setLayout(null);
		
		frame2.setResizable(true);
		frame2.setVisible(true);
		
		label19.setBounds(200,50, 330, 40);
		label19.setForeground(Color.BLACK);
		label19.setFont(new Font("Calibri", Font.PLAIN + Font.ITALIC, 16));
		
		label20.setBounds(200,100, 330, 40);
		label20.setForeground(Color.BLACK);
		label20.setFont(new Font("Calibri", Font.PLAIN + Font.ITALIC, 16));
		
		textfield.setBackground(Color.WHITE);
		textfield.setForeground(Color.BLACK);
		textfield.setFont(new Font("Consolas", Font.PLAIN,16));
		textfield.setBounds(300, 55, 450, 35);
		textfield.setEditable(true);
		
		pass.setBackground(Color.WHITE);
		pass.setForeground(Color.BLACK);
		pass.setFont(new Font("Consolas", Font.PLAIN,16));
		pass.setBounds(300, 96, 450, 35);
		pass.setEditable(true);
		
		button.addActionListener(this);
		button.setBackground(Color.WHITE);
		button.setForeground(Color.BLACK);
		button.setBounds(300, 150, 100, 50);
		button.setFont(new Font("Consolas",Font.PLAIN,16));
		
		frame2.add(label19);
		frame2.add(textfield);
		
		frame2.add(label20);
		frame2.add(pass);
		frame2.add(button);
	}
	
	public void DatabaseConnection(){
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
			System.out.println("Connected");
			//String query="Select Username,password from member WHERE Username = ? AND Password= ?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("Select Name,Address,PhoneNumber,"
					+ "Amount,PersonId,Gender,Email,Username,Password from member WHERE Username = ? AND "
					+ "Password= ?");
			//PreparedStatement ps1 = (PreparedStatement) conn.prepareStatement("update member set Amount = ? where Username = ? AND "+ "Password= ?");
			ps.setString(1,UserNamePattern(textfield.getText()));
			ps.setString(2,PasswordPattern(pass.getText()));
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()){
				textfield.setForeground(Color.GREEN);
				pass.setForeground(Color.GREEN);
				UserPage u = new UserPage();
				u.show();
				u.setLabel2(resultSet.getString("Name"));
				u.setLabel4(resultSet.getString("Address"));
				//u.setTextfield(resultSet.getString("Address"));
				u.setLabel6(resultSet.getString("PhoneNumber"));
				u.setLabel8(resultSet.getString("Email"));
				//u.setTextfield3(resultSet.getString("Email"));
				u.setLabel10(resultSet.getString("Amount"));
				u.setLabel12(resultSet.getString("Username"));
				u.setLabel14(resultSet.getString("PersonId"));
				u.setLabel18(resultSet.getString("Gender"));

			}else{
				textfield.setForeground(Color.RED);
				pass.setForeground(Color.RED);
				JOptionPane.showMessageDialog(null,"Data Not found");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public String UserNamePattern(String n){
  	  
  	  String number = "[a-zA-Z]{1,20}_[0-9]{1,20}";
  	  Pattern p = Pattern.compile(number);
  	  Matcher m = p.matcher(n);
  	  if(!m.matches()){
			JOptionPane.showMessageDialog(null,"Username not valid");
		}
		else{
			//JOptionPane.showMessageDialog(null,"Username valid");
		}
  	  return n;
    }
	
	 public String PasswordPattern(String n){
    	 
	      String number = "[a-zA-Z0-9]{1,20}";
	   	  Pattern p = Pattern.compile(number);
	   	  Matcher m = p.matcher(n);
	   	  //Matcher m = p.
	   	  if(!m.matches()){
	 			JOptionPane.showMessageDialog(null,"Password not valid");
	 		}
	 		else{
	 			//JOptionPane.showMessageDialog(null,"Password valid");
	 		}
	   	  return n;
	     }
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
			DatabaseConnection();
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
