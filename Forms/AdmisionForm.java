//import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

//import com.psql.jdbc.PreparedStatement;
//import com.postgresql.jdbc.Statement;
@SuppressWarnings("serial")
public  class AdmisionForm extends JFrame implements KeyListener,ActionListener {
	
	JLabel lbadmform,lbformno,lbdate,lbmid,lbmname,lbemlid,lbmadd,lbcontno,lblgender,lblcoursename,lblbatchtime,lblfeetype,lbltotalfee;
	JTextField frmno,date,memid,memname,emailid,memadd,memcontno,totalfee;
	JComboBox cbgender,cbcoursename,cbbatchtime,cbFeeType,cblblfeetype;
	Font f,ff;
	String [] gender,coursename,batchtime,FeeType;
 	JButton neww,open,update,show,delete;
 	String Date;
 	int i,a;
 	
 	DefaultTableModel model=new DefaultTableModel();
	   JTable tabGrid=new JTable(model);
	   JScrollPane scrlPane=new JScrollPane(tabGrid);
 	
 	
 	
 	 AdmisionForm()
 	{
 		JLabel background;
 		setSize(900,900);
 		setTitle("Admision form");
 		
 		 ImageIcon ig=new ImageIcon("/home/user/project/iconfinder_save as_36557.png");
 		
		 ImageIcon igg=new ImageIcon("/home/user/project/iconfinder_basket_1814090.png");

                      ImageIcon iggg=new ImageIcon("/home/user/project/iconfinder_Open_1493293.png");
           ImageIcon igggg=new ImageIcon("/home/user/project/iconfinder_document-print_118913.png");
           
   		 ImageIcon k=new ImageIcon("/home/user/eclipse-workspace/Fitness Club Management/src/eye.png");

           
           SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	 		Date datee=new Date();
	 		Date=sdf.format(datee); 
	 		
	 		
	 		 Toolkit t = Toolkit.getDefaultToolkit();
	            Dimension d = t.getScreenSize();
	            int h = d.height;
	            int w = d.width;
	            this.setSize(w,h);
 		
 		
        ImageIcon img=new ImageIcon("/home/user/project/1z24WBckE0lTDVSt63sYPIy3dXsx00769.jpeg");
        Image i=img.getImage();
        Image new_img=i.getScaledInstance(900,900 ,Image.SCALE_SMOOTH);
        background=new JLabel("",img,JLabel.CENTER);
 		background.setBounds(0,0,w,h);
		add( background); 	
        
        f=new Font("Georgia",Font.BOLD,16);	
        ff=new Font("Georgia",Font.BOLD,30);	

        lbadmform=new JLabel("Admision Form ");
        lbadmform.setForeground(Color.green);
        lbadmform.setOpaque(true);//BackGround color
        lbadmform.setFont(ff);
		background.add(lbadmform);
		
        lbformno=new JLabel("Form No: ");
        lbformno.setForeground(Color.BLACK);

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
		//lblgender.setOpaque(true);//BackGround color
		lblgender.setFont(f);
		background.add(lblgender);
		
		
		gender=new String[] {"Male","Female"};
        cbgender=new JComboBox(gender);
        background.add(cbgender);
		

        lblcoursename=new JLabel("Course Name: ");
        lblcoursename.setForeground(Color.BLACK);
        lblcoursename.setOpaque(true);//BackGround color
        lblcoursename.setFont(f);
        background.add(lblcoursename);

		coursename=new String[] {"Gym","Cardio","Zumba","Gym+Cardio","Gym+Cardio+Zumba"};
		cbcoursename=new JComboBox(coursename);
		background.add(cbcoursename);
			
	     

	     lblbatchtime=new JLabel("Batch Time: ");
	     lblbatchtime.setForeground(Color.BLACK);
	     lblbatchtime.setOpaque(true);//BackGround color
	     lblbatchtime.setFont(f);
	     background.add(lblbatchtime);

		 batchtime=new String[] {"6am to 7am","7am to 8am","8am to 9am","9am to 10 am ","10 am to 11 am","4pm to 5pm","5pm to 6 pm","6pm to 7pm","7pm to 8pm","8pm to 9 pm","9pm to 10pm"};
		 cbbatchtime=new JComboBox(batchtime);
		 background.add(cbbatchtime);
				

		  lblfeetype=new JLabel("Fee Type: ");
		  lblfeetype.setForeground(Color.BLACK);
		  lblfeetype.setOpaque(true);//BackGround color
		  lblfeetype.setFont(f);
		  background.add(lblfeetype);
				

	      FeeType=new String[] {"One Time","Monthly","Quaterly"};
	      cbFeeType=new JComboBox(FeeType);
	      background.add(cbFeeType);
		  
		  lbltotalfee=new JLabel("Total Fee : ");
		  lbltotalfee.setForeground(Color.BLACK);
		  lbltotalfee.setOpaque(true);//BackGround color
		  lbltotalfee.setFont(f);
		  background.add(lbltotalfee);
				

	      totalfee=new JTextField(30);
	      background.add(totalfee);
		  
		  neww=new JButton("ADD",ig);
		  background.add(neww);

		   
		   open=new JButton("Open",iggg);
		   background.add(open);
		   open.addActionListener(this);

		   
		   update=new JButton("Update",igggg);
		   background.add(update);
		   update.addActionListener(this);

		   
		   show=new JButton("Show",k);
		   background.add(show);
		   show.addActionListener(this);


		   
		   delete=new JButton("Delete",igg);
		   background.add(delete);
		   delete.addActionListener(this);
		   
		   //Model
		   
		   

		//Suggetion
		
		frmno.setToolTipText("Enter the Form no ");
		date.setToolTipText("Enter Date ");
		memid.setToolTipText("Enter Member ID ");
		memname.setToolTipText("Enter Member Name ");
		emailid.setToolTipText("Enter Email-id ");
		memadd.setToolTipText("Enter Address ");
		memcontno.setToolTipText("Enter Contact No ");
		cbgender.setToolTipText("Select members Gender ");
		cbcoursename.setToolTipText("Select Course for Member ");
		cbbatchtime.setToolTipText("Select Batch Timing ");
		neww.setToolTipText("Click for New Admission");
		open.setToolTipText("Click to open");
		update.setToolTipText("Click for clear");
		show.setToolTipText("Select show");
	     delete.setToolTipText("Click for Printing");


		//*************End of suggetion part*********
		
	//	Set Bounds
		lbadmform.setBounds(300,50,400,35);

		lbformno.setBounds(30,100,100,30);	
		frmno.setBounds(210,100,150,30);
		
		lbdate.setBounds(500,100,100,30);	
		date.setBounds(700,100,150,30);
		
		lbmid.setBounds(30,150,130,30);
		memid.setBounds(210,150,150,30);
		
		lbmname.setBounds(30,200,150,30);
		memname.setBounds(210,200,600,30);
		
		lbemlid.setBounds(30,250,150,30);
		emailid.setBounds(210,250,600,30);
		
		lbmadd.setBounds(30,300,150,30);
		memadd.setBounds(210,300,600,30);
		
		lbcontno.setBounds(30,350,150,30);
		memcontno.setBounds(210,350,250,30);
		
		lblgender.setBounds(500,350,100,30);	
		cbgender.setBounds(650,350,100,30);	
		
		lblcoursename.setBounds(30,400,150,30);
		cbcoursename.setBounds(200,400,150,30);
		
		lblbatchtime.setBounds(470,400,130,30);	
		cbbatchtime.setBounds(650,400,100,30);	
		
		lblfeetype.setBounds(30,450,150,30);
		cbFeeType.setBounds(200,450,150,30);
		
		lbltotalfee.setBounds(470,450,130,30);	
		totalfee.setBounds(650,450,180,30);	
		
		
		neww.setBounds(30,500,125,50);

		open.setBounds(200,500,125,50);

		update.setBounds(370,500,125,50);

		show.setBounds(540,500,125,50);

		delete.setBounds(720,500,125,50);
		
		scrlPane.setBounds(0, 570,780,200);
		background.add(scrlPane);
        tabGrid.setFont(new Font("Verdana",0,13));
        model.addColumn("fno");
        model.addColumn("mem_id");
        model.addColumn("mem_Name");
        model.addColumn("Email_id");
        model.addColumn("Mem Add");
        model.addColumn("Contact No");
        model.addColumn("Gender");



        

        setSize(w,h);//2
	
		setVisible(true);//3

		
 	memname.addKeyListener(new KeyAdapter() 
 	{
 		public void keyTyped(KeyEvent e) {
 	 		char c=e.getKeyChar();

 			if(!((c>=65 && c<=90)||(c>=97 && c<122)||( c==32)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)))
 			{
 				JOptionPane.showMessageDialog(null,"Please Enter Alphabates");
 				e.consume();
 				/*String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                         "[a-zA-Z0-9_+&*-]+)*@" + 
                         "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                         "A-Z]{2,7}$"; 
                           
     Pattern pat = Pattern.compile(emailRegex); 
     if (email == null) 
			JOptionPane.showMessageDialog(null,"Email cannot be empty");
     boolean value=pat.matcher(email).matches(); 
     boolean t=true;
    
    boolean ab=Boolean.compare(value,t) ;
*/    
    	 
     

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
			JOptionPane.showMessageDialog(null,"Special charaters showowed are only @ .");
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

 			if(!(Character.isDigit(c)))
 			{
 				JOptionPane.showMessageDialog(null,"Please enter only Integer value");
 				e.consume();
 			}
 		}
 	});
	neww.addActionListener(this);
	
	

//	JTextField frmno,date,memid,memname,emailid,memadd,memcontno,totalfee;

	//JDBC
 	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
	if(e.getSource()==neww)
 	{
	try
	{
	Class.forName("org.postgresql.Driver");
	System.out.println("river reg");
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
     System.out.println("conn success");
     PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO addmision VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
     PreparedStatement ps1=con.prepareStatement("INSERT INTO addmision1 VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
     SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
     
int fno=Integer.parseInt(frmno.getText());
   String D=date.getText();
  //   Date Date=(java.sql.Date) formatter.parse(D);
     String mid=memid.getText();
     String mname=memname.getText();
     String memail=emailid.getText();
     String madd=memadd.getText();
     String mcnt=memcontno.getText();
     String mttl=totalfee.getText();
     
     String gen=(String)cbgender.getSelectedItem();
     String pac=(String)cbcoursename.getSelectedItem();

     String batchtime=(String)cbbatchtime.getSelectedItem();

     String ftype=(String)cbFeeType.getSelectedItem();
//ps1.setInt(,);
     //	JTextField frmno,date,memid,memname,emailid,memadd,memcontno,totalfee;

     ps.setInt(1, fno);
   //ps.setString(2, java.sql.Date.valueOf(date.getText()));
     ps.setString(2, D);
     ps.setString(3, mid);
     ps.setString(4, mname);
     ps.setString(5, memail);
     ps.setString(6, madd);
     ps.setString(7, mcnt);
     ps.setString(8, mttl);
     ps.setString(9, gen);
     ps.setString(10, pac);
     ps.setString(11, batchtime);
     ps.setString(12, ftype);

     ps1.setInt(1, fno);
     ps1.setString(2, D);
     ps1.setString(3, mid);
     ps1.setString(4, mname);
     ps1.setString(5, memail);
     ps1.setString(6, madd);
     ps1.setString(7, mcnt);
     ps1.setString(8, mttl);
     ps1.setString(9, gen);
     ps1.setString(10, pac);
     ps1.setString(11, batchtime);
     ps1.setString(12, ftype);
     ps1.setString(13,"0");
  i= ps1.executeUpdate();
     
    a= ps.executeUpdate();

 if(a>0&&i>0)
     JOptionPane.showMessageDialog(null,"Your record Submited");
	else System.out.println("Record is not added");
	
     con.close();
System.out.println("Record Added");
     frmno.setText(" ");
     date.setText(" ");
     memid.setText(" ");
     memname.setText(" ");
     emailid.setText(" ");
     memadd.setText(" ");
     memcontno.setText(" ");
     totalfee.setText(" ");
     date.setText(" ");
	}

catch(SQLException ex)
{
	System.out.println("error occured");
	System.out.println("Errorrr :"+ex);
}
	catch(Exception ex1)
	{
		System.out.println("errorr occured");
		System.out.println("Error :"+ex1);
	}

	
 	}
	
	
	

	
	if(e.getSource()==delete)
 	{
	try
	{
    
    
	Class.forName("org.postgresql.Driver");
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
     PreparedStatement st=(PreparedStatement) con.prepareStatement("delete from addmision where formno=?");
     PreparedStatement st1=(PreparedStatement) con.prepareStatement("delete from addmision1 where formno=?");

  
    int f= Integer.parseInt(frmno.getText());
  
    st.setInt(1,f);
     st1.setInt(1,f);
	



	    int i= st.executeUpdate();
	   int a= st1.executeUpdate();

	   if(i>0&&a>0)
	     JOptionPane.showMessageDialog(null,"Your record is Deleted");
		else System.out.println("Record is not Deleted");
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
	
	
	if(e.getSource()==show)
	{
		int r=0;
		try
		{
			Class.forName("org.postgresql.Driver");
	        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
		    Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=stmt.executeQuery("select * from addmision");
			while(rs.next())
			{
				model.insertRow(r++,new Object[] {rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(9)});
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
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:3542/gym","rohan","6756");
     PreparedStatement st=(PreparedStatement) con.prepareStatement("update batch set Date=?,Mem_id=?,mname=?,email_id=? ,memadd=? ,cntno=?,totalfee=?,gender=?,package=?,batchtime=?,fee_type=?   where formno=?");
  
     /*JTextField frmno,date,memid,memname,emailid,memadd,memcontno,totalfee;
	JComboBox cbgender,cbcoursename,cbbatchtime,cbFeeType;*/
     
     String gen= (String)cbgender.getSelectedItem();
     String pac=(String)cbcoursename.getSelectedItem();
     String batchtime=(String)cbbatchtime.getSelectedItem();
     String ftype=(String)cbFeeType.getSelectedItem();

     
     
     st.setString(1,date.getText());
     st.setString(2,memid.getText());
     st.setString(3,memname.getText());

     st.setString(4,emailid.getText());

     st.setString(5,memadd.getText());
     
     st.setString(6,memcontno.getText());
     st.setString(7,totalfee.getText());

	 st.setString(8,gen);
	 st.setString(9,pac);

	 st.setString(10,batchtime);
	 st.setString(11,ftype);
	 st.setString(12, frmno.getText());



	    int i= st.executeUpdate();

	   if(i>0)
	     JOptionPane.showMessageDialog(null,"Your record Updated");
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
	
	if(e.getSource()==open)
 	{
	try
	{
Class.forName("org.postgresql.Driver");
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym","rohan","6756");
	 Statement st=(Statement) con.createStatement();
	 String id=memid.getText();
	 String qry="select * from addmision where mem_id like '"+id+"%'";
	 System.out.println(""+qry);

	ResultSet rss=st.executeQuery(qry);

	 

	 while(rss.next())
	 {
		 frmno.setText(rss.getString(1));
		 date.setText(rss.getString(2));

		 memid.setText(rss.getString(3));

		 memname.setText(rss.getString(4));

		 emailid.setText(rss.getString(5));

		 memadd.setText(rss.getString(6));

		 memcontno.setText(rss.getString(7));
		 
		 totalfee.setText(rss.getString(8));

		 
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
		
	 	}

	
	
	
	
 	
 	

	


	public static void main(String args[])
	{
	new AdmisionForm();
		
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