import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n + 2];
		int[] b = new int[n + 1];
		for ( int i = 1; i <= n + 1; i++ ) {
			a[i] = in.nextInt();
		}
		for ( int i = 1; i <= n; i++ ) {
			b[i] = in.nextInt();
		}

		long beated = 0;
		for ( int i = 1; i <= n; i++ ) {
			// モンスタの方が多いor同数の場合 bを使い切る
			if ( a[i] >= b[i] ) {
				beated += b[i];
				a[i] -= b[i];
				b[i] = 0;
			}
			// 勇者の方が多い場合 aを使い切る
			else if ( a[i] < b[i] ) {
				beated += a[i];
				b[i] -= a[i];
				a[i] = 0;

				// 次の町にも手を出す
				if ( a[i + 1] >= b[i] ) {
					beated += b[i];
					a[i + 1] -= b[i];
					b[i] = 0;

				} else if ( a[i + 1] < b[i] ) {
					beated += a[i + 1];
					b[i] -= a[i + 1];
					a[i + 1] = 0;
				}
			}
		}
		System.out.println(beated);
		in.close();
	}
}