import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		double v[] = new double[N];

		for (int i = 0; i < N; i++) {
			v[i] = sc.nextLong();
		}

		Arrays.sort(v);

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
		int same = 1; // 自分自身
		for (int i = 0; i < A - 1; i++) {
			if (v[N - A] == v[N - A + 1 + i]) {
				same += 1;
			} else {
				break;
			}
		}
		int bunboa = same;
		// A以下の中にAと同値がいくつあるか
		for (int i = 0; i < N - A; i++) {
			if (v[N - A] == v[N - A - i - 1]) {
				same += 1;
			} else {
				break;
			}
		}
		int bunshia = same;
		long comba = pascal[bunshia][bunboa];

		// A個以上の場合
		long combb = 0;
		long sumcombb = 0;
		int bunbob = 0;
		int bunshib = 0;
		if (B > A) {
			for (int i = 0; i < B - 1; i++) {
				if (v[N - A - 1 - i] == v[N - 1]) {
					bunbob = A + 1 + i;
					bunshib = bunbob;
					for (int j = 0; j < B - 2 - i; j++) {
						if (v[N - A - 1 - i - j - 1] == v[N - 1]) {
							bunshib += 1;
						}
					}
					combb = pascal[bunshib][bunbob];
					sumcombb += combb;
				} else {
					break;
				}
			}
		}

		long sumcombab = comba + sumcombb;
		// 出力
		System.out.println(ansave);
		System.out.println(sumcombab);
	}

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
