import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

public class Exam09 extends JFrame{
	public Exam09() {
		setTitle("GridLayout");//창의 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫을 수 있게 해줌
		
		GridLayout grid = new GridLayout(3,2);//레이아웃방식과 줄,칸의 수를 생성
		Container c = getContentPane(); //담아야할 컨테이너
		c.setLayout(grid);
		
		c.add(new JLabel("이름")); //속성 담기
		c.add(new JTextField()); //입력란 담기
		c.add(new JLabel("아이디"));
		c.add(new JTextField());
		c.add(new JLabel("비번"));
		c.add(new JTextField());
		
		setSize(300,200); //창의 사이즈
		setVisible(true); //실행가능하게 하는 것
	}
	
	public static void main(String[] args) {
		new Exam09(); //실행
	}

}
