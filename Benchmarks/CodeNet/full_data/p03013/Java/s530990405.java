import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int D = 1000000007;
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int[] a = new int[M + 2];
		a[0] = -1;
		a[M + 1] = N + 1;

		boolean enable = false;
		for ( int i = 1; i <= M; i++ ) {
			a[i] = in.nextInt();

			if ( a[i] == a[i - 1] + 1 ) {
				enable = true;
			}
		}
		if ( enable ) {
			System.out.println(0);
			in.close();
			return;
		}

		long result = 1;

		for ( int i = 0; i <= M; i++ ) {
			int steps = (a[i + 1] - 1) - (a[i] + 1); // 壊れ段の直後から直前までの段数
			int temp = 0;

			for ( int one_step = steps % 2; one_step <= steps; one_step += 2 ) {
				int option = (steps - one_step)/2 + one_step;
				temp += nCr(option, one_step);
			}
			result = (result % D) * (temp % D);
			temp = 0;
		}
		System.out.println(result % D);
		in.close();
	}

	private static long nCr(int n, int r) {
		long num = 1;
		for ( int i = 1; i <= r; i++ ) {
			num = num * (n - i + 1) / i;
		}
		return num;
	}
}
