import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long f(long a) {
		long ans = 0;
		if (a <= 0)
			return 0;

		// 0～aの個数は a+1
		long n = a + 1;

		//桁ごとに1の個数をしらべる
		for (int i = 0; i < 50; i++) {

			// i桁目の周期
			long period = 1L << (i + 1);

			// 1周期に含まれる１（または０）の数
			long numInPeriod = period / 2;

			// nまでに何周期含まれるか
			long numOfPeriod = n / period;

			// 周期に含まれない部分の個数。
			long amari = n % period;

			// 周期の前半は0、後半は1なので、amariから周期の長さの半分を引いたものが1の個数。
			// ただし、0以下になる場合があるので、その場合は0とする。
			long amari1 = Math.max(amari - period / 2, 0);

			long cnt = numInPeriod * numOfPeriod + amari1;

			if (cnt % 2 == 1) {
				ans += 1L << i;
			}
		}
		return ans;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long ans = f(b) ^ f(a - 1);

		out.println(ans);
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
