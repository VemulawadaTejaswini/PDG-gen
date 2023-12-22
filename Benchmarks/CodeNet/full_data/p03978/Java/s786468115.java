import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[] cs = { '.', '#' };

	public static void main(String[] args) {
		int N = sc.nextInt();
		String upper = "";
		String lower = "";
		for (int i = 0; i < 4; ++i) {
			if (queryAppend(upper, lower, i)) {
				upper += cs[i >> 1];
				lower += cs[i & 1];
				break;
			}
		}
		while (true) {
			boolean ok = false;
			for (int i = 0; i < 4; ++i) {
				if (queryAppend(upper, lower, i)) {
					upper += cs[i >> 1];
					lower += cs[i & 1];
					ok = true;
					break;
				}
			}
			if (!ok) break;
		}
		while (true) {
			boolean ok = false;
			for (int i = 0; i < 4; ++i) {
				if (queryPretend(upper, lower, i)) {
					upper = cs[i >> 1] + upper;
					lower = cs[i & 1] + lower;
					ok = true;
					break;
				}
			}
			if (!ok) break;
		}
	}

	static boolean queryAppend(String u, String l, int idx) {
		return query(u + cs[idx >> 1], l + cs[idx & 1]);
	}

	static boolean queryPretend(String u, String l, int idx) {
		return query(cs[idx >> 1] + u, cs[idx & 1] + l);
	}

	static boolean query(String u, String l) {
		System.out.println(u);
		System.out.println(l);
		System.out.flush();
		String res = sc.next();
		if (res.equals("end")) System.exit(0);
		return res.equals("T");
	}
}
