import javax.swing.*;
import java.awt.*;

class BB { //상속 안받은 상태에서 만들어 보기
	JFrame f; //클래스니까 멤버변수,참조변수
	//String a;//클래스니까 멤버변수,참조변수
	//int bb;//일반변수
	
	BB(){
		f = new JFrame();//생성
		f.setTitle("세번째 프레임");
		f.setSize(300,300);
		f.setVisible(true);
	}
}
public class Exam03 {
	public static void main(String[] args) {
		//int ss;//지역번수
		new BB();
	}

}
