import javax.swing.*;
import java.awt.*;

public class Exam05 extends JFrame{
	public Exam05() {
		setTitle("컴포넌트 배치 테스트");
		
		Container ff = getContentPane();//배에 싣는 부분
		ff.setBackground(Color.orange);
		ff.setLayout(new FlowLayout());
		ff.add(new JButton("OK"));
		ff.add(new JButton("Cancle"));
		ff.add(new JButton("Ignore"));
		
		/*색상 안먹음
		setBackground(Color.orange);
		
		setLayout(new FlowLayout());//무조건 왼쪽에서 오른쪽으로 가게 함. 오른쪽에 갈곳없으면 아래로 내려감
		add(new JButton("OK"));
		add(new JButton("Cancle"));
		add(new JButton("Ignore"));
		 */
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam05();
	}
}
