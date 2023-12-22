import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		long m = sc.nextLong();
		Integer[] a = new Integer[n];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
		}
		int hp = 0;
		int[] c = new int[n];

		Arrays.sort(a, Collections.reverseOrder());

		for ( int i=0; i<m; i++ ) {
			int r = 0;
			int hpr = 0;
			int hpl = 0;
			int hpmax = 0;
			int sel = 0;
			int f = 0;
			do {
				if ( c[r] < n ) {
					hpr = a[r];
					hpl = a[c[r]];
				} else {
					hpr = 0;
					hpl = 0;
				}
				if ( hpr+hpl > hpmax ) {
					hpmax = hpr+hpl;
					sel = r;
				}
				if ( c[r] == 0 ) {
					f++;
				}
				r++;
			} while ( f == 0 & r < n );

			hp = hp + hpmax;
			c[sel]++;
		}

		System.out.println(hp);
	}
}