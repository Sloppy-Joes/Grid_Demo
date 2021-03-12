// Demonstration of the Grid Layout

import javax.swing.*;
import java.awt.*;

public class GridDemo
{
	public static void main(String[] args)
	{
		// create the JFrame object and customize it
		JFrame myFrame = new JFrame("Grid Layout Demo");
		myFrame.setBounds(600, 240, 540, 120);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(3, 2));

		// create multiple JButton objects
		JButton button1 = new JButton("Button 1");
		button1.setBackground(Color.LIGHT_GRAY);
		button1.setForeground(Color.MAGENTA);
		JButton button2 = new JButton("Button 2");
		button2.setBackground(Color.LIGHT_GRAY);
		button2.setForeground(Color.MAGENTA);
		JButton button3 = new JButton("Button 3");
		button3.setBackground(Color.LIGHT_GRAY);
		button3.setForeground(Color.MAGENTA);
		JButton button4 = new JButton("Button 4");
		button4.setBackground(Color.LIGHT_GRAY);
		button4.setForeground(Color.MAGENTA);
		JButton button5 = new JButton("Button 5");
		button5.setBackground(Color.LIGHT_GRAY);
		button5.setForeground(Color.MAGENTA);
		JButton button6 = new JButton("Button 6");
		button6.setBackground(Color.LIGHT_GRAY);
		button6.setForeground(Color.MAGENTA);


		// add the JButtons to the JFrame
		myFrame.add(button1);
		myFrame.add(button2);
		myFrame.add(button3);
		myFrame.add(button4);
		myFrame.add(button5);
		myFrame.add(button6);

		// make the JFrame visible
		myFrame.setVisible(true); 		
	}
}