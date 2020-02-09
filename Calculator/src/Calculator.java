import java.util.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

public class  Calculator implements ActionListener {
	int c,n;
    String s1,s2,s3,s4,s5;
	
Frame f=new Frame("My Calculator");
 
TextField t1=new TextField();
 
    Button b1=new Button("0");
	Button b2=new Button("1");
	Button b3=new Button("2");
	Button b4=new Button("3");
	Button b5=new Button("4");
	Button b6=new Button("5");
    Button b7=new Button("6");
	Button b8=new Button("7");
	Button b9=new Button("8");
	Button b10=new Button("9");
    Button b11=new Button("+");
	Button b12=new Button("-");
	Button b13=new Button("*");
	Button b14=new Button("/");
	Button b15=new Button("Clear");
	Button b16=new Button("=");

		
	Calculator()
	{
		t1.setBounds(50,100,200,40);
		
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		b5.setBounds(290,250,50,20);
		b6.setBounds(50,200,50,20);
		b7.setBounds(110,200,50,20);
		b8.setBounds(170,200,50,20);
		b9.setBounds(230,200,50,20);
		b10.setBounds(290,200,50,20);
		b11.setBounds(50,150,50,20);
		b12.setBounds(110,150,50,20);
		b13.setBounds(170,150,50,20);
		b14.setBounds(230,150,50,20);
		b15.setBounds(290,150,50,20);
		b16.setBounds(290,100,50,20);
		
		b1.setBackground(Color.gray);
		b2.setBackground(Color.gray);
		b3.setBackground(Color.gray);
		b4.setBackground(Color.gray);
		b6.setBackground(Color.gray);
		b7.setBackground(Color.gray);
		b8.setBackground(Color.gray);
		b9.setBackground(Color.gray);
		b10.setBackground(Color.gray);
		b11.setBackground(Color.gray);
		b12.setBackground(Color.gray);
		b13.setBackground(Color.gray);
		b14.setBackground(Color.gray);
		b16.setBackground(Color.gray);
		b5.setBackground(Color.gray);

		f.add(t1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
	}
		
		public void actionPerformed (ActionEvent e)
		{
	
			if(e.getSource()==b1)
			{
				 s3 = t1.getText();
		         s4 = "0";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b2)
			{
				 s3 = t1.getText();
		         s4 = "1";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b3)
			{
				 s3 = t1.getText();
		         s4 = "2";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b4)
			{
				 s3 = t1.getText();
		         s4 = "3";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b5)
			{
				 s3 = t1.getText();
		         s4 = "4";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b6)
			{
				 s3 = t1.getText();
		         s4 = "5";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b7)
			{
				 s3 = t1.getText();
		         s4 = "6";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b8)
			{
				 s3 = t1.getText();
		         s4 = "7";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b9)
			{
				 s3 = t1.getText();
		         s4 = "8";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			if(e.getSource()==b10)
			{
				 s3 = t1.getText();
		         s4 = "9";
		         s5 = s3+s4;
		         t1.setText(s5);
			}
			
        if(e.getSource()==b11)
        {
            s1 = t1.getText();
            t1.setText("");
            c=1;
        }
        if(e.getSource()==b12)
        {
            s1 = t1.getText();
            t1.setText("");
            c=2;
        }
        if(e.getSource()==b13)
        {
            s1 = t1.getText();
            t1.setText("");
            c=3;
        }
        if(e.getSource()==b14)
        {
            s1 = t1.getText();
            t1.setText("");
            c=4;
        }
     
        if(e.getSource()==b16)
        {
        s2 = t1.getText();
        if(c==1)
        {
            n = Integer.parseInt(s1)+Integer.parseInt(s2);
            t1.setText(String.valueOf(n));
        }
        else if(c==2)
        {
            n = Integer.parseInt(s1)-Integer.parseInt(s2);
            t1.setText(String.valueOf(n));
        }
        else if(c==3)
        {
            n = Integer.parseInt(s1)*Integer.parseInt(s2);
            t1.setText(String.valueOf(n));
        }
         if(c==4)
        {
          try
           {
             int p=Integer.parseInt(s2);
             if(p!=0)
             {
              n = Integer.parseInt(s1)/Integer.parseInt(s2);
              t1.setText(String.valueOf(n));
             }
             else
              t1.setText("infinite");
           }
              catch(Exception i){}
        }
        }
        if(e.getSource()==b15)
		{
			System.exit(0);
		}
		}
		
		public static void main (String[] args)
		{
			new Calculator();
		}
	}

