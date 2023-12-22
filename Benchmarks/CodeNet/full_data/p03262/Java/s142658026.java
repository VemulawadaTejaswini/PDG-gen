import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long X = input.nextLong();
		long GCD = Math.abs(X-input.nextLong());
		for (long i = 1; i < N; i++) {
			long x = Math.abs(X-input.nextLong());
			GCD=GCD(GCD,x);
		}
		System.out.println(GCD);
	}
	public static long GCD(long a, long b) {
		if (a==0) return b;
		if (b==0) return a;
		if (a==b) return a;
		if (a>b) return GCD(a%b,b);
		return GCD(b%a,a);
	}
}