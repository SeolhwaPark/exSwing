package componet;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exam04 {
	JFrame frm;
	JLabel lab1, lab2, lab3, lab4;
	JTextField tx1, tx2, tx3;
	JButton btn1, btn2;
	JPanel panel1, panel2,panel3,panel4,panel5;
	
	public Exam04() {
		frm = new JFrame("로그인폼 만들기");
		lab1 = new JLabel("로그인 폼",JLabel.CENTER);
		frm.add(BorderLayout.NORTH, lab1);
		
		//이름
		lab2 = new JLabel("이 름:");
		tx1 = new JTextField("이름 입력");
		panel1 = new JPanel();
		panel1.add(lab2);
		panel1.add(tx1);
		
		//아이디
		lab3 = new JLabel("아이디:");
		tx2 = new JTextField("아이디 입력");
		panel2 = new JPanel();
		panel2.add(lab3);
		panel2.add(tx2);
		
		//비밀번호
		lab4 = new JLabel("비 번:");
		tx3= new JTextField("비번 입력");
		panel3 = new JPanel();
		panel3.add(lab4);
		panel3.add(tx3);
		
		panel4 = new JPanel();
		panel4.setLayout(new GridLayout(3,1));//3줄의 1칸짜리로 묶어서 부착시킴
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
//		frm.add(BorderLayout.CENTER,panel1);
//		frm.add(BorderLayout.CENTER,panel2);
//		frm.add(BorderLayout.CENTER,panel3);
		frm.add(BorderLayout.CENTER,panel4);
		
		btn1 = new JButton("등록");
		btn2 = new JButton("취소");
		panel5 = new JPanel();
		panel5.add(btn1);
		panel5.add(btn2);
		frm.add(BorderLayout.SOUTH,panel5);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(200,200);
		frm.setVisible(true);
	}
	
	//메소드 정의
	
	public static void main(String[] args) {
		new Exam04();
	}
}
