import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static long[] h = new long[100010];
	public static long[] dp = new long[100010];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		IntStream.range(0, N).forEach((i) -> h[i] = in.nextLong()); 
		IntStream.range(0, 100010).forEach((i) -> dp[i] = Long.MAX_VALUE);
		
		// solve1(N);
		solve2(N);
	}
	
	private static void solve2(int N) {
		System.out.println(rec(N - 1));
	}
	
	private static long rec(int i) {
		if (dp[i] < Long.MAX_VALUE) return dp[i];
		if (i == 0) return 0;
		
		long cal1 = rec(i - 1) + Math.abs(h[i] - h[i - 1]);
		long cal2 = (i > 1) ? rec(i - 2) + Math.abs(h[i] - h[i - 2]) : Long.MAX_VALUE;
		long res = Math.min(cal1, cal2);
		
		return dp[i] = res;
	}
	
}
