package Atm;

import java.awt.Color;
import java.util.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	
	JButton submit,cancel;
	String formno;
	
	String pinnumber ;
	
	SignupThree(String formno)
	{
		this.formno=formno;
		setLayout(null);
		setTitle("Signup Page");
		
		JLabel form3=new JLabel("Page 3: Account Details");
		form3.setFont(new Font("Railway",Font.BOLD,28));
		form3.setBounds(220, 40, 400, 40);
		add(form3);
		
		JLabel type=new JLabel("Account Type :");
		type.setFont(new Font("Railway",Font.BOLD,20));
		type.setBounds(100, 120, 200, 30);
		add(type);
		
		r1=new JRadioButton(" Saving Account");
		r1.setFont(new Font("Railway",Font.BOLD,14));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100, 180, 150, 20);
		add(r1);
		
		r2=new JRadioButton(" Fixed Deposit Account");
		r2.setFont(new Font("Railway",Font.BOLD,14));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350, 180, 250, 20);
		add(r2);
		
		r3=new JRadioButton(" Current Account");
		r3.setFont(new Font("Railway",Font.BOLD,14));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100, 220, 250, 20);
		add(r3);
		
		r4=new JRadioButton(" Recurring  Account");
		r4.setFont(new Font("Railway",Font.BOLD,14));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350, 220, 250, 20);
		add(r4);
		
		ButtonGroup groupaccount=new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		JLabel card=new JLabel("Card Number :");
		card.setFont(new Font("Railway",Font.BOLD,20));
		card.setBounds(100, 280, 200, 30);
		add(card);
		
		JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("Railway",Font.BOLD,20));
		number.setBounds(350, 280, 300, 30);
		add(number);
		
		JLabel cardd=new JLabel("Your 16-Digit Number ");
		cardd.setFont(new Font("Railway",Font.BOLD,15));
		cardd.setBounds(350, 300, 200, 20);
		add(cardd);
		
		JLabel pin=new JLabel("PIN :");
		pin.setFont(new Font("Railway",Font.BOLD,20));
		pin.setBounds(100, 350, 200, 30);
		add(pin);
		
		JLabel pnumber=new JLabel("XXXX");
		pnumber.setFont(new Font("Railway",Font.BOLD,20));
		pnumber.setBounds(350, 350, 300, 30);
		add(pnumber);
		
		JLabel pinp=new JLabel("Your 4-Digit PIN");
		pinp.setFont(new Font("Railway",Font.BOLD,15));
		pinp.setBounds(350, 370, 200, 20);
		add(pinp);
		
		JLabel service=new JLabel("Services Requried :");
		service.setFont(new Font("Railway",Font.BOLD,20));
		service.setBounds(100, 420, 200, 30);
		add(service);
		
		c1=new JCheckBox("ATM CARD");
		c1.setFont(new Font("Railway",Font.BOLD,15));
		c1.setBounds(100, 470, 200, 20);
		add(c1);
		
		c2=new JCheckBox("Internet Banking");
		c2.setFont(new Font("Railway",Font.BOLD,15));
		c2.setBounds(350, 470, 200, 20);
		add(c2);
		
		c3=new JCheckBox("Mobile Banking");
		c3.setFont(new Font("Railway",Font.BOLD,15));
		c3.setBounds(100, 510, 200, 20);
		add(c3);
		
		c4=new JCheckBox("Email and SMS Alert");
		c4.setFont(new Font("Railway",Font.BOLD,15));
		c4.setBounds(350, 510, 200, 20);
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setFont(new Font("Railway",Font.BOLD,15));
		c5.setBounds(100, 550, 200, 20);
		add(c5);
		
		c6=new JCheckBox("E-Statement");
		c6.setFont(new Font("Railway",Font.BOLD,15));
		c6.setBounds(350, 550, 200, 20);
		add(c6);
		
		c7=new JCheckBox("I Hereby declared that the above entered details are correct to the best of my knowlege ");
		c7.setFont(new Font("Railway",Font.BOLD,12));
		c7.setBounds(100, 620, 600, 15);
		add(c7);
		
		ButtonGroup servicegroup=new ButtonGroup();
		servicegroup.add(c1);
		servicegroup.add(c2);
		servicegroup.add(c3);
		servicegroup.add(c4);
		servicegroup.add(c5);
		servicegroup.add(c6);
		
		submit=new JButton("SUBMIT");
		submit.setFont(new Font("Railway",Font.BOLD,20));
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setBounds(350, 670, 150, 30);
		submit.addActionListener(this);
		add(submit);
		
		cancel=new JButton("CANCEL");
		cancel.setFont(new Font("Railway",Font.BOLD,20));
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setBounds(550, 670, 150, 30);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(820,820);
		setVisible(true);
		setLocation(350,10);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submit)
		{
			String type=null;
			if(r1.isSelected())
			{
				type="Saving Account";
			}else if(r2.isSelected())
			{
				type="Fixed Account";
			}else if(r3.isSelected())
			{
				type="Current Account";
			}else if(r4.isSelected())
			{
				type="Reccuring Account";
			}
			
			Random random=new Random();
			String card=" "+Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L);
			
			String pinnumber=""+Math.abs((random.nextLong() % 9000L)+1000L);
			
			String facility="";
			if(c1.isSelected())
			{
				facility=facility+"ATM CARD";
			}else if(c2.isSelected())
			{
				facility=facility+"Internet Banking";
			}else if(c3.isSelected())
			{
				facility=facility+"Mobile Banking";
			}else if(c4.isSelected())
			{
				facility=facility+"E-mail nad SMS Alert";
			}else if(c5.isSelected())
			{
				facility=facility+"Cheque Book";
			}else if(c6.isSelected())
			{
				facility=facility+"E-Statement";
			}
			
			try {
			    if (type.equals("")) {
			        JOptionPane.showMessageDialog(null, "Account type is Required");
			    } else {
			        Conn conn = new Conn();
			        String query3 = "INSERT INTO signupthree (formno, Account_Type, Card_Number, Pin_Number, Facility) " +
			                        "VALUES ('" + formno + "', '" + type + "', '" + card + "', '" + pinnumber + "', '" + facility + "')";
			        String query4 = "INSERT INTO login (formno, Card_Number, Pin_Number) " +
			                        "VALUES ('" + formno + "', '" + card + "', '" + pinnumber + "')";

			        conn.s.executeUpdate(query3);
			        conn.s.executeUpdate(query4);

			        JOptionPane.showMessageDialog(null, "Card_Number: " + card + "\n Pin_Number:" + pinnumber);
			        
			        setVisible(false);
					new Deposite(pinnumber).setVisible(false);;
			        
			    }
			} catch (Exception e3) {
			    System.out.println(e3);
			}

		}else if(e.getSource() == cancel)
		{
			setVisible(false);
			new Login().setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SignupThree s=new SignupThree("");
	}

	

}
