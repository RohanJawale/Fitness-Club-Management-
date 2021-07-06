import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EnquiryForm extends JFrame  implements ActionListener{
	

		JLabel lblenquiryform,lblenquiryno,lbdate,lbemlid,lbmname,lbmadd,lbcontno,lblref,lblcoursename,lblbatchtime;
		JTextField enquiryno,date,memname,emailid,memadd,memcontno;
		JComboBox cbref,cbpackage,cbbatchtime;
		Font f,ff;
		String [] reference,coursename,batchtime;
	 	JButton neww,submit,clear,all;
	 	
	 	DefaultTableModel model=new DefaultTableModel();
		   JTable tabGrid=new JTable(model);
		   JScrollPane scrlPane=new JScrollPane(tabGrid);

	 	EnquiryForm()
	 	{
	 		JLabel background;
	 		setSize(900,900);
	 		
	 		setTitle("Enquiry  Record");
	 		ImageIcon ig=new ImageIcon("/home/user/project/iconfinder_save as_36557.png");
    		
			 ImageIcon igg=new ImageIcon("/home/user/project/iconfinder_basket_1814090.png");

                         ImageIcon iggg=new ImageIcon("/home/user/project/iconfinder_Open_1493293.png");
              ImageIcon igggg=new ImageIcon("/home/user/project/iconfinder_document-print_118913.png");
 	 		 ImageIcon k=new ImageIcon("/home/user/p1/eye.png");

	        ImageIcon img=new ImageIcon("/home/user/project/200229.jpg");
	        background=new JLabel("",img,JLabel.CENTER);
	 		background.setBounds(0,0,900,900);
			add( background); 	
	        
			
			Toolkit t = Toolkit.getDefaultToolkit();
            Dimension d = t.getScreenSize();
            int h = d.height;
            int w = d.width;
            this.setSize(w,h);
		
			
			
	        f=new Font("Georgia",Font.BOLD,16);	
	        
	        ff=new Font("Garamond",Font.BOLD,30);	

	        lblenquiryform=new JLabel("Enquiry Form ");
	        lblenquiryform.setForeground(Color.magenta);
	        lblenquiryform.setOpaque(true);//BackGround color
	        lblenquiryform.setFont(ff);
			background.add(lblenquiryform);
	        
	        lblenquiryno=new JLabel("Enquiry No: ");
	        lblenquiryno.setForeground(Color.BLACK);

	        lblenquiryno.setOpaque(true);//BackGround color
			//lbformno.setBackground(Color.PINK);
	        lblenquiryno.setFont(f);
			background.add(lblenquiryno);
			enquiryno=new JTextField(30);
			background.add(enquiryno);

			lbdate=new JLabel("Date : ");
			lbdate.setForeground(Color.BLACK);
			lbdate.setOpaque(true);//BackGround color
			lbdate.setFont(f);
			background.add(lbdate);
			
			date=new JTextField(30);
			background.add(date);

			

			lbmname=new JLabel("Member Name : ");
			lbmname.setForeground(Color.BLACK);
			lbmname.setOpaque(true);//BackGround color
			lbmname.setFont(f);
			background.add(lbmname);


			memname=new JTextField(30);
			background.add(memname);

			lbemlid=new JLabel("Email_id : ");
			lbemlid.setForeground(Color.BLACK);
			lbemlid.setOpaque(true);//BackGround color
			lbemlid.setFont(f);
			background.add(lbemlid);
			
			emailid=new JTextField(30);
			background.add(emailid);

			
			lbmadd=new JLabel("Member Add : ");
			lbmadd.setForeground(Color.BLACK);
			lbmadd.setOpaque(true);//BackGround color
			lbmadd.setFont(f);
			background.add(lbmadd);
			
			
			
			
			memadd=new JTextField(30);
			background.add(memadd);
			
			
			lbcontno=new JLabel("Contact No : ");
			lbcontno.setForeground(Color.BLACK);
			lbcontno.setOpaque(true);//BackGround color
			lbcontno.setFont(f);
			background.add(lbcontno);
			

			memcontno=new JTextField(30);
			background.add(memcontno);
			

			lblref=new JLabel("Reference: ");
			lblref.setForeground(Color.BLACK);
			lblref.setOpaque(true);//BackGround color
			lblref.setFont(f);
			background.add(lblref);
			
			
			reference=new String[] {"By papmlet","By Hording","By Friend","By Calling"};
	        cbref=new JComboBox(reference);
	        background.add(cbref);
			

	        lblcoursename=new JLabel("Package Name: ");
	        lblcoursename.setForeground(Color.BLACK);
	        lblcoursename.setOpaque(true);//BackGround color
	        lblcoursename.setFont(f);
	        background.add(lblcoursename);

			coursename=new String[] {"Gym","Cardio","Zumba","Gym+Cardio","Gym+Cardio+Zumba"};
			cbpackage=new JComboBox(coursename);
			background.add(cbpackage);
				
		     

		     lblbatchtime=new JLabel("Batch Time: ");
		     lblbatchtime.setForeground(Color.BLACK);
		     lblbatchtime.setOpaque(true);//BackGround color
		     lblbatchtime.setFont(f);
		     background.add(lblbatchtime);

			 batchtime=new String[] {"6am to 7am","7am to 8am","8am to 9am","9am to 10 am ","10 am to 11 am","4pm to 5pm","5pm to 6 pm","6pm to 7pm","7pm to 8pm","8pm to 9 pm","9pm to 10pm"};
			 cbbatchtime=new JComboBox(batchtime);
			 background.add(cbbatchtime);
					

			  
			  neww=new JButton("New");
			  background.add(neww);

			   
			   submit=new JButton("Submit",ig);
			   background.add(submit);

			   
			   clear=new JButton("Delete",igg);
			   background.add(clear);

			   
			   all=new JButton("Show",k);
			   background.add(all);

			   
			  
			//Suggetion
			
		/*	frmno.setToolTipText("Enter the Form no ");
			date.setToolTipText("Enter Date ");
			memid.setToolTipText("Enter Member ID ");
			memname.setToolTipText("Enter Member Name ");
			emailid.setToolTipText("Enter Email-id ");
			memadd.setToolTipText("Enter Address ");
			memcontno.setToolTipText("Enter Contact No ");
			cbref.setToolTipText("Select members Gender ");
			cbpackage.setToolTipText("Select Course for Member ");
			cbbatchtime.setToolTipText("Select Batch Timing ");
			neww.setToolTipText("Click for New Admission");
			submit.setToolTipText("Click to Submit");
			clear.setToolTipText("Click for clear");
			all.setToolTipText("Select All");
			print.setToolTipText("Click for Printing");*/


			//*************End of suggetion part*********
			
		//	Set Bounds
			   lblenquiryform.setBounds(300,50,400,35);

			lblenquiryno.setBounds(30,140,150,30);	
			enquiryno.setBounds(210,140,150,30);
			
			lbdate.setBounds(500,140,100,30);	
			date.setBounds(700,140,150,30);
			
			lbmname.setBounds(30,200,150,30);
			memname.setBounds(210,200,600,30);
			
			lbemlid.setBounds(30,260,150,30);
			emailid.setBounds(210,260,600,30);
			
			lbmadd.setBounds(30,320,150,30);
			memadd.setBounds(210,320,600,30);
			
			lbcontno.setBounds(30,380,150,30);
			memcontno.setBounds(210,380,250,30);
			
			lblref.setBounds(500,380,150,30);	
			cbref.setBounds(680,380,200,30);	
			
			lblcoursename.setBounds(30,450,150,30);
			cbpackage.setBounds(200,450,150,30);
			
			lblbatchtime.setBounds(470,450,130,30);	
			cbbatchtime.setBounds(650,450,150,30);	
			
			
			
			
			neww.setBounds(80,510,125,50);

			submit.setBounds(280,510,125,50);

			clear.setBounds(480,510,125,50);

			all.setBounds(680,510,125,50);
			scrlPane.setBounds(0, 570,780,200);
			background.add(scrlPane);
	        tabGrid.setFont(new Font("Verdana",0,13));
	        model.addColumn("enquiry_no");
	        model.addColumn("Date");
	        model.addColumn("mem_Name");
	        model.addColumn("Email_id");
	        model.addColumn("Mem Add");
	        model.addColumn("Contact No");
	        model.addColumn("Reference");
	        model.addColumn("Package");
	        model.addColumn("Batch Time");


				
				setVisible(true);
			
			emailid.addKeyListener(new KeyAdapter()
			{
		public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c>=65 && c<=90 )||(c>=97 && c<122))||(c==64)||(c==46)))
			{
				JOptionPane.showMessageDialog(null,"Special charaters allowed are only @ .");
				e.consume();
			}
		}
		});	 	
			enquiryno.addKeyListener(new KeyAdapter() 
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
			memcontno.addKeyListener(new KeyAdapter() 
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
		 	
	 	//JDBC

			submit.addActionListener(this);
			all.addActionListener(this);
			clear.addActionListener(this);
	 	}

			public void actionPerformed(ActionEvent e)
			{
				
			if(e.getSource()==submit)
		 	{
			try
			{
				Class.forName("org.postgresql.Driver");
			     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		    PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO enquiry VALUES(?,?,?,?,?,?,?,?,?)");
				
             
		     int eno=Integer.parseInt(enquiryno.getText());
		     String Date=date.getText();
		     String mname=memname.getText();
		     String memail=emailid.getText();
		     String madd=memadd.getText();
		     String mcnt=memcontno.getText();
		     String ref=(String)cbref.getSelectedItem();
		     String pac=(String)cbpackage.getSelectedItem();
		     String btime=(String)cbbatchtime.getSelectedItem();

		    ps.setInt(1, eno);
		     ps.setString(2, Date);
		     ps.setString(3, mname);
		     ps.setString(4, memail);
		     ps.setString(5, madd);
		     ps.setString(6, mcnt);
		     ps.setString(7, ref);
		     ps.setString(8, pac);
		     ps.setString(9, btime);

		     String l=memcontno.getText();
		     if(l.length()==10)
		     {
		  ps.executeUpdate();
		     JOptionPane.showMessageDialog(null,"Your record Submited");
		     con.close();
		System.out.println("Record Added");
		     enquiryno.setText("");
		     date.setText("");
		     memname.setText("");
		     memadd.setText("");
		     memcontno.setText("");
		     date.setText("");
		     emailid.setText("");
		     }
		     else
			     JOptionPane.showMessageDialog(null,"Please eneter 10 digit contact number");

		    
			}

		catch(Exception ex)
		{
			System.out.println("error occured");
			System.out.println("Error :"+ex);
		}

			
		 	}
			
			if(e.getSource()==clear)
		 	{
			try
			{
	        
	        
				Class.forName("org.postgresql.Driver");
			     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		     PreparedStatement st=con.prepareStatement("delete from enquiry where enqury_no=?");
		     
		  
		     int eno=Integer.parseInt(enquiryno.getText());
		  
		     st.setInt(1,eno);
			



			    int i= st.executeUpdate();

			   if(i>0)
			     JOptionPane.showMessageDialog(null,"Your record is Deleted");
				else System.out.println("Record is not added");
			    con.close();
				System.out.println("Record Added");
			
		 	}
			catch(SQLException ex)
			{
				System.out.println("error occureddd");
				System.out.println("Error :"+ex);
				ex.printStackTrace();
			}
				catch(Exception ex1)
				{
					System.out.println("error occured");
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
			ResultSet rs=stmt.executeQuery("select * from enquiry");
					while(rs.next())
					{
						model.insertRow(r++,new Object[] {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
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
		new EnquiryForm();
			
		}
}
