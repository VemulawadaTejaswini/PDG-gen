import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solve(Integer.parseInt(sc.next()), 0));
	}
	public static int solve(int n, int c) {
		if (n < 6) return c + n;
		int a = 1,b = 1;
		while (a * 6 <= n) a *= 6;
		while (b * 9 <= n) b *= 9;
		return Math.min(solve(n - a, c + 1), solve(n - b, c + 1));
	}
}