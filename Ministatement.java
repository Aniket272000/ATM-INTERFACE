package Atm;

import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Ministatement  extends JFrame{
	
	Ministatement(String pinnumber)
	{
		setLayout(null);
		setTitle("Mini Statement");
		
		JLabel mini=new JLabel();
		add(mini);
		
		JLabel bank=new JLabel("Indian Bank");
		bank.setBounds(150, 20, 100, 20);
		add(bank);
		
		JLabel card=new JLabel();
		card.setBounds(20, 40, 300, 20);
		add(card);
		
		JLabel balance=new JLabel();
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		
		try
		{
			Conn conn=new Conn();
			
            ResultSet rs=conn.s.executeQuery("select * from login where Pin_Number = '"+pinnumber+"'");
			
			while(rs.next())
			{
				mini.setText("Card Number:"+rs.getString("Card_Number").substring(0,5)+"XXXXXXXX"+rs.getString("Card_Number").substring(12));
				
			}
			
			
		}catch(Exception e8)
		{
			System.out.println(e8);
		}
		
		try
		{
			Conn conn=new Conn();
			int bal=0;
			ResultSet rs=conn.s.executeQuery("select * from bank where Pin_Number = '"+pinnumber+"'");
			while(rs.next())
			{
				mini.setText(mini.getText()+"<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount") + "< br><br><html>");
				if(rs.getString("type").equals("Deposite"))
				{
					bal +=Integer.parseInt(rs.getString("amount"));
				}else
				{
					bal -=Integer.parseInt(rs.getString("amount"));
				}
			}
			balance.setText("Your current account  balance is Rs "+bal);
		}catch(Exception ed)
		{
			System.out.println(ed);
		}
		
		mini.setBounds(40,60 , 400, 200);
		
		
		setSize(400,600);
		setLocation(20,20);
		setVisible(true);
		
		getContentPane().setBackground(Color.WHITE);
	}

	

	public static void main(String[] args) {
		new Ministatement("");

	}

}
