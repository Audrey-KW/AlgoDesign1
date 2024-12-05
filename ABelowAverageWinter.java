
import java.util.Scanner;
public class ABelowAverageWinter {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		//allows user input
		System.out.println("Welcome to the below average temperature tester.");
		System.out.println("Please enter temp for day 1: ");
		int day1 = scanner.nextInt();
		System.out.println("Please enter temp for day 2: ");
		int day2 = scanner.nextInt();
		System.out.println("Please enter temp for day 3: ");
		int day3 = scanner.nextInt();
		System.out.println("Please enter temp for day 4: ");
		int day4 = scanner.nextInt();
		System.out.println("Please enter temp for day 5: ");
		int day5 = scanner.nextInt();
		System.out.println("Please enter temp for day 6: ");
		int day6 = scanner.nextInt();
		System.out.println("Please enter temp for day 7: ");
		int day7 = scanner.nextInt();
		System.out.println("Please enter temp for day 8: ");
		int day8 = scanner.nextInt();
		System.out.println("Please enter temp for day 9: ");
		int day9 = scanner.nextInt();
		System.out.println("Please enter temp for day 10: ");
		int day10 = scanner.nextInt();
		
		int temps[] = {day1, day2, day3, day4, day5, day6, day7, day8, day9, day10};
		//puts the user input of all 10 days into an array
		int sum = 0;
		for (int temp : temps) {
			sum += temp;
		}
		//defines the sum
		double average = (double) sum / temps.length;
		// finds average of the temps
		System.out.println("The average temperature was " + average);
		
		System.out.println("The days that were below average were ");
		for (int i = 0; i < temps.length; i++) {
			if (temps[i] < average) {
				System.out.println("Day " + (i+1) + " with " + temps[i]);
				// day is i+1 since we start counting at 0
			}
		}

	}

		
}


