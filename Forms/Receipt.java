import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.*;
import java.util.Date;


	public class Receipt extends JFrame implements KeyListener,ActionListener{
		
		JLabel lbadmform,lbformno,lbdate,lbmid,lbmname,lbemlid,lbmadd,lbcontno,lblgender,lblpack,lblbatchtime,lblcoursefee,lblpaidfee,lblfeetype,lblremaining,lblcurrentpay;
		JTextField frmno,date,memid,memname,emailid,memadd,memcontno,pack,FeeType,PaidFee,coursefees,gender,remaining,currentpay;
		Font f,ff;
	 	JButton open,submit,update,delete,print;
	 	String Date,rem,pf;
	 	
	 	DefaultTableModel model=new DefaultTableModel();
		   JTable tabGrid=new JTable(model);
		   JScrollPane scrlPane=new JScrollPane(tabGrid);
	 	Receipt()
	 	{
	 		JLabel background;
	 		setSize(900,900);
	 		setTitle("Receipt form");
	 		setBackground(Color.CYAN);
	 		 ImageIcon ig=new ImageIcon("/home/user/p1/eye.png");
        		
			 ImageIcon igg=new ImageIcon("/home/user/project/iconfinder_basket_1814090.png");

                          ImageIcon iggg=new ImageIcon("/home/user/project/iconfinder_Open_1493293.png");
               ImageIcon igggg=new ImageIcon("/home/user/project/iconfinder_system-software-update_28709.png");
               ImageIcon iggggg=new ImageIcon("/home/user/project/iconfinder_document-print_118913.png");


//Date Code
	 		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
	 		Date datee=new Date();
	 		Date=sdf.format(datee); 
	 		
	 		
	 		DefaultTableModel model=new DefaultTableModel();
	 	   JTable tabGrid=new JTable(model);
	 	   JScrollPane scrlPane=new JScrollPane(tabGrid);
	  	
	 		 
	 		
	       ImageIcon img=new ImageIcon("/home/user/project/Back.jpg");
	        Image i=img.getImage();
	       //Image new_img=i.getScaledInstance(120, 40,Image.SCALE_SMOOTH);
	        background=new JLabel("",img,JLabel.CENTER);
	 		//background.setBounds(0,0,900,900);
			add( background); 	
	        
	        f=new Font("Georgia",Font.BOLD,16);	
	        ff=new Font("Georgia",Font.BOLD,30);	

	        lbadmform=new JLabel("Receipt ");
	        lbadmform.setForeground(Color.green);
	        lbadmform.setOpaque(true);//BackGround color
	        lbadmform.setFont(ff);
			background.add(lbadmform);
			
	        lbformno=new JLabel("Form No: ");
	        lbformno.setForeground(Color.BLACK);

	        lblremaining=new JLabel("Remaining");
	        background.add(lblremaining);
	        lblremaining.setFont(f);
	        lblremaining.setForeground(Color.BLACK);
	        lblremaining.setOpaque(true);//BackGround c
	        
	        remaining=new JTextField(30);
	       background.add(remaining);

	        lblcurrentpay=new JLabel("Current Pay");
	        background.add(lblcurrentpay);
	        lblcurrentpay.setFont(f);
	        lblcurrentpay.setForeground(Color.BLACK);
	        lblcurrentpay.setOpaque(true);
	        currentpay=new JTextField(30);
	        background.add(currentpay);
	        
	        
	   		lbformno.setOpaque(true);//BackGround color
			//lbformno.setBackground(Color.PINK);
			lbformno.setFont(f);
			background.add(lbformno);
			frmno=new JTextField(30);
	        background.add(frmno);
	        
	        
	        

			lbdate=new JLabel("Date : ");
			lbdate.setForeground(Color.BLACK);
			lbdate.setOpaque(true);//BackGround color
			lbdate.setFont(f);
		    background.add(lbdate);
			
			date=new JTextField(30);
			background.add(date);

			lbmid=new JLabel("Member id : ");
			lbmid.setForeground(Color.BLACK);
			lbmid.setOpaque(true);//BackGround color
			lbmid.setFont(f);
			background.add(lbmid);

			memid=new JTextField(30);
			background.add(memid);
			

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
			

			lblgender=new JLabel("Gender: ");
			lblgender.setForeground(Color.BLACK);
			lblgender.setOpaque(true);//BackGround color
			lblgender.setFont(f);
			background.add(lblgender);
			
			 gender=new JTextField(30);
				background.add(gender);
		

	        lblpack=new JLabel("Package: ");
	        lblpack.setForeground(Color.BLACK);
	        lblpack.setOpaque(true);//BackGround color
	        lblpack.setFont(f);
	       background.add(lblpack);
	        
	        pack=new JTextField(30);
			background.add(pack);
			

			lblfeetype=new JLabel(" Fee Type: ");
			lblfeetype.setForeground(Color.BLACK);
			lblfeetype.setOpaque(true);//BackGround color
			lblfeetype.setFont(f);
		   background.add(lblfeetype);
		     
		     FeeType=new JTextField(30);
				background.add(FeeType);
				
		     

		     lblcoursefee=new JLabel("Course Fees: ");
		     lblcoursefee.setForeground(Color.BLACK);
		     lblcoursefee.setOpaque(true);//BackGround color
		     lblcoursefee.setFont(f);
		  background.add(lblcoursefee);
		     
		     coursefees=new JTextField(30);
			background.add(coursefees);
			

            
		  
			  
			  lblpaidfee=new JLabel("Paid Fee : ");
			  lblpaidfee.setForeground(Color.BLACK);
			  lblpaidfee.setOpaque(true);//BackGround color
			  lblpaidfee.setFont(f);
			 background.add(lblpaidfee);
					

			  PaidFee=new JTextField(30);
		   background.add(PaidFee);
			  
			open=new JButton("Open",iggg);
			 background.add(open);

			   
			   submit=new JButton("Show",ig);
			 background.add(submit);

			   
			   update=new JButton("update",igggg);
			  background.add(update);

			   
			   delete=new JButton("Delete",igg);
			   background.add(delete);
			   delete.addActionListener(this);
			   print=new JButton("Print",iggggg);
			  background.add(print);

			//Suggetion
			
			frmno.setToolTipText("Enter the Form no ");
			date.setToolTipText("Enter Date ");
			memid.setToolTipText("Enter Member ID ");
			memname.setToolTipText("Enter Member Name ");
			emailid.setToolTipText("Enter Email-id ");
			memadd.setToolTipText("Enter Address ");
			memcontno.setToolTipText("Enter Contact No ");
			/*cbgender.setToolTipText("Select members Gender ");
			cbpack.setToolTipText("Select Course for Member ");
			cbbatchtime.setToolTipText("Select Batch Timing ");
			open.setToolTipText("Click for New Admission");
			submit.setToolTipText("Click to Submit");*/
			update.setToolTipText("Click for update");
			delete.setToolTipText("Select delete");
			print.setToolTipText("Click for Printing");


			//*************End of suggetion part*********
			
		//	Set Bounds
			lbadmform.setBounds(400,50,150,35);

			lbformno.setBounds(30,100,100,30);	
			frmno.setBounds(210,100,150,30);
			
			lbdate.setBounds(500,100,100,30);	
			date.setBounds(700,100,150,30);
			
			lbmid.setBounds(30,150,150,30);
			memid.setBounds(210,150,150,30);
			
			lbmname.setBounds(30,200,150,30);
			memname.setBounds(210,200,600,30);
			
			lbemlid.setBounds(30,250,150,30);
			emailid.setBounds(210,250,600,30);
			
			lbmadd.setBounds(30,300,150,30);
			memadd.setBounds(210,300,600,30);
			
			lbcontno.setBounds(30,350,150,30);
			memcontno.setBounds(210,350,200,30);
			
			lblgender.setBounds(480,350,100,30);	
			gender.setBounds(600,350,180,30);	
			
			lblpack.setBounds(30,400,150,30);
			pack.setBounds(200,400,150,30);
			
			lblfeetype.setBounds(400,400,130,30);	
			FeeType.setBounds(600,400,180,30);	
			
			lblcoursefee.setBounds(30,450,150,30);
			coursefees.setBounds(200,450,150,30);
			
			lblpaidfee.setBounds(400,450,130,30);	
			PaidFee.setBounds(600,450,180,30);	
			
			lblremaining.setBounds(30,500, 150, 30);
			remaining.setBounds(200, 500, 150, 30);
			
			lblcurrentpay.setBounds(400,500,130,25);	
			currentpay.setBounds(600,500,180,30);	
			
			open.setBounds(30,550,125,50);

			submit.setBounds(200,550,125,50);

			update.setBounds(370,550,125,50);

			delete.setBounds(540,550,125,50);

			print.setBounds(720,550,125,50);
			
			
			scrlPane.setBounds(0, 620,780,200);
			background.add(scrlPane);
	        tabGrid.setFont(new Font("Verdana",0,13));
	        model.addColumn("fno");
	        model.addColumn("mem_id");
	        model.addColumn("mem_Name");
	        model.addColumn("Email_id");
	        model.addColumn("Mem Add");
	        model.addColumn("Contact No");
	        model.addColumn("Gender");
	        model.addColumn("Paid Fee:");



	        setSize(900,900);//2
		
			setVisible(true);//3
			open.addActionListener(this);
			submit.addActionListener(this);
			update.addActionListener(this);


			emailid.addKeyListener(new KeyAdapter()
			{
		public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))||((c>=65 && c<=90 )||(c>=97 && c<122))||(c==64)||(c==46)))
			{
				JOptionPane.showMessageDialog(null,"Special charaters deleteowed are only @ .");
				e.consume();
			}
		}
		});	 	
			frmno.addKeyListener(new KeyAdapter() 
		 	{
		 		public void keyTyped(KeyEvent e) {
		 	 		char c=e.getKeyChar();

		 			if(!(Character.isDigit(c)))
		 			{
		 				JOptionPane.showMessageDialog(null,"Please enter only Integer value");
		 				e.consume();
		 			}
		 		}
		 	});
			memid.addKeyListener(new KeyAdapter() 
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
	 			if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))))
	 			{
	 				JOptionPane.showMessageDialog(null,"Please Enter Numerical value");
	 				e.consume();
	 			}
	 		}
	 			});
	 	
	 	emailid.addKeyListener(new KeyAdapter()
			{
		public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))||((c>=65 && c<=90 )||(c>=97 && c<122))||(c==64)||(c==46)))
			{
				JOptionPane.showMessageDialog(null,"Special charaters deleteowed are only @ .");
				e.consume();
			}
		}
		});
	 
	 	}
		public void actionPerformed(ActionEvent e)
		{
			
		if(e.getSource()==open)
	 	{
		
				 

		try
		{
			Class.forName("org.postgresql.Driver");
	     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		 Statement st=(Statement) con.createStatement();
		 String id=memid.getText();
		  
		 String qry="select * from addmision1 where mem_id like '"+id+"%'";
		 System.out.println(""+qry);
		 ResultSet rs=st.executeQuery(qry);
		 
		  
		 while(rs.next())
		 {
			 frmno.setText(rs.getString(1));
			 date.setText(rs.getString(2));

			 memid.setText(rs.getString(3));

			 memname.setText(rs.getString(4));

			 emailid.setText(rs.getString(5));

			 memadd.setText(rs.getString(6));

			 memcontno.setText(rs.getString(7));
			 
			 coursefees.setText(rs.getString(8));

			 gender.setText(rs.getString(9));

			 pack.setText(rs.getString(10));
			 
			 FeeType.setText(rs.getString(12));
			 PaidFee.setText(""+rs.getString(13));
			 
			 int cf=Integer.parseInt(rs.getString(8));
			  int pf=Integer.parseInt(rs.getString(13));
			  int r=cf-pf;
			rem=String.valueOf(r);
				 remaining.setText(rem);
				 
			 
			 
		 }
	
		 con.close();
		}
		 catch(SQLException ex)
		 {
		 	System.out.println("error occured");
		 	System.out.println("Error :"+ex);
		 }
		 	catch(Exception ex1)
		 	{
		 		System.out.println("error occured");
		 		System.out.println("Error :"+ex1);
		 	}

		 	
		  	}
		
		/*if(e.getSource()==submit)
	 	{
		try
		{
			Class.forName("org.postgresql.Driver");
		     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
	     PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO receipt VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
	     int fno=Integer.parseInt(frmno.getText());
	     String Date=date.getText();
	     String mid=memid.getText();
	     String mname=memname.getText();
	     String memail=emailid.getText();
	     String madd=memadd.getText();
	     String mcnt=memcontno.getText();
	  
	     
	     String gen=gender.getText();
	     String pac=pack.getText();

String cfees=coursefees.getText();
	     String ftype=FeeType.getText();
	    String paidfee=PaidFee.getText();

	     ps.setInt(1,fno);
	     ps.setString(2, Date);
	     ps.setString(3, mid);
	     ps.setString(4, mname);
	     ps.setString(5, memail);
	     ps.setString(6, madd);
	     ps.setString(7, mcnt);
	     ps.setString(8,cfees);
	     ps.setString(9, gen);
	     ps.setString(10, pac);
	     ps.setString(11, ftype);
	     
	     ps.setString(12,paidfee);
	  

	     
	   
	     

	    int i= ps.executeUpdate();
	    if(i>0)
	     JOptionPane.showMessageDialog(null,"Your record Submited");
		else System.out.println("Record is not added");
	    
	    
	    PreparedStatement st=(PreparedStatement) con.prepareStatement("update addmision1 set  paid_fee=paid_fee + ? where formno=?");
	     
	     
	     
	     st.setString(1, PaidFee.getText());
		 //st.setString(2,Date);

	     st.setString(2,frmno.getText());

		    int i1= st.executeUpdate();

		
	     con.close();
	System.out.println("Record Added");
	     frmno.setText("");
	     date.setText("");
	     memid.setText("");
	     memname.setText("");
	     emailid.setText("");
	     memadd.setText("");
	     memcontno.setText("");
	     coursefees.setText("");
	     date.setText("");
	     gender.setText("");
		 PaidFee.setText("");
		 pack.setText("");
		}

	catch(SQLException ex)
	{
		System.out.println("error occured");
		System.out.println("Error :"+ex);
	}
		catch(Exception ex1)
		{
			System.out.println("error occured8");
			System.out.println("Error :"+ex1);
		}

		
	 	}
		*/
		
		if(e.getSource()==submit)
	 	{
			int r=0;
		try
		{
			Class.forName("org.postgresql.Driver");
		     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		     Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		 	ResultSet rs=stmt.executeQuery("select * from addmision1");
		 			while(rs.next())
		 			{
		 				model.insertRow(r++,new Object[] {rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(9),rs.getString(13)});
		 			}
		 			
		 		}
		 	    catch(Exception ex)
		 		{
		 	    	JOptionPane.showMessageDialog(null,"Error Occured:"+ex);
		 		}
		 	}
		     
		     
		     
		     
		
		
		if(e.getSource()==update)
	 	{
		try
		{
        
        
			Class.forName("org.postgresql.Driver");
		     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
	     PreparedStatement st=(PreparedStatement) con.prepareStatement("update addmision1 set  paidfee=?where formno=?");
	   int remm=Integer.parseInt(rem);
	   String curpay=currentpay.getText();
	   int cpay=Integer.parseInt(curpay);
	   int p=Integer.parseInt(PaidFee.getText());
	   
	     int r=p+cpay;
			pf=String.valueOf(r);

	     /*,date=?*/ 
	     int fno=Integer.parseInt(frmno.getText());

	     st.setString(1, pf);
		 //st.setString(2,Date);

	     st.setInt(2,fno);
	     rem=String.valueOf(r);
		 remaining.setText(rem);
		    int i= st.executeUpdate();

		   if(i>0)
		     JOptionPane.showMessageDialog(null,"Your record Submited");
			else System.out.println("Record is not added");
		    con.close();
			System.out.println("Record Added");
		     date.setText("");
			 //PaidFee.setText();
			 rem=String.valueOf(r);
			 remaining.setText(rem);


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
		
		if(e.getSource()==delete)
	 	{
		try
		{
        
        
			Class.forName("org.postgresql.Driver");
		     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
	     PreparedStatement st=(PreparedStatement) con.prepareStatement("delete from receipt where formno=?");
	     
	  
	     
	  
	     st.setString(1, frmno.getText());
		



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
		}
		


		public static void main(String args[])
		{
		new Receipt();
			
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



