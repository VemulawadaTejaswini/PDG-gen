import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private BigDecimal gcd(BigDecimal a, BigDecimal b) {
		if (b.equals(BigDecimal.ZERO))
			return a;
		return gcd(b, a.remainder(b));
	}

	private BigDecimal lcm(BigDecimal a, BigDecimal b) {
		return a.multiply(b).divide(gcd(a,b));
	}

	private BigDecimal lcm(BigDecimal[] a) {
		BigDecimal ans = a[0];
		for (int i = 1; i < a.length; i++) {
			ans = lcm(ans, a[i]);
		}
		return ans;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		BigDecimal[] a = new BigDecimal[N];

		for (int i = 0; i < N; i++) {
			a[i] = new BigDecimal(sc.nextInt());
		}

		BigDecimal l = lcm(a);

		l = l.subtract(BigDecimal.ONE);

		BigDecimal z = BigDecimal.ZERO;
		for (int i = 0; i < N; i++) {
			z = z.add( l.remainder(a[i]) );
		}
		out.println(z);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
