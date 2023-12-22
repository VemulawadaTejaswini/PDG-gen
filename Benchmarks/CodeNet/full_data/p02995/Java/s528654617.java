import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();

		long cMulD = lcm(c, d);
		long p = b - a + 1;

		long bDivC = b / c;
		long bDivD = b / d;
		long e = b / cMulD;
		long aDivC = (a - 1) / c;
		long aDivD = (a - 1) / d;
		long f = (a - 1) / cMulD;

		long temp = bDivC + bDivD - e;
		long temp2 = aDivC + aDivD - f;

		long ans = p - (temp - temp2);

		System.out.println(ans);
	}
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
}
