package Atm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class Deposite extends JFrame implements ActionListener{
	
	JTextField amount;
	JButton deposite,back;
	String pinnumber;
	Deposite(String pinnumber)
	{
		this.pinnumber=pinnumber;
		
		ImageIcon i1 = new ImageIcon("Icon/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel Image=new JLabel(i3);
		Image.setBounds(0, 0, 900, 900);
		add(Image);
		
		JLabel text=new JLabel("Enter the amount you want to Deposite");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Railway",Font.BOLD,16));
		text.setBounds(190, 300, 400, 20);
		Image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Railway",Font.BOLD,22));
		amount.setBounds(190, 350, 280, 25);
		Image.add(amount);
		
		deposite=new JButton("Deposite");
		deposite.setBounds(355, 485, 150,30);
		deposite.addActionListener(this);
		Image.add(deposite);
		
		back=new JButton("Back");
		back.setBounds(160, 485, 150,30);
		back.addActionListener(this);
		Image.add(back);
		
		
		setSize(900,900);
		setVisible(true);
		setLocation(350,10);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== deposite)
		{
			String number=amount.getText();
			Date date=new Date();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposite");
			}
			else {
				try
				{
					Conn conn=new Conn();
					String query6 ="insert into bank ( Pin_Number, date, type, amount)values('"+pinnumber+"','"+date+"','Deposite','"+number+"')";
					conn.s.executeUpdate(query6);
					JOptionPane.showMessageDialog(null, "Rs"+number+" Deposited Successfully");
					setVisible(false);
					new Transaction(pinnumber).setVisible(true);
				}catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
			
		}else if(e.getSource()==back)
		{
			setVisible(false);
			new Transaction(pinnumber).setVisible(true);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Deposite("");
	}

	

}
