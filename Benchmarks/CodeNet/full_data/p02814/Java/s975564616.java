import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long g = sc.nextLong()/2;
		int ans = 0;
		boolean flag = true;
		for (int i = 0; i < n-1; i++) {
			long b = sc.nextLong()/2;
			g = lcm(g,b);
			if(g > m) {
				flag = false;
				break;
			}
		}
		if(flag && g%2 == 1) {
			int gcd = (int)g;
			for (int i = 1; i*gcd <= m; i = i+2) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
	public static long gcd(long a, long b) {
		if(a < b) return gcd(b, a);
		if( b == 0) return a;
		return gcd(b, a%b);
	}
	public static long lcm(long a, long b) {
		return a*b/gcd(a, b);
	}
}