/*
 * Written by Audrey Webb
 */
import java.util.Scanner;
//allows java to read input from keyboard
public class Zodiac {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("What is your zodiac sign? Enter your birthday --");
			
			System.out.println("Month followed by day as numbers");
			// what user sees intially, prompt
			
			int month=scan.nextInt();
			
			int day=scan.nextInt();
			// allows user to enter birthday integers
		
			
			
			if ((month == 1 && day >=20 && day <=31) || (month == 2 && day >=1 && day <=19)) //sets all parameters for specific zodiac sign
			{
				System.out.println("Your zodiac sign is Aquarius.");
			}
			else if ((month == 1 && day >=32 || day <=0))
			{
				System.out.println("Invalid day.");
				// invalidates any other day inputs for month (1), repeated for each month below
			}
			else if ((month == 2 && day >=19 && day<=29) || (month == 3 && day >=1 && day <=20))
			{
				System.out.println("Your zodiac sign is Pisces.");
			}
			else if ((month == 2 && day >=30 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 3 && day >=21 && day <=31) || (month == 4 && day >=1 && day <=19))
			{
				System.out.println("Your zodiac sign is Aries.");
			}
			else if ((month == 3 && day >=32 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 4 && day >=20 && day <=30) || (month == 5 && day >=1 && day <=20))
			{
				System.out.println("Your zodiac sign is Taurus.");
			}
			else if ((month == 4 && day >=31 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 5 && day >=21 && day <=31) || (month == 6 && day >=1 && day <=20))
			{
				System.out.println("Your zodiac sign is Gemini.");
			}
			else if ((month == 5 && day >=32 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 6 && day >=21&& day <=30) || (month == 7 && day >=1 && day <=22))
			{
				System.out.println("Your zodiac sign is Cancer.");
			}
			else if ((month == 6 && day >=31 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 7 && day >=23&& day<=31) || (month == 8 && day >=1 && day <=22))
			{
				System.out.println("Your zodiac sign is Leo.");
			}
			else if ((month == 7 && day >=32 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 8 && day >=23 && day <=31) || (month == 9 && day >=1 && day <=22))
			{
				System.out.println("Your zodiac sign is Virgo.");
			}
			else if ((month == 8 && day >=32 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 9 && day >=23 && day <=30) || (month == 10 && day >=1 && day <=22))
			{
				System.out.println("Your zodiac sign is Libra.");
			}
			else if ((month == 9 && day >=31 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 10 && day >=23 && day <=31) || (month == 11 && day >=1 && day <=21))
			{
				System.out.println("Your zodiac sign is Scorpio.");
			}
			else if ((month == 10 && day >=32 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 11 && day >=22 && day <=30) || (month == 12 && day >=1 && day <=21))
			{
				System.out.println("Your zodiac sign is Sagittarius.");
			}
			else if ((month == 11 && day >=31 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month == 12 && day >=22 && day <=31) || (month == 1 && day >=1 && day <=19))
			{
				System.out.println("Your zodiac sign is Capricorn.");
			}
			else if ((month == 12 && day >=32 || day <=0))
			{
				System.out.println("Invalid day.");
			}
			else if ((month >=13 || month <=0))
			{
				System.out.println("Invalid month.");
			}
			// invalidates all other values for month regardless of day input
	
		}	
	
	}
	
}