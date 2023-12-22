import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prepareFact();
		int numQ = sc.nextInt();
		for(int i = 0; i < numQ; i ++) {
			long x = sc.nextLong();
			long d = sc.nextLong();
			long num = sc.nextLong();
			if(x == 0) { System.out.println(0); continue; }
			if(d == 0) { System.out.println(powerMod(x, num)); continue; };
			x = mod(x * invMod(d));
			if(x + num - 1 >= MOD) { System.out.println(0); continue; }
			long ans = mod(factMod[(int)(x + num - 1)] * invMod(factMod[(int)(x - 1)]));
			ans = mod(ans * powerMod(d, num));
			System.out.println(ans);
		}
	}
	static int MOD = 1_000_003;
	public static long mod(long i) {
		return i % MOD + ((i % MOD) < 0 ? MOD : 0);
	}
	
	static long powerMod(long x, long y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else if (y % 2 == 0) {
			long tmp = powerMod(x, y / 2);
			return mod(tmp * tmp);
		} else {
			long tmp = powerMod(x, y / 2);
			return mod(mod(tmp * tmp) * x);
		}
	}
	
	static long invMod(long x) {
		return powerMod(x, MOD - 2);
	}
	
	static int MAX_FACT = MOD;
	static long factMod[] = new long[MAX_FACT];
	static void prepareFact() {
		factMod[0] = 1;
		for(int i = 1; i < MAX_FACT; i ++) {
			factMod[i] = mod(factMod[i - 1] * i);
		}
	}
	
	static long combiMod(int n, int r) {
		if(n < 0 || n < r) { return 0; }
		if(r == 0 || r == n) { return 1; }
		return mod(mod(factMod[n] * invMod(factMod[r])) * invMod(factMod[n - r]));
	}
}