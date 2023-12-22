import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		long[] a = new long[n];
		
		for(int i=0;i<n;i++) {
			a[i] = in.nextLong() - 1 - i;
		}
		
		Arrays.sort(a);
		
		int half = n/2;
		long b = a[half];
		
		long sum1 = 0;
		long sum2 = 0;
		
		for(int i=0;i<half;i++) {
			sum1 = sum1 + a[i];
		}
		for(int i=half;i<n;i++) {
			sum2 = sum2 + a[i];
		}
		
		long sumB = (half - n + half )* b;
		
		System.out.println(sum2 - sum1 + sumB);

	}

}