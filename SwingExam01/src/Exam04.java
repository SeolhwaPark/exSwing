import java.awt.Container;

import javax.swing.*;
import java.awt.*;
public class Exam04 extends JFrame{
	public Exam04() {
		setTitle("프레임에 컨포넌트 부착하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창끄게하는 애. swing에서는 굳이 필요없지만 awt에서는 필수
		//(부착할 화면범위를 알아내기)컴포넌트팬 알아내기
		
		Container contentPane = getContentPane(); //컨테이너 싣고 갈 배 이름
		Button btn = new Button("Submit");//컴포넌트의 크기는 임의대로 사이즈를 변경할 수 없다
		JButton jbtn = new JButton("등록");
		
		contentPane.add(btn); //배에 실었당
		//contentPane.add(jbtn); //배에 실었당
		contentPane.add(BorderLayout.NORTH,jbtn); //BorderLayout.NORTH = 북쪽애 배치하는 방법
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam04();
		
	}
}
