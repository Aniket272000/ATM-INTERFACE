package Atm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transaction extends JFrame implements ActionListener{
	
	JButton deposite,withdrawl,ministatement,pinchange,fastcash,balanceenquiry,exit;
	
	String pinnumber;
	Transaction(String pinnumber)
	{
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon("Icon/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel Image=new JLabel(i3);
		Image.setBounds(0, 0, 900, 900);
		add(Image);
		
		JLabel text=new JLabel("Please select your Transaction");
		text.setBounds(215,300, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Railway",Font.BOLD,15));
		Image.add(text);
		
		deposite=new JButton("Deposite");
		deposite.setBounds(170, 415, 150, 30);
		deposite.addActionListener(this);
		Image.add(deposite);
		
		withdrawl=new JButton("Withdrawl");
		withdrawl.setBounds(355, 415, 150, 30);
		withdrawl.addActionListener(this);
		Image.add(withdrawl);
		
		fastcash=new JButton("Fast Cash");
		fastcash.setBounds(170, 450, 150, 30);
		fastcash.addActionListener(this);
		Image.add(fastcash);
		
		ministatement=new JButton("Mini Statement");
		ministatement.setBounds(355, 450, 150, 30);
		ministatement.addActionListener(this);
		Image.add(ministatement);
		
		pinchange=new JButton("Pn Change");
		pinchange.setBounds(170, 485, 150, 30);
		pinchange.addActionListener(this);
		Image.add(pinchange);
		
		balanceenquiry=new JButton("Balance Enquiry");
		balanceenquiry.setBounds(355, 485, 150, 30);
		balanceenquiry.addActionListener(this);
		Image.add(balanceenquiry);
		
		exit=new JButton("Exit");
		exit.setBounds(355, 520, 150, 30);
		exit.addActionListener(this);
		Image.add(exit);
		
		
		setSize(900,900);
		setLocation(350,10);
		setUndecorated(true);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== exit)
		{
			System.exit(0);
		}else if(e.getSource()==deposite)
		{
			setVisible(false);
			new Deposite(pinnumber).setVisible(true);
		}else if(e.getSource()==withdrawl)
		{
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
		}else if(e.getSource()==fastcash)
		{
			setVisible(false);
			new Fastcash(pinnumber).setVisible(true);
		}else if(e.getSource()==pinchange)
		{
			setVisible(false);
			new Pinchange(pinnumber).setVisible(true);
		}else if(e.getSource()==balanceenquiry)
		{
			setVisible(false);
			new Balanceenquiry(pinnumber).setVisible(true);
		}else if(e.getSource()==ministatement)
		{
			
			new Ministatement(pinnumber).setVisible(true);
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Transaction(""); 
	}

	
}
