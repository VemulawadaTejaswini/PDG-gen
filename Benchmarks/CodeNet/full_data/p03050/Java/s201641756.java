
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final long N = in.nextInt();
		System.out.println(solve(N));
	}

	public static long solve(long N) {
		long ans = 0;
		for (long x = 1; ; ++x) {
			if (N % x != 0)
				continue;
			final long m = N / x - 1;
			if (m <= x)
				break;
			ans += m;
		}
		return ans;
	}
}
