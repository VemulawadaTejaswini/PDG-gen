import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private double calc(int n) { // 初期点数がnのとき、Kを超える確率を返す
		if (n >= K)
			return 1.0 / N;
		double x = Math.log((double) K / n) / Math.log(2);
		int p = (int) Math.ceil(x);
		return (1.0 / N) * Math.pow(1.0 / 2, p);
	}

	int N, K;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		K = sc.nextInt();

		double ans = 0;
		for (int i = N; i >= 1; i--) {
			ans += calc(i);
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
