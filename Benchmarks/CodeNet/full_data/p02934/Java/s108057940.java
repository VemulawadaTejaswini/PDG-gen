import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger m = BigInteger.ONE;
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			m = m.multiply(BigInteger.valueOf(a[i]));
		}
		BigInteger de = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			de = de.add(m.divide(BigInteger.valueOf(a[i])));
		}
		System.out.println(new BigDecimal(m).divide(new BigDecimal(de), 10, BigDecimal.ROUND_HALF_UP));
	}
}
