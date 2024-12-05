/*
 * Written by Audrey Webb
 */
import java.util.Scanner;
public class MatrixAdder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//allows user to input variables
		
		System.out.println("Please enter the number of rows and columns in the first matrix: ");
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		
		int[][] matrix1 = new int[rows][columns];
		//creates array for first matrix
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Please enter value at index " + i + " " + j + ": ");
				matrix1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Please enter the number of rows and columns in the second matrix: ");
		int rows2 = scanner.nextInt();
		int columns2 = scanner.nextInt();
		
		if (rows != rows2 || columns != columns2) {
			System.out.println("Matrices must have the same dimensions");
			return;
		}
		int[][] matrix2 = new int[rows][columns];
		//creates array for second matrix
		
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				System.out.println("Please enter value at index " + i + " " + j + ": ");
				matrix2[i][j] = scanner.nextInt();
			}
		}
	

		int[][]sum = new int[rows][columns];
		//array for sum
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				//calculation for sum
			}
		}
		printMatrix(matrix1, rows, columns);
		System.out.println("+");
		printMatrix(matrix2, rows2, columns2);
		System.out.println("=");
		printMatrix(sum, rows, columns);
		// prints the full equation
		scanner.close();
}

	private static void printMatrix(int[][] matrix, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	}
