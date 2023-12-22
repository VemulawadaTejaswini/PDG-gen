import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int r = solve(n, m);
		System.out.println(r);
		in.close();
	}

	private static int solve(int n, int m) {
		int r = 0;
		if (n > 1)
			r += (n * (n - 1) / 2);
		if (m > 1)
			r += (m * (m - 1) / 2);
		return r;
	}
}