import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot r2d2 = new Robot();
		//2. Set the speed to 100
r2d2.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a Color", "Evil Polygons", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 2) {
			r2d2.setPenColor(Color.blue);
		}
		else if (colorChoice ==1) {
			r2d2.setPenColor(Color.green);
		}
		else {
			r2d2.setPenColor(Color.red);
		}
		
		//4. Ask the use how many polygons they want to be drawn.
		String poly = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		//5. Use the robot to draw the number of polygons the user requested.
		int x = Integer.parseInt(poly);
		for (int y = 0; y < x; y++) {
			r2d2.move(30);
			r2d2.turn(360/5);
			
				
			}
	
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}


