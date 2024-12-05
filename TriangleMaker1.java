/*
 * Written by Audrey Webb
 */
import java.util.Scanner;
//allows java to read input from keyboard
public class TriangleMaker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Welcome to the triangle maker! Please enter the size of the triangle:");
		//What user sees, prompt
		int rows = k.nextInt();
		//allows user input to be processed into variable "row"
		for (int i = 1; i<=rows; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("* ");
			//Sets middle of triangle, makes first half of triangle increase to middle
			}
			System.out.println();		
		}
			for (int i = rows - 1; i >= 1; i--) {
				for (int j = 1; j<= i; j++) {
					System.out.print("* ");
				//makes second half of triangle decrease from middle
				}
				System.out.println();		}
				//makes all other output invisible
			
			
		}
	}


