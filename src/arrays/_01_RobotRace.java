package arrays;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) throws AWTException {

		// 2. create an array of 5 robots.
		Robot[] robo = new Robot[5];
		int i = 0;
		int y = 550;
		int y2 = 550;
		int y3 = 550;
		int y4 = 550;
		int y5 = 550;
		Random r = new Random();
		int moveNum = r.nextInt(50);
		int moveNum2 = r.nextInt(50);
		int moveNum3 = r.nextInt(50);
		int moveNum4 = r.nextInt(50);
		int moveNum5 = r.nextInt(50);
		// 3. use a for loop to initialize the robots.
		
			
		
		for (i = 0; i < robo.length; i++) {
			robo[i] = new Robot();
			robo[i].setSpeed(10);
			robo[i].setX(200);
			robo[i].setY(y);
			robo[i].turn(90);
			robo[i].move(100 * i);
			robo[i].turn(-90);
			
		}
		
		while(y > 0 && y2 > 0 && y3 > 0 && y4 > 0 && y5 > 0) {
				robo[0].move(moveNum);
				robo[1].move(moveNum2);
				robo[2].move(moveNum3);
				robo[3].move(moveNum4);
				robo[4].move(moveNum5);
				y-=moveNum;
				y2-=moveNum2;
				y3-=moveNum3;
				y4-=moveNum4;
				y5-=moveNum5;

		}
		System.out.println("Robot #1:" + moveNum);
		System.out.println("Robot #2:" + moveNum2);
		System.out.println("Robot #3:" + moveNum3);
		System.out.println("Robot #4:" + moveNum4);
		System.out.println("Robot #5:" + moveNum5);
		
		if(y < 0 && y2 > 0 && y3 > 0 && y4 > 0 && y5 > 0 ) {
			JOptionPane.showMessageDialog(null, "Robot #1 Wins!");
			robo[0].setX(300);
			robo[0].setY(300);
			for (int j = 0; j < 1;) {
				robo[0].turn(360);
			}
			
		}
		if(y > 0 && y2 < 0 && y3 > 0 && y4 > 0 && y5 > 0 ) {
			JOptionPane.showMessageDialog(null, "Robot #2 Wins!");
			robo[1].setX(300);
			robo[1].setY(300);
			for (int j = 0; j < 1;) {
				robo[1].turn(360);
			}
			
		}
		if(y > 0 && y2 > 0 && y3 < 0 && y4 > 0 && y5 > 0 ) {
			JOptionPane.showMessageDialog(null, "Robot #3 Wins!");
			robo[2].setX(300);
			robo[2].setY(300);
			for (int j = 0; j < 1;) {
				robo[2].turn(360);
			}
			
		}
		if(y > 0 && y2 > 0 && y3 > 0 && y4 < 0 && y5 > 0 ) {
			JOptionPane.showMessageDialog(null, "Robot #4 Wins!");
			robo[3].setX(300);
			robo[3].setY(300);
			for (int j = 0; j < 1;) {
				robo[3].turn(360);
			}
			
		}
		if(y > 0 && y2 > 0 && y3 > 0 && y4 > 0 && y5 < 0 ) {
			JOptionPane.showMessageDialog(null, "Robot #5 Wins!");
			robo[4].setX(300);
			robo[4].setY(300);
			for (int j = 0; j < 1;) {
				robo[4].turn(360);
			}
			
		}
	}
			

			// 4. make each robot start at the bottom of the screen, side by side, facing up

			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.

			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.

			// 7. declare that robot the winner and throw it a party!

			// 8. try different races with different amounts of robots.

			// 9. make the robots race around a circular track.
		}

	

