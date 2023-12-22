import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long LEN = (long) 1e18;
	
	void doIt() {
		long n = sc.nextLong();
		long cnt = 0;
		long base = 5;
		while(base <= n) {
			cnt += n / base / 2;
			if(base < 0)break;
			base *= 5;
		}
		System.out.println(cnt);
	}
	

	long gcd(long a, long b) {
		return (b != 0) ? gcd(b, a % b) : a;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
	
}
