/*
 * Written by Audrey Webb
 */
import java.util.Scanner;

public class DateAndTimeTester {

    // This method allows and processes user input
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter your date and time in the format MM/DD hh:mm: ");
            input = scanner.nextLine().trim();

            if (isValid(input)) {
                System.out.println("Valid date and time!");
            } else {
                System.out.println("Invalid date and time!");
            }

            System.out.print("Press 'Enter' to keep going or type 'done' to exit: ");
            input = scanner.nextLine().trim();
        } while (!input.equalsIgnoreCase("done"));

        System.out.println("Program complete!");
        scanner.close();
    }

    // This method checks for valid "MM/DD hh:mm" format
    public boolean isValid(String dateTimeStr) {
        int spaceIndex = dateTimeStr.indexOf(' ');

        if (spaceIndex == -1) {
            return false; 
        }

        String datePart = dateTimeStr.substring(0, spaceIndex);
        String timePart = dateTimeStr.substring(spaceIndex + 1);

        return isValidDate(datePart) && isValidTime(timePart);
    }

    // This method checks for valid month and day values
    public boolean isValidDate(String dateStr) {
        int month = getMonth(dateStr);
        int day = getDay(dateStr);

        if (month == -1 || day == -1) {
            return false;
        }

      
        if (month < 1 || month > 12) {
            return false; 
        }

        if (day < 1 || (month == 2 && day > 28) || (isThirtyDayMonth(month) && day > 30) || day > 31) {
            return false; 
        }

        return true;
    }

    // This method checks for valid hour and minute values
    public boolean isValidTime(String timeStr) {
        int hour = getHour(timeStr);
        int minute = getMinute(timeStr);

        if (hour == -1 || minute == -1) {
            return false; 
        }

     
        if (hour < 1 || hour > 12) {
            return false; 
        }

        if (minute < 0 || minute > 59) {
            return false; 
        }

        return true;
    }


    public int getMonth(String dateStr) {
        int slashIndex = dateStr.indexOf('/');
        if (slashIndex == -1) {
            return -1; 
        }
        try {
            return Integer.parseInt(dateStr.substring(0, slashIndex).trim());
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

   
    public int getDay(String dateStr) {
        int slashIndex = dateStr.indexOf('/');
        if (slashIndex == -1 || slashIndex == dateStr.length() - 1) {
            return -1; 
        }
        try {
            return Integer.parseInt(dateStr.substring(slashIndex + 1).trim());
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

 
    public int getHour(String timeStr) {
        int colonIndex = timeStr.indexOf(':');
        if (colonIndex == -1) {
            return -1; 
        }
        try {
            return Integer.parseInt(timeStr.substring(0, colonIndex).trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    public int getMinute(String timeStr) {
        int colonIndex = timeStr.indexOf(':');
        if (colonIndex == -1 || colonIndex == timeStr.length() - 1) {
            return -1; 
        }
        try {
            return Integer.parseInt(timeStr.substring(colonIndex + 1).trim());
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    // checks if the month has 30 days
    public boolean isThirtyDayMonth(int month) {
        
        return month == 4 || month == 6 || month == 9 || month == 11;
    }
}
