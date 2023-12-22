import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int K = sc.nextInt();
		
		// 結果の出力
		long sum = 0;
		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				int r = euclid(i, j);
				for (int k = 1; k <= K; k++) {
					sum += euclid(r, k);
				}
			}
		}
		System.out.println(sum);

		sc.close();
	}
	
	// ユークリッドの互除法で最大公約数を求める
	static int euclid( int a, int b ) {
		//引数の大小入替
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int r = a % b;
		if (r == 0) {
			return b;
		}
		return euclid(b, r);
	}
}
