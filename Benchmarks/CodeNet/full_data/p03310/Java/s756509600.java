import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] sums = new long[n];
		long prev = 0;
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			sums[i] = a + prev;
			prev = sums[i];
		}
		long min = Long.MAX_VALUE;
		int idx1 = 0;
		int idx3 = 2;
		for (int idx2 = 1; idx2 < n - 1; idx2++) {
			while (sums[idx1] < sums[idx2] - sums[idx1] && idx2 - idx1 > 1) {
				if (Math.abs(sums[idx1] - (sums[idx2] - sums[idx1])) < Math.abs(sums[idx1 + 1] - (sums[idx2] - sums[idx1 + 1]))) {
					break;
				}
				idx1++;
			}
			if (idx2 >= idx3) {
				idx3 = idx2 + 1;
			}
			while (sums[idx3] - sums[idx2] < sums[n - 1] - sums[idx3] && n - idx3 > 2) {
				if (Math.abs((sums[idx3] - sums[idx2]) - (sums[n - 1] - sums[idx3])) < Math.abs((sums[idx3 + 1] - sums[idx2]) - (sums[n - 1] - sums[idx3 + 1]))) {
					break;
				}
				idx3++;
			}
			long ans = getAns(sums[idx1], sums[idx2], sums[idx3], sums[n - 1]);
			min = Math.min(min, ans);
		}
		System.out.println(min);
	}
	
	static long getAns(long a, long b, long c, long d) {
		return Math.max(Math.max(a, b - a), Math.max(c - b, d - c)) - Math.min(Math.min(a, b - a), Math.min(c - b, d - c));
	}
}
