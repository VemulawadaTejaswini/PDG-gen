import java.util.Scanner;

public class Main {

	static int conti = 0;
	static int fi = 0;
	static int la = 0;
	static int fl = 0;
	static int n = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.next().toCharArray();
		n = Integer.parseInt(sc.next());
		calcConti(c);
		System.out.println((long) conti * n);

	}

	static void calcConti(char[] c) {
		int count = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
				i++;
			}
		}
		conti = count;
		if (c[0] == c[c.length - 1] && conti != c.length) {
			fl = 1;
			for (int i = 0; i < c.length - 1; i++) {
				if (c[i] == c[i + 1]) {
					fi++;
				} else {
					break;
				}
			}
			for (int i = c.length - 1; i > 1; i--) {
				if (c[i] == c[i - 1]) {
					la++;
				} else {
					break;
				}
			}
		}
		if (fl == 1) {
			if (fi % 2 != 0 && la % 2 != 0) {
				fl = 1;
			} else {
				fl = 0;
			}
		}
		if (fl != 0) {
			fl = n - 1;
		}

	}

}
