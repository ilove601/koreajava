package dya5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myage {
	//static 쓰기 싫어서 따로 최 상위 단계에서 따로 정의해준다.
	JFrame f; //'나 f 쓸거야'라고 "선언"하는것 (사용할 수 있는 범위)
	JLabel top, name, year, age, result ;
	JButton  confirm;
	JTextField n, y, a;
	
	public Myage() {
		
		//필요한 부품 복사해오기 싹 다 /////////////////
			f = new JFrame();
			f.setSize(300, 200);
			
			
			top = new JLabel("<<<<<<<<<성인인증 프로그램입니다.>>>>>>>>>");
			name = new JLabel("이름");
			year = new JLabel("생년");
			age = new JLabel("나이");
			result = new JLabel();
			confirm = new JButton("인증");
			n = new JTextField(20);
			y= new JTextField(20);
			a = new JTextField(20);
		///////////////////////////////////////	
		
			// 이제 물 흐르듯이 나열만 해주자 //
		FlowLayout flow = new FlowLayout(); //플로우 부품 복사
		f.setLayout(flow); //플로우 나열
		
		f.add(top);
		f.add(name);
		f.add(n);
		f.add(year);
		f.add(y);
		f.add(age);
		f.add(a);
		f.add(confirm);
		f.add(result);
		
		top.setForeground(Color.red); //레이블은 백그라운드가 따로 없으니까, 정의해 줄 필요가 없다

		result.setForeground(Color.blue);
		result.setBackground(Color.blue);
		confirm.setBackground(Color.blue);
		confirm.setForeground(Color.yellow);
		result.setBackground(Color.blue);
		a.setBackground(Color.lightGray);
		
		//이벤트 처리하는 방법을 add 해주자 이벤트 처리하는건 무조건 애드액션리스너
		confirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//"이름"님 띄워주기
				String name = n.getText();  //가져오기, 가져오는 것이니까 name의 특성을 적어주어야한다.
				
				String year = y.getText(); //계산을해야하는데 텍스트로 가져왔어 그래서 전환필요
				int yearInt = Integer.parseInt(year); //입력값을 분석해서 int값으로 전환해주는거여
				
				int age = 2019 - yearInt +1;
				a.setText(age+""); //Text를 불러와야하는데 age는 int로 전환되었으므로, 뒤에 ""붙여서 txt화 시키기
				
				if (age>=19) {
					result.setText(name + "님은 성인"); //띄워주기
					
				} else {
					result.setText(name + "님은 미성년자"); //띄워주기
				}
				
				
				
				
				

				
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Myage age = new Myage();
		

	}

}
