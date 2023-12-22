import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int x = 1000000007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int n =  Integer.parseInt(input[0]);
		int k =  Integer.parseInt(input[1]);

		for ( int i = 1; i <= k; i++ ) {
			if ( n - k + 1 < i ) {
				System.out.println("0");
				continue;
			}
			// (n-k)個の赤玉の隙間＋両サイド (n-k+1)カ所から青のグループを差し込むiカ所を選ぶ
			//long res2 = nCr_Pascal(n - k + 1, i);

			// k個の青ボールをi個のグループ順列に分ける（全グループに最低一つ配る） 
			// → (k-1)カ所の隙間から(i-1)カ所選んで仕切りを差し込む並べ方に等しい
			//long res1 = nCr_Pascal(k - 1, i - 1);

			// long ans = (nCr_Pascal(n - k + 1, i) * nCr_Pascal(k - 1, i - 1)) % x;
			System.out.println( (nCr_Pascal(n - k + 1, i) * nCr_Pascal(k - 1, i - 1) ) % x );
		}
		
		//br.close();
		//in.close();
	}

	// パスカルの三角形でnCrを計算する
	private static long nCr_Pascal(int n, int r) {
		int width = r + 1;
		int height = n + 1 - r;
		long[][] table = new long[height][width];

		// 0列目と0行目を初期化
		for ( int row = 0; row < height; row++ ) {
			table[row][0] = 1;
		}
		// Arrays.fill(table[0], 1);

		for ( int col = 0; col < width; col++ ) {
			table[0][col] = 1;
		}

		// 計算部分
		for ( int row = 1; row < height; row++ ) {
			for ( int col = 1; col < width; col++ ) {
				table[row][col] = (table[row][col - 1] + table[row - 1][col]) % x; // 左 ＋ 上
			}
		}

		return table[height - 1][width - 1];
	}
}
