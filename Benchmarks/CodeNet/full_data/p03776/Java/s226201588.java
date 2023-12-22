import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		double v[] = new double[N];
		for (int i = 0; i < N; i++) {
			v[i] = sc.nextLong();
		}
		Arrays.sort(v);

		// パスカル三角形の準備
		long pascal[][] = Pascal(N);

		// A個の際の平均値の計算
		double suma = 0;
		for (int i = 0; i < A; i++) {
			suma = suma + v[N - 1 - i];
		}
		double avea = (double) suma / A;
		String ansave = String.format("%.6f", avea);

		// A個の場合の組み合わせ
		// A以上の中にAと同値がいくつあるか
		int samea = 1; // 自分自身
		for (int i = 0; i < A - 1; i++) {
			if (v[N - A] == v[N - A + 1 + i]) {
				samea += 1;
			} else {
				break;
			}
		}
		int bunboa = samea;
		// A以下の中にAと同値がいくつあるか
		for (int i = 0; i < N - A; i++) {
			if (v[N - A] == v[N - A - i - 1]) {
				samea += 1;
			} else {
				break;
			}
		}
		int bunshia = samea;
		long comba = pascal[bunshia][bunboa]; // bunshia C bunboa の計算

		// A個以上の場合
		int sameb = 0;
		long combb = 0;
		long sumcombb = 0;
		if (B > A) {
			// 最大値と同値がいくつあるか
			for (int i = 0; i < N; i++) {
				if (v[N - 1 - i] == v[N - 1]) {
					sameb += 1;
				}
			}
			// A+1〜Bについてそれぞれの組み合わせ数を累計
			for (int i = 0; i < B - A; i++) {
				combb = pascal[sameb][A + 1 + i];
				sumcombb += combb;
			}
		}

		long sumcombab = comba + sumcombb;
		// 出力
		System.out.println(ansave);
		System.out.println(sumcombab);
	}

	// パスカル三角形導出メソッド
	public static long[][] Pascal(int max) {
		long pascal[][] = new long[max + 1][max + 1];
		pascal[0][0] = 1;
		for (int i = 0; i < max + 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (i == 0 && j == 0) {
					continue;
				} else if (j == 0) {
					pascal[i][j] = pascal[i - 1][j];
				} else if (j == i) {
					pascal[i][j] = pascal[i - 1][j - 1];
				} else {
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
				}
			}
		}
		return pascal;
	}
}
