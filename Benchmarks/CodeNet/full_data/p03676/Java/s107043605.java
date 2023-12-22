import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
public class Main {
	static BigInteger[][] combMap;

	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		combMap = new BigInteger[n + 2][];
		for (int i = 0; i <= n + 1; i++) {
			combMap[i] = new BigInteger[n + 2];
		}
		int[] a = new int[n + 1];
		int l = 0;
		int r = 0;
		for (int i = 1; i <= n + 1; i++) {
			int tmp = sc.nextInt();
			if (a[tmp] == 0) {
				a[tmp] = i;
			} else {
				l = a[tmp];
				r = i;
			}
		}
		System.out.println(n);
		System.out.println(comb(n - 1, 2).add(BigInteger.ONE).add(BigInteger.valueOf(n + r - l - 2)));
		for (int k = 3; k < n; k++) {
			BigInteger ans = comb(n - 1 , k)
					        .add(comb(n - 1, k - 2))
					        .add(comb(l + n - r, k - 1));
			for (int j = 1; j < k; j++) {
				BigInteger tmp = comb(r - l - 1, j)
					   .multiply(comb(l + n - r, k - j - 1))
					   .multiply(BigInteger.valueOf(2L));
				ans = ans.add(tmp);
			}
			System.out.println(ans.mod(BigInteger.valueOf(1000000007L)));
		}
		if (n > 2) {
			System.out.println(n + (l + 1 == r ? 0 : 1));
			System.out.println(1);
		}
	}

	private BigInteger comb(int a, int b) {
		if (b == 0 || a == b) {
			return BigInteger.ONE;
		}
		if (a < b) {
			return BigInteger.ZERO;
		}
		if (combMap[a][b] == null) {
			BigInteger tmp = comb(a - 1, b - 1).add(comb(a - 1, b));
			combMap[a][b] = tmp;
		}
		return combMap[a][b];
	}
}