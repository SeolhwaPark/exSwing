/*
	BorderLayout
		동:BorderLayout.EAST
		서:BorderLayout.WEST
		남:BorderLayout.SOUTH
		북:BorderLayout.NORTH
		중앙::BorderLayout.CENTER
 */
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam07 extends JFrame{
	public Exam07() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(30,20));//간격넣어줌
		//c.setLayout(new BorderLayout());//간격없음
		//new BorderLayout(hGap,vGap);//간격넣어줌
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		c.add(new JButton("Add"),BorderLayout.NORTH);
		c.add(new JButton("Sub"),BorderLayout.SOUTH);
		c.add(new JButton("Mul"),BorderLayout.EAST);
		c.add(new JButton("Div"),BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam07();
	}

}
