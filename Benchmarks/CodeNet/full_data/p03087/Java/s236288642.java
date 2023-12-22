import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			l[i] = in.nextInt();
			r[i] = in.nextInt();
		}
		solve(s, l, r);
		in.close();
	}

	private static void solve(String s, int[] l, int[] r) {
		int[] c = new int[s.length() - 1];
		int ct = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C')
				ct++;
			c[i] = ct;
		}
		for (int i = 0; i < l.length; i++)
			solvePrint(c, l[i], r[i]);
	}

	private static void solvePrint(int[] c, int l, int r) {
		if (l == 1)
			System.out.println(c[r - 2]);
		else
			System.out.println(c[r - 2] - c[l - 2]);
	}
}