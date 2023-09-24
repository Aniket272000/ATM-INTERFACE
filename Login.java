package Atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Login extends JFrame implements ActionListener{
	
	JButton login,signup,clear;  //define globally
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	Login()
	{
		setTitle("AUTOMATED TELLER MACHINE");
		
		setLayout(null);
		
		ImageIcon i1=new ImageIcon("Icon/logo.jpg");
		Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel label=new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text=new JLabel("Welcome To ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		
		JLabel cardno=new JLabel("Card No :");
		cardno.setFont(new Font("Railway",Font.BOLD,28));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno);
		
		cardTextField =new JTextField();
		cardTextField.setBounds(300, 150, 250, 30);
		cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(cardTextField);
		
		
		
		
		JLabel pin=new JLabel("Pin :");
		pin.setFont(new Font("Osward",Font.BOLD,28));
		pin.setBounds(120, 220, 200, 30);
		cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(pin);
		
		pinTextField =new JPasswordField();
		pinTextField.setBounds(300, 220, 250, 30);
		add(pinTextField);
		
		login=new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.black);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		clear=new JButton("CLEAR");
		clear.setBounds(450, 300, 100, 30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signup=new JButton("SIGN UP");
		signup.setBounds(300, 350, 250, 30);
		signup.setBackground(Color.black);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		
		getContentPane().setBackground(Color.WHITE);
		
		
		setSize(800,500);
		setVisible(true);
		setLocation(350,200);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()== clear)
		{
			cardTextField.setText("");
			pinTextField.setText("");
			
		}else if(ae.getSource()== login)
		{
			try
			{
				Conn conn=new Conn();
				String cardnumber=cardTextField.getText();
				String pinnumber=pinTextField.getText();
				String query5="select * from login where Card_Number = '"+cardnumber+"' and Pin_Number ='"+pinnumber+"'"; //do it carefully mention the name as per login table in sql
				try {
					ResultSet rs=conn.s.executeQuery(query5);
					if(rs.next())
					{
						setVisible(false);
						new Transaction(pinnumber).setVisible(true);
					}else
					{
						JOptionPane.showMessageDialog(null, "Incorrect Card number or Pin");
					}
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}else if(ae.getSource()== signup)
		{
			setVisible(false);
			new SignupOne().setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Login();
		

	}
	

	

}
