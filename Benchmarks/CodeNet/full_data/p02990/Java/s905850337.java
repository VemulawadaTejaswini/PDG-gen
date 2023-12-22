import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int x = 1000000007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);

		// nCr取得用テーブル
		int height = n - k + 1 > k - 1 ? n - k + 1 : k - 1;
		int width = k;
		long[][] tb = makePscalsTable(height + 1, width + 1);

		for ( int i = 1; i <= k; i++ ) {
			if ( n - k + 1 < i ) {
				System.out.println("0");
				continue;
			}
			// (n-k)個の赤玉の隙間＋両サイド (n-k+1)カ所から青のグループを差し込むiカ所を選ぶ
			long res2 = tb[n - k + 1 - i][i];   //nCr(n - k + 1, i);

			// k個の青ボールをi個のグループ順列に分ける（全グループに最低一つ配る） 
			// → (k-1)カ所の隙間から(i-1)カ所選んで仕切りを差し込む並べ方に等しい
			long res1 = tb[k - 1 - (i - 1)][i - 1];     //nCr(k - 1, i - 1);

			System.out.println((res1 * res2) % x);
		}

		br.close();
	}

	// height*width のテーブルを作る nCr = tb[n-r][r]
	private static long[][] makePscalsTable(int height, int width) {
		long[][] tb = new long[height][width];
		tb[0][0] = 1;

		for ( int row = 0; row < height; row++ ) {
			for ( int col = 0; col < width; col++ ) {
				if ( 0 < col ) tb[row][col] += tb[row][col - 1]; // 左を加算
				if ( 0 < row ) tb[row][col] += tb[row - 1][col]; // 上を加算
				if ( tb[row][col] > x ) tb[row][col] %= x;
			}
		}
		return tb;
	}
}
