import java.util.Scanner;
import java.util.Arrays;

class atCoder_110 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		int numC = scanner.nextInt();
		
		
		if (0 <= numA && numA <= 9 && 0 <= numB && numB <= 9 && 0 <= numC && numC <= 9) {
			int[] intArray = {numA, numB, numC};
			Arrays.sort(intArray);
			//System.out.println(Arrays.toString(intArray));
			
			int sum = intArray[2] * 10 + intArray[1] + intArray[0];
			System.out.println(sum);
		}
	}
}