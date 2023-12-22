
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int N;
    private final long[] T;

    public Main() {
	N = Integer.parseInt(scan.next());
	T = new long[N];
	for (int i = 0; i < N; i++) {
	    T[i] = Long.parseLong(scan.next());
	}
	scan.close();
    }

    public final void answer() {

	long ans = 1;
	for (int i = 0; i < N; i++) {
	    ans = lcm(ans, T[i]);
	}

	System.out.println(ans);
    }

    private long gcd(long m, long n) {

	while(m % n != 0) {
	    long tmp = n;
	    n = m % n;
	    m = tmp;
	}

	return n;
    }

    private long lcm(long m, long n) {
	BigDecimal mb = new BigDecimal(m);
	BigDecimal nb = new BigDecimal(n);
	BigDecimal tmp = new BigDecimal(gcd(m, n));
	return mb.multiply(nb).divide(tmp).longValue();
    }
}
