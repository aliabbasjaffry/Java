
import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 4, 9};
				
		int[] myArr = createArr(4);
		//double average = calcAvg(myArr);
		System.out.println(Arrays.toString(myArr));
	}
	
	public static int[] createArr(int arrSize) {
		int[] arr = new int[arrSize];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < arrSize; i++) {
			System.out.print("Enter number: ");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static double calcAvg(int[] numArray) {
		int sum = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			sum += numArray[i];
		}
		
		return (double) sum / numArray.length;
	}
}

