import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = in.nextLong();
		}
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans = gcd(ans, A[i]);
		}
		System.out.println(ans);
		in.close();
	}

	static long gcd(long x, long y) {
		if (x < y) {
			long tmp = y;
			y = x;
			x = tmp;
		}
		if (y == 0) {
			return x;
		}
		return gcd(x % y, y);
	}
}