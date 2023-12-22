import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = sc.nextInt();
		    arr[i] += arr[i -1];
		}
		int left = 2;
		int right = 4;
		long min = Long.MAX_VALUE;
		for (int center = 3; center <= n - 1; center++) {
		    while (left < center && Math.abs(arr[center - 1] - 2 * arr[left - 1]) > Math.abs(arr[center - 1] - 2 * arr[left])) {
		        left++;
		    } 
		    while (center >= right) {
		        right++;
		    }
		    while (right < n && Math.abs(arr[n] - 2 * arr[right - 1] + arr[center - 1]) > Math.abs(arr[n] - 2 * arr[right] + arr[center - 1])) {
		        right++;
		    }
		    min = Math.min(min, getMax(arr[left - 1], arr[center - 1] - arr[left - 1], arr[right- 1] - arr[center - 1], arr[n] - arr[right - 1]));
		}
		System.out.println(min);
	}
	
	static long getMax(long a, long b, long c, long d) {
	    return Math.max(Math.max(a, b), Math.max(c, d)) - Math.min(Math.min(a, b), Math.min(c, d));
	}
}
