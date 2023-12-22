import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("T");
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		if (s.length == 0) {
			if (x == 0 && y == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
			return;
		}
		int[] sx = new int[(s.length + 1) / 2 - 1];
		int[] sy = new int[s.length / 2];
		for (int i = 1; i < s.length; i++) {
			if (i % 2 == 0)
				sx[i / 2 - 1] = s[i].length();
			else
				sy[i / 2] = s[i].length();
		}
		boolean[][] dpx = new boolean[sx.length + 1][20000];
		boolean[][] dpy = new boolean[sy.length + 1][20000];
		int center = 10000;
		dpx[0][center + s[0].length()] = true;
		dpy[0][center] = true;
		for (int i = 1; i <= sx.length; i++) {
			int t = sx[i - 1];
			for (int j = 0; j < 20000; j++) {
				if (j - t >= 0 && dpx[i - 1][j - t] || j + t < 20000 && dpx[i - 1][j + t])
					dpx[i][j] = true;
			}
		}
		for (int i = 1; i <= sy.length; i++) {
			int t = sy[i - 1];
			for (int j = 0; j < 20000; j++) {
				if (j - t >= 0 && dpy[i - 1][j - t] || j + t < 20000 && dpy[i - 1][j + t])
					dpy[i][j] = true;
			}
		}
		if (dpx[sx.length][center + x] && dpy[sy.length][center + y])
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}