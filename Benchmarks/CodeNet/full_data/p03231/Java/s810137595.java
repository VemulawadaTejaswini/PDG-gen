import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long lcm = n / gcd(n,m) * m;
		System.err.println(lcm);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		if (s[0] != t[0]) {
			throw new RuntimeException();
			//System.out.println(-1);
			//return;
		}
		if (n > m) {
			int l = n;
			n = m;
			m = l;
			char[] u = s;
			s = t;
			t = u;
		}
		//n < m
		if (m % n == 0) {
			int d = m / n;
			for(int i=0;i<n;i++) {
				if (s[i] != t[i*d]) {
					throw new RuntimeException();
					//System.out.println(-1);
					//return;
				}
			}
		}
		System.out.println(-1);
	}
	public static long gcd(long a,long b) {
		while(b!=0) {
			long r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
