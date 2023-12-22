
import java.util.Scanner;

public class Main {
	public static long maxSum = Long.MIN_VALUE;
	public static int limit = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		limit = n / 2;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n / 2; i++) {
			select(a, i, 0, 1);
		}
		
		System.out.println(maxSum);
	}
	
	public static void select(int[] a, int i, long sum, int count) {
		if (count >= limit) {
			maxSum = Math.max(maxSum, sum);
			return;
		}
		if (i >= a.length) {
			if (count >= limit) {
				maxSum = Math.max(maxSum, sum);
				return;
			}
			return;
		}
		sum += a[i];
		for (int k = i + 2; k < a.length; k++) {
			select(a, k, sum, count + 1);
		}
	}
}
