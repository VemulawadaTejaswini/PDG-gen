import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static int[][] dp;

	static	boolean[] flag ;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);			//文字の入力
		N = scanner.nextInt();
		M = scanner.nextInt();

		String s = scanner.next();
		String t = scanner.next();

		long ans = lcm(N, M);

		for(int i = 0;i < N;i += N/gcd(N, M) ){
			int x = M*i/N;
			if(s.charAt(i) != t.charAt(x)){
				System.out.println("-1");
			}
		}
		

		System.out.println(ans);


	}





	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
	static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}


