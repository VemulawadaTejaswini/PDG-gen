import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int arraySize = scan.nextInt();

		int inputArray[] = new int[arraySize+1];
		
		for(int i =1;i<=arraySize;i++) {
			inputArray[i] = scan.nextInt();
		}
		System.out.println(findMinCost(inputArray));
	}
	
	public static int findMinCost(int[]inputArray) {
		int size = inputArray.length;
		int dp[] = new int[size];
		dp[1] = 0; //if frog is at index 0th stone
		for(int i = 2;i<size;i++) {
			int option1 = Math.abs(inputArray[i]-inputArray[i-1])+dp[i-1];
			int option2 = (i==2) ? Integer.MAX_VALUE : Math.abs(inputArray[i]-inputArray[i-2])+dp[i-2];
			dp[i] = Math.min(option1,option2); 
		}
//		for(int i =0;i<size;i++) {
//			System.out.print(dp[i]+"  ");
//		}
		return dp[size-1];
	}
	
}