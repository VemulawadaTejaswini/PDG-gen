import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int gcd = (int) gcd(n,m);
		long lcm = n / gcd(n,m) * m;
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		for(int i=0;i<gcd;i++) {
			if (s[n/gcd*i] != t[m/gcd*i]) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(lcm);
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
