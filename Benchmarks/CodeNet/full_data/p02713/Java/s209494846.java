import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();

		long f = 0;
		for ( int i=1; i<=n; i++ ) {
		for ( int j=1; j<=n; j++ ) {
		for ( int k=1; k<=n; k++ ) {
			int g = gcd3(i, j, k);
			f = f + g;
		}
		}
		}
		System.out.println(f);
	}

	private static int gcd3(int a, int b, int c) {
		if ( a==1 || b==1 || c==1 ) return 1;
		int g1 = gcd2(a, b);

		if ( g1==1 ) return 1;
		int g2 = gcd2(g1, c);
		return g2;
	}
	private static int gcd2(int a, int b) {
		while ( b>0 ) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

}