import java.util.Scanner;



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