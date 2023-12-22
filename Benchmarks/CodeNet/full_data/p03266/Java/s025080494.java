import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int ans = 0;
		for (int a = 1; a <= N; a++) {
			for (int b = 1; b <= N; b++) {
				if ((a + b) % K != 0) {
					continue;
				}
				if (a % K != b % K) {
					continue;
				}

				int ck = K - (a % K);
				//1～Nで mod Kがckのものの数
				int x = N / K; //1～Nに、Kが何周期あるか。
				//周期に含まれない部分（最後の部分）に、mod Kがckのものが含まれるなら+1する
				if (N % K <= ck) {
					x++;
				}
				ans += (x);

			}
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
