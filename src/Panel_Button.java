import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Button extends JPanel {
	public Panel_Button(){
		init();
	}
	
	private void init(){
		word_list word = new word_list();
		this.setLayout(new GridLayout(10,5));
		Button btn;
		for(int i = 0;i<50;i++){
			btn = new Button(word.char_eng.get(i));
			
			this.add(btn);
			this.setSize(800, 500);
		}
	}
}
