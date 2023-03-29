package module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class mainepage extends JFrame {

	private JPanel contentPane;
	private JTextField mathsTF;
	private JTextField osTF;
	private JTextField dsTF;
	private JTextField physicsTF;
	private JTextField englishTF;
	private JTextField avgTF;
	private JTextField gpaTF;
	private JTextField iletterTF;
	private JTextField jletterTF;
	private JTextField kletterTF;
	private JTextField lletterTF;
	private JTextField mletterTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainepage frame = new mainepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainepage() 
	{
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(183, 210, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GPA Calculator");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(143, 11, 149, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Maths");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(27, 72, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operating System");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(27, 97, 112, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data Structure ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(27, 146, 112, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Physics");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(27, 180, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("English");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(27, 219, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Average");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(292, 73, 89, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("GPA");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(292, 144, 49, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Calculate ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mathsScore, osScore,dsScore,englishScore,physicsScore;
				double average;
				double gpa=0;
				 
				mathsScore=mathsTF.getText();
				osScore=osTF.getText();
				dsScore=dsTF.getText();
				physicsScore=physicsTF.getText();
				englishScore=englishTF.getText();
				
				double maths=Double.parseDouble(mathsScore);
				double os=Double.parseDouble(osScore);
				double ds=Double.parseDouble(dsScore);
				double english=Double.parseDouble(englishScore);
				double physics=Double.parseDouble(physicsScore);
				
				average=(maths+os+ds+physics+english)/5;
				
				/*Maths*/
				if(maths>=90)
				{
					iletterTF.setText("A");
					gpa=gpa+0.5;	
				}
				else if(maths>=80 && maths<90)
				{
					iletterTF.setText("B");
					gpa=gpa+0.4;	
				}
				else if(maths>=70 && maths<80)
				{
					iletterTF.setText("C");
					gpa=gpa+0.3;	
				}
				else if(maths>=60 && maths<70)
				{
					iletterTF.setText("D");
					gpa=gpa+0.2;	
				}
				else if(maths>=50 && maths<60)
				{
					iletterTF.setText("P");
					gpa=gpa+0.1;	
				}
				else if(maths<40)
				{
					iletterTF.setText("F");
					gpa=gpa+0;	
				}
				
				/*os*/
				if(os>=90)
				{
					jletterTF.setText("A");
					gpa=gpa+0.5;	
				}
				else if(os>=80 && os<90)
				{
					jletterTF.setText("B");
					gpa=gpa+0.4;	
				}
				else if(os>=70 && os<80)
				{
					jletterTF.setText("C");
					gpa=gpa+0.3;	
				}
				else if(os>=60 && os<70)
				{
					jletterTF.setText("D");
					gpa=gpa+0.2;	
				}
				else if(os>=50 && os<60)
				{
					jletterTF.setText("P");
					gpa=gpa+0.1;	
				}
				else if(os<40)
				{
					jletterTF.setText("F");
					gpa=gpa+0;	
				}
				
				/*ds*/
				if(ds>=90)
				{
					kletterTF.setText("A");
					gpa=gpa+0.5;	
				}
				else if(ds>=80 && ds<90)
				{
					kletterTF.setText("B");
					gpa=gpa+0.4;	
				}
				else if(ds>=70 && ds<80)
				{
					kletterTF.setText("C");
					gpa=gpa+0.3;	
				}
				else if(ds>=60 && ds<70)
				{
					kletterTF.setText("D");
					gpa=gpa+0.2;	
				}
				else if(ds>=50 && ds<60)
				{
					kletterTF.setText("P");
					gpa=gpa+0.1;	
				}
				else if(ds<40)
				{
					kletterTF.setText("F");
					gpa=gpa+0;	
				}
				
				/*english*/
				if(english>=90)
				{
					mletterTF.setText("A");
					gpa=gpa+0.5;	
				}
				else if(english>=80 && english<90)
				{
					mletterTF.setText("B");
					gpa=gpa+0.4;	
				}
				else if(english>=70 && english<80)
				{
					mletterTF.setText("C");
					gpa=gpa+0.2;	
				}
				else if(english>=60 && english<70)
				{
					mletterTF.setText("P");
					gpa=gpa+0.1;	
				}
				else if(english>=50 && english<60)
				{
					mletterTF.setText("P");
					gpa=gpa+0.2;	
				}
				else if(english<40)
				{
					mletterTF.setText("F");
					gpa=gpa+0.1;	
				}
				
				/*physics*/
				if(physics>=90)
				{
					lletterTF.setText("A");
					gpa=gpa+0.5;	
				}
				else if(physics>=80 && physics<90)
				{
					lletterTF.setText("B");
					gpa=gpa+0.4;	
				}
				else if(physics>=70 && physics<80)
				{
					lletterTF.setText("C");
					gpa=gpa+0.3;	
				}
				else if(physics>=60 && physics<70)
				{
					lletterTF.setText("P");
					gpa=gpa+0.2;	
				}
				else if(physics>=50 && physics<60)
				{
					lletterTF.setText("P");
					gpa=gpa+0.2;	
				}
				else if(physics<40)
				{
					lletterTF.setText("F");
					gpa=gpa+0.1;	
				}
				
				gpa=gpa/5;
				gpaTF.setText(Double.toString(gpa));
				avgTF.setText(Double.toString(average));		
				
			}
		});
		
		
		btnNewButton.setBounds(292, 215, 96, 23);
		contentPane.add(btnNewButton);
		
		mathsTF = new JTextField();
		mathsTF.setBounds(143, 70, 40, 20);
		contentPane.add(mathsTF);
		mathsTF.setColumns(10);
		
		osTF = new JTextField();
		osTF.setBounds(143, 102, 40, 20);
		contentPane.add(osTF);
		osTF.setColumns(10);
		
		dsTF = new JTextField();
		dsTF.setBounds(143, 144, 40, 20);
		contentPane.add(dsTF);
		dsTF.setColumns(10);
		
		physicsTF = new JTextField();
		physicsTF.setBounds(143, 178, 40, 20);
		contentPane.add(physicsTF);
		physicsTF.setColumns(10);
		
		englishTF = new JTextField();
		englishTF.setBounds(143, 217, 40, 20);
		contentPane.add(englishTF);
		englishTF.setColumns(10);
		
		avgTF = new JTextField();
		avgTF.setBounds(292, 98, 96, 20);
		contentPane.add(avgTF);
		avgTF.setColumns(10);
		
		gpaTF = new JTextField();
		gpaTF.setBounds(292, 174, 96, 20);
		contentPane.add(gpaTF);
		gpaTF.setColumns(10);
		
		iletterTF = new JTextField();
		iletterTF.setEditable(false);
		iletterTF.setBounds(186, 70, 40, 20);
		contentPane.add(iletterTF);
		iletterTF.setColumns(10);
		
		jletterTF = new JTextField();
		jletterTF.setEditable(false);
		jletterTF.setBounds(186, 102, 40, 20);
		contentPane.add(jletterTF);
		jletterTF.setColumns(10);
		
		kletterTF = new JTextField();
		kletterTF.setEditable(false);
		kletterTF.setBounds(186, 144, 40, 20);
		contentPane.add(kletterTF);
		kletterTF.setColumns(10);
		
		lletterTF = new JTextField();
		lletterTF.setEditable(false);
		lletterTF.setBounds(186, 178, 40, 20);
		contentPane.add(lletterTF);
		lletterTF.setColumns(10);
		
		mletterTF = new JTextField();
		mletterTF.setEditable(false);
		mletterTF.setBounds(186, 217, 40, 20);
		contentPane.add(mletterTF);
		mletterTF.setColumns(10);
	}
}
