import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		long p = 0;

		for (int i=0; i<n; i++ ) {
			a[i] = 1;
		}

		while ( a[0] < n ) {
			int flag = 1;
			// max k_mon
			int kmax = 0;
			// min k+1_mon
			int k1min = a[0];
			for ( int k=1; k<n; k++ ) {
				kmax = kmax + a[n-k];
				k1min = k1min + a[k];

				if ( kmax >= k1min ) {
					flag = 0;
					break;
				}
			}
			p = p + flag;

			// 次の配列
			if (flag == 1) {
				nextary(a,n,n);
			} else {
				nextary(a,n,n-1);
			}
		}
		// 全問最高スコア(n点)は条件みたす
		p++;
		// 出力
		long md = p%m ;
		System.out.println(md);
	}

	static void nextary(int[] ary, int maxnum, int num) {
		int ps = num - 1;
		if ( ary[ps] == maxnum ) {
			nextary(ary, maxnum, ps);
		} else {
			ary[ps]++;
			for ( int j=ps+1; j<maxnum; j++ ) {
				ary[j] = ary[ps];
			}
		}
	}

}