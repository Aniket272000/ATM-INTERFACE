package Atm;

import java.awt.Color;

import java.util.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Pinchange extends JFrame implements ActionListener {
	
	JPasswordField pin,repin;
	JButton change,back;
	String pinnumber;
	Pinchange(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon("Icon/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel Image=new JLabel(i3);
		Image.setBounds(0, 0, 900, 900);
		add(Image);
		
		JLabel text=new JLabel("CHANGE YOUR PIN ");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Railway",Font.BOLD,16));
		text.setBounds(270, 280, 500,40);
		Image.add(text);
		
		JLabel pintext=new JLabel("NEW PIN :");
		pintext.setForeground(Color.WHITE);
		pintext.setFont(new Font("Railway",Font.BOLD,16));
		pintext.setBounds(160, 320, 200,30);
		Image.add(pintext);
		
		pin=new JPasswordField();
		pin.setFont(new Font("Railway",Font.BOLD,25));
		pin.setBounds(330, 320, 170, 30);
		Image.add(pin);
		
		JLabel repintext=new JLabel("Re-Enter NEW PIN :");
		repintext.setForeground(Color.WHITE);
		repintext.setFont(new Font("Railway",Font.BOLD,16));
		repintext.setBounds(160, 370, 500,30);
		Image.add(repintext);
		
		repin=new JPasswordField();
		repin.setFont(new Font("Railway",Font.BOLD,25));
		repin.setBounds(330, 370, 170, 30);
		Image.add(repin);
		
		change=new JButton("CHANGE");
		change.setBounds(355, 485, 150, 25);
		change.addActionListener(this);
		Image.add(change);
		
		back=new JButton("BACK");
		back.setBounds(355, 520, 150, 25);
		back.addActionListener(this);
		Image.add(back);
		
		
		
		
		setSize(900,900);
		setLocation(350,10);
		setUndecorated(true);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==change)
		{
			try
			{
				String npin=pin.getText();
				String rpin=repin.getText();
				
				if(!npin.equals(rpin))
				{
					JOptionPane.showMessageDialog(null, "Enter PIN does not match");
					return;
				}
				
				if(npin.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Plese Enter your PIN");
					return;
				}
				
				if(rpin.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Plese Re-Enter your PIN");
					return;
				}
				
				try
				{
					Conn conn=new Conn();
					
					String query1="update bank Pin_Number = '"+rpin+"'where Pin_Number='"+pinnumber+"'";
					String query2="update login Pin_Number = '"+rpin+"'where Pin_Number='"+pinnumber+"'";

					String query3="update signupthree Pin_Number = '"+rpin+"'where Pin_Number='"+pinnumber+"'";

					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					conn.s.executeUpdate(query3);
					
					JOptionPane.showMessageDialog(null, "PIN Change Successfully");
					setVisible(false);
					new Transaction(rpin).setVisible(true);
					
				}catch(Exception ea)
				{
					System.out.println(ea);
				}
				 
			}catch(Exception e6)
			{
				System.out.println(e6);
			}
		}else
		{
			setVisible(false);
			new Transaction(pinnumber).setVisible(true);
		}
	
		
	}


	public static void main(String[] args) {
		new Pinchange("").setVisible(true);

	}


}
