import java.util.Scanner;

public class Main {

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}

	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    long C = Long.parseLong(sc.next());
    long D = Long.parseLong(sc.next());
    long ans = 0;

    long AparC = A % C == 0 ? A/C : A/C+1;
    long BparC = B/C;
    long cMinus = BparC - AparC + 1;

    long AparD = A % D == 0 ? A/D : A/D+1;
    long BparD = B/D;
    long dMinus = BparD - AparD + 1;

    long lcm = lcm(C, D);
    long AparLcm = A % lcm == 0 ? A/lcm : A/lcm+1;
    long BparLcm = B/lcm;
    long lcmMinus = BparLcm - AparLcm + 1;

    ans = B - A + 1 - (cMinus + dMinus - lcmMinus);
    System.out.println(ans);
  }
}