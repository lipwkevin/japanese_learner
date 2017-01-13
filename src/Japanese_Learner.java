import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Japanese_Learner extends JFrame{
	static character cur;
	static int questionNum= 0;
	
	public Japanese_Learner(){
		Panel_Button panel_button = new Panel_Button();
		Panel_Display panel_display = new Panel_Display();
		this.getContentPane().add(panel_display);
		this.getContentPane().add(panel_button);
		panel_button.setAlignmentX(this.CENTER_ALIGNMENT);
		panel_display.setAlignmentX(this.CENTER_ALIGNMENT);
		this.setVisible(true);
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	}
	
	public static void main(String [] args){
		new Japanese_Learner();
	}
}
