import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long sum = 0;
		for ( int i = 0 ; i < N ; i++ ) {
			A[i] = sc.nextLong();
			sum += A[i];
		}
		sc.close();

		long minD = sum;
		long curSum = 0;
		for ( int i = 0 ; i < N ; i++ ) {
			curSum += A[i];
			if ( Math.abs(sum - curSum * 2) < minD ) {
				minD = Math.abs(sum - curSum * 2);
			}
		}
		
		System.out.println(minD);
	}
}
