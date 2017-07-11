
import java.awt.*;
import java.awt.event.*;                                                             
import javax.swing.*;
import java.sql.*;


class MyPanel8 extends JPanel
{
  JButton b1,b2,b3,b4,b5,b6;
  JTextField t1;
  
  MyPanel8()
  { setLayout(null);
    t1=new JTextField();
	t1.setBounds(60,10,250,40);
	add(t1);
	b1=new JButton("Clear");
	b1.setBounds(20,70,100,30);
	add(b1);
	b2=new JButton("<<");
	b2.setBounds(120,70,100,30);
	add(b2);
	b3=new JButton("=");
	b3.setBounds(220,70,100,30);
	add(b3);
	b4=new JButton("=");
	b4.setBounds(20,70,100,30);
	add(b4);
	b5=new JButton("0");
	b5.setBounds(120,110,100,30);
	add(b5);
	b6=new JButton("1");
	b6.setBounds(220,110,100,30);
	add(b6);
	
    //b1=new JButton("Shree Ganesh");
	//b1.setBounds(10,10,150,30);
	//add(b1);
  }

}
 