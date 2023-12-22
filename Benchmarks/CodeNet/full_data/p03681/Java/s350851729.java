import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long mod = 1000000007;

	private long fact(long x) {
		long ans = 1;
		for (long i = 1; i <= x; i++) {
			ans *= i;
			ans %= mod;
		}
		return ans;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.close();

		if (N < M) {
			int tmp = N;
			N = M;
			M = tmp;
		}
		if (N - M > 1) {
			out.println(0);
			return;
		}

		//Nの並べ方*Mの並べ方
		long ans = fact(N) * fact(M);
		ans %= mod;

		if (N == M) { //同数なら猿犬猿犬と犬猿犬猿が可能なので2倍。
			ans *= 2;
			ans %= mod;
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
