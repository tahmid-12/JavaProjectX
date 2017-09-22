import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BankEntry implements ActionListener,WindowListener{

	private JFrame frame1;
	
	private JLabel label1;
	
	private JButton button1;
	private JButton button2;
	
	public BankEntry(){
		
		frame1 = new JFrame("Bank Application");
		
		label1 = new JLabel("Welcome To Our Bank");
		//label2 = new JLabel("Please Choose Your Service");
		
		button1 = new JButton();
		//button1.setLabel("LOG IN");
		button1.setText("LOG IN");
		
		button2 = new JButton();
		button2.setText("REGISTRATION");
	}
	
	public void show(){
		
		frame1.addWindowListener(this);
		frame1.setSize(850, 600);
		frame1.setBackground(Color.GRAY);
		frame1.setLayout(null);
		
		frame1.setResizable(true);
		frame1.setVisible(true);
		
		label1.setBounds(250,50, 330, 40);
		label1.setForeground(Color.RED);
		label1.setFont(new Font("Serif", Font.BOLD,30));
		
		/*label2.setBounds(200,100, 400, 100);
		label2.setForeground(Color.RED);
		label2.setFont(new Font("Serif", Font.BOLD,30));*/
		
		button1.addActionListener(this);
		button1.setBackground(Color.WHITE);
		button1.setForeground(Color.BLACK);
		button1.setBounds(220, 200, 150, 150);
		button1.setFont(new Font("Consolas",Font.PLAIN,16));
		
		button2.addActionListener(this);
		button2.setBackground(Color.WHITE);
		button2.setForeground(Color.BLACK);
		button2.setBounds(450, 200, 150, 150);
		button2.setFont(new Font("Consolas",Font.PLAIN,16));
		
		frame1.add(label1);
		//frame1.add(label2);
		frame1.add(button1);
		frame1.add(button2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button2){
			BankFrame bf = new BankFrame();
			bf.show();
		}
		if(e.getSource() == button1){
			
			UserLogin u = new UserLogin();
			u.show();
		}
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
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
