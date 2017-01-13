import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Button extends JButton {
	character word;
	public Button(character word){
		this.word = word;
		init();
	}

	public void init(){
		this.setText(word.pronounce);
		this.addActionListener(new ActionListener() {
			  @Override
				public void actionPerformed(ActionEvent e) {
					  checkAnswer();
				  }
				});
	}

	private void checkAnswer(){
		if(word.pronounce==Japanese_Learner.cur.pronounce)
//			System.out.println("Correct!");
			JOptionPane.showMessageDialog(null, "Correct!");
		else
//			System.out.println("Incorrect! "+ Japanese_Learner.cur.writing +" is "+Japanese_Learner.cur.pronounce);
			JOptionPane.showMessageDialog(null, "Incorrect! "+ Japanese_Learner.cur.writing +" is "+Japanese_Learner.cur.pronounce);
		Panel_Display.next();
	}

}
