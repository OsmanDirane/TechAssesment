import java.util.Scanner;


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

	}

	public String toString(){
		return "\nSpeed: " + getSpeed() + "\nDirection: " + getDirection() +"\n" ;
		
	}

}
