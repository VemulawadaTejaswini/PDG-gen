
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int MOD = 1000000007;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();

		long NM= (N*M)%MOD;
		long ans = f(NM, N, M, K);
		ans += f(NM, M, N, K);
		ans %= MOD;
		System.out.println(ans);
		sc.close();
	}

	public long f(long nm, int n, int m, int k) {
		long ans = 0;
		for(int i=1; i<n; i++) {
			long tmp = i * (n-i);
			tmp %= MOD;
			ans += tmp;
			ans %= MOD;
		}
		ans = ans * ((m*m)%MOD);
		ans %= MOD;
		ans *= choose(nm-2, k-2);
		ans %= MOD;
		return ans;
	}

	public long choose(long n, int k) {
		return (((fact(n) * inv(fact(n-k))) % MOD) * inv(fact(k))) % MOD;
	}

	public long fact(long x) {
		long ans = 1;
		for(long i=x; i>0; i--) {
			ans *= i;
			ans %= MOD;
		}
		return ans;
	}

	public long pow(long n, int x) {
		if(x==0) return 1;
		long tmp = pow(n, x/2);
		long ans = 0;
		if(x%2==0) {
			ans = (tmp * tmp) % MOD;
		}else {
			ans = (((tmp * tmp) % MOD) * n) % MOD;
		}
		return ans;
	}

	public long inv(long x) {
		return pow(x, MOD-2);
	}
}
