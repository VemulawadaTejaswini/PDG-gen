import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;
	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[N];

		for(int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		int count = numTwo(a[0]);
		for(int i = 1; i < N; i++) {
			if(count != numTwo(a[i])) {
				System.out.println(0);
				return;
			}
		}

		long lcm = a[0];
		for(int i = 1; i < N; i++) {
			long g = gcd(lcm, a[i]);
			lcm = lcm * a[i] / g / 2;
			if(lcm / 2 > M) {
				System.out.println(0);
				return;
			}
		}
		long ans = M / (lcm / 2) - M / lcm;
		System.out.println(ans);

	}


	int numTwo(int n) {
		int cnt = 0;
		while(n % 2 == 0) {
			cnt++;
			n /= 2;
		}
		return cnt;
	}
	
	long gcd(long a, long b) {
		return (b == 0)?a:gcd(b, a % b);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
