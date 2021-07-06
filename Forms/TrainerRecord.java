
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;


public class TrainerRecord extends JFrame implements ActionListener{
        JLabel lbladdrecord,lbltrainerid,lbemlid,lbtrainername,lbtadd,lbcontno,lblgender,lblcourseid,lblfaculty;
		JTextField trainerid,trainername,emailid,tadd,tcontno;
		JComboBox cbgender,cbcourseid,cbfaculty;
		Font f,ff;
		String [] gender,courseid,faculty;
	 	JButton neww,submit,delete,update;

	 	TrainerRecord()
	 	{
	 		JLabel background;
	 		setSize(900,900);
	 		
	 		setTitle("Trainer  Record");

	 		
	        ImageIcon img=new ImageIcon("/home/user/eclipse-workspace/Fitness Club Management/src/danielle-cerullo-CQfNt66ttZM-unsplash.jpg");
	        background=new JLabel("",img,JLabel.CENTER);
	 		background.setBounds(0,0,900,900);
			add( background); 	
			
			
			 ImageIcon ig=new ImageIcon("/home/user/project/iconfinder_save as_36557.png");
     		
			 ImageIcon igg=new ImageIcon("/home/user/project/iconfinder_basket_1814090.png");

                          ImageIcon iggg=new ImageIcon("/home/user/project/iconfinder_Open_1493293.png");
               ImageIcon igggg=new ImageIcon("/home/user/project/iconfinder_system-software-update_28709.png");
			
			
	        
	        f=new Font("Georgia",Font.BOLD,16);	
	        
	        ff=new Font("Garamond",Font.BOLD,38);	

	        lbladdrecord=new JLabel("ADD Record ");
	        lbladdrecord.setForeground(Color.green);
	        lbladdrecord.setOpaque(true);//BackGround color
	        lbladdrecord.setFont(ff);
			background.add(lbladdrecord);
	        
			lbltrainerid=new JLabel("Trainer id: ");
			lbltrainerid.setForeground(Color.BLACK);

			lbltrainerid.setOpaque(true);//BackGround color
			//lbformno.setBackground(Color.PINK);
			lbltrainerid.setFont(f);
			background.add(lbltrainerid);
			trainerid=new JTextField(30);
			background.add(trainerid);

			
			

			lbtrainername=new JLabel("Trainer Name : ");
			lbtrainername.setForeground(Color.BLACK);
			lbtrainername.setOpaque(true);//BackGround color
			lbtrainername.setFont(f);
			background.add(lbtrainername);


			trainername=new JTextField(30);
			background.add(trainername);

			lbemlid=new JLabel("Email_id : ");
			lbemlid.setForeground(Color.BLACK);
			lbemlid.setOpaque(true);//BackGround color
			lbemlid.setFont(f);
			background.add(lbemlid);
			
			emailid=new JTextField(30);
			background.add(emailid);

			
			lbtadd=new JLabel("Trainer Add : ");
			lbtadd.setForeground(Color.BLACK);
			lbtadd.setOpaque(true);//BackGround color
			lbtadd.setFont(f);
			background.add(lbtadd);
			
			
			tadd=new JTextField(30);
			background.add(tadd);
			
			
			lbcontno=new JLabel("Contact No : ");
			lbcontno.setForeground(Color.BLACK);
			lbcontno.setOpaque(true);//BackGround color
			lbcontno.setFont(f);
			background.add(lbcontno);
			

			tcontno=new JTextField(30);
			background.add(tcontno);
			

			lblgender=new JLabel("Gender: ");
			lblgender.setForeground(Color.BLACK);
			lblgender.setOpaque(true);//BackGround color
			lblgender.setFont(f);
			background.add(lblgender);
			
			
			gender=new String[] {"Male","Female"};
	        cbgender=new JComboBox(gender);
	        background.add(cbgender);
			

	        lblcourseid=new JLabel("Course Id: ");
	        lblcourseid.setForeground(Color.BLACK);
	        lblcourseid.setOpaque(true);//BackGround color
	        lblcourseid.setFont(f);
	        background.add(lblcourseid);

	        courseid=new String[]  {"101","102","103","104 ","105","106","107","108","109","110","111"};
	        cbcourseid=new JComboBox(courseid);
			background.add(cbcourseid);
				
		     

		     lblfaculty=new JLabel("Faculty: ");
		     lblfaculty.setForeground(Color.BLACK);
		     lblfaculty.setOpaque(true);//BackGround color
		     lblfaculty.setFont(f);
		     background.add(lblfaculty);

		     faculty=new String[] {"201","202","203","204 ","205","206","207","208","209","210","211"};
			 cbfaculty=new JComboBox(faculty);
			 background.add(cbfaculty);
					

			  
			  neww=new JButton("New",ig);
			  background.add(neww);
			  neww.addActionListener(this);


			   
			   submit=new JButton("open");
			   background.add(submit);

			   
			   delete=new JButton("Delete",igg);
			   background.add(delete);
			   delete.addActionListener(this);


			   
			   update=new JButton("Update",igggg);
			   background.add(update);
			   update.addActionListener(this);

			   
			  
			//Suggetion
			
		/*	frmno.setToolTipText("Enter the Form no ");
			date.setToolTipText("Enter Date ");
			memid.setToolTipText("Enter Member ID ");
			memname.setToolTipText("Enter Member Name ");
			emailid.setToolTipText("Enter Email-id ");
			memadd.setToolTipText("Enter Address ");
			tcontno.setToolTipText("Enter Contact No ");
			cbgender.setToolTipText("Select members Gender ");
			cbcoursename.setToolTipText("Select Course for Member ");
			cbbatchtime.setToolTipText("Select Batch Timing ");
			neww.setToolTipText("Click for New Admission");
			submit.setToolTipText("Click to Submit");
			delete.setToolTipText("Click for delete");
			update.setToolTipText("Select update");
			print.setToolTipText("Click for Printing");*/


			//*************End of suggetion part*********
			
		//	Set Bounds
			   lbladdrecord.setBounds(340,50,400,35);

			   lbltrainerid.setBounds(30,140,150,30);	
			   trainerid.setBounds(210,140,150,30);
			
			
			   lbtrainername.setBounds(30,200,150,30);
			   trainername.setBounds(210,200,600,30);
			
			lbemlid.setBounds(30,260,150,30);
			emailid.setBounds(210,260,600,30);
			
			lbtadd.setBounds(30,320,150,30);
			tadd.setBounds(210,320,600,30);
			
			lbcontno.setBounds(30,380,150,30);
			tcontno.setBounds(210,380,250,30);
			
			lblgender.setBounds(500,380,100,30);	
			cbgender.setBounds(650,380,100,30);	
			
			lblcourseid.setBounds(30,450,150,30);
			cbcourseid.setBounds(200,450,150,30);
			
			lblfaculty.setBounds(470,450,130,30);	
			cbfaculty.setBounds(650,450,100,30);	
			
			
			
			
			neww.setBounds(80,510,125,50);

			submit.setBounds(280,510,125,50);

			delete.setBounds(480,510,125,50);

			update.setBounds(680,510,125,50);

			
			emailid.addKeyListener(new KeyAdapter()
			{
		public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if(!((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))||((c>=65 && c<=90 )||(c>=97 && c<122))||(c==64)||(c==46)))
			{
				JOptionPane.showMessageDialog(null,"Special charaters updateowed are only @ .");
				e.consume();
			}
		}
		});	 	
			trainerid.addKeyListener(new KeyAdapter() 
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
		
		 	
	 	
			tcontno.addKeyListener(new KeyAdapter()
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
	 	

	        setSize(900,900);//2
		
			setVisible(true);//3

			submit.addActionListener(this);
			
			submit.addActionListener(this);

	 	}

			public void actionPerformed(ActionEvent e)
			{
				
			if(e.getSource()==neww)
		 	{
			try
			{
				Class.forName("org.postgresql.Driver");
			     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		     PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO trainer_record VALUES(?,?,?,?,?,?,?,?)");
				
		     int tid=Integer.parseInt(trainerid.getText());

		     String tname=trainername.getText();
		     String temail=emailid.getText();
		     String taddr=tadd.getText();
		     String tcnt=tcontno.getText();
		     String gen=(String)cbgender.getSelectedItem();
		     String cid=(String)cbcourseid.getSelectedItem();
		     String btime=(String)cbfaculty.getSelectedItem();

		     ps.setInt(1, tid);
		     ps.setString(2, tname);
		     ps.setString(3, temail);
		     ps.setString(4, taddr);
		     ps.setString(5, tcnt);
		     ps.setString(6, gen);
		     ps.setString(7,cid);
		     ps.setString(8, btime);

		     String l=tcontno.getText();
		     if(l.length()==10)
		     {
		     ps.executeUpdate();
		     JOptionPane.showMessageDialog(null,"Your record Submited");
		     con.close();
		System.out.println("Record Added");
		trainerid.setText("");
		trainername.setText("");
		emailid.setText("");
		tadd.setText("");
		     tcontno.setText("");
		   
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
			
			if(e.getSource()==update)
		 	{
			try
			{
	        
	        
				Class.forName("org.postgresql.Driver");
			     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		     PreparedStatement st=(PreparedStatement) con.prepareStatement("update trainer_record set  Trainer_Name=?,email_id=?,Trainer_Add=?,Contact_No=?,gender=?,Course_id=?,faculty=? where enquiry_no=?");
		     
		     /*JTextField trainerid,trainername,emailid,tadd,tcontno;
		JComboBox cbgender,cbcourseid,cbfaculty;*/
		     
		     
		     String gen=(String)cbgender.getSelectedItem();
		     String course=(String)cbcourseid.getSelectedItem();

		     String faculty=(String)cbfaculty.getSelectedItem();
		     st.setString(1, trainername.getText());
			 st.setString(2,emailid.getText());

		     st.setString(3,tadd.getText());
		     st.setString(4,tcontno.getText());
		     st.setString(5, gen);
		     st.setString(6, course);
		     st.setString(7, faculty);
		     st.setString(8,trainerid.getText());



			    int i= st.executeUpdate();

			   if(i>0)
			     JOptionPane.showMessageDialog(null,"Your record Submited");
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
			
			
			if(e.getSource()==delete)
		 	{
			try
			{
	        
	        
				Class.forName("org.postgresql.Driver");
			     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		     PreparedStatement st=con.prepareStatement("delete from trainer_record where enquiry_no=?");
		     
		  
		     
		  
		     st.setString(1, trainerid.getText());
			



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
		new TrainerRecord();
			
		}


	}






