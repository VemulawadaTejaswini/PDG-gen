import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[3*n];
		for (int i = 0; i < 3*n; i++) a[i] = Long.parseLong(sc.next());
		long max = Long.MIN_VALUE;
		long[] sum1 = new long[n+1], sum2 = new long[n+1];

		PriorityQueue<Long> que = new PriorityQueue<Long>();
		for (int i = 0; i < n; i++) {
			que.add(a[i]);
			sum1[0] += a[i];
		}
		for (int k = 1; k <= n; k++) {
			que.add(a[n-1+k]);
			sum1[k] = sum1[k-1]-que.poll()+a[n-1+k];
		}
		que = new PriorityQueue<Long>();
		for (int i = 3*n-1; i > 2*n-1; i--) {
			que.add(-a[i]);
			sum2[n] += a[i];
		}
		for (int k = n-1; k >= 0; k--) {
			que.add(-a[n+k]);
			sum2[k] = sum2[k+1]+que.poll()+a[n+k];
		}
		for (int k = 0; k <= n; k++) max = Math.max(max,sum1[k]-sum2[k]);
		System.out.println(max);
		sc.close();
	}
}