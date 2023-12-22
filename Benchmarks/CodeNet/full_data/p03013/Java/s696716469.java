import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final long D = 1000000007;
		long result = 1;

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();

		// 壊れ段 スタート直前とゴール直後も登録しておく
		int[] a = new int[M + 2];
		a[0] = -1;
		a[M + 1] = N + 1;

		long[] ptrns = new long[M + 2];
		for ( int i = 1; i <= M; i++ ) {
			a[i] = in.nextInt();
			ptrns[i] = getStepPatterns(a[i] - a[i - 1] - 1);
		}
		ptrns[M + 1] = getStepPatterns(a[M + 1] - a[M] - 1);

		for ( int i = 1; i <= M + 1; i++ ) {
			result = (result * (ptrns[i]) % D) % D;
		}

		System.out.println(result);
		in.close();
	}

	// n段のステップパターンを計算する（nにはスタートとゴールの段を含む）
	private static long getStepPatterns(int ｎ) {
		long D = 1000000007;
		long ptrn = 0;

		if ( ｎ <= 0 ) ptrn = 0;
		else if ( ｎ == 1 || ｎ == 2 ) ptrn = 1;
		else
		// (p+2)段目のパターン = (p+1)段目のパターン + p段目のパターン
		if ( 3 <= ｎ ) {
			long p0, p1, p2;
			p0 = p1 = p2 = 1;

			for ( int i = 2; i < ｎ; i++ ) {
				p2 = (p1 + p0) % D;
				p0 = p1;
				p1 = p2;
			}
			ptrn = p2;
		}
		return ptrn;
	}
}
