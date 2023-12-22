import java.util.Scanner;
public class Main {
	static int[] sx;
	static int[] sy;
	static int x;
	static int y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("T");
		x = Integer.parseInt(sc.next());
		y = Integer.parseInt(sc.next());
		if (s.length == 0) {
			if (x == 0 && y == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
			return;
		}
		sx = new int[(s.length + 1) / 2 - 1];
		sy = new int[s.length / 2];
		for (int i = 1; i < s.length; i++) {
			if (i % 2 == 0)
				sx[i / 2 - 1] = s[i].length();
			else
				sy[i / 2] = s[i].length();
		}
		if (xSolve(0, s[0].length()) && ySolve(0, 0))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static boolean xSolve(int n, int m) {
		if (n == sx.length) {
			if (m == x)
				return true;
			else
				return false;
		}
		return xSolve(n + 1, m + sx[n]) || xSolve(n + 1, m - sx[n]);
	}
	public static boolean ySolve(int n, int m) {
		if (n == sy.length) {
			if (m == y)
				return true;
			else
				return false;
		}
		return ySolve(n + 1, m + sy[n]) || ySolve(n + 1, m - sy[n]);
	}
}