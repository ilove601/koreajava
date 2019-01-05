package dya5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {
		JFrame f;
		JLabel top, count;
		JButton p1,p2,p3;
		JTextField total;
		int sum = 0;
		int combo = 0;
		int potato = 0;
		int bulgogi = 0;
	
			JTextArea list;
		
		public Pizza() {
				
		f = new JFrame();
		f.setSize(350, 200);
		top = new JLabel("<<<<<<<<<<<<<자바 피자에 오신 것을 환영합니다.>>>>>>>>>>>>>");
		count = new JLabel("개수");
		p1 = new JButton("콤보피자");
		p2 = new JButton("포테이토피자");
		p3 = new JButton("불고기피자");
		
		
		
		total = new JTextField(20);
		
		FlowLayout flow = new FlowLayout(); //플로우 부품 복사
		f.setLayout(flow); //플로우 나열
		list = new JTextArea(3, 30);
		
		f.add(top);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(count);
		f.add(total);
		f.add(list);
		
		p1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				combo++;
				
				list.setText("콤보 개수: " + combo + "개\n"
						+"포테이토 개수: " + potato + "개\n"
						+"불고기 개수: " + bulgogi + "개\n"
						);
				
			}
		});
		
		p2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				potato++;
				
				list.setText("콤보 개수: " + combo + "개\n"
						+"포테이토 개수: " + potato + "개\n"
						+"불고기 개수: " + bulgogi + "개\n"
						);
			}
		});
		
		p3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				bulgogi++;
				
				list.setText("콤보 개수: " + combo + "개\n"
						+"포테이토 개수: " + potato + "개\n"
						+"불고기 개수: " + bulgogi + "개\n"
						);
			}
		});
		
		
		
		
		
		
		
		f.setVisible(true);		
		
	}
		
	
	
	
	
	
	public static void main(String[] args) {
		Pizza p = new Pizza(); 

	}

}
