import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		if (n == 0) {
			pr.println('0');
		} else if (n > 0) {
			char[] ans = new char[40];
			Arrays.fill(ans, '0');
			
			for (int i = 0; i < 40; i++) {
				if ((n & 0x1L << i) != 0) {
					set(ans, i);
				}
			}

			boolean flag = false;
			for (int i = ans.length - 1; i >= 0; i--) {
				if (flag) {
					pr.print(ans[i]);
				} else if (ans[i] == '1') {
					flag = true;
					pr.print(ans[i]);
				}
			}
			pr.println();
			
			check(n, ans);
		} else {
			long tmp = -1;
			int cnt = 0;
			while (tmp > n) {
				tmp *= 2;
				cnt++;
			}
			
			long tmp2 = n - tmp;
			char[] ans = new char[40];
			Arrays.fill(ans, '0');
			
			for (int i = 0; i < 40; i++) {
				if ((tmp2 & 0x1L << i) != 0) {
					set(ans, i);
				}
			}

			if (cnt % 2 == 1 && ans[cnt] == '0') {
				ans[cnt] = '1';
			} else if (cnt % 2 == 1 && ans[cnt] == '1') {
				ans[cnt + 1] = '0';
				ans[cnt] = '0';
			} else if (cnt % 2 == 0 && ans[cnt] == '0') {
				ans[cnt] = '1';
				ans[cnt + 1] = '1';
			} else {
				ans[cnt] = '0';
			}

			boolean flag = false;
			for (int i = ans.length - 1; i >= 0; i--) {
				if (flag) {
					pr.print(ans[i]);
				} else if (ans[i] == '1') {
					flag = true;
					pr.print(ans[i]);
				}
			}
			pr.println();
			check(n, ans);
		}
	}

	private static void set(char[] ans, int i) {
		if (i % 2 == 0 && ans[i] != '1') {
			ans[i] = '1';
		} else if (i % 2 == 0 && ans[i] == '1') {
			ans[i] = '0';
			set(ans, i + 1);
		} else if (i % 2 == 1 && ans[i] != '1') {
			ans[i] = '1';
			set(ans, i + 1);
		} else {
			ans[i] = '0';
		}
	}

	private static void check(int n, char[] ans) {
		long tmp = 1;
		long tmp2 = 0;
		for (int i = 0, size = ans.length; i < size; i++, tmp *= -2) {
			if (ans[i] == '1') {
				tmp2 += tmp;
			}
		}

		if (n != tmp2) {
			pr.printf("err %d %d\n", n, tmp2);
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
