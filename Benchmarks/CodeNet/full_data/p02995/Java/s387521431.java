import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();

		long first = B/C;
		long second = (A-1)/C;
		long third = B/D;
		long fourth = (A-1)/D;
		long lc = lcm (C,D);
		long fifth = B/(lc);
		long sixth = (A-1)/(lc);

		long oneans = first - second;
		long secans = third - fourth;
		long thians = fifth - sixth;

		long answer = (B-A+1)-oneans-secans+thians;

		System.out.println(answer);
	}

	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}