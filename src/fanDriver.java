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
public class fanDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan();

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Select your option: ");
			System.out.println("----------------------");
			System.out.println("1. Turn Up Speed ");
			System.out.println("2. Reverse Fan Direction");
			int selection = input.nextInt();
			if (selection == 1) {
				fan.speed();
				System.out.println(fan.toString());
			}
			if (selection == 2) {
				fan.reverse();
				System.out.println(fan.toString());
			}
			if (selection >2) {
				break;
			}
		}
	
	}
}