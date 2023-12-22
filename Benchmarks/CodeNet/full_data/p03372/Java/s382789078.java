import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();
		long[] dists = new long[n + 2];
		dists[n + 1] = c;
		int[] values = new int[n + 1];
		long max = 0;
		long cur = 0;
		long[] leftMaxes = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    dists[i] = sc.nextLong();
		    values[i] = sc.nextInt();
		    cur += values[i] + dists[i - 1] - dists[i];
		    max = Math.max(max, cur);
		    leftMaxes[i] = max;
		}
		cur = 0;
		max = 0;
		long[] rightMaxes = new long[n + 1];
		for (int i = n; i >= 1; i--) {
		    cur += values[i] + dists[i] - dists[i + 1];
		    max = Math.max(max, cur);
		    rightMaxes[i] = max;
		}
		max = 0;
		max = Math.max(max, leftMaxes[n]);
		max = Math.max(max, rightMaxes[1]);
		for (int i = 1; i < n; i++) {
		    max = Math.max(max, leftMaxes[i] - dists[i] + rightMaxes[i + 1]);
		}
		for (int i = n; i > 1; i--) {
		    max = Math.max(max, rightMaxes[i] - (c - dists[i]) + leftMaxes[i - 1]);
		}
		System.out.println(max);
    }
}

