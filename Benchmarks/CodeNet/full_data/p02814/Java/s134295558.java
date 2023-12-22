import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long l = sc.nextLong()/2;
		int ans = 0;
		boolean flag = true;
		int div_two = two(l);
		boolean flag2 = true;
		for (int i = 0; i < n-1; i++) {
			long b = sc.nextLong()/2;
			l = lcm(l, b);
			if(l > m) {
				flag = false;
				break;
			}
			if(two(b) != div_two) flag2 = false;
		}

		if(flag) {
			if(flag2) {
				int lcm = (int)l;
				for (int i = 1; i*lcm <= m; i = i+2) {
					ans++;
				}
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
	public static int two(long n) {
		int k = 0;
		while(n%2 == 0) {
			n = n/2;
			k++;
		}
		return k;
	}
}