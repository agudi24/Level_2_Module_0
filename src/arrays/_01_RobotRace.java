package arrays;

import java.awt.AWTException;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) throws AWTException {

		// 2. create an array of 5 robots.
		Robot[] robo = new Robot[5];
		int i = 0;
		int y = 550;
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
		
		while(y > 0) {
				Random r = new Random();
				int moveNum = r.nextInt(50);
				robo[i].move(moveNum);
				y-=moveNum;

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

	

