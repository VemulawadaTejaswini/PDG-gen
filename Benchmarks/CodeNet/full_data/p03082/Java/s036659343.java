import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n = 0;
	static int[] s;
	static int min = Integer.MAX_VALUE;
	static long[] p = new long[201];
	static int[][] memoX = new int[100001][201];
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int x = sc.nextInt();
		s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			min = Math.min(min, s[i]);
		}
		sc.close();

		p[0] = 1L;
		for (int i = 1; i <= n; i++) {
			p[i] = p[i - 1] * i % 1000000007;
		}
		Arrays.parallelSort(s);

		for (int i = 0; i < memoX.length; i++) {
			memoX[i][n] = i;
		}

		int result = calc(x, 0);
//		for (int i = 0; i <= x; i++) {
//			for (int j = 0; j <= n; j++) {
//				System.out.print(memoX[i][j] + "\t");
//			}
//			System.out.println();
//		}
		System.out.println(result);
	}

	static int calc(int x, int cnt) {
		if (x == 0) {
			return 0;
		}
		if (memoX[x][cnt] > 0) {
			return memoX[x][cnt];
		}

		long sum = 0L;
		int idx = Arrays.binarySearch(s, x);
		if (idx < 0) idx = ~idx;
		if (idx == 0) {
			sum = x % s[0] * p[n - cnt] % 1000000007;
			memoX[x][cnt] = (int) sum;
			return memoX[x][cnt];
		}

		for (int i = 0; i < n - cnt; i++) {
			int nextX = x % s[i];
			sum += calc(nextX, cnt + 1);
			sum %= 1000000007;
		}
		sum = sum * p[cnt] % 1000000007;
		memoX[x][cnt] = (int) sum;
		return memoX[x][cnt];
	}
}
