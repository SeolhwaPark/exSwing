/*
GUI(Graphic User Interface)
	1.AWT : GUI 라이브러리, 무겁고 메모리많이차지함,중량컴포넌트,OS에 종속적임, 윈도우에서는 빠름
	2.Swing : AWT기반으로 한 순수 자바언어, 가벼움   import javax.swing.*;

	3.FX
	
	
	프레임 - 컨테이너를 싣는 곳, 프레임을 상속받음 extends JFrame
	
	컨테이너 - 컨포넌트를 묶어서 담는 곳
	
	컨포넌트
*/
import javax.swing.*;

public class Exam01 extends JFrame{
	public Exam01() { //셍성자
		setTitle("첫번째 프레임");//타이틀명
		setSize(300,300);//프레임의 전체크기
		setVisible(true);//화면에 보여달라는 요구,화면 창 띄우기같은 거
	}
	
	public static void main(String[] args) {
		new Exam01();
		
	}

}
