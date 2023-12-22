import java.util.Scanner;
public class Main {

	static final int x = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		for ( int i = 1; i <= k; i++ ) {
			if ( n - k + 1 < i ) {
				System.out.println(0);
				continue;
			}
			// (n-k)個の赤玉の隙間＋両サイド (n-k+1)カ所から青のグループを差し込むiカ所を選ぶ
			long res2 = nCr(n - k + 1, i);

			// k個の青ボールをi個のグループ順列に分ける（全グループに最低一つ配る） 
			// → (k-i)カ所の隙間から(i-1)カ所選んで仕切りを差し込む並べ方に等しい
			long res1 = nCr(k - 1, i - 1);

			long ans = (res1 * res2) % x;

			System.out.println(ans);
		}
		in.close();
	}

	private static long nCr(int n, int r) {
		if ( r == 0 ) return 1L;
		return (n * nCr(n - 1, r - 1) / r) % x;
	}
}
