import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		int c = sc.nextInt();
		int d = sc.nextInt();
		long ans = 0;
		long countc = 0;
		long countd = 0;
		long countlcm = 0;
		long gcd = 0;
		long lcm = 0;

		long tmpc = c;
		long tmpd = d;

		if (d > c) {
			long tmp = tmpd;
			tmpd = tmpc;
			tmpc = tmp;
		}

		long r = 0;
		while (tmpd > 0) {
			r = tmpc % tmpd;
			tmpc = tmpd;
			tmpd = r;
		}

		lcm = (long) c * d / tmpc;

		countc = b / c - a / c;
		if (a % c == 0) {
			countc++;
		}
		countd = b / d - a / d;
		if (a % d == 0) {
			countd++;
		}
		countlcm = b / lcm - a / lcm;
		if (a % lcm == 0) {
			countlcm++;
		}
		ans = b - a + 1 - (countc + countd - countlcm);

		System.out.println(ans);

		//		System.out.println(countc);
		//		System.out.println(countd);
		//		System.out.println(countlcm);

	}
}