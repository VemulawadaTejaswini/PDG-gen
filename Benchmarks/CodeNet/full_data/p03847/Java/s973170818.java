
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static final long MOD = 1000_000_007L;
    private static long count = 0;
    private static long[] a;
    private static long[] s;

    public static void main(String[] args) {
	long N = Long.parseLong(scan.next());

	int digit = (int)(Math.log10(N)/Math.log10(2) + 1.0);
	a = new long[digit];
	s = new long[digit];
	a[0] = 1;
	s[0] = 1;
	for (int i = 1; i < digit; i++) {
	    a[i] = a[i-1] * 2;
	    s[i] = a[i] + s[i-1];
	}

	func(N, digit);
	System.out.println(count);
	scan.close();
    }

    private static void func(long n, int bit) {
	if(bit == 1) {
	    if(n >= 0) count = (count + 1) % MOD;
	    if(n - 1 >= 0) count = (count + 1) % MOD;
	    if(n - 2 >= 0) count = (count + 1) % MOD;
	    return;
	}
	
	if(n >= 2*s[bit-1]) {
	    count = (count + pow(3, bit-1)) % MOD;
	} else if(n >= 0) {
	    func(n, bit-1);
	}

	if(n - a[bit-1] >= 2*s[bit-1]) {
	    count = (count + pow(3, bit-1)) % MOD;
	} else if(n - a[bit-1] >= 0) {
	    func(n - a[bit-1], bit-1);
	}

	if(n - 2*a[bit-1] >= 2*s[bit-1]) {
	    count = (count + pow(3, bit-1)) % MOD;
	} else if(n - 2*a[bit-1] >= 0) {
	    func(n - 2*a[bit-1], bit-1);
	}
    }

    private static long pow(long x, long n) {
	if(n == 0) return 1;

	long tmp = (n % 2 == 0 ? 1 : x);
	long x2 = pow(x, n/2);
	return tmp * x2 % MOD * x2 % MOD;
    }
}
