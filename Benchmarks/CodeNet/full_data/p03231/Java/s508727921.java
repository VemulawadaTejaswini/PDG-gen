import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[] arrS = sc.next().toCharArray();
		char[] arrT = sc.next().toCharArray();
		int x = lcm(n, m);
		int y = gcd(n, m);
		int nn = x / n;
		int mm = x / m;
		for (int i = 0; i * mm < n && i * nn < m; i++) {
			if (arrS[i * mm] != arrT[i * nn]) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(x);
	}
	static int lcm(int x, int y) {
		return x * y / gcd(x, y);
	}
	
	static int gcd(int x, int y) {
		if (x % y == 0) {
			return y;
		}
		return gcd(y, x % y);
	}
}
