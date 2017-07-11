                                     // PANEL FOR MODIFY COMMAND   
import java.awt.*;
import java.awt.event.*;                                                             // event import
import javax.swing.*;
import java.sql.*; 


class MyPanel6  extends JPanel   implements ActionListener
{
  JLabel l20;
  Choice ch;
  JButton b9;
      
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
  
  
  MyPanel6()
  {
     setLayout(null);
	 setBackground(Color.white);
     l20=new JLabel("Choose Account Number");
	 l20.setBounds(50,0,500,30);
	 add(l20); 
     Font fa=new Font("Times New Roman",Font.ITALIC,20);
	 l20.setFont(fa);
     ch=new Choice();
     
     ch.setBounds(550,5,150,30);
     add(ch);
	 
	 b9=new JButton("Show");
	 b9.setBounds(750,5,100,20);
	 b9.setBackground(Color.white);
	 add(b9);
	 
	 
	 b9.addActionListener(this);
	 
	 try{
     
	 rs=st.executeQuery("Select Account_no from banking ");
	 
	 while(rs.next())
	 {
		 ch.add(rs.getString("Account_no"));
		 
	 }
	 
	 }
	  catch(Exception e)
              {
	             System.out.println(e);
              }
	 
	 
	 
	 
  }
  public void actionPerformed(ActionEvent ae)
  {
	  Object ob=ae.getSource();
	  if(ob==b9)
	  {   
      String n=ch.getSelectedItem();
		  try
		  {  /*
			  String d[][]=new String [20][16];
			  String h[]={"Customer type","Account type","Full name","Father name","sex","Martial status","Mode of Operation","Address","City","State","e-mail","Nationality","Balance","D.O.B","Phone","Accpount no."};
			  int r=0;
			  String a;
			  String n=ch.getSelectedItem();
			  //int n=Integer.parseInt(ch.getSelectedIndex());
			  rs=st.executeQuery("select * from banking where Account_no="+n+"");
			  while(rs.next())
			  {
				   d[r][0]=rs.getString("Cust_type");
				  d[r][1]=rs.getString("acc_type");
				  a=d[r][2]=rs.getString("full_name");
				  d[r][3]=rs.getString("father_name");
				  d[r][4]=rs.getString("sex");
				  d[r][5]=rs.getString("matial_status");
				  d[r][6]=rs.getString("mod");
				  d[r][7]=rs.getString("add");
				  d[r][8]=rs.getString("city");
				  d[r][9]=rs.getString("state");
				  d[r][10]=rs.getString("email");
				  d[r][11]=rs.getString("nationality");
				  d[r][12]=rs.getString("balance");
				  d[r][13]=rs.getString("DOB");
				  d[r][14]=rs.getString("phone");
				  d[r][15]=rs.getString("Account_no");
				  r++;
				  
			  }
			  */
			   /* 
			    JTable tb=new JTable(d,h);
				JScrollPane sp=new JScrollPane(tb);
				sp.setBounds(0,50,970,60);
				add(sp);
			  */
			  
			 
			  
			  
			  
			  MyPanel7 p7=new MyPanel7(n);
			  p7.setBounds(10,50,980,380);
			  add(p7);
			       			   
		  }
		  catch(Exception e)
           {
	        System.out.println(e);
           }
	  }
  }

  
}

class MyPanel7  extends JPanel  implements ActionListener
{    


        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l18,l17,l19;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
		ImageIcon img3;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
		JTextArea ta1;
	    ButtonGroup g ,g1,g2,g3,g4;
		JRadioButton cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
		JCheckBox c1,c2,c3;
        String a;
		
	 
	    String d[][]=new String [20][16];
	     int r=0;
	     String a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15;
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
  
	   
	 
	 
	 
	 
	 
	 MyPanel7(String n)
	 {
		 super();
	     a=n;
		  try
		  {
			  
			  String h[]={"Customer type","Account type","Full name","Father name","sex","Martial status","Mode of Operation","Address","City","State","e-mail","Nationality","Balance","D.O.B","Phone","Accpount no."};
			  
			  //String a;
			  
			  //String n=ch.getSelectedItem();
			  
			  rs=st.executeQuery("select * from banking where Account_no="+a+"");
			  while(rs.next())
			  {
				  a0= d[r][0]=rs.getString("Cust_type");
				  a1=d[r][1]=rs.getString("acc_type");
				 a2=d[r][2]=rs.getString("full_name");
				  a3=d[r][3]=rs.getString("father_name");
                  a4=d[r][4]=rs.getString("sex");
				  a5=d[r][5]=rs.getString("matial_status");
				  a6=d[r][6]=rs.getString("mod");
				  a7=d[r][7]=rs.getString("add");
				  a8=d[r][8]=rs.getString("city");
				  a9=d[r][9]=rs.getString("state");
				  a10=d[r][10]=rs.getString("email");
				  a11=d[r][11]=rs.getString("nationality");
				  a12=d[r][12]=rs.getString("balance");
				  a13=d[r][13]=rs.getString("DOB");
				  a14=d[r][14]=rs.getString("phone");
				  a15=d[r][15]=rs.getString("Account_no");
				  r++;
				  
			  }
		 
		  }
		  catch(Exception e)
           {
	        System.out.println(e);
           }
		 
		 
		 setLayout(null);
		setBackground(Color.white);	
			
			
			l3=new JLabel("Customer type");
			l3.setBounds(0,50,100,20);
			Font fb=new Font("Times New Roman",Font.BOLD,15);
			l3.setFont(fb);
			add(l3);
			g=new ButtonGroup();
			cb1=new JRadioButton("Public",false);
			cb1.setBounds(110,50,100,20);
			Font fc=new Font("Times New Roman",Font.ITALIC,15);
			cb1.setFont(fc);
			add(cb1);
			cb2=new JRadioButton("Staff",false);
			cb2.setBounds(220,50,100,20);
			cb2.setFont(fc);
			cb1.setBackground(Color.white);
			cb2.setBackground(Color.white);
			g.add(cb1);
			g.add(cb2);
			add(cb2);
			
			
			l3=new JLabel("Please Select an Account of your Choice ");
			l3.setBounds(0,70,300,20);
			l3.setFont(fb);
			add(l3);
			
			
			g1=new ButtonGroup();
			cb3=new JRadioButton("Savings",false);
			cb3.setBounds(320,70,100,20);
			Font fd=new Font("Times New Roman",Font.ITALIC,15);
			cb3.setFont(fd);
			add(cb3);
			cb4=new JRadioButton("Current",false);
			cb4.setBounds(420,70,100,20);
			Font fe=new Font("Times New Roman",Font.ITALIC,15);
			cb4.setFont(fe);
			cb3.setBackground(Color.white);
			cb4.setBackground(Color.white);
			g1.add(cb3);
			g1.add(cb4);
			add(cb4);
			
			l4=new JLabel("(A)PERSONAL Details:");
			l4.setBounds(0,90,200,20);
			Font ff=new Font("Times New Roman",Font.BOLD,15);
			l4.setFont(ff);
			add(l4);
			
			l5=new JLabel("(B)RESIDENTIAL Details:");
			l5.setBounds(400,90,200,20);
			Font fg=new Font("Times New Roman",Font.BOLD,15);
			l5.setFont(fg);
			add(l5);
			
			
			ta1=new JTextArea();
			ta1.setBounds(400,130,150,60);
			Color c=new Color(226,230,231);
			ta1.setBackground(c);
			add(ta1);
			
			
			ta1.setText(a7);
			
			l6=new JLabel("Full name");
			l6.setBounds(0,120,150,20);
			Font fh=new Font("Times New Roman",Font.ITALIC,15);
			l6.setFont(fh);
			add(l6);
			
			t1=new JTextField();
			t1.setBounds(150,120,150,20);
			add(t1);
			t1.setText(a2);     //***************************
			
			l7=new JLabel("Father name");
			l7.setBounds(0,140,150,20);
			Font fi=new Font("Times New Roman",Font.ITALIC,15);
			l7.setFont(fi);
			add(l7);
			
			
			
			
			t2=new JTextField();
			t2.setBounds(150,140,150,20);
			add(t2);
			t1.setText(a3);
			
			
			t1.setText(a3);
			
			
			
			l8=new JLabel("D.O.B.");
			l8.setBounds(0,160,100,20);
			Font fj=new Font("Times New Roman",Font.ITALIC,15);
			l8.setFont(fj);
			add(l8);
			
			t3=new JTextField();
			t3.setBounds(150,160,150,20);
			add(t3);
			
			t3.setText(a13);
			
			l9=new JLabel("City");
			l9.setBounds(660,100,100,20);
			Font fk=new Font("Times New Roman",Font.ITALIC,15);
			l9.setFont(fk);
			add(l9);
			
			t4=new JTextField();
			t4.setBounds(760,100,130,20);
			add(t4);
			
			t4.setText(a8);
			
			l10=new JLabel("State");
			l10.setBounds(660,120,100,20);
			Font fl=new Font("Times New Roman",Font.ITALIC,15);
			l10.setFont(fl);
			add(l10);
			
			t5=new JTextField();
			t5.setBounds(760,120,150,20);
			add(t5);
			
			
			t5.setText(a9);
			
			l11=new JLabel("email id");
			l11.setBounds(960,140,100,20);
			Font fm=new Font("Times New Roman",Font.ITALIC,15);
			l11.setFont(fm);
			add(l11);
			
			t6=new JTextField();
			t6.setBounds(760,140,200,20);
			add(t6);
			
			
			t6.setText(a10);
			
			l12=new JLabel("Nationality");
			l12.setBounds(660,180,100,20);
			Font fn=new Font("Times New Roman",Font.ITALIC,15);
			l12.setFont(fn);
			add(l12);
			
			t7=new JTextField();
			t7.setBounds(760,180,150,20);
			add(t7);
			
			
			
			t7.setText(a11);
			
			l13=new JLabel("Phone no.");
			l13.setBounds(660,200,100,20);
			Font fo=new Font("Times New Roman",Font.ITALIC,15);
			l13.setFont(fo);
			add(l13);
			
			t8=new JTextField();
			t8.setBounds(760,200,150,20);
			add(t8);
			
			
			t8.setText(a14);
			
			l14=new JLabel("Balance");
			l14.setBounds(660,220,100,20);
			Font fp=new Font("Times New Roman",Font.ITALIC,15);
			l14.setFont(fp);
			add(l14);
			
			t9=new JTextField();
			t9.setBounds(760,220,150,20);
			add(t9);
			
			t9.setText(a15);
			
			l15=new JLabel("Sex");
			l15.setBounds(0,180,100,20);
			Font fq=new Font("Times New Roman",Font.ITALIC,15);
			l15.setFont(fq);
			add(l15);
			
			
			g2=new ButtonGroup();
			cb5=new JRadioButton("Male",false);
			cb5.setBounds(110,180,100,20);
			cb6=new JRadioButton("Female",false);
			cb6.setBounds(210,180,100,20);
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
			l16.setBounds(0,200,120,20);
			Font fr=new Font("Times New Roman",Font.ITALIC,15);
			l16.setFont(fr);
			add(l16);
			
			
			
			
			
			
			g3=new ButtonGroup();
			cb7=new JRadioButton("Married",false);
			cb7.setBounds(130,200,100,20);
			cb8=new JRadioButton("Unmarried",false);
			cb8.setBounds(230,200,150,20);
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
			l17.setBounds(0,230,120,20);
			Font fs=new Font("Times New Roman",Font.ITALIC,15);
			l17.setFont(fs);
			add(l17);
			
			g4=new ButtonGroup();
			cb9=new JRadioButton("Self only",false);
			cb9.setBounds(130,230,100,20);
			cb10=new JRadioButton("Either or Survivor",false);
			cb10.setBounds(240,230,150,20);
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
			
			
			b9=new JButton("Modify");
			b9.setBounds(240,260,150,30);
			b9.setBackground(Color.green);
			add(b9);
			
			if(cb7.getLabel().equals(a5))
			{
				cb7.setSelected(true);
			}
			else
			{
				cb8.setSelected(true);
			}
			
			if(cb9.getLabel().equals(a6))
			{
				cb9.setSelected(true);
			}
			else
			{
				cb10.setSelected(true);
			}
			
			if(cb5.getLabel().equals(a4))
			{
				cb5.setSelected(true);
			}
			else
			{
				cb6.setSelected(true);
			}
			
			if(cb3.getLabel().equals(a1))
			{
				cb3.setSelected(true);
			}
			else
			{
				cb4.setSelected(true);
			}
			
			if(cb1.getLabel().equals(a0))
			{
				cb1.setSelected(true);
			}
			else
			{
				cb2.setSelected(true);
			}
		   
			
			b9.addActionListener(this);
	    
	 }
	 
	 public void actionPerformed(ActionEvent ae)
	 {
		 Object ob=ae.getSource();
		 if(ob==b9)
	     {
			 try 
			 {
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
                 
				 
                 st.executeUpdate("update banking set Cust_type='"+a1+"',acc_type='"+a2+"',full_name='"+a3+"',father_name='"+a4+"',sex='"+a5+"',matial_status='"+a6+"',mod='"+a7+"',add='"+a8+"',city='"+a9+"',state='"+a10+"',email='"+a11+"',nationality='"+a12+"',balance="+a15+",DOB='"+a14+"',phone="+a13+" where Account_no="+a+"");
				 
				 JOptionPane.showMessageDialog(null,"UPDATED","emulation1",3);
				 
				
				 
				 
			 }
			 
			 catch(Exception e)
           {
	        System.out.println(e);
           }
			 
			 
			 
			 
		 }
	 }
}



