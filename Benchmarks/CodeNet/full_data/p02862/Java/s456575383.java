import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if ((x + y) % 3 != 0) {
			System.out.println(0);
			return;
		}
		if (x > y * 2 || y > x * 2) {
			System.out.println(0);
			return;
		}
		int a = x - (x + y) / 3;
		int b = y - (x + y) / 3;

		long mod = (long) Math.pow(10, 9) + 7;
		FermatCombination com = new FermatCombination((a + b), mod);
		long num = com.combine((a + b), a);

		System.out.println(num);
	}

}

class FermatCombination {

	long factrial[]; // 階乗を保持
	long inverse[]; // 逆元を保持
	long MOD;

	FermatCombination(int size, long mod) {

		this.factrial = new long[size + 1];
		this.inverse = new long[size + 1];
		this.MOD = mod;

		this.factrial[0] = 1;
		this.inverse[0] = 1;

		for (int i = 1; i <= size; i++) {
			factrial[i] = (factrial[i - 1] * i) % MOD; // 階乗を求める
			inverse[i] = pow(factrial[i], (int) MOD - 2) % MOD; // フェルマーの小定理で逆元を求める
		}
	}

	long combine(int n, int k) {
		return factrial[n] * inverse[k] % MOD * inverse[n - k] % MOD;
	}

	long pow(long x, int n) { // x^n 計算量O(logn)
		long ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * x % MOD;
			}
			x = x * x % MOD; // 一周する度にx, x^2, x^4, x^8となる
			n >>= 1; // 桁をずらす n = n >> 1
		}
		return ans;
	}
}