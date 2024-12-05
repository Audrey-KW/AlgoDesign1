/*
 * Written by Audrey Webb
 */
import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    int area;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle [Width=" + width + ", Height=" + height + ", Area=" + area + "]";
    }
}

public class RectangleSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This sets a maximum number of rectangles
        final int max = 100;
        Rectangle[] rectangles = new Rectangle[max];
        int count = 0;

        System.out.println("Welcome to the rectangle sorter!");

        while (true) {
            System.out.print("Enter the width of the rectangle: ");
            int width = scanner.nextInt();

            System.out.print("Enter the height of the rectangle: ");
            int height = scanner.nextInt();

            // Array
            rectangles[count++] = new Rectangle(width, height);

            System.out.print("Press Enter to add another rectangle, or type 'f' to finish: ");
            scanner.nextLine(); 
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("f")) {
                break;
            }

            if (count >= max) {
                System.out.println("Maximum number of rectangles reached.");
                break;
            }
        }

        // This sorts rectangles from smallest to largest
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rectangles[j].area > rectangles[j + 1].area) {
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }

        System.out.println("\nRectangles Sorted by Area (Smallest to Largest):");
        for (int i = 0; i < count; i++) {
            System.out.println(rectangles[i]);
        }

        // This sorts rectangles from largest to smallest
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rectangles[j].area < rectangles[j + 1].area) {
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }

        System.out.println("\nRectangles Sorted by Area (Largest to Smallest):");
        for (int i = 0; i < count; i++) {
            System.out.println(rectangles[i]);
        }
        
        // This calculates the minimum, maximum, and average areas
        int totalArea = 0;
        int minArea = Integer.MAX_VALUE;
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int area = rectangles[i].area;
            totalArea += area;
            if (area < minArea) {
                minArea = area;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }

        double averageArea = (double) totalArea / count;

        // This prints the statistics onto the console
        System.out.println("\nStatistics:");
        System.out.println("Average Area: " + averageArea);
        System.out.println("Minimum Area: " + minArea);
        System.out.println("Maximum Area: " + maxArea);

        scanner.close();
    }
}



