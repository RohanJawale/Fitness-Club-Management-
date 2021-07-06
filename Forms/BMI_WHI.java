import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.lang.*;
import java.io.*;
import java.math.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BMI_WHI extends JFrame implements ActionListener,KeyListener{
	
	JLabel header,bmi,whi,weight,height,mobNo,mname,pac,status,datee,feet,inch,west,hip,gen,b,whr,bs,ws;
	JTextField BMI,WHI,WEIGHT,HEIGHT,MNAME,MOBNO,INCH,WEST,HIP,BMISTATUS,WHISTATUS;
	JComboBox Pac,cbdate,cbmonth,cbyear,cbgender;
	JButton Calculate,Save,Status,Previous;
	String[] Package,date,month,year,gender;
	JLabel arrow;
	JLabel background;
String ch=null;
	Font f,ff,fff;
	DefaultTableModel model=new DefaultTableModel();
	   JTable tabGrid=new JTable(model);
	   JScrollPane scrlPane=new JScrollPane(tabGrid);
	   String Date;
	
		BMI_WHI()
	{
		
		 Toolkit t = Toolkit.getDefaultToolkit();
		    Dimension d = t.getScreenSize();
		    int h = d.height;
		    int w = d.width;
			setSize(900,900);

	
			
			
		  ImageIcon img=new ImageIcon("/home/user/project/1087579.jpg");
	        background=new JLabel("",img,JLabel.CENTER);
	 		background.setBounds(0,0,900,900);
			add( background); 	
			
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
	 		Date dateee=new Date();
	 		Date=sdf.format(dateee); 
 String[] dd=Date.split("/",5);
 String y=dd[0];
 String m=dd[1];
 String ddd=dd[2];
 
			
			
			ImageIcon im=new ImageIcon("/home/user/project/multimedia-option.png");
			  
			  
				ImageIcon ig=new ImageIcon("/home/user/project/files-and-folders.png");
				
				ImageIcon igg=new ImageIcon("/home/user/project/technology.png");
				
				ImageIcon iggg=new ImageIcon("/home/user/project/icons8-back-30.png");
		
		
				background.add(scrlPane);
		        tabGrid.setFont(new Font("Verdana",0,13));
		        tabGrid.setBackground(Color.orange);
		        model.addColumn("Member Name");
		        model.addColumn("Package");
		        model.addColumn("Weight");
		        model.addColumn("BMI");
		        model.addColumn("BMI Status");
		        model.addColumn("WHI");
		        model.addColumn("WHR Status");
				
				
	    f=new Font("TimesNewRoman",Font.HANGING_BASELINE,20);	
        ff=new Font("TimesNewRoman",Font.BOLD,35);
        fff=new Font("TimesNewRoman",Font.ITALIC,15);

        header=new JLabel("Health Record");
        header.setFont(ff);
        header.setForeground(Color.orange);
        background.add(header);
        
        
        
	 mobNo=new JLabel("Mobile No :->");
	 mobNo.setFont(f);
	 mobNo.setForeground(Color.orange);
	 mobNo.setOpaque(false);
	 background.add(mobNo);
	 
	 MOBNO=new JTextField();
	 MOBNO.setFont(f);
	 background.add(MOBNO);
	 
	 
	 
	 
	 
	
	 
	 
	 
	 mname=new JLabel("Member Name :->");
	 mname.setFont(f);
	 mname.setForeground(Color.orange);
	 mname.setOpaque(false);
	 background.add(mname);
	 
	
	 MNAME=new JTextField();
	// MNAME.setFont(f);
	 //MNAME.setOpaque(false);
	 background.add(MNAME);
	 
	 
	weight=new JLabel("Weight");
	weight.setFont(f);
	weight.setForeground(Color.orange);

	weight.setOpaque(false);
	background.add(weight);
	
		
		
	pac=new JLabel("Package :->");
	pac.setFont(f);
	pac.setForeground(Color.orange);
	pac.setOpaque(false);
	background.add(pac);
	
	
	
	Package=new String[] {"Gym","Cardio","Zumba","Gym+Cardio","Gym+Cardio+Zumba"};

	Pac=new JComboBox(Package);
	background.add(Pac);
	
	height=new JLabel("Height :->");
	height.setForeground(Color.orange);

	height.setFont(f);
	background.add(height);
	
	HEIGHT=new JTextField();
	HEIGHT.setFont(f);
	background.add(HEIGHT);
	
	INCH=new JTextField();
	INCH.setFont(f);
	background.add(INCH);
	
	feet=new JLabel("Feet");
	feet.setForeground(Color.orange);

	feet.setFont(fff);
	background.add(feet);
	
	inch=new JLabel("inch");
	inch.setForeground(Color.orange);

	inch.setFont(fff);
	background.add(inch);
	
	weight=new JLabel("Weight :->");
	weight.setForeground(Color.orange);
	weight.setFont(f);
	background.add(weight);
	
	WEIGHT=new JTextField();
	WEIGHT.setFont(f);
   background.add(WEIGHT);
	
	bmi=new JLabel("Body Mass Index");
	bmi.setForeground(Color.orange);
	bmi.setFont(f);
	background.add(bmi);
	
	
	b=new JLabel("BMI");
	b.setForeground(Color.orange);
	b.setFont(fff);
	background.add(b);
	
	whr=new JLabel("WHR");
	whr.setForeground(Color.orange);
	whr.setFont(fff);
	background.add(whr);
	
	bs=new JLabel("BMI Status");
	bs.setForeground(Color.orange);
	bs.setFont(fff);
	background.add(bs);
	
	ws=new JLabel("WHR Status");
	ws.setForeground(Color.orange);
	ws.setFont(fff);
	background.add(ws);
	
	
	
	
	 BMI=new JTextField();
	 background.add(BMI);
	 BMI.setEditable(false);
	
	 whi=new JLabel("WHI");
	whi.setForeground(Color.orange);
	 whi.setFont(f);
	 background.add(whi);
	 
	 WHI=new JTextField();
	 
	 background.add(WHI);
	 WHI.setEditable(false);
	 
	 datee=new JLabel("Date :->");
	datee.setForeground(Color.orange);
	 datee.setFont(f);
	 background.add(datee);
	 
	 date=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	 cbdate=new JComboBox(date);
	 cbdate.setSelectedItem(ddd);
	 background.add(cbdate);
	 	 
	 
	 month=new String[] {"Jan","Feb","Mar","Apr","May","June","Jully","Aug","Sep","Oct","Nov","Dec"};
	 cbmonth=new JComboBox(month);
	 cbmonth.setSelectedItem(m);
	 background.add(cbmonth);
	 
	 year=new String[] {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033","2034","2035","2036","2037","2038","2039","2040","2041","2042","2043","2044","2045","2046","2047","2048","2049","2050"};
	 cbyear=new JComboBox(year);
	 cbyear.setSelectedItem(y);
     background.add(cbyear);
     
     west=new JLabel("West Size (in cm)");
 	west.setForeground(Color.orange);
     west.setFont(f);
     background.add(west);
     
     WEST=new JTextField();
     WEST.setFont(f);
     background.add(WEST);
     
     hip=new JLabel("Hip Size (in cm)");
 	 hip.setForeground(Color.orange);
     hip.setFont(f);
     background.add(hip);
     
     HIP=new JTextField();
     HIP.setFont(f);
     background.add(HIP);
     
     gender= new String[]{"Male","Female"};
     cbgender=new JComboBox(gender);
     background.add(cbgender);
     
     gen=new JLabel("Gender");
 	 gen.setForeground(Color.orange);
     gen.setFont(f);
     background.add(gen);
     
     BMISTATUS=new JTextField();
     BMISTATUS.setEditable(false);
     background.add(BMISTATUS);
     
     WHISTATUS=new JTextField();
     WHISTATUS.setEditable(false);
     background.add(WHISTATUS);
     
     
	 
     
     Calculate=new JButton("Calculate",igg);
     background.add(Calculate);
     Calculate.addActionListener(this);
     
     Save=new JButton("Save",im);
     background.add(Save);
     Save.addActionListener(this);
     
     
     Status=new JButton("Status",ig);
     background.add(Status);
     Status.addActionListener(this);
     
     Previous=new JButton("Previous Record",iggg);
     background.add(Previous);
     Previous.addActionListener(this);
	// whi.setEditable(false);
	
	
	header.setBounds(450, 20, 300, 35);
	mobNo.setBounds(20,70,190,35);
	MOBNO.setBounds(230,70,200,35);
	mname.setBounds(20, 130, 220, 35);
	MNAME.setBounds(230, 130, 200, 35);
	pac.setBounds(20,190,200,35);
	Pac.setBounds(230,190,200,35);
	height.setBounds(20, 260, 190, 35);
	HEIGHT.setBounds(230, 260, 70, 35);
	feet.setBounds(240, 290, 70, 30);
	INCH.setBounds(310, 260, 70, 35);
	inch.setBounds(320, 290, 70, 30);
	weight.setBounds(20, 330, 190, 35);
	WEIGHT.setBounds(230, 330, 200, 35);
	Calculate.setBounds(100, 480, 150, 50);
	Status.setBounds(400, 480, 150, 50);
	Save.setBounds(700, 480, 150, 50);
	Previous.setBounds(1000, 480, 190, 50);
	
	datee.setBounds(720, 70, 190, 35);
	cbdate.setBounds(950,70,45,35);
	cbmonth.setBounds(1000, 70, 65, 35);
	cbyear.setBounds(1070, 70, 65, 35);
	gen.setBounds(720, 140, 300, 35);
	cbgender.setBounds(950,140,200,35);
	hip.setBounds(720, 220, 300, 35);
	HIP.setBounds(950,220,200,35);
	west.setBounds(720, 280, 200, 35);
	WEST.setBounds(950, 280, 200, 35);
	bmi.setBounds(50, 400, 300, 35);
	b.setBounds(300, 370, 100, 30);
	BMI.setBounds(270, 400, 100, 35);
	bs.setBounds(470, 370, 200, 30);
	BMISTATUS.setBounds(420, 400, 200, 35);
	whi.setBounds(800, 400, 300, 35);
	whr.setBounds(920,370,100,30);
	WHI.setBounds(900, 400, 100, 35);
	ws.setBounds(1040, 370, 200, 30);
	WHISTATUS.setBounds(1020, 400, 200, 35);
	scrlPane.setBounds(100, 570,1000,100);

	
	

	setSize(w,h);
	setVisible(true);
	
	MNAME.addKeyListener(new KeyAdapter()
	{
public void keyTyped(KeyEvent e) {
	char c=e.getKeyChar();
	if(!((c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_SPACE)||(c==KeyEvent.VK_DELETE)||((c>=65 && c<=90 )||(c>=97 && c<122))))
	{
		JOptionPane.showMessageDialog(null,"Special charaters are not allowed .");
		e.consume();
	}
}
});	 	
	MOBNO.addKeyListener(new KeyAdapter()
		{
	public void keyTyped(KeyEvent e) {
		char c=e.getKeyChar();
		if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))))
		{
			JOptionPane.showMessageDialog(null,"Please Enter Numerical value");
			e.consume();
		}
	}
		});
	WEIGHT.addKeyListener(new KeyAdapter()
	{
public void keyTyped(KeyEvent e) {
	char c=e.getKeyChar();
	if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==46))))
	{
		JOptionPane.showMessageDialog(null,"Please Enter Numerical value");
		e.consume();
	}
}
	});
	
	HEIGHT.addKeyListener(new KeyAdapter()
	{
public void keyTyped(KeyEvent e) {
	char c=e.getKeyChar();
	ch=ch+c;

	if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))))
	{
		JOptionPane.showMessageDialog(null,"Please Enter Numerical value");
		e.consume();
	}
	
}
    
	});
	ch=null;
	
	HIP.addKeyListener(new KeyAdapter()
	{
public void keyTyped(KeyEvent e) {
	char c=e.getKeyChar();
	if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))))
	{
		JOptionPane.showMessageDialog(null,"Please Enter Numerical value");
		e.consume();
	}
}
	});
	
	WEST.addKeyListener(new KeyAdapter()
	{
public void keyTyped(KeyEvent e) {
	char c=e.getKeyChar();
	if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))))
	{
		JOptionPane.showMessageDialog(null,"Please Enter Numerical value");
		e.consume();
	}
}
	});
 
	 
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==Calculate)
		{
			try
			{
			
			final int BMI_CONSTANT_VALUE=703;
            final double lb=2.205;
			 DecimalFormat fmt=new DecimalFormat("0.##");

			 int f= Integer.parseInt(HEIGHT.getText());	
			 int i= Integer.parseInt(INCH.getText());
			 Float h=Float.parseFloat(HIP.getText());
			 Float wst=Float.parseFloat(WEST.getText());
			 String whr=""+fmt.format((wst/h));
			 int totheight=(f*12)+i;
			 int wt=Integer.parseInt(WEIGHT.getText());
			 double w=wt*2.205;
		double tbmi=(w*BMI_CONSTANT_VALUE)/(Math.pow(totheight,2));
			
			
			 String res=""+fmt.format(tbmi);
				 BMI.setText(res);
				 WHI.setText(whr);
			 
			// else
				 //JOptionPane.showMessageDialog(null,"Please check something is missing from (Feet,Inch,Weight,Hip,West)");
			
			 
			 
			 
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		
		if(e.getSource()==Status)
		{
		    double bmi=Double.parseDouble(BMI.getText());
		    double whi=Double.parseDouble(WHI.getText());
		    String g=(String)cbgender.getSelectedItem();
		    System.out.println(g);
		    if(g.equals("Male"))
		    {
		    	if(whi<=0.95)
		    	{
		    		WHISTATUS.setText("Low Health Risk");
		    	}
		    	
		    	else if(whi>0.95&&whi<=1.0)
		    	{
		    		WHISTATUS.setText("Moderate Health Risk");

		    	}
		    	else if(whi>1.0)
		    	{
		    		WHISTATUS.setText("High Health Risk");

		    	}
		    	
		    	if(bmi<15)
		    	{
		    		BMISTATUS.setText("Very Severely Underweight");
		    	}
		    	else if(bmi>15.0&&bmi<=16.0)
		    	{
		    		BMISTATUS.setText("Severely Underweight");

		    	}
		    	else if(bmi>16.0&&bmi<=18.5)
		    	{
		    		BMISTATUS.setText(" Underweight");

		    	}
		    	else if(bmi>18.5 && bmi<=25)
		    	{
		    		BMISTATUS.setText(" Normal");

		    	}
		    	else if(bmi>25 &&  bmi<=30)
		    	{
		    		BMISTATUS.setText(" Overweight");

		    	}
		    	else if(bmi>30 &&  bmi<=35)
		    	{
		    		BMISTATUS.setText(" Moderately Obese");
		    		System.out.println("Moderatey Obese");

		    	}
		    	else if(bmi>35 && bmi<=40)
		    	{
		    		BMISTATUS.setText(" Severely Obese");

		    	}
		    	else if(bmi>40)
		    	{
		    		BMISTATUS.setText("Very Severely Obese");

		    	}
		    	
		    }
		    
		    
		    else if(g.equals("Female"))
		    {
		    	if(whi<=0.80)
		    	{
		    		WHISTATUS.setText("Low Health Risk");
		    	}
		    	
		    	else if(whi>0.80&&whi<=0.84)
		    	{
		    		WHISTATUS.setText("Moderate Health Risk");

		    	}
		    	else if(whi>0.85)
		    	{
		    		WHISTATUS.setText("High Health Risk");

		    	}
		    	
		    	if(bmi<15)
		    	{
		    		BMISTATUS.setText("Very Severely Underweight");
		    	}
		    	else if(bmi>15.0&&bmi<=16.0)
		    	{
		    		BMISTATUS.setText("Severely Underweight");

		    	}
		    	else if(bmi>16.0&&bmi<=18.5)
		    	{
		    		BMISTATUS.setText(" Underweight");

		    	}
		    	else if(bmi>18.5 && bmi<=25)
		    	{
		    		

		    		BMISTATUS.setText(" Normal");

		    	}
		    	else if(bmi>25 &&  bmi<=30)
		    	{

		    		BMISTATUS.setText(" Overweight");
		    	}
		    	else if(bmi>30 &&  bmi<=35)
		    	{
		    		

		    		
		    		BMISTATUS.setText(" Moderately Obese");
		    		
		    	}
		    	else if(bmi>35 && bmi<=40)
		    	{
		    		

		    		BMISTATUS.setText(" Severely Obese");

		    	}
		    	else if(bmi>40)
		    	{
		    		BMISTATUS.setText("Very Severely Obese");

		    	}
		    }
			
			
		}
		if(e.getSource()==Save)
		{
			try
			{
				Class.forName("org.postgresql.Driver");
		        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
			     PreparedStatement ps= con.prepareStatement("INSERT INTO Health_Record VALUES(?,?,?,?,?,?,?,?,?,?)");
			     String MobNo=(String)MOBNO.getText();
			     String mname=(String)MNAME.getText();
			     String Package=(String)Pac.getSelectedItem();
			     
			     String date=(String) cbdate.getSelectedItem();
			     String Month=""+cbmonth.getSelectedItem();
				    String Year=(String)cbyear.getSelectedItem();
				    String Date=date+"/"+Month+"/"+Year; 
				    
             String Gender=(String)cbgender.getSelectedItem();
             String Bmi=(String)BMI.getText();
             String Whi=(String)WHI.getText();
             String BmiStatus=(String)BMISTATUS.getText();
             String WhiStatus=(String)WHISTATUS.getText();
             String weight=(String)WEIGHT.getText();
             
             
			     ps.setString(1, MobNo);
			     ps.setString(2,mname);
			     ps.setString(3,Package);
			     ps.setString(4,Date);

			     ps.setString(5,Gender);

			     ps.setString(6,Bmi);

			     ps.setString(7,Whi);

			     ps.setString(8,BmiStatus);
			     
			     ps.setString(9, WhiStatus);
			     
			     ps.setString(10, weight);
			     if(MOBNO.getText()!=null&&MNAME.getText()!=null&&BMI.getText()!=null&&WHI.getText()!=null&&BMISTATUS.getText()!=null && WHISTATUS.getText()!=null && WEIGHT.getText()!=null)
			     {
			     int i=ps.executeUpdate();
			     if(i>0)
				     JOptionPane.showMessageDialog(null,"Your record Submited");
					else 		     
						JOptionPane.showMessageDialog(null,"Record is not added");
			     }
		}

			    
			catch(Exception ex)
			{
				System.out.println(ex);
System.out.println(ex);
				JOptionPane.showMessageDialog(null,ex);
			}
		}
		if(e.getSource()==Previous)
		{
			int r=0;

			try
			{
				Class.forName("org.postgresql.Driver");
		        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		        String mno=MOBNO.getText();
		        PreparedStatement st=(PreparedStatement) con.prepareStatement("select * from Health_Record where mobile_no=?");
		        st.setString(1, mno);
				ResultSet rs= st.executeQuery();
				while(rs.next())
				{
					model.insertRow(r++,new Object[] {rs.getString(2),rs.getString(3),rs.getString(10),rs.getString(6),rs.getString(8),rs.getString(7),rs.getString(9)});

				}

		        
		}
			catch(Exception ex)
			{
		    	JOptionPane.showMessageDialog(null,"Error Occured:"+ex);

			}
	}
	}
    
	public static void main(String args[])
	{
		new BMI_WHI();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
