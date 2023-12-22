import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] switchPatterns = new int[m][];
		int[] p = new int[m];
		for ( int i = 0; i < m; i++ ) {
			int k = in.nextInt();
			int[] s = new int[k];
			for ( int j = 0; j < k; j++ ) {
				s[j] = in.nextInt();
			}
			switchPatterns[i] = s;
		}
		for ( int i = 0; i < m; i++ ) {
			p[i] = in.nextInt();
		}

		int Allpatterns = 2 << (n - 1); // 2のn乗
		int cnt = Allpatterns;

		// スイッチのパターンを上限まで列挙
		for ( int ptr = 0; ptr < Allpatterns; ptr++ ) {
			// 電球ごとのスイッチパターンと照らし合わせる
			for ( int d = 0; d < m; d++ ) {
				int temp = 0;
				for ( int i : switchPatterns[d] ) {
					// 順序：四則演算 → ビットシフト → 論理演算 → 代入
					temp += ptr >> i - 1 & 1; 
				}
				if ( temp % 2 != p[d] ) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}