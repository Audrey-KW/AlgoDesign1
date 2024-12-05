package array;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, -2, 4, 12, 1, 3};
		//int[] array = new int[size];
		
		//find the max value of this array
		//Needs:
		// Some variable to keep track of the current max value
		// loop to look at all of the numbers
		
		int max = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if(max < array[i])
			{
				max = array[i];
			}
	
		}
		
		System.out.println("max");
	}
	

}
