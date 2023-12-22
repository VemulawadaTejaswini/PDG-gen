import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private long gcd(long m, long n) {
		long temp;
		while((temp = m%n) != 0) {
			m = n;
			n = temp;
		}
		return n;
	}
	
	private long lcm(long m, long n) {
		return (m*n)/gcd(m,n);
	}
	
	private long f(long a, long b) { // a以下の、bでわりきれるかず
		return a/b;
	}
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		sc.close();
		a--;
		long aa = a - (f(a, c) + f(a,d) - f(a, lcm(c,d)));
		long bb = b - (f(b, c) + f(b,d) - f(b, lcm(c,d)));
		long ans =  bb-aa;
		
		out.println(ans);
		

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
	
	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
