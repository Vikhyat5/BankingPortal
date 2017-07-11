                                     // PANEL FOR DELETE COMMAND   
import java.awt.*;
import java.awt.event.*;                                                             // event import
import javax.swing.*;
import java.sql.*; 


class MyPanel5  extends JPanel   implements ActionListener
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
  
  
  MyPanel5()
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
	 
	 b9=new JButton("Delete");
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
		  {  
			  String d[][]=new String [20][16];
			  String h[]={"Customer type","Account type","Full name","Father name","sex","Martial status","Mode of Operation","Address","City","State","e-mail","Nationality","Balance","D.O.B","Phone","Accpount no."};
			  int r=0;
			  String a;
			  //String n=ch.getSelectedItem();
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
			  
			    
			    JTable tb=new JTable(d,h);
				JScrollPane sp=new JScrollPane(tb);
				sp.setBounds(0,50,970,60);
				add(sp);
	            
				
				
				int y=JOptionPane.showConfirmDialog(null,"Do u want to delete the record","emulation1",0);
				if(y==0)
				{
					st.executeUpdate("delete from banking where Account_no="+n+"");
					JOptionPane.showMessageDialog(null,"DELETED","emulation1",0);
				}
		  }
		  catch(Exception e)
           {
	        System.out.println(e);
           }
	  }
  }

  
}




