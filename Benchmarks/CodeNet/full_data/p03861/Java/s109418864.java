import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long cntA = 0;
		long cntB = 0;

		if (a > 0) {
			cntA = cntYksu(a-1,x);
		}
		cntB = cntYksu(b,x);
		System.out.println(cntB - cntA);
	}
	public static long cntYksu(long num, long x) {
		return num / x;
	}
}
