import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame 
{
	 public JFrame frame1;
	 public JPanel top,lower;
	
	JLabel leli;	

	JMenuBar mbr=new JMenuBar();

	JMenu A_form=new JMenu("Admission");
	
	JMenu tea=new JMenu("Trainers");

		 JMenu cour=new JMenu("Packages");
	 
	
	 
	 JMenu batch=new JMenu("Batches");
         JMenu exam=new JMenu("Exam");

	
		  JMenu bill=new JMenu("Receipt");
			JMenu health_record=new JMenu("Health Record");

	JMenu exit=new JMenu("Logout");

   
		JLabel background;

	 
	
	 
	 String temp;
	  public MainMenu()
	 {
	 	frame1=new JFrame();
	 	

		 Toolkit t = Toolkit.getDefaultToolkit();
	     Dimension d = t.getScreenSize();
	     int h = d.height;
	     int w = d.width;

        ImageIcon img=new ImageIcon("/home/user/project/200229.jpg");
        background=new JLabel("",img,JLabel.CENTER);
 		background.setBounds(0,0,w,h);
		add( background); 	
        
}
	 //}

 	
//student
        JMenuItem addts=new JMenuItem(" add ");
		JMenuItem search=new JMenuItem(" Search ");
		JMenuItem delete=new JMenuItem(" Delete ");
		JMenuItem modify=new JMenuItem(" Update ");

//teacher 
	 
    	JMenuItem opent=new JMenuItem(" Open ");
		JMenuItem modifyt=new JMenuItem("Update ");
		JMenuItem addt=new JMenuItem(" add ");
		JMenuItem deletet=new JMenuItem(" Delete ");
		  
	 
//Courses
    	JMenuItem addc=new JMenuItem(" Add");
		JMenuItem modc=new JMenuItem(" Update ");
		
	 
//Courses
    	JMenuItem addb=new JMenuItem(" Add");
		




//bill

		JMenuItem openbl=new JMenuItem(" Open ");
		JMenuItem delbl=new JMenuItem(" Delete");
		JMenuItem printbl=new JMenuItem(" Add ");
 
	    
//admission form
		JMenuItem fresh=new JMenuItem("New Admission");
        JMenuItem fresh1=new JMenuItem("Enquiry");

//Exam
      //  JMenuItem exam1=new JMenuItem("Exam Details");
       // JMenuItem exam2=new JMenuItem("Result");

//Health_Record
        JMenuItem hr=new JMenuItem("Calculate");
//exit
		JMenuItem exit1=new JMenuItem("Exit");
		//show();

 public void LaunchFrame()	
 {

	 Toolkit t = Toolkit.getDefaultToolkit();
     Dimension d = t.getScreenSize();
     int h = d.height;
     int w = d.width;
	 	frame1.setSize(w,h);
	 	frame1.setLayout(null);
	 	frame1.setTitle("Fitness Club Management System");
	    	frame1.setResizable(false);
	 	frame1.add(mbr);


		leli=new JLabel(new ImageIcon("/home/user/project/200229.jpg"));
	    	leli.setBounds(0,0,1023,1000);
	    frame1.add(leli);
          
//admission form
		 mbr.add(A_form);
		A_form.add(fresh);
A_form.add(fresh1);
//teacher	 	 	
		mbr.add(tea);
		tea.add(opent);
		tea.add(modifyt);
	

	 
//trainer
   		 mbr.add(cour);
		cour.add(modc);
		cour.add(addc);
		
	mbr.add(batch);
		
		batch.add(addb);
		//student
  
        

//bill
		   mbr.add(bill);
		   bill.add(printbl);
		bill.add(openbl);
		bill.add(delbl);
		
mbr.add(health_record);
health_record.add(hr);
		
       mbr.add(exit);
		exit.add(exit1);

           
        	 	
	 	frame1.setJMenuBar(mbr);
	 	frame1.setVisible(true);
	// }
	 
}
 public void Check_Event()
 {
//Addmision Form
	 fresh.addActionListener(new ActionListener()
		{
	   
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==fresh)
	   	  	{
	   	  	 AdmisionForm f=new AdmisionForm();
	   	  	}
	   	  }	   	  
	   });
	 
	 fresh.addActionListener(new ActionListener()
		{
	   
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==fresh)
	   	  	{
	   	  	 AdmisionForm f=new AdmisionForm();
	   	  	}
	   	  }	   	  
	   });
	   

	 hr.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==hr)
			{
	   	     BMI_WHI ff=new BMI_WHI();
             
             		}
	   	  	
	   	  }   	  
	   });
	   
	   opent.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==opent)
	   	  	{
	   	  	 
	   	  		TrainerRecord t=new TrainerRecord();
             	   	}
            		   	  	
	   	  }   	  
	   });
	   modifyt.addActionListener(new ActionListener()
	 		{
	 	   	  public void actionPerformed(ActionEvent ae)
	 	   	  {
	 	   	  	if(ae.getSource()==modifyt)
	 	   	  	{
	 	   	  	 
	 	   	  		TrainerRecord t=new TrainerRecord();
	              	   	}
	             		   	  	
	 	   	  }   	  
	 	   });
	   
	   
	   printbl.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==printbl)
	   	  	{
	   	  	 
	   	  		Receipt t=new Receipt();
             	   	}
            		   	  	
	   	  }   	  
	   });
	   openbl.addActionListener(new ActionListener()
	 		{
	 	   	  public void actionPerformed(ActionEvent ae)
	 	   	  {
	 	   	  	if(ae.getSource()==openbl)
	 	   	  	{
	 	   	  	 
	 	   	  		Receipt t=new Receipt();
	              	   	}
	             		   	  	
	 	   	  }   	  
	 	   });
	   delbl.addActionListener(new ActionListener()
	 		{
	 	   	  public void actionPerformed(ActionEvent ae)
	 	   	  {
	 	   	  	if(ae.getSource()==delbl)
	 	   	  	{
	 	   	  	 
	 	   	  		Receipt t=new Receipt();
	              	   	}
	             		   	  	
	 	   	  }   	  
	 	   });
	   /*modc.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==opent)
	   	  	{
	   	  	 
	   	  		TrainerRecord t=new TrainerRecord();
             	   	}
            		   	  	
	   	  }   	  
	   });
	   addc.addActionListener(new ActionListener()
	 		{
	 	   	  public void actionPerformed(ActionEvent ae)
	 	   	  {
	 	   	  	if(ae.getSource()==modifyt)
	 	   	  	{
	 	   	  	 
	 	   	  		TrainerRecord t=new TrainerRecord();
	              	   	}
	             		   	  	
	 	   	  }   	  
	 	   });
	*/
//admission form 	 

		 fresh.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==fresh)
	   	  	{
	   	  	 
	   	  	//   admfrm afm=new admfrm();
             
             	
            	
            	
	   	  	}
	   	  }   	  
	   });
           
              fresh1.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==fresh1)
	   	  	{
	   	  	 
	   	  	//  enqfrm afm=new enqfrm();
             
             	
            	
            	
	   	  	}
	   	  }   	  
	   });
//exit
 addb.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==addb)
	   	  	{
	   	  	 
	   	  	 //  batrec abt=new batrec();
             
             	
            	
            	
	   	  	}
	   	  }   	  
	   });

		exit1.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==exit1)
	   	  	{
	   	  	 
	   	  	   System.exit(0);
                                   	
	   	  	}
	   	  }   	  
	   });
		
		//Batch
		
		addb.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==addb)
			{
	   	     BatchRecord f=new BatchRecord();
             
             		}
	   	  	
	   	  }   	  
	   });
		
		
//student
		modify.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==modify)
	   	  	{
	   	  	 
	   	  	  // sturecm srm=new sturecm();
	   	  	}
	   	  }   	  
	   });

		delete.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==delete)
	   	  	{
	   	  	 
	   	  	  //  sturec srm=new sturec();
                                   	
	   	  	}
	   	  }   	  
	   });

	search.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==search)
	   	  	{
	   	  	 
	   	  	  // sturecs srm=new sturecs();
	   	  	}
	   	  }   	  
	   });
//TEACHER

		addt.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==addt)
	   	  	{
	   	  	 
	   	  	   //teareca tadd=new teareca();
	   	  	}
	   	  }   	  
	   });


	deletet.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==deletet)
	   	  	{
	   	  	 
	   	  	 //  tearecd tdel=new tearecd();
	   	  	}
	   	  }   	  
	   });

	modifyt.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==modifyt)
	   	  	{
	   	  	 
	   	 // 	   tearecm tmod=new tearecm();
	   	  	}
	   	  }   	  
	   });


	     opent.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==opent)
	   	  	{
	   	  	 
	   	  //	   teareco topen=new teareco();
	   	  	}
	   	  }   	  
	   });


		/*deleteb.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==deleteb)
	   	  	{
	   	  	 
	   	  	   batrec op=new batrec();
	   	  	}
	   	  }   	  
	   });

	
		addb.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==addb)
	   	  	{
	   	  	 
	   	  	   batrec op=new batrec();
	   	  	}
	   	  }   	  
	   });*/



//bill

		printbl.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==printbl)
	   	  	{
	   	  	 
	   	//  	   stubill print=new stubill();
	   	  	}
	   	  }   	  
	   });

		openbl.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==openbl)
	   	  	{
	   	  	 
	   	//  	   stubillo openbill=new stubillo();
	   	  	}
	   	  }   	  
	   });

		delbl.addActionListener(new ActionListener()
		{
	   	  public void actionPerformed(ActionEvent ae)
	   	  {
	   	  	if(ae.getSource()==delbl)
	   	  	{
	   	  	 
	   	  //	   stubilld delbill=new stubilld();
	   	  	}
	   	  }   	  
	   });


//Exam

 
	 }
public static void main(String args[])
{
    MainMenu menu1=new MainMenu();
menu1.LaunchFrame();	
	menu1.Check_Event();	

}
	 
}