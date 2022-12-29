
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class EmployeeFile 
{
	private static Color black;

	public static void main(String[] args) 
	{
		JFrame frameobj = new JFrame();  //creating frame
		frameobj.setSize(500, 500);  //declaring frame size
		
		GridLayout g1=new GridLayout(5,2);  // layout of the frame
		frameobj.setLayout(g1);				//layout is set to the frame created
		
		JPanel p1=new JPanel();  //creating panels
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		JPanel p7=new JPanel();
		JPanel p8=new JPanel();
		JPanel p9=new JPanel();
		JPanel p10=new JPanel();
		
		JLabel l1=new JLabel("NAME");  //creating labels
		JLabel l2=new JLabel("ID");
		JLabel l3=new JLabel("DOJ");
		JLabel l4=new JLabel("DOB");
		
		JTextField f1=new JTextField();   //create obj for txtfield
		JTextField f2=new JTextField();
		JTextField f3=new JTextField();
		JTextField f4=new JTextField();
		
		f1.setPreferredSize(new Dimension(200,30)); //size of txtfield
		f2.setPreferredSize(new Dimension(200,30));
		f3.setPreferredSize(new Dimension(200,30));
		f4.setPreferredSize(new Dimension(200,30));
		
		JButton b1=new JButton("SUBMIT");
		JButton b2=new JButton("RESET");
		
		b1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				File fileobj=new File("/home/Admin/workspace/P10 - Employee File/File.txt");
				try 
				{
					FileWriter fw=new FileWriter(fileobj.getAbsoluteFile(),true);
					System.out.println("\n NAME : " +f1.getText()  +"\n"  +"ID : " +f2.getText()  +"\n"  +"DOJ : " +f3.getText()  +"\n"  +"DOB : "+f4.getText() +"\n");
					fw.write("\n NAME : " +f1.getText()  +"\n"  +"ID : " +f2.getText()  +"\n"  +"DOJ : " +f3.getText()  +"\n"  +"DOB : "+f4.getText() +"\n");
					fw.close();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}	
			}
		});
		
		b2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				f1.setText(" ");
				f2.setText(null);
				f3.setText(null);
				f4.setText(null);
			}
		});
		
		p1.add(l1);   //add labels to panels where labels=name,id,doj,dob
		p3.add(l2);
		p5.add(l3);
		p7.add(l4);
		
		p2.add(f1);   //add textfield to panels where txtfield is user defined
		p4.add(f2);
		p6.add(f3);
		p8.add(f4);
		
		p9.add(b1);    //add buttons to panel
		p10.add(b2);
		
		//l1.setBorder(BorderFactory.createLineBorder(Color.black));
		l1.setBorder(BorderFactory.createLineBorder(black,10));
		l2.setBorder(BorderFactory.createLineBorder(black,10));
		l3.setBorder(BorderFactory.createLineBorder(black,10));
		l4.setBorder(BorderFactory.createLineBorder(black,10));
		
		frameobj.add(p1);  //add panels to frames
		frameobj.add(p2);
		frameobj.add(p3);
		frameobj.add(p4);
			
		frameobj.add(p5);
		frameobj.add(p6);
		frameobj.add(p7);
		frameobj.add(p8);
		
		frameobj.add(p9);
		frameobj.add(p10);
		
		frameobj.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////


package nag;
import java.awt.Color; // for using the Color class
import java.awt.Dimension; // for using the Dimension class
import java.awt.GridLayout; // for using the GridLayout class
import java.awt.event.ActionEvent; // for using the ActionEvent class
import java.awt.event.ActionListener; // for using the ActionListener interface
import java.io.File; // for using the File class
import java.io.FileWriter; // for using the FileWriter class
import java.io.IOException; // for handling IOExceptions
import javax.swing.*; // for using Swing components
public class sample
{
// Declare a static variable to store the color black
private static Color black;
public static void main(String[] args)
{
// Create a new JFrame object
JFrame frameobj = new JFrame();
// Set the size of the JFrame
frameobj.setSize(500, 500);
// Create a new GridLayout object with 5 rows and 2 columns
GridLayout g1 = new GridLayout(5, 2);
// Set the layout of the JFrame to the GridLayout object
frameobj.setLayout(g1);
// Create new JPanel objects
JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();
JPanel p4 = new JPanel();
JPanel p5 = new JPanel();
JPanel p6 = new JPanel();
JPanel p7 = new JPanel();
JPanel p8 = new JPanel();
JPanel p9 = new JPanel();
JPanel p10 = new JPanel();
// Create new JLabel objects
JLabel l1 = new JLabel("NAME");
JLabel l2 = new JLabel("ID");
JLabel l3 = new JLabel("DOJ");
JLabel l4 = new JLabel("DOB");
// Create new JTextField objects
JTextField f1 = new JTextField();
JTextField f2 = new JTextField();
JTextField f3 = new JTextField();
JTextField f4 = new JTextField();
// Set the preferred size of the JTextField objects
f1.setPreferredSize(new Dimension(200, 30));
f2.setPreferredSize(new Dimension(200, 30));
f3.setPreferredSize(new Dimension(200, 30));
f4.setPreferredSize(new Dimension(200, 30));
// Create new JButton objects
JButton b1 = new JButton("SUBMIT");
JButton b2 = new JButton("RESET");
// Add an action listener to the "SUBMIT" button
b1.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e)
{
// Create a new File object representing the file "ui.txt"
File fileobj = new File("/home/student/ui.txt");
try
{
// Create a new FileWriter object to write to the file
FileWriter fw=new FileWriter(fileobj.getAbsoluteFile(),true);
System.out.println("\n NAME : " +f1.getText() +"\n" +"ID :
" +f2.getText() +"\n" +"DOJ : " +f3.getText() +"\n" +"DOB : "+f4.getText() +"\n");
fw.write("\n NAME : " + f1.getText() + "\n" + "ID : " + f2.getText() + "\n" + "DOJ : " + f3.getText() +
"\n" + "DOB : " + f4.getText() + "\n");
// Close the FileWriter
fw.close();
}
catch (IOException e1)
{
// Print the stack trace if an IOException occurs
e1.printStackTrace();
}
}
});
// Add an action listener to the "RESET" button
b2.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
// Clear the text in the JTextFields
f1.setText(" ");
f2.setText(" ");
f3.setText(" ");
f4.setText(" ");
}
});
// Add the components to the JFrame
p1.add(l1);
p1.add(f1);
p2.add(l2);
p2.add(f2);
p3.add(l3);
p3.add(f3);
p4.add(l4);
p4.add(f4);
p5.add(b1);
p6.add(b2);
frameobj.add(p1);
frameobj.add(p2);
frameobj.add(p3);
frameobj.add(p4);
frameobj.add(p5);
frameobj.add(p6);
frameobj.add(p7);
frameobj.add(p8);
frameobj.add(p9);
frameobj.add(p10);
// Set the JFrame to be visible
frameobj.setVisible(true);
}
}

