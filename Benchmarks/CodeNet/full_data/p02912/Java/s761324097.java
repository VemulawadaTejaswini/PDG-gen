import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextInt();
		long A[] = new long[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		while ( m-- > 0) {
			A[n-1] = (int) (A[n-1] / (Math.pow(2, 1)));
			Arrays.sort(A);
		}
		long sum = 0;
		for (int i = n - 1; i >= 0 ; i--)
			sum += A[i];
		
		System.out.println(sum);
	}
}