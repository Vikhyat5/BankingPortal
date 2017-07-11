                             // PANEL FOR show all COMMAND   
import java.awt.*;
import java.awt.event.*;                                                             // event import
import javax.swing.*;
import java.sql.*; 


class MyPanel3  extends JPanel  
{
  
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
  
  
  MyPanel3()
  {
     setLayout(null);
	 setBackground(Color.white);
     
	 
	 
	 
	 
	 	  try
		    {
			  String d[][]=new String [20][16];
			  String h[]={"Customer type","Account type","Full name","Father name","sex","Martial status","Mode of Operation","Address","City","State","e-mail","Nationality","Balance","D.O.B","Phone","Accpount no."};
			  int r=0;
			  //String n=ch.getSelectedItem();
			  //int n=Integer.parseInt(ch.getSelectedIndex());
			  rs=st.executeQuery("select * from banking");
			  while(rs.next())
			  {
				  d[r][0]=rs.getString("Cust_type");
				  d[r][1]=rs.getString("acc_type");
				  d[r][2]=rs.getString("full_name");
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
				sp.setBounds(0,50,970,200);
				add(sp);
			  
		   }
		  catch(Exception e)
          {
	        System.out.println(e);
          }
	}
}	 
	 
	 