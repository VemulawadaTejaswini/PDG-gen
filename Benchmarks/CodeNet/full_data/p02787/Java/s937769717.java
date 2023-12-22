import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] d = new int[n];
		int[] m = new int[n];

		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			d[i] = b[i] * (h/a[i]);
			m[i] = h % a[i];
		}

		for ( int i=0; i<n; i++ ) {
			if ( m[i] > 0 ) {
				// 残りはm[i]
				// とどめの一撃になるなかで一番消費がすくないもの
				int by = 10000;	// b暫定
				for ( int j=0; j<n; j++ ) {
					if ( a[j] >= m[i] && b[j] < by ) {
						by = b[j];
					}
				}
				d[i] = d[i] + by;
			}
		}

		Arrays.sort(d);
		// 出力
		System.out.println(d[0]);

	}
}