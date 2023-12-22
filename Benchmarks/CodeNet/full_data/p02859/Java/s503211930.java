import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int X;
	int Y;
	int MOD = (int)Math.pow(10, 9) + 7;
	int SIZE = (int)Math.pow(10, 6) + 2;
	long fact[];
	long inv[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		init(SIZE);
		long ans = calc(X,Y);
		System.out.println(ans);
		sc.close();
	}

	private void init(int size) {
		fact = new long[size+1];
		inv = new long[size+1];

		fact[0]=1;
		inv[0]=1;

		for(int i=1; i<=size; i++) {
			fact[i] = (fact[i-1] * i) % MOD;
			inv[i] = pow(fact[i], MOD-2) % MOD;
		}
	}

	private long calc(int x, int y) {
		if((x+y) % 3 == 0) {
			int a = (2 * x - y) / 3;
			int b = (2 * y - x) / 3;
			long ans = comb(a+b, a);
			return ans;
		} else {
			return 0;
		}
	}
	private long comb(int n, int k) {
		return fact[n] * inv[k] % MOD * inv[n-k] % MOD;
	}

	//反復２乗法
	//x^y
	private long pow(long x, int n) {
		long ans = 1;
		while(n>0) {
			if((n & 1) == 1) {
				ans = ans * x % MOD;
			}
			x = x * x % MOD;
			n >>= 1;
		}
		return ans;
	}
}
