import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel_Display extends JPanel{
	static JButton btn = new JButton();
	static String type = JOptionPane.showInputDialog("TYPE");
	public Panel_Display(){
		btn.disable();
		btn.setSize(200,300);
		btn.setFont(btn.getFont().deriveFont((float)60));
		this.add(btn);
		this.setSize(200,500);
		this.setLayout(new FlowLayout());
		System.out.println(""+type);
		next();
	}
	
	public static void next(){
		Random rand = new Random();
		int num = rand.nextInt(50);
		Japanese_Learner.cur = type.equals("1") ? nextKata(num) : nextHira(num);
//		Japanese_Learner.cur = nextKata(num);
		btn.setText(Japanese_Learner.cur.writing);
	}
	
	private static character nextKata(int num){
		return word_list.char_kata.get(num);
	}
	
	private static character nextHira(int num){
		return word_list.char_hira.get(num);
	}
}
