import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int gcd = 0;
		int[] xDifference = new int[n];
		// 整数nの数だけ標準入力
		for(int i = 0; i < n; i++) {
			xDifference[i] = Math.abs(x - sc.nextInt());
			if(i == 0) {
				gcd = xDifference[i];
			} else {
				gcd = gcd(gcd, xDifference[i]);				
			}
		}
		System.out.println(gcd);
		sc.close();
	}
	// 最大公約数を求めるgcdメソッド
	private static int gcd(int m, int n) {
		if(m < n) {
			return gcd(n, m);
		}
		if(n == 0) {
			return m;
		}
		return gcd(n, m % n);
	}
}