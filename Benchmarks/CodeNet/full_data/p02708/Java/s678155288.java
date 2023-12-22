import java.util.*;
public class Main {
	public static void main(String[] args){
		int mod = 1000000007;

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();

		long g = 0;
		for ( int i=k; i<=n+1; i++ ) {
			long l = (long)(i-1)*(long)i/2l;
			long r = (long)n*(long)i-l;
			g = modadd(g, r-l+1, mod);
		}

		System.out.println(g);
	}

	private static long modadd( long a, long b, int m) {
		long c = (a + b)%(long)m;
		return c;
	}
}