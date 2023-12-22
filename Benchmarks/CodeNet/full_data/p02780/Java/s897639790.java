import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int[] pArray = new int[n];
//			int[] kArray = new int[n];
			
			int kSum = 0;
			int kMax = 0;
			for(int i = 0 ; i < n ; i++ ) {
				pArray[i] = sc.nextInt();
				
				kSum += pArray[i];
				
				if ( i >= k ) {
					kSum -= pArray[i-k];
				}
//				kArray[i] = kSum;
				
				if ( kSum > kMax ) {
					kMax = kSum;
				}
			}
			
			System.out.println( ((double)kMax + (double)k)/2f );
			
		}
	}
}