import java.util.Scanner;

/**Filename: 
 * Author: Osman Dirane, 040976403
 * Course: CST8284 - OOP
 * Lab Section: 302
 * Assignment: TODO [number]
 * Date: TODO [the date of the final version]
 * Lab Professor: Sandra Iroakazi
 * Purpose: TODO [Brief description of the contents]
 * Class List: TODO [only if there is more than one class in the file]
 * 
 */

/**
 * TODO [Brief Description of purpose of class]
 * 
 * @author Osman Dirane
 * @version 1.0
 * @see TODO [package or class name used in class]
 * @since JDK 14
 */
public class Fan {
	public static final int powerOff = 0;

	private int speed = powerOff;

	public String direction = "FORWARD";

	public String getDirection() {
		return direction;
	
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	public void speed() {
		if (speed >= 3) {
			speed = powerOff;
		} else {
			speed++;
			
		}
	}
	
	public void reverse() {
		if (direction == "FORWARD") {
			direction = "BACKWARD";
		}else {
			direction = "FORWARD";
		}
		System.out.println(direction);
	}

	public String toString(){
		return "\nSpeed: " + getSpeed() + "\nDirection: " + getDirection() +"\n" ;
		
	}

}