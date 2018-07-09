/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	int hiddenButton;

	
	//1. create an array of JButtons. Don't initialize it yet.
	String question = JOptionPane.showInputDialog("Enter a positive number:");
	int num = Integer.parseInt(question);
	JButton[] button;
	
	
	//2 create an int variable called hiddenButton
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new _02_FindTheHiddenButton().start();
				
			}
		});
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		//3.  Ask the user to enter a positive number and convert it to an int
		button = new JButton[num];
		Random r = new Random();
		hiddenButton = r.nextInt(num);
		System.out.println(hiddenButton);
		for (int i = 0; i < num; i++) {
			button[i] = new JButton();
			button[i].addActionListener(this);
			panel.add(button[i]);
	
		}
		//button[hiddenButton].setText("ME");
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JOptionPane.showMessageDialog(null, "Instructions: You have to click one out of the number of buttons that you chose, and if you click the right one, it displays a message.");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		button[hiddenButton].setText(null);
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		
		//14. Set the text of the JButton located at hiddenButton the read "ME"

		//15. Use Thread.sleep(100); to pause the program.
		//    Surround it with a try/catch
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked.equals(button[hiddenButton])) {
			JOptionPane.showMessageDialog(null, "You Win!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You Lose!");
		}
		//18. else tell them to try again
	}
}
