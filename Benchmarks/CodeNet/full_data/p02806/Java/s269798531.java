import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] t = new int[n];
		// スペース区切りの入力
		for ( int i=0; i<n; i++ ) {
			s[i] = sc.next();
			t[i] = sc.nextInt();
		}
		String x = sc.next();
		int f = 0;
		int t0 = 0;

		for ( int i=0; i<n; i++ ) {
			if ( f == 0 ) {
				if (s[i].equals(x)) {
					f = 1;
				}
			} else {
				t0 = t0 + t[i];
			}
		}

		// 出力
		System.out.println(t0);
	}
}