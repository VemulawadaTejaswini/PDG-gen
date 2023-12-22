import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		int[][] c = new int[n][2];		// children
		int[] next = new int[n];

		// format
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'R')
				c[i][0] = i + 1;
			else				// 'L'
				c[i][0] = i - 1;
			c[i][1] = 1;
		}

		// move
		for (int i = 0; i < 10_000; i++) {
			for (int j = 0; j < n; j++) {
				next[c[j][0]] += c[j][1];
			}

			arrCopy(c, next);
		}

		// output
		for (int i = 0; i < n; i++) {
			System.out.print(c[i][1] + " ");
		}
		System.out.println();
	}

	static void arrCopy(int[][] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			a[i][1] = b[i];
			b[i] = 0;
		}
	}
}
