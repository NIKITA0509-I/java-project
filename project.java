import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="project.class" height="400" width="400"></applet>*/
public class project extends Applet implements ActionListener
{
String a;
Boolean f1=false;
Boolean f2=false;
Boolean f3=false;
Boolean f4=false;
Boolean f5=false;
Font fo1;
int si=10;
Label l1=new Label("enter the string");
TextField t1=new TextField(15);
Button b1=new Button ("RED");
Button b2=new Button ("BLUE");
Button b3= new Button("GREEN");
Button b4=new Button ("+");
Button b5=new Button ("-");
public void init()
{
	add(l1);
add(t1);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
f1=true;
f2=false;
f3=false;
f4=false;
f5=false;
repaint();	
}
if(ae.getSource()==b2)
{
f2=true;
f1=false;
f3=false;
f4=false;
f5=false;
repaint();	
}
if(ae.getSource()==b3)
{
f3=true;
f1=false;
f2=false;
f4=false;
f5=false;
repaint();	
}
if(ae.getSource()==b4)
{
f1=false;
f2=false;
f3=false;
f4=true;
f5=false;
repaint();	
}
if(ae.getSource()==b5)
{
f1=false;
f2=false;
f3=false;
f4=false;
f5=true;
repaint();	
}
}
public void paint(Graphics g)
{
String st=t1.getText();
if(f1==true)
{
	setForeground(Color.RED);
	si++;
}
if(f2==true)
{
	setForeground(Color.BLUE);
}
if(f3==true)
{
	setForeground(Color.GREEN);
}
if(f4==true)
{
	fo1 = new Font("Arial",Font.BOLD,si); 
	si++;
}
if(f5==true)
{
	fo1 = new Font("Arial",Font.BOLD,si); 
	si--;
}
	g.setFont(fo1);	
	g.drawString(st,200,200);
	
}
}
