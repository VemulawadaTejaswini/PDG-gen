import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	Integer steps[];
	BigInteger results[];

	public Main(int n, Integer a[]) {
		steps = new Integer[n];
		results = new BigInteger[n];
		for (int i = 0; i < steps.length; i++) {
			steps[i] = 1;
		}
		for (int e : a) {
			steps[e] = 0;
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		Integer a[] = new Integer[m];
		for (int i = 0; i < m; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(
				new Main(n, a).calc(0).mod(new BigInteger("1000000007")));
	}

	public BigInteger calc(int prefix) {
		BigInteger shortcut = results[prefix];
		BigInteger result;
		if (shortcut != null) {
			return shortcut;
		}
		if (prefix >= steps.length) {
			result = BigInteger.ZERO;
		} else if (prefix == steps.length - 1) {
			result = BigInteger.ONE;
		} else if (prefix == steps.length - 2) {
			result = BigInteger.ONE
					.add(((steps[prefix + 1] == 1) ? BigInteger.ONE
							: BigInteger.ZERO));
		} else {
			result = ((steps[prefix + 1] == 1) ? calc(prefix + 1)
					: BigInteger.ZERO)
							.add((steps[prefix + 2] == 1) ? calc(prefix + 2)
									: BigInteger.ZERO);
		}
		results[prefix] = result;
		return result;
	}
}