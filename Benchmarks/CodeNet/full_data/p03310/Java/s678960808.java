import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int[] a = new int[n];
		long[] sum = new long[n];
		a[0] = sc.nextInt();
		sum[0] = a[0];
		for (int i = 1; i < n; i++) {
			a[i] = sc.nextInt();
			sum[i] = sum[i - 1] + a[i];
		}
 
		long minDiff = Long.MAX_VALUE;
		int sep1 = 0;
		int sep3 = 2;
		for (int sep2 = 1; sep2 <= n - 3; sep2++) {
			long minOfDiff = Long.MAX_VALUE;
			for (int j = sep1; j <= sep2 - 1; j++) {
				long diff = Math.abs((sum[sep2] - sum[j]) - sum[j]);
				if (diff < minOfDiff) {
					minOfDiff = diff;
					sep1 = j;
				} else {
					break;
				}
			}
			minOfDiff = Long.MAX_VALUE;
			for (int j = sep3; j <= n - 2; j++) {
				long diff = Math.abs((sum[n - 1] - sum[j]) - (sum[j] - sum[sep2]));
				if (diff < minOfDiff) {
					minOfDiff = diff;
					sep3 = j;
				} else {
					break;
				}
			}
			long b = sum[sep1];
			long c = sum[sep2] - sum[sep1];
			long d = sum[sep3] - sum[sep2];
			long e = sum[n - 1] - sum[sep3];
			long max = Math.max(Math.max(b, c), Math.max(d, e));
			long min = Math.min(Math.min(b, c), Math.min(d, e));
			minDiff = max - min < minDiff ? max - min : minDiff;
		}
 
		System.out.println(minDiff);
	}
 
}