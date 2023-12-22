import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = sc.next();

		char[] c = st.toCharArray();
		long[] x = new long[st.length()];
		int kosu = Renzoku(c, x);
		int moto, saki;
		moto = 0;
		saki = kosu - 1;
		if (c[0] == '.') {
			moto = 1;

		}
		if (c[n - 1] == '#') {
			saki--;
		}

		long min = 0;
		long ans = 0;

		for (int j = moto + 1; j <= saki; j = j + 2) {
			ans += x[j];

		}
		min = ans;
		for (int j = moto + 2; j <= saki+2; j = j + 2) {
			ans = ans - x[j - 1] + x[j - 2];
			if (ans < min) {
				min = ans;
			}
		}

		System.out.println(min);

	}

	public static int Renzoku(char c[], long x[]) {

		int mode = 0;
		int val = 0;

		for (int i = 0; i <= c.length - 2; i++) {
			if ((c[i] == c[i + 1]) && i != c.length - 2) {
				val++;
			} else {
				if ((c[i] == c[i + 1]) && i == c.length - 2) {
					val++;
				}
				val++;
				x[mode] = val;
				mode++;

				if ((c[i] != c[i + 1]) && i == c.length - 2) {
					x[mode] = 1;
					mode++;
				}

				val = 0;
			}

		}
		return mode;

	}
}