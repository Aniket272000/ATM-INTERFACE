package Atm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;


public class SignupTwo extends JFrame implements ActionListener {
	
	JTextField pannoTextField,adharnoTextField;
	
	JComboBox religionJComboBox, catJComboBox, incomeJComboBox, educationJComboBox,occupationJComboBox;
	// jcombobox in dropdown formate.
	JRadioButton yes,no,yes1,no1;
	
	JButton next;
	String formno;
	
	
	
	SignupTwo(String formno)
	{
		
		this.formno=formno;
		setTitle("Sign up Page");
		setLayout(null);
		
		
		
		JLabel form2=new JLabel("Page 2 : Additional Details");
		form2.setFont(new Font("Railway",Font.BOLD,28));
		form2.setBounds(200, 40, 400, 40);
		add(form2);
		
		JLabel religion=new JLabel("Religion :");
		religion.setFont(new Font("Railway",Font.BOLD,20));
		religion.setBounds(120, 100, 100, 40);
		add(religion);
		
		String[] valreligion ={" ","Hindu","Buddhist","Muslim","Chrischan","Jain"};
		religionJComboBox=new JComboBox(valreligion);
		religionJComboBox.setFont(new Font("Railway",Font.BOLD,14));
		religionJComboBox.setBounds(380, 110, 300, 26);
		add(religionJComboBox);
		
		JLabel cat=new JLabel("Category :");
		cat.setFont(new Font("Railway",Font.BOLD,20));
		cat.setBounds(120, 150, 100, 40);
		add(cat);
		
		String[] valcat ={" ","SC","ST","OPEN","OBC","NT"};
		catJComboBox=new JComboBox(valcat);
		catJComboBox.setFont(new Font("Railway",Font.BOLD,14));
		catJComboBox.setBounds(380, 160, 300, 26);
		add(catJComboBox);
		
		JLabel income=new JLabel("Income :");
		income.setFont(new Font("Railway",Font.BOLD,20));
		income.setBounds(120, 200, 100, 40);
		add(income);
		
		String[] valincome ={" ","10000-50000","50000-100000","100000-500000","500000-1000000","1000000 +"};
		incomeJComboBox=new JComboBox(valincome);
		incomeJComboBox.setFont(new Font("Railway",Font.BOLD,14));
		incomeJComboBox.setBounds(380, 210, 300, 26);
		add(incomeJComboBox);
		
		JLabel education=new JLabel("Education :");
		education.setFont(new Font("Railway",Font.BOLD,20));
		education.setBounds(120, 250, 200, 40);
		add(education);
		
		String[] valed ={" ","BE/B TECH","BCA","BA","BCOM","BSC","OTHER"};
		educationJComboBox=new JComboBox(valed);
		educationJComboBox.setFont(new Font("Railway",Font.BOLD,14));
		educationJComboBox.setBounds(380, 260, 300, 26);
		add(educationJComboBox);
		
		JLabel occupation=new JLabel("Occupation :");
		occupation.setFont(new Font("Railway",Font.BOLD,20));
		occupation.setBounds(120, 300, 200, 40);
		add(occupation);
		
		String[] valocc ={" ","Self Employee","Bussines","Farmar","Labour","Gov-Servent","Student"};
		occupationJComboBox=new JComboBox(valocc);
		occupationJComboBox.setFont(new Font("Railway",Font.BOLD,14));
		occupationJComboBox.setBounds(380, 310, 300, 26);
		add(occupationJComboBox);
		
		JLabel panno=new JLabel("Pancard Number :");
		panno.setFont(new Font("Railway",Font.BOLD,20));
		panno.setBounds(120, 350, 200, 40);
		add(panno);
		
		pannoTextField=new JTextField();
		pannoTextField.setFont(new Font("Railway",Font.BOLD,14));
		pannoTextField.setBounds(380, 360, 300, 26);
		add(pannoTextField);
		
		JLabel adharno=new JLabel("Adharcard Number :");
		adharno.setFont(new Font("Railway",Font.BOLD,20));
		adharno.setBounds(120, 400, 200, 40);
		add(adharno);
		
		adharnoTextField=new JTextField();
		adharnoTextField.setFont(new Font("Railway",Font.BOLD,14));
		adharnoTextField.setBounds(380, 410, 300, 26);
		add(adharnoTextField);
		
		JLabel sen=new JLabel("Senior Citizen  :");
		sen.setFont(new Font("Railway",Font.BOLD,20));
		sen.setBounds(120, 450, 200, 40);
		add(sen);
		
		yes=new JRadioButton("Yes");
		yes.setBounds(380, 450, 60, 30);
		yes.setBackground(Color.WHITE);
		add(yes);
		
		no=new JRadioButton("No");
		no.setBounds(440, 450, 60, 30);
		no.setBackground(Color.WHITE);
		add(no);
		
		ButtonGroup sengroup=new ButtonGroup();
		sengroup.add(yes);
		sengroup.add(no);
		
		JLabel ex=new JLabel("Existing Account :");
		ex.setFont(new Font("Railway",Font.BOLD,20));
		ex.setBounds(120, 500, 200, 40);
		add(ex);
		
		yes1=new JRadioButton("Yes");
		yes1.setBounds(380, 500, 60, 30);
		yes1.setBackground(Color.WHITE);
		add(yes1);
		
		no1=new JRadioButton("No");
		no1.setBounds(440, 500, 60, 30);
		no1.setBackground(Color.WHITE);
		add(no1);
		
		ButtonGroup exgroup=new ButtonGroup();
		exgroup.add(yes1);
		exgroup.add(no1);
		
		next=new JButton("Next Page");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Railway",Font.BOLD,14));
		next.addActionListener(this);
		next.setBounds(380, 600, 200, 40);
		
		add(next);
		
		
		
		setSize(800,800);
		setLocation(350,10);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String religion= (String)religionJComboBox.getSelectedItem();
		String cat= (String)catJComboBox.getSelectedItem();
		String income= (String)incomeJComboBox.getSelectedItem();
		String education= (String)educationJComboBox.getSelectedItem();
		String occupation= (String)occupationJComboBox.getSelectedItem();
		String pan=pannoTextField.getText();
		String adhar=adharnoTextField.getText();
		
		String sen=null;
		if(yes.isSelected())
		{
			sen="Yes";
		}else if(no.isSelected()){
		         sen="No";
		}
		String ex=null;
		if(yes1.isSelected())
		{
			ex="Yes";
		}else if(no1.isSelected()){
		         ex="No";
		}
		try
		{
			if(religion.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Religion is Required");
			}else if(cat.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Category is Required");
			}else if(income.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Income is Required");
			}else if(education.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Education is Required");
			}else if(occupation.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Occupation is Required");
			}
			else if(pan.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Pan Number is Required");
			}else if(adhar.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Adhar Number is Required");
			}else
			{
				Conn conn=new Conn();
				String query1 = "INSERT INTO signuptwo (formno, religion , category, income, education, occupation, pan_number, adhar_number, senior_citizen, existing_account) " +
			               "VALUES ('" + formno + "', '" + religion + "', '" + cat + "', '" + income + "', '" + education + "', '" + occupation+ "', '" + pan + "', '" + adhar + "', '" + sen + "', '" + ex + "')";

				conn.s.executeUpdate(query1);
				setVisible(false);
				new SignupThree(formno).setVisible(true);
				
			}
			
			
			
		}catch(Exception e2)
		{
			System.out.println(e2);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SignupTwo n=new SignupTwo("");
	}

	

}
