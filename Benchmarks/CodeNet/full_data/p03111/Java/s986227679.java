import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int along = 0;
		int blong = 0;
		int clong = 0;

		int h[] = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		// 0捨
		// 1a
		// 2b
		// 3c
		int ans = 9999999;
		int finalcost = 99999999;
		for (int i = 0; i <= Math.pow(4, n); i++) {
			String s = Integer.toString(i, 4);
			s = fixs(s, n);

			if (allin(s)) {
				finalcost = -30;
				along=0;
				blong=0;
				clong=0;
				char cs[] = s.toCharArray();
				for (int o = 0; o < cs.length; o++) {
					if (cs[o] == '1') {
						along += h[o];
						finalcost += 10;
					}
					if (cs[o] == '2') {
						blong += h[o];
						finalcost += 10;
					}
					if (cs[o] == '3') {
						clong += h[o];
						finalcost += 10;
					}
				}
				finalcost = finalcost + Math.abs(a - along)
						+ Math.abs(b - blong) + Math.abs(c - clong);
			}
			if (ans > finalcost) {
				ans = finalcost;
			}
		}
		System.out.println(ans);

	}

	static String fixs(String s, int n) {
		String s1 = "0";
		for (int i = s.length(); i < n; i++) {
			s = s1 + s;
		}
		return s;
	}

	static boolean allin(String s) {
		if ( s.contains("1") && s.contains("2")
				&& s.contains("3")) {
			return true;
		} else {
			return false;
		}
	}
}
