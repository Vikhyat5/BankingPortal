import java.awt.*;
import java.awt.event.*;                                                             // event import
import javax.swing.*;
import java.sql.*;


import java.io.File;
import java.awt.Desktop;
                                                                
class banking                                                                          // class Banking
{
	
	
     JFrame f,f1;
	 JLabel l1,l2;
	 ImageIcon img1;
	 JPanel jp1;
	 JProgressBar pb;
	 
	 
	 
	 banking()
	 {
	 f=new JFrame("Welcome To  epay ");                                          //frame f
	 f.setBounds(350,150,600,380);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f.setResizable(false);
	 
	 l1=new JLabel();                                                    //label l1
	 l1.setBounds(0,0,600,300);
	 f.add(l1);
	 img1=new ImageIcon("banking.png");
	 l1.setIcon(img1);
	 
	 jp1=new JPanel();                                                           //panel jp1
	 jp1.setBounds(0,300,600,70);
	 jp1.setBackground(Color.white);
	 //jp1.setBackground(Color.red);
	 l2=new JLabel("www.epayIndia.com");
	 l2.setBounds(0,0,150,70);
	 jp1.add(l2);
	 f.add(jp1);
	 Font f11=new Font("Times New Roman",Font.ITALIC,15);
	 l2.setFont(f11);
	 l2.setForeground(Color.blue);
	 
	 
	 pb=new JProgressBar(1,100);                                                  //progress bar
	 pb.setBounds(20,300,560,5);
	 pb.setBackground(Color.white);
	 f.add(pb);
	 

	 
	 f.setLayout(null);
	 f.setVisible(true);
	 
	 	 for(int i=1;i<100;i=i+5)
	 {
		 try{
			 pb.setValue(i);
			 Thread.sleep(200);
		 }
		 catch(Exception e)
		 {
			 System.out.println("a");
		 }
		 
	 }
	 bank a=new bank();                                                       //Bank constructor called
	 f.setVisible(false);
	 
	 }

    
     

    
    public static void main(String[]z)                                                                    // function MAIN
	{
	     banking b=new banking();                                            //Banking constructor called
	}
}


	  class bank  implements ActionListener                                              //New class Bank
    { 
	     JFrame f1;
		 JLabel l3,l4,l5,l6,l7,l8;
	     ImageIcon img2,img3,img4;
		 JMenuBar mb;
		 JMenu m1,m2,m3,m4,m5,m6;
         JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi20,mi21;
		 JDesktopPane dp;
		 JPanel jp2;
		 
		 
		
		 
		 bank()                                                                          //Bank constructor
	     {
		 f1=new JFrame("epay India");
		 f1.setBounds(0,0,1500,750);                    
		 f1.setLayout(null);
		 l3=new JLabel();
	 
	     l3.setBounds(0,0,1500,200);
	     f1.add(l3);
	     img2=new ImageIcon("banking2 .png");
	     
		 l3.setIcon(img2);
		 
		 
		 
		
		 
		 mb=new JMenuBar();                                                          //Menu Bar
		 mb.setBounds(0,200,1500,30); 
		 mb.setBackground(Color.white);
		 f1.add(mb);
		 
		 
		 
		 m1=new JMenu("Customer");
	     mb.add(m1); 
         m2=new JMenu("Transaction");
	     mb.add(m2);
	     m3=new JMenu("Loan");
	     mb.add(m3);
	     m4=new JMenu("About");
	     mb.add(m4);
	     m5=new JMenu("Help");
	     mb.add(m5);
		 m6=new JMenu("tools");
	     mb.add(m6);
		 
		 
		 
		 mi1=new JMenuItem();
		 mi1=new JMenuItem("New Account",new ImageIcon("icon.png"));
	     m1.add(mi1);
	     mi2=new JMenuItem("Display",new ImageIcon("icon4.png"));
	     m1.add(mi2);
	     mi3=new JMenuItem("Modify",new ImageIcon("icon2.png"));
	     m1.add(mi3);
	     mi4=new JMenuItem("Delete",new ImageIcon("icon6.png"));
	     m1.add(mi4);
		 mi20=new JMenuItem("show all",new ImageIcon("icon3.png"));
	     m1.add(mi20);
		 
		 mi5=new JMenuItem("Exit",new ImageIcon("icon5.png"));
	     m1.add(mi5);
		 
	     mi6=new JMenuItem("Widrawl",new ImageIcon("icon17.png"));
	     m2.add(mi6);
	     mi7=new JMenuItem("Deposit",new ImageIcon("icon17.png"));
	     m2.add(mi7);
	     mi8=new JMenuItem("Balance enquiry",new ImageIcon("icon17.png"));
	     m2.add(mi8);
		 mi9=new JMenuItem("Display Transaction",new ImageIcon("icon17.png"));
	     m2.add(mi9);
		 mi10=new JMenuItem("Home",new ImageIcon("icon8.png"));
	     m3.add(mi10);
		 mi11=new JMenuItem("car",new ImageIcon("icon10.png"));
	     m3.add(mi11);
		 mi12=new JMenuItem("Education",new ImageIcon("icon7.png"));
	     m3.add(mi12);
		 mi13=new JMenuItem("Details",new ImageIcon("icon9.png"));
	     m3.add(mi13);
		 mi14=new JMenuItem("Bank",new ImageIcon("icon15.png"));
	     m4.add(mi14);
		 mi15=new JMenuItem("Services",new ImageIcon("icon14.png"));
	     m4.add(mi15);
		 mi16=new JMenuItem("employee",new ImageIcon("icon12.png"));
	     m4.add(mi16);
		 mi17=new JMenuItem("Testimonils",new ImageIcon("icon13.png"));
	     m4.add(mi17);
		 mi18=new JMenuItem("Important no.",new ImageIcon("icon11.png"));
	     m5.add(mi18);
		 mi19=new JMenuItem("Terms & Conditions",new ImageIcon("icon16.png"));
	     m5.add(mi19);
		 mi21=new JMenuItem("Calculator",new ImageIcon("icon2.png"));
	     m6.add(mi21);
		 
		 
		 
		 Font f12=new Font("Times New Roman",Font.ITALIC,15);
		 m1.setFont(f12);
		 m2.setFont(f12);
		 m3.setFont(f12);
		 m4.setFont(f12);
		 m5.setFont(f12);
		 m6.setFont(f12);
		 
		 Font f13=new Font("Times New Roman",Font.PLAIN,15);
		 mi1.setFont(f13);
		 mi2.setFont(f13);
		 mi3.setFont(f13);
		 mi4.setFont(f13);
		 mi5.setFont(f13);
		 mi6.setFont(f13);
		 mi7.setFont(f13);
		 mi8.setFont(f13);
		 mi9.setFont(f13);
		 mi10.setFont(f13);
		 mi11.setFont(f13);
		 mi12.setFont(f13);
		 mi13.setFont(f13);
		 mi14.setFont(f13);
		 mi15.setFont(f13);
		 mi16.setFont(f13);
		 mi17.setFont(f13);
		 mi18.setFont(f13);
		 mi19.setFont(f13);
		 mi20.setFont(f13);
		 mi21.setFont(f13);
		 
		 
		 m1.setForeground(Color.blue);
		 m2.setForeground(Color.blue);
		 m3.setForeground(Color.blue);
		 m4.setForeground(Color.blue);
		 m5.setForeground(Color.blue);
		 m6.setForeground(Color.blue);
		 
		 mi1.setForeground(Color.blue);
		 mi2.setForeground(Color.blue);
		 mi3.setForeground(Color.blue);
		 mi4.setForeground(Color.blue);
		 mi5.setForeground(Color.blue);
		 mi6.setForeground(Color.blue);
		 mi7.setForeground(Color.blue);
		 mi8.setForeground(Color.blue);
		 mi9.setForeground(Color.blue);
		 mi10.setForeground(Color.blue);
		 mi11.setForeground(Color.blue);
		 mi12.setForeground(Color.blue);
		 mi13.setForeground(Color.blue);
		 mi14.setForeground(Color.blue);
		 mi15.setForeground(Color.blue);
		 mi16.setForeground(Color.blue);
		 mi17.setForeground(Color.blue);
		 mi18.setForeground(Color.blue);
		 mi19.setForeground(Color.blue);
		 mi20.setForeground(Color.blue);
		 mi21.setForeground(Color.blue);
		 
		 
		 
		 dp=new JDesktopPane();                                                     //Desktop Panel
		 dp.setBackground(Color.white);
		 dp.setBounds(0,230,1000,460);
                 f1.add(dp);
                 dp.setLayout(null);
                //img3=new ImageIcon("image3.jpg");
	     
		 //dp.setIcon(img3);		 
		 
		 l8=new JLabel("sddfgnxfn");
		 l8.setBounds(1000,10,500,690);
		 l8.setBackground(Color.green);
		 f1.add(l8);
		 
		 img3=new ImageIcon("copy.png");
		 l8.setIcon(img3);
		 
		 jp2=new JPanel();                                               //panel
		 jp2.setBackground(Color.white);
		 jp2.setBounds(0,690,1500,30);
		 f1.add(jp2);
		 
		 
		 l6=new JLabel("Designed by vikhyat Software Technology .pvt.Ltd");
		 l6.setBounds(0,0,150,30);
		 l6.setForeground(Color.white);
		 l6.setFont(f12);
		 jp2.add(l6);
		 
		 
		 
		 f1.setVisible(true);
		 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 mi1.addActionListener(this);
		 mi2.addActionListener(this);
		 mi20.addActionListener(this);
		 mi4.addActionListener(this);
		 mi3.addActionListener(this);
		 
		 mi21.addActionListener(this);
		 mi14.addActionListener(this);
		
		 }
		 
		public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==mi1)
		{
			JInternalFrame jif=new JInternalFrame("New Account",true,true,true,true);              // Inernal Frame
			jif.setBounds(10,10,980,440);
			jif.setVisible(true);
			dp.add(jif);
			jif.setLayout(null);
			MyPanel p=new MyPanel();
			jif.add(p);
			p.setSize(980,420);
			p.setVisible(true);
		}
		if(ob==mi2)
		{
			JInternalFrame jif=new JInternalFrame("Display",true,true,true,true);              // Inernal Frame
			jif.setBounds(10,10,980,440);
			jif.setVisible(true);
			dp.add(jif);                        
			jif.setLayout(null);
			MyPanel2 p2=new MyPanel2();
			jif.add(p2);
			p2.setSize(980,420);
			p2.setVisible(true);
		}
		if(ob==mi20)
		{
			JInternalFrame jif=new JInternalFrame("Show all",true,true,true,true);              // Inernal Frame
			jif.setBounds(10,10,980,440);
			jif.setVisible(true);
			dp.add(jif);                        
			jif.setLayout(null);
			MyPanel3 p3=new MyPanel3();
			jif.add(p3);
			p3.setSize(980,420);
			p3.setVisible(true);
		}
		if(ob==mi4)
		{
			JInternalFrame jif=new JInternalFrame("Delete",true,true,true,true);              // Inernal Frame
			jif.setBounds(10,10,980,440);
			jif.setVisible(true);
			dp.add(jif);                        
			jif.setLayout(null);
			MyPanel5 p5=new MyPanel5();
			jif.add(p5);
			p5.setSize(980,420);
			p5.setVisible(true);
		}
		if(ob==mi3)
		{
			JInternalFrame jif=new JInternalFrame("Modify",true,true,true,true);              // Inernal Frame
			jif.setBounds(10,10,980,440);
			jif.setVisible(true);
			dp.add(jif);                        
			jif.setLayout(null);
			MyPanel6 p6=new MyPanel6();
			jif.add(p6);
			p6.setSize(980,420);
			p6.setVisible(true);
		}
		if(ob==mi21)
		{
			JInternalFrame jif=new JInternalFrame("CALCULATOR",true,true,true,true);              // Inernal Frame
			jif.setBounds(10,10,980,440);
			jif.setVisible(true);
			dp.add(jif);                        
			jif.setLayout(null);
			MyPanel8 p8=new MyPanel8();
			jif.add(p8);
			p8.setSize(980,420);
			p8.setVisible(true);
		}
		if(ob==mi14)
		{
			 try
			 {
				 
                      File myFile = new File( "Bank.pdf");
                      Desktop.getDesktop().open(myFile);
                    
             }



				
			
			catch(Exception e)
           {
	             System.out.println(e);
           }
		}
		
	} 
		 
	}
	
	
	
	
	
	class MyPanel  extends JPanel   implements ActionListener                                          //   My Panel
	{ 
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l18,l17,l19;
		JButton b1,b2,b3,b4,b5,b6,b7,b8;
		ImageIcon img3;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
		JTextArea ta1;
	    ButtonGroup g ,g1,g2,g3,g4;
		JRadioButton cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
		JCheckBox c1,c2,c3;
		
		
		
		 Connection Con;
         Statement st;
         ResultSet rs;
	     
	 
	     
	      {
           try{
	
	           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	           Con=DriverManager.getConnection("jdbc:odbc:emulation1");
	           st=Con.createStatement();
	           System.out.println("Connected");
              }  
           catch(Exception e)
              {
	             System.out.println(e);
              }
          }
		  
		 
	     
		 
		 
		MyPanel()                                                                          // Constructor MyPanel
		{
			setLayout(null);
			l1=new JLabel("Account Opening Form");
			l1.setBounds(200,0,500,30);
			add(l1);
			Font fa=new Font("Times New Roman",Font.BOLD,20);
			l1.setFont(fa);
			setBackground(Color.white);
			l2=new JLabel("BRANCH: Sriganganagar");
			l2.setBounds(0,30,150,20);
			add(l2);
			l3=new JLabel("Customer type");
			l3.setBounds(160,30,100,20);
			Font fb=new Font("Times New Roman",Font.BOLD,15);
			l3.setFont(fb);
			add(l3);
			g=new ButtonGroup();
			cb1=new JRadioButton("Public",false);
			cb1.setBounds(300,30,100,20);
			Font fc=new Font("Times New Roman",Font.ITALIC,15);
			cb1.setFont(fc);
			add(cb1);
			cb2=new JRadioButton("Staff",false);
			cb2.setBounds(450,30,100,20);
			cb2.setFont(fc);
			cb1.setBackground(Color.white);
			cb2.setBackground(Color.white);
			g.add(cb1);
			g.add(cb2);
			add(cb2);
			
			
			l3=new JLabel("Please Select an Account of your Choice ");
			l3.setBounds(0,60,300,20);
			l3.setFont(fb);
			add(l3);
			
			
			g1=new ButtonGroup();
			cb3=new JRadioButton("Savings",false);
			cb3.setBounds(350,60,100,20);
			Font fd=new Font("Times New Roman",Font.ITALIC,15);
			cb3.setFont(fd);
			add(cb3);
			cb4=new JRadioButton("Current",false);
			cb4.setBounds(460,60,100,20);
			Font fe=new Font("Times New Roman",Font.ITALIC,15);
			cb4.setFont(fe);
			cb3.setBackground(Color.white);
			cb4.setBackground(Color.white);
			g1.add(cb3);
			g1.add(cb4);
			add(cb4);
			
			l4=new JLabel("(A)PERSONAL Details:");
			l4.setBounds(0,80,200,20);
			Font ff=new Font("Times New Roman",Font.BOLD,15);
			l4.setFont(ff);
			add(l4);
			
			l5=new JLabel("(B)RESIDENTIAL Details:");
			l5.setBounds(400,80,200,20);
			Font fg=new Font("Times New Roman",Font.BOLD,15);
			l5.setFont(fg);
			add(l5);
			
			
			ta1=new JTextArea();
			ta1.setBounds(400,100,150,60);
			Color c=new Color(226,230,231);
			ta1.setBackground(c);
			add(ta1);
			
			l6=new JLabel("Full name");
			l6.setBounds(0,100,150,20);
			Font fh=new Font("Times New Roman",Font.ITALIC,15);
			l6.setFont(fh);
			add(l6);
			
			t1=new JTextField();
			t1.setBounds(150,100,150,20);
			add(t1);
			
			l7=new JLabel("Father name");
			l7.setBounds(0,120,150,20);
			Font fi=new Font("Times New Roman",Font.ITALIC,15);
			l7.setFont(fi);
			add(l7);
			
			t2=new JTextField();
			t2.setBounds(150,120,150,20);
			add(t2);
			
			l8=new JLabel("D.O.B.");
			l8.setBounds(0,140,100,20);
			Font fj=new Font("Times New Roman",Font.ITALIC,15);
			l8.setFont(fj);
			add(l8);
			
			t3=new JTextField();
			t3.setBounds(150,140,150,20);
			add(t3);
			
			l9=new JLabel("City");
			l9.setBounds(560,100,100,20);
			Font fk=new Font("Times New Roman",Font.ITALIC,15);
			l9.setFont(fk);
			add(l9);
			
			t4=new JTextField();
			t4.setBounds(660,100,130,20);
			add(t4);
			
			l10=new JLabel("State");
			l10.setBounds(560,120,100,20);
			Font fl=new Font("Times New Roman",Font.ITALIC,15);
			l10.setFont(fl);
			add(l10);
			
			t5=new JTextField();
			t5.setBounds(660,120,150,20);
			add(t5);
			
			l11=new JLabel("email id");
			l11.setBounds(560,140,100,20);
			Font fm=new Font("Times New Roman",Font.ITALIC,15);
			l11.setFont(fm);
			add(l11);
			
			t6=new JTextField();
			t6.setBounds(660,140,200,20);
			add(t6);
			
			l12=new JLabel("Nationality");
			l12.setBounds(540,180,100,20);
			Font fn=new Font("Times New Roman",Font.ITALIC,15);
			l12.setFont(fn);
			add(l12);
			
			t7=new JTextField();
			t7.setBounds(660,180,150,20);
			add(t7);
			
			l13=new JLabel("Phone no.");
			l13.setBounds(540,200,100,20);
			Font fo=new Font("Times New Roman",Font.ITALIC,15);
			l13.setFont(fo);
			add(l13);
			
			t8=new JTextField();
			t8.setBounds(660,200,150,20);
			add(t8);
			
			l14=new JLabel("Balance");
			l14.setBounds(540,220,100,20);
			Font fp=new Font("Times New Roman",Font.ITALIC,15);
			l14.setFont(fp);
			add(l14);
			
			t9=new JTextField();
			t9.setBounds(660,220,150,20);
			add(t9);
			
			l15=new JLabel("Sex");
			l15.setBounds(0,160,100,20);
			Font fq=new Font("Times New Roman",Font.ITALIC,15);
			l15.setFont(fq);
			add(l15);
			
			
			g2=new ButtonGroup();
			cb5=new JRadioButton("Male",false);
			cb5.setBounds(110,160,100,20);
			cb6=new JRadioButton("Female",false);
			cb6.setBounds(210,160,100,20);
			add(cb5);
			add(cb6);
			Font fu=new Font("Times New Roman",Font.ITALIC,15);
			cb6.setFont(fu);
			cb5.setFont(fu);
			cb5.setBackground(Color.white);
			cb6.setBackground(Color.white);
			g2.add(cb5);
			g2.add(cb6);
			
			
			l16=new JLabel("Martial Status");
			l16.setBounds(0,180,120,20);
			Font fr=new Font("Times New Roman",Font.ITALIC,15);
			l16.setFont(fr);
			add(l16);
			
			
			g3=new ButtonGroup();
			cb7=new JRadioButton("Married",false);
			cb7.setBounds(130,180,100,20);
			cb8=new JRadioButton("Unmarried",false);
			cb8.setBounds(230,180,150,20);
			add(cb7);
			add(cb8);
			Font fv=new Font("Times New Roman",Font.ITALIC,15);
			cb7.setFont(fv);
			Font fw=new Font("Times New Roman",Font.ITALIC,15);
			cb8.setFont(fw);
			cb7.setBackground(Color.white);
			cb8.setBackground(Color.white);
			g3.add(cb7);
			g3.add(cb8);
			
			l17=new JLabel("Mode of operation");
			l17.setBounds(0,210,120,20);
			Font fs=new Font("Times New Roman",Font.ITALIC,15);
			l17.setFont(fs);
			add(l17);
			
			g4=new ButtonGroup();
			cb9=new JRadioButton("Self only",false);
			cb9.setBounds(130,210,100,20);
			cb10=new JRadioButton("Either or Survivor",false);
			cb10.setBounds(240,210,150,20);
			add(cb9);
			add(cb10);
			Font fx=new Font("Times New Roman",Font.ITALIC,15);
			cb9.setFont(fx);
			Font fy=new Font("Times New Roman",Font.ITALIC,15);
			cb10.setFont(fy);
			cb9.setBackground(Color.white);
			cb10.setBackground(Color.white);
			g4.add(cb9);
			g4.add(cb10);
			
			
			
			
			l18=new JLabel("Service Aquired");
			l18.setBounds(0,240,120,20);
			Font ft=new Font("Times New Roman",Font.ITALIC,15);
			l18.setFont(ft);
			add(l18);
			
			c1=new JCheckBox("ATM cun Debit card");
			c1.setBounds(130,240,160,20);
			add(c1);
			c2=new JCheckBox("Internet Banking");
			c2.setBounds(130,270,120,20);
			add(c2);
			c3=new JCheckBox("Sms Alert");
			c3.setBounds(130,300,120,20);
			add(c3);
			c1.setBackground(Color.white);
			c2.setBackground(Color.white);
			c3.setBackground(Color.white);
			
			b1=new JButton("Save");
			b1.setBounds(150,340,100,20);
			b1.setBackground(Color.white);
			add(b1);
			
			b2=new JButton("Cancel");
			b2.setBounds(260,340,100,20);
			b2.setBackground(Color.white);
			add(b2);
			
			
			
			img3=new ImageIcon("banking3.png");
			l19=new JLabel();
			l19.setIcon(img3);
			l19.setBounds(700,300,300,150);
			l19.setBackground(Color.yellow);
			add(l19);
			
			 b1.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		
		{
			Object ob=ae.getSource();
			if(ob==b1)
			{  
				try{
			      int a13,a15;
			     String a1="",a5="",a2="",a3="",a4="",a6="",a7="",a8,a9="",a10,a11,a12,a14;
				 
				 if(cb1.isSelected()) 
                  a1=cb1.getLabel();
                 else if(cb2.isSelected()) 
                 a1=cb2.getLabel();
				 
				 
				 if(cb3.isSelected()) 
                  a2=cb3.getLabel();
                 else if(cb4.isSelected()) 
                 a2=cb4.getLabel();
			      
				  
				 a3=t1.getText();
				 a4=t2.getText();
				 
				 
				 if(cb5.isSelected()) 
                  a5=cb5.getLabel();
                 else if(cb6.isSelected()) 
                 a5=cb6.getLabel();
			 
			     if(cb7.isSelected()) 
                  a6=cb7.getLabel();
                 else if(cb8.isSelected()) 
                 a6=cb8.getLabel();
			 
			     if(cb9.isSelected()) 
                  a7=cb9.getLabel();
                 else if(cb10.isSelected()) 
                 a7=cb10.getLabel();
				 
				 a8=ta1.getText();
			     a9=t4.getText();
			     a10=t5.getText();
			     a11=t6.getText();
                 a12=t7.getText();
                 a13=Integer.parseInt(t8.getText());
			     a14=t3.getText();
				 a15= a13=Integer.parseInt(t9.getText());
				 
				 t1.setText("");
			     t2.setText("");
			     t3.setText("");
			     t4.setText("");
			     t5.setText("");
				 t7.setText("");
			     t8.setText("");
			     t9.setText("");
			     ta1.setText("");
			     t6.setText("");
                 //cb1.setDefault(false);
			     
			  st.execute("insert into banking (cust_type,acc_type,full_name,father_name,sex,matial_status,mod,add,city,state,email,nationality,balance,DOB,phone) values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"','"+a11+"','"+a12+"',"+a13+",'"+a14+"',"+a15+")");
			   System.out.println("Result Saved");
			  JOptionPane.showMessageDialog(null,"saved","emulation1",0);
			   
			   System.out.println(3);
			    }
				catch(Exception e)
                {
	              System.out.println(e);
                }
		   }
		   
		
		}
	}