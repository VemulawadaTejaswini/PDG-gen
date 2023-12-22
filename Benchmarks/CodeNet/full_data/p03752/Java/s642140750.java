import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long first = sc.nextInt();
		long[] arr = new long[n - 1];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long cost = 0;
		for (int i = 1; i < k; i++) {
			long x = arr[n - 1 - k + i];
			cost += Math.max(first + i - x, 0);
		}
		System.out.println(cost);
	}
}
