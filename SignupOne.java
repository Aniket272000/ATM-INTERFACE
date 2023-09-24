package Atm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.util.*;


public class SignupOne extends JFrame implements ActionListener {
	
	long random;
	JTextField nameTextField,middlenameTextField,lastnameTextField,dobTextField,emailTextField,addTextField,cityTextField,stateTextField,pinTextField;
	JButton next;
	JRadioButton male,female,married,unmarried;
	
	
	
	SignupOne()
	{
		setTitle("Sign Up Page");
		setLayout(null);
		
		Random ran=new Random();
		random=Math.abs((ran.nextLong() %9000L)+1000L);
		
		JLabel formno=new JLabel("APLLICATION FORM NO "+ random);
		formno.setFont(new Font("Railway",Font.BOLD,38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		JLabel personaldetail=new JLabel("Page 1: Personal Details ");
		personaldetail.setFont(new Font("Railway",Font.BOLD,25));
		personaldetail.setBounds(250, 80, 400, 30);
		add(personaldetail);
		
		JLabel name=new JLabel("Name : ");
		name.setFont(new Font("Railway",Font.BOLD,20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		nameTextField=new JTextField();
		nameTextField.setFont(new Font("Railway",Font.BOLD,15));
		nameTextField.setBounds(350, 140, 400, 30);
		add(nameTextField);
		
		JLabel middlename=new JLabel("Middle Name : ");
		middlename.setFont(new Font("Railway",Font.BOLD,20));
		middlename.setBounds(100, 190, 200, 30);
		add(middlename);
		
		middlenameTextField=new JTextField();
		middlenameTextField.setFont(new Font("Railway",Font.BOLD,15));
		middlenameTextField.setBounds(350, 190, 400, 30);
		add(middlenameTextField);
		
		JLabel lastname=new JLabel("Last Name : ");
		lastname.setFont(new Font("Railway",Font.BOLD,20));
		lastname.setBounds(100, 240, 200, 30);
		add(lastname);
		
		lastnameTextField=new JTextField();
		lastnameTextField.setFont(new Font("Railway",Font.BOLD,15));
		lastnameTextField.setBounds(350, 240, 400, 30);
		add(lastnameTextField);
		
		JLabel dob=new JLabel("Date of Birth : ");
		dob.setFont(new Font("Railway",Font.BOLD,20));
		dob.setBounds(100, 290, 200, 30);
		add(dob);
		
		dobTextField=new JTextField();
		dobTextField.setFont(new Font("Railway",Font.BOLD,15));
		dobTextField.setBounds(350, 290, 400, 30);
		add(dobTextField);
		
		
		
		JLabel gender=new JLabel("Gender : ");
		gender.setFont(new Font("Railway",Font.BOLD,20));
		gender.setBounds(100, 340, 100, 30);
		add(gender);
		
		male=new JRadioButton("Male");
		male.setBounds(350, 340, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);
		
		
		female=new JRadioButton("Female");
		female.setBounds(450, 340, 150, 30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		JLabel email=new JLabel("E-mail : ");
		email.setFont(new Font("Railway",Font.BOLD,20));
		email.setBounds(100, 390, 100, 30);
		add(email);
		
		emailTextField=new JTextField();
		emailTextField.setFont(new Font("Railway",Font.BOLD,15));
		emailTextField.setBounds(350, 390, 400, 30);
		add(emailTextField);
		
		JLabel maritalstatus=new JLabel("Marital Status : ");
		maritalstatus.setFont(new Font("Railway",Font.BOLD,20));
		maritalstatus.setBounds(100, 440, 150, 30);
		add(maritalstatus);
		
		married=new JRadioButton("Married");
		married.setBounds(350, 440, 100, 30);
		married.setBackground(Color.WHITE);
		add(married);
		
		
		unmarried=new JRadioButton("UnMarried");
		unmarried.setBounds(450, 440, 250, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		
		JLabel add=new JLabel("Address : ");
		add.setFont(new Font("Railway",Font.BOLD,20));
		add.setBounds(100, 490, 100, 30);
		add(add);
		
		addTextField=new JTextField();
		addTextField.setFont(new Font("Railway",Font.BOLD,15));
		addTextField.setBounds(350, 490, 400, 30);
		add(addTextField);
		
		JLabel city=new JLabel("City: ");
		city.setFont(new Font("Railway",Font.BOLD,20));
		city.setBounds(100, 540, 100, 30);
		add(city);
		
		cityTextField=new JTextField();
		cityTextField.setFont(new Font("Railway",Font.BOLD,15));
		cityTextField.setBounds(350, 540, 400, 30);
		add(cityTextField);
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Railway",Font.BOLD,20));
		state.setBounds(100, 590, 100, 30);
		add(state);
		
		stateTextField=new JTextField();
		stateTextField.setFont(new Font("Railway",Font.BOLD,15));
		stateTextField.setBounds(350, 590, 400, 30);
		add(stateTextField);
		
		JLabel pincode=new JLabel("Pin Code:");
		pincode.setFont(new Font("Railway",Font.BOLD,20));
		pincode.setBounds(100, 640, 150, 30);
		add(pincode);
		
		pinTextField=new JTextField();
		pinTextField.setFont(new Font("Railway",Font.BOLD,15));
		pinTextField.setBounds(350, 640, 400, 30);
		add(pinTextField);
		
		next=new JButton("Next Page");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Railway",Font.BOLD,14));
		next.setBounds(350, 700, 200, 40);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800,800);
		setVisible(true);
		setLocation(350,10);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String formno=" " + random;
		String name=nameTextField.getText();
		String middlename=middlenameTextField.getText();
		String lastname=lastnameTextField.getText();
		String dob=dobTextField.getText();
		String gender=null;
		if(male.isSelected())
		{
			gender="Male";
		}else if(female.isSelected())
		{
			gender="Female";
		}
		String email=emailTextField.getText();
		String maritalstatus=null;
		if(married.isSelected())
		{
			maritalstatus="Married";
		}else if(unmarried.isSelected())
		{
			maritalstatus="UnMarried";
		}
		String add=addTextField.getText();
		String city=cityTextField.getText();
		String state=stateTextField.getText();
		String pin=pinTextField.getText();
		
		try
		{
			if(name.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Name is Required");
			}else if(middlename.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Middle Name is Required");
			}else if(lastname.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Last Name is Required");
			}else if(dob.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Date of Birth is Required");
			}else if(email.equals(""))
			{
				JOptionPane.showMessageDialog(null, "E-mail  is Required");
			}
			else if(add.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Address Name is Required");
			}else if(city.equals(""))
			{
				JOptionPane.showMessageDialog(null, "City Name is Required");
			}else if(state.equals(""))
			{
				JOptionPane.showMessageDialog(null, "State Name is Required");
			}else if(pin.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Pin Code is Required");
			}else
			{
				Conn conn=new Conn();
				String query = "INSERT INTO signup (formno, name, middlename, lastname, dob, gender, email, marital_status, address, city, state, pin_code) " +
			               "VALUES ('" + formno + "', '" + name + "', '" + middlename + "', '" + lastname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + maritalstatus + "', '" + add + "', '" + city + "', '" + state + "', '" + pin + "')";

				conn.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
			
			
			
		}catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SignupOne();

	}

	

}
