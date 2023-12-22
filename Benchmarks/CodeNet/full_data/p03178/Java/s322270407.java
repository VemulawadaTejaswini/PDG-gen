import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();
		int[] K = new int[S.length()];
		for (int i = 0; i < K.length; i++) {
			K[i] = S.charAt(i) - '0';
		}
		int D = sc.nextInt();

		final long MOD = 1000000007;

		sc.close();

		// 上限ぴったり
		long[][] dpj = new long[D][K.length];
		// 上限未満
		long[][] dps = new long[D][K.length];

		// 初期化
		dpj[K[0] % D][0] = 1;

		for (int i = 0; i < K[0]; i++) {
			dps[i % D][0]++;
		}

		// 配るdp
		for (int i = 0; i < K.length - 1; i++) {
			// ぴったりからぴったりへ遷移
			for (int j = 0; j < D; j++) {
				dpj[(j + K[i + 1]) % D][i + 1] += dpj[j][i];
				dpj[(j + K[i + 1]) % D][i + 1] %= MOD;
			}

			// ぴったりから未満へ遷移
			for (int j = 0; j < D; j++) {
				for (int k = 0; k < K[i + 1]; k++) {
					dps[(j + k) % D][i + 1] += dpj[j][i];
					dps[(j + k) % D][i + 1] %= MOD;
				}
			}

			// 未満から未満へ遷移
			for (int j = 0; j < D; j++) {
				for (int k = 0; k <= 9; k++) {
					dps[(j + k) % D][i + 1] += dps[j][i];
					dps[(j + k) % D][i + 1] %= MOD;
				}
			}
		}

		long ans = dps[0][K.length - 1] + dpj[0][K.length - 1] - 1; // 0が含まれているので、1つ引く
		out.println((ans + MOD) % MOD);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
