import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		int[][] c = new int[n][3];		// children

		// format
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'R')
				c[i][2] = i + 1;
			else				// 'L'
				c[i][2] = i - 1;
			c[i][0] = 1;
		}

		// move
		int flg = 0;
		for (int i = 0; i < 10_000; i++) {
			for (int j = 0; j < n; j++) {
				c[c[j][2]][flg ^ 1] += c[j][flg];
				c[j][flg] = 0;
			}

			flg ^= 1;
		}

		// output
		for (int i = 0; i < n; i++) {
			System.out.print(c[i][flg] + " ");
		}
		System.out.println();
	}

}
