import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	static final int MAX = 1000005;
	static final int MOD = 1000000007;
	static long[]fact = new long[MAX];
	static long[]factInv = new long[MAX];
	static long[]inv = new long[MAX];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long M = scan.nextLong();
		scan.close();
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		long m = M;
		for(long i = 2; i * i <= M; i++) {
			if(m % i == 0) {
				int cnt = 1;
				m = m / i;
				while(m % i == 0) {
					m = m / i;
					cnt++;
				}
				map.put(i, cnt);
			}
		}
		if(m > 1) {
			if(map.containsKey(m)) {
				map.put(m, map.get(m) + 1);
			}else {
				map.put(m, 1);
			}
		}
		factMOD();
		invMOD();
		factInvMOD();

		long ans = 1;
		for(int i : map.values()) {
			ans *= combMOD(N + i - 1, i) % MOD;
			ans = ans % MOD;
		}
		System.out.println(ans % MOD);
	}

	//
	static void factMOD() {
		fact[0] = 1;
		for(int i = 1; i < MAX; i++) {
			fact[i] = fact[i - 1] * i % MOD;
		}
	}
	static void invMOD() {
		inv[0] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			inv[i] = MOD - inv[(int)(MOD % i)] * (MOD / i) % MOD;
		}
	}
	static void factInvMOD() {
		factInv[0] = 1;
		for(int i = 1; i < MAX; i++) {
			factInv[i] = factInv[i - 1] * inv[i] % MOD;
		}
	}
	static long combMOD(int n, int k) {
		if(n < k) return 0;
		if(n < 0 || k < 0) return 0;
		return fact[n] * ((factInv[k] * factInv[n - k]) % MOD) % MOD;
	}
}