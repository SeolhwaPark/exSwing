/*
	배치관리자 종류 : BorderLayout동서남북형식,FlowLayout왼쪽부터 오른쪽으로, GridLayout기억자로 배치해나감, CardLayout 쌓아올리는방법
	컨테이너 : Window(디폴트배치자 BorderLayout), 
			Frame(디폴트배치자 BorderLayout), 
			Panel(디폴트배치자 FlowLayout), 
			Dialog(디폴트배치자 FlowLayout) // Frame이 많이 쓰임, Dialog 팝업창 자주씀
 */
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class Exam06 extends JFrame{
	public Exam06() {
		setTitle("FlowLayout 테스트");
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); //왼쪽을 기준으로 버튼간의 간격조절 추가가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new JButton("Add"));
		c.add(new JButton("Sub"));
		c.add(new JButton("Multe"));
		c.add(new JButton("Divide"));
		c.add(new JButton("Cal"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam06();
	}
}
