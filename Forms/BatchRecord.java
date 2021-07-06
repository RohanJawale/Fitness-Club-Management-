import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.table.DefaultTableModel;

public class BatchRecord extends JFrame implements ActionListener{
	
		
		JLabel lblstandardrecord,lblBatchid,lblPackage,lblstartdate,lblBatchtime;
		JTextField Batchid,startdate;
		JComboBox cbPackagename,cbbatchtime,cbdate,cbmonth,cbyear;
		Font f,ff;
		String [] gender,coursename,batchtime,FeeType,date,month,year;
	 	JButton open,modify,delete,neww,addd,all;
	 	
		 String TDate = null;

	 	
		DefaultTableModel model=new DefaultTableModel();
		   JTable tabGrid=new JTable(model);
		   JScrollPane scrlPane=new JScrollPane(tabGrid);

	 	BatchRecord()
	 	{
	 		JLabel background;
	 		setSize(900,900);
	 		setTitle("Batch  Record");
	        ImageIcon img=new ImageIcon("/home/user/eclipse-workspace/Fitness Club Management/src/1087579.jpg");
	        background=new JLabel("",img,JLabel.CENTER);
	 		background.setBounds(0,0,900,900);
			add( background); 	
	        
	        f=new Font("TimesNewRoman",Font.BOLD,20);	
	        
	        ff=new Font("Georgia",Font.BOLD,30);	
	        
	        
            ImageIcon iggg=new ImageIcon("/home/user/project/iconfinder_Open_1493293.png");
   		 ImageIcon igg=new ImageIcon("/home/user/project/iconfinder_basket_1814090.png");
   		 ImageIcon ig=new ImageIcon("/home/user/project/Open-folder-add-icon.png");
   		 ImageIcon i=new ImageIcon("/home/user/project/Gear-icon.png");
   		 ImageIcon ii=new ImageIcon("/home/user/project/eye.png");

   		 ImageIcon iii=new ImageIcon("/home/user/project/miscellaneous.png");

   		 
   		 
		background.add(scrlPane);
        tabGrid.setFont(new Font("Verdana",0,13));
        model.addColumn("Batch_Id");
        model.addColumn("Package");
        model.addColumn("Start_Date");
        model.addColumn("Batch_Time");
        



	        lblstandardrecord=new JLabel("Standard Record ");
	        lblstandardrecord.setForeground(Color.white);
	        lblstandardrecord.setFont(ff);
			background.add(lblstandardrecord);
			
	        
	        lblBatchid=new JLabel("Batch id :");
	        lblBatchid.setForeground(Color.white);
	        lblBatchid.setFont(f);
			background.add(lblBatchid);
			Batchid=new JTextField(35);
			background.add(Batchid);

			lblPackage=new JLabel("Package : ");
			lblPackage.setForeground(Color.white);
			//lblPackage.setOpaque(true);//BackGround color
			lblPackage.setFont(f);
			background.add(lblPackage);
			
			coursename=new String[] {"Gym","Cardio","Zumba","Gym+Cardio","Gym+Cardio+Zumba"};
			cbPackagename=new JComboBox(coursename);
			cbPackagename.setForeground(Color.white);
			cbPackagename.setBackground(Color.black);
			background.add(cbPackagename);

			lblstartdate=new JLabel("Start Date : ");
			lblstartdate.setForeground(Color.white);
			//lblstartdate.setOpaque(true);//BackGround color
			lblstartdate.setFont(f);
			background.add(lblstartdate);

			//startdate=new JTextField(35);
			//background.add(startdate);
			

			lblBatchtime=new JLabel("Batch Time : ");
			lblBatchtime.setForeground(Color.white);
			//lblBatchtime.setOpaque(true);//BackGround color
			lblBatchtime.setFont(f);
			background.add(lblBatchtime);

			
			 batchtime=new String[] {"6am to 7am","7am to 8am","8am to 9am","9am to 10 am ","10 am to 11 am","4pm to 5pm","5pm to 6 pm","6pm to 7pm","7pm to 8pm","8pm to 9 pm","9pm to 10pm"};
			 cbbatchtime=new JComboBox(batchtime);
			 cbbatchtime.setForeground(Color.white);
			 cbbatchtime.setBackground(Color.black);
			 background.add(cbbatchtime);
					
			 
			 date=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
			 cbdate=new JComboBox(date);
			 cbdate.setForeground(Color.white);
			 cbdate.setBackground(Color.black);
			 background.add(cbdate);
			 
			 
			 month=new String[] {"Jan","Feb","Mar","Apr","May","June","Jully","Aug","Sep","Oct","Nov","Dec"};
			 cbmonth=new JComboBox(month);
			 cbmonth.setForeground(Color.white);
			 cbmonth.setBackground(Color.BLACK);
			 background.add(cbmonth);
			 
			 
			 year=new String[] {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033","2034","2035","2036","2037","2038","2039","2040","2041","2042","2043","2044","2045","2046","2047","2048","2049","2050"};
			 cbyear=new JComboBox(year);
			 cbyear.setForeground(Color.white);
			 cbyear.setBackground(Color.black);
			 background.add(cbyear);
			 
			 
			 
			 
			 
			 
			 
			 

			  open=new JButton("Open",iggg);
			  open.setForeground(Color.white);
			  open.setBackground(Color.black);
			  background.add(open);
			  open.addActionListener(this);

			   
			   modify=new JButton("Modify",i);
			   background.add(modify);
				  modify.setForeground(Color.white);
				  modify.setBackground(Color.black);
			   modify.addActionListener(this);

			   
			   delete=new JButton("Delete",igg);
			   delete.setForeground(Color.white);
			   delete.setBackground(Color.black);
			   background.add(delete);
			   delete.addActionListener(this);

			   
			   neww=new JButton("Clear",iii);
			   neww.addActionListener(this);

			   background.add(neww);
				  neww.setForeground(Color.white);
				  neww.setBackground(Color.black);

			   
			   addd=new JButton("Add",ig);
			   addd.setForeground(Color.white);
				  addd.setBackground(Color.black);
			   background.add(addd);
			   addd.addActionListener(this);

			   all=new JButton("show",ii);
			   all.addActionListener(this);
			   all.setForeground(Color.white);
				 all.setBackground(Color.black);
			   background.add(all);

			//Suggetion}
			
			/*frmno.setToolTipText("Enter the Form no ");
			date.setToolTipText("Enter Date ");
			memid.setToolTipText("Enter Member ID ");
			memname.setToolTipText("Enter Member Name ");
			emailid.setToolTipText("Enter Email-id ");
			memadd.setToolTipText("Enter Address ");
			memcontno.setToolTipText("Enter Contact No ");
			cbgender.setToolTipText("Select members Gender ");
			cbPackagename.setToolTipText("Select Course for Member ");
			cbbatchtime.setToolTipText("Select Batch Timing ");
			neww.setToolTipText("Click for New Admission");
			submit.setToolTipText("Click to Submit");
			clear.setToolTipText("Click for clear");
			all.setToolTipText("Select All");
			print.setToolTipText("Click for Printing");
*/

			//*************End of suggetion part*********
			
		//	Set Bounds
			   
			   lblstandardrecord.setBounds(450,50,400,35);	

			   
			lblBatchid.setBounds(190,140,150,35);	
			Batchid.setBounds(340,140,135,35);
			
			lblPackage.setBounds(650,140,150,35);	
			cbPackagename.setBounds(800,140,135,35);
			
			lblstartdate.setBounds(190,210,155,35);
			cbdate.setBounds(340,210,45,35);
			cbmonth.setBounds(390, 210, 65, 35);
			cbyear.setBounds(464, 210, 70, 35);
			
			lblBatchtime.setBounds(650,210,150,35);
			cbbatchtime.setBounds(800,210,135,35);
			
		
			
			
			open.setBounds(200,350,125,45);

			modify.setBounds(450,350,125,45);

			delete.setBounds(700,350,125,45);

			neww.setBounds(200,440,125,45);

			addd.setBounds(450,440,125,45);

			all.setBounds(700,440,125,45);
			
	   		scrlPane.setBounds(200, 500,780,200);

			
			Batchid.addKeyListener(new KeyAdapter() 
		 	{
		 		public void keyTyped(KeyEvent e) {
		 	 		char c=e.getKeyChar();

		 			if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)))
		 			{
		 				JOptionPane.showMessageDialog(null,"Please enter only Integer value");
		 				e.consume();
		 			}
		 		}
		 	});

	        setSize(900,900);//2
		
			setVisible(true);//3
			

	 	}
			public void actionPerformed(ActionEvent e)
			{
				
			if(e.getSource()==addd)
		 	{
				System.out.println("Add button pressed");
			try
			{
			 Class.forName("org.postgresql.Driver");
			  Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
			  System.out.println("1");
		     PreparedStatement ps= con.prepareStatement("INSERT INTO batch VALUES(?,?,?,?)");
		     System.out.println("1");
		   int bid=Integer.parseInt(Batchid.getText());
		    int date=Integer.parseInt((String)cbdate.getSelectedItem());
		     String Date=(String) cbdate.getSelectedItem();
		     String Month=""+cbmonth.getSelectedItem();
		  int year=Integer.parseInt((String)cbyear.getSelectedItem());
		    String Year=(String)cbyear.getSelectedItem();
		     
		     

		     String pac=(String)cbPackagename.getSelectedItem();

		     String batchtime=(String)cbbatchtime.getSelectedItem();

			  System.out.println("1");

		     
if(Month.equals("Jan")||Month.equals("Mar")||Month.equals("May")||Month.equals("jully")||Month.equals("Aug")||Month.equals("Oct")||Month.equals("Dec"))
{
	  System.out.println("1");

  
		TDate=Date+"/"+Month+"/"+Year;
		
	  
 
  if(!(Batchid.getText()==null))
	{
		 ps.setInt(1, bid);
		     ps.setString(2, pac);
		     ps.setString(3, TDate);
		     ps.setString(4, batchtime);
			    int i= ps.executeUpdate();

			    if(i>0)
			     JOptionPane.showMessageDialog(null,"Your record Submited");
				else 		     
					JOptionPane.showMessageDialog(null,"Record is not added");
	}
	else
	    JOptionPane.showMessageDialog(null,"Date or BatchId is missing");

			     con.close();
			System.out.println("Record Added");
			Batchid.setText("");

}
else if(Month.equals("Apr")||Month.equals("June")||Month.equals("Sep")||Month.equals("Nov"))
{
	if(date<31)
	{
		TDate=Date+"/"+Month+"/"+Year;
		System.out.println(TDate);

		if(!(Batchid.getText()==null))
		{
			  ps.setInt(1, bid);
			     ps.setString(2, pac);
			     ps.setString(3, TDate);
			     ps.setString(4, batchtime);
				    int i= ps.executeUpdate();
				    if(i>0)
				     JOptionPane.showMessageDialog(null,"Your record Submited");
					else 		     
						JOptionPane.showMessageDialog(null,"Record is not added");
		}
		else
		    JOptionPane.showMessageDialog(null,"Date or BatchId is missing");

				     con.close();
				System.out.println("Record Added");
				Batchid.setText("");

		
	}
	else JOptionPane.showMessageDialog(null,"Check selected Date (Date should be less than 31 )");
	
	
}

else if(Month.equals("Feb"))
{
	if(year%4==0)
	{
		if(date<30)
		{		
		TDate=Date+"/"+Month+"/"+Year;
		if(!(Batchid.getText()==null))
		{
			 ps.setInt(1, bid);
			     ps.setString(2, pac);
			     ps.setString(3, TDate);
			     ps.setString(4, batchtime);
				    int i= ps.executeUpdate();

				    if(i>0)
				     JOptionPane.showMessageDialog(null,"Your record Submited");
					else 		     
						JOptionPane.showMessageDialog(null,"Record is not added");
		}
		else
		    JOptionPane.showMessageDialog(null," BatchId is missing");

				     con.close();
				System.out.println("Record Added");
				Batchid.setText("");
				
	}
         
		else 
		JOptionPane.showMessageDialog(null,"Check selected Date (Date should be less than 30 )");


	}
	
	
	else if(!(year%4==0))
		{
			if(date<29)
			{		
			TDate=Date+"/"+Month+"/"+Year;
			if(!(Batchid.getText()==null))
			{
				 ps.setInt(1, bid);
				     ps.setString(2, pac);
				     ps.setString(3, TDate);
				     ps.setString(4, batchtime);
					    int i= ps.executeUpdate();

					    if(i>0)
					     JOptionPane.showMessageDialog(null,"Your record Submited");
						else 		     
							JOptionPane.showMessageDialog(null,"Record is not added");
			}
			else
			    JOptionPane.showMessageDialog(null,"Date or BatchId is missing");

					     con.close();
					System.out.println("Record Added");
					Batchid.setText("");
					
		}
			else 
				JOptionPane.showMessageDialog(null,"Check selected Date (Date should be less than 29 )");

			}
			
		}
}
	////////////////////////////////


						
		catch(SQLException ex)
		{    
			System.out.println("error occuwhite");
			System.out.println("Error :"+ex);
		}
			catch(Exception ex1)
			{
				System.out.println("error occuwhite");
				System.out.println("Error :"+ex1);
			}
			
		 	}
			
		
			
		if(e.getSource()==open)	
		{
			try
			{
				Class.forName("org.postgresql.Driver");
			     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
			 Statement st=(Statement) con.createStatement();
			 String id=Batchid.getText();
			 String qry="select * from batch where Batch_id="+id+"";
			 java.sql.ResultSet rs=st.executeQuery(qry);

			
			 
			 while(rs.next())
			 {
				 Batchid.setText(rs.getString(1));
				 startdate.setText(rs.getString(3));
                 	cbPackagename.setActionCommand(rs.getString(2));
				 
			 }
			 con.close();
			}
			 catch(SQLException ex)
			 {
			 	System.out.println("error occuwhite");
			 	System.out.println("Error :"+ex);
			 }
			 	catch(Exception ex1)
			 	{
			 		System.out.println("error occuwhite");
			 		System.out.println("Error :"+ex1);
			 	}
		}
		
		if(e.getSource()==modify)
	 	{
		try
		{
        
			Class.forName("org.postgresql.Driver");
		     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
	     PreparedStatement st=(PreparedStatement) con.prepareStatement("update batch set package=?,start_date=?,batch_time=? where batch_id=?");
	  
	     String course= (String)cbPackagename.getSelectedItem();
	     String btime=(String)cbbatchtime.getSelectedItem();
	     String D=(String)cbdate.getSelectedItem();
	     String M=(String)cbmonth.getSelectedItem();
	     String Y=(String)cbyear.getSelectedItem();

	     String TD=D+"/"+M+"/"+Y;
	     
	     
	     st.setString(1,course);
	     st.setString(2,TD);
		 st.setString(3,btime);
		 st.setInt(4,Integer.parseInt(Batchid.getText()));


		    int i= st.executeUpdate();

		   if(i>0)
		     JOptionPane.showMessageDialog(null,"Your record Submited");
			else System.out.println("Record is not added");
		    con.close();
			System.out.println("Record Added");
			startdate.setText("");
			Batchid.setText("");


	 	}
		catch(SQLException ex)
		{
			System.out.println("error occuwhitedd");
			System.out.println("Error :"+ex);
			ex.printStackTrace();
		}
			catch(Exception ex1)
			{
				System.out.println("error occuwhite");
				System.out.println("Error :"+ex1);
				ex1.printStackTrace();
			}

			
		 	}
		if(e.getSource()==all)
		{
		
			int r=0;
			try
			{
				Class.forName("org.postgresql.Driver");
		        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
			    Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select * from batch");
	
				while(rs.next())
				{
					model.insertRow(r++,new Object[] {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)});
				}
				
			}
		    catch(Exception ex)
			{
		    	JOptionPane.showMessageDialog(null,"Error Occured:"+ex);
			}
			
		}
		if(e.getSource()==neww)
		{
			for(int i=0;i<=model.getRowCount();i++)
			{	
			model.removeRow(i);
			}
		}
		}

			
	 	

		public static void main(String args[])
		{
		new BatchRecord();
			
		}


	}



