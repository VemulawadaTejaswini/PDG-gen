import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static final int MOD = 1000000007;
	static final int MAX = 200000;

	static BigInteger[] fac = new BigInteger[MAX]; // 1!,2!,...
	static BigInteger[] inv = new BigInteger[MAX]; // (1)^-1,(2)-1,...(逆元)
	static BigInteger[] finv = new BigInteger[MAX]; // (1!)^-1,(2!)-1,...(逆元)
	static BigInteger big_mod = new BigInteger(String.valueOf(MOD));

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		init_nCr();

		BigInteger ans = new BigInteger(String.valueOf("0"));
		for (int i = 0 ; i < H - A ; i++) {
			ans = ans.add(nCr(B + i - 1, i).multiply(nCr(H - i + W - B - 2, H - i - 1)).mod(big_mod));
			ans = ans.mod(big_mod);
		}
		System.out.println(ans.intValue());

		scanner.close();
	}

	private static void init_nCr() {
		fac[0] = fac[1] = new BigInteger("1");
		inv[1] = new BigInteger("1");
		finv[0] = finv[1] = new BigInteger("1");

		for (int i = 2 ; i < MAX ; i++) {
	        fac[i] = (fac[i - 1].multiply(new BigInteger(String.valueOf(i)))).mod(big_mod);
	        inv[i] = big_mod.subtract(inv[MOD % i]).multiply(new BigInteger(String.valueOf(MOD / i))).mod(big_mod);
	        finv[i] = finv[i - 1].multiply(inv[i]).mod(big_mod);
		}
	}

	private static BigInteger nCr(int n, int r) {
		return fac[n].multiply(finv[r]).mod(big_mod).multiply(finv[n - r]).mod(big_mod);
	}
}
