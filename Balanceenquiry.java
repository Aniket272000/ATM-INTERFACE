package Atm;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Balanceenquiry extends JFrame implements ActionListener {
	
	JButton back;
	String pinnumber;
	Balanceenquiry(String pinnumber)
	{
		this.pinnumber=pinnumber;
        setLayout(null);
		
		ImageIcon i1 = new ImageIcon("Icon/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel Image=new JLabel(i3);
		Image.setBounds(0, 0, 900, 900);
		add(Image);
		
		back=new JButton("Back");
		back.setFont(new Font("Railwat",Font.BOLD,16));
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		Image.add(back);
		
		
		
		setSize(900,900);
		setLocation(350,10);
		setUndecorated(true);
		setVisible(true);
		
		int balance=0;
		try
		{
			Conn conn=new Conn();
			ResultSet rs=conn.s.executeQuery("select * from bank where Pin_Number = '"+pinnumber+"'");
			
			while(rs.next())
			{
				if(rs.getString("type").equals("Deposite"))
				{
					balance +=Integer.parseInt(rs.getString("amount"));
				}else
				{
					balance -=Integer.parseInt(rs.getString("amount"));
				}
			}
			
		}catch(Exception e7)
		{
			System.out.println(e7);
		}
		JLabel text=new JLabel("Your balace is Rs :" +balance);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Railway",Font.BOLD,16));
		text.setBounds(170, 300, 400, 30);
		Image.add(text);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Transaction(pinnumber).setVisible(true);
		
		
		
	}


	public static void main(String[] args) {
		new Balanceenquiry("");

	}

	
}
