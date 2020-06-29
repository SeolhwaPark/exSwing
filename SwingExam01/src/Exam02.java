//독립된 프레임 만들 떄

import javax.swing.*;
class AA extends JFrame{
	AA(){ 
		this.setTitle("두번째 프레임");
		this.setSize(300,300);
		this.setVisible(true);
	}
}

public class Exam02 {
	public static void main(String[] args) {
		new AA();
	}
}
