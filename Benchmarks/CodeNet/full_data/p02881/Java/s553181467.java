import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();
			//もっとも数字の近い2つの数の積に分割する

			long result = calcFactor(n);
			
			System.out.println(result);
		}
	}
	
	public static long calcFactor(long n) {
		
		long currentStep = Long.MAX_VALUE;
		
		for(long i = 1 ; i < Math.pow(n, 0.5) + 2 ; i++ ) {
			
			if ( n % i == 0 ) {
				//this is factor
				long j = n / i;
				if ( i + j - 2 < currentStep ) {
					currentStep = i + j - 2;
				}
			}
		}
		
		return currentStep;
	}
}
