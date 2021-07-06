
import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;



 class Login extends JFrame implements ActionListener
{
   JLabel l1,l2;
   JButton b1,b2;
   JTextField t1;
   JPasswordField t2;
   JOptionPane p1=new JOptionPane();
   Font f;
 Container contentPane=getContentPane();
   Login()
   {
	   
	   JLabel background;
    setTitle ("LOGIN");
    
    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension d = t.getScreenSize();
    int h = d.height;
    int w = d.width;
    
    
    ImageIcon img=new ImageIcon("/home/user/eclipse-workspace/Fitness Club Management/src/victor-freitas-fZsfqu2a-Mk-unsplash.jpg");
    Image i=img.getImage();
    Image new_img=i.getScaledInstance(900,900 ,Image.SCALE_SMOOTH);
    background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,w,h);
	add( background); 	
    
	
	 ImageIcon k=new ImageIcon("/home/user/eclipse-workspace/Fitness Club Management/src/login.png");
	 ImageIcon kk=new ImageIcon("/home/user/eclipse-workspace/Fitness Club Management/src/icons8-cancel-32.png");

   // setLocation(400,400);
	
	  f=new Font("Georgia",Font.BOLD,16);	
    l1=new JLabel("User Name :");
    l1.setFont(f);
    l1.setForeground(Color.white);
	//l1.setOpaque(true);
    background.add(l1);
    l2=new JLabel("Password :");
    l2.setFont(f);
    l2.setForeground(Color.white);
   	//l2.setOpaque(true);
    background.add(l2);
  
    t1=new JTextField(10);
    
    background.add(t1);
    t2=new JPasswordField(10);
    background.add(t2);
    b1=new JButton("Login",k);
    background.add(b1);
    
    b1.setForeground(Color.white);
	  b1.setBackground(Color.black);
    b2=new JButton("Cancel",kk);
    b2.setForeground(Color.white);
	  b2.setBackground(Color.black);
    background.add(b2);
    
  
    b1.addActionListener(this);    
    b2.addActionListener(this);
    l1.setBounds(200, 300, 150, 30);
    l2.setBounds(200, 400, 150, 30);
    t1.setBounds(400, 300, 300, 30);
    t2.setBounds(400, 400, 300, 30);
    b1.setBounds(230, 500, 125, 50);
    b2.setBounds(400, 500, 125, 50);

    //addWindowListener(new WLclass());
    
    this.setSize(w,h);
    setVisible(true);
    show();
   }

   public static void main(String args[])
    {
     new Login();
    }

 public void actionPerformed(ActionEvent e)
  {
 String s1;
 String s2;
 if(e.getSource()==b1)
 {
 s1=t1.getText();
s2=t2.getText();

if(s1.equals(""))
{
 p1.showMessageDialog(this,"pls enter UserName");
t1.requestFocus();

}
else if(s2.equals(""))
{
 p1.showMessageDialog(this,"pls enter  Password");
t2.requestFocus();

}
else if(s1.equalsIgnoreCase("admin")==true && s2.equals("admin")==true)
{
dispose();
 MainMenu menu1=new MainMenu();
 menu1.LaunchFrame();	
 menu1.Check_Event();	
 }
 else
{
 p1.showMessageDialog(this,"Invalid login");
t1.setText("");
t2.setText("");
t1.requestFocus();


 }

}
 if(e.getSource()==b2)
 {
 System.exit(0); 
}

}

 class WLclass extends WindowAdapter
 {
  public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }
 }

}



