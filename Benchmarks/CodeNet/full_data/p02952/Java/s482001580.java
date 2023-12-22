import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		System.out.println(solve(n));
		in.close();
	}

	private static int solve(int n) {
		int r = 0;
		int l = 1;
		int h = 10;
		while (true) {
			if (n < l)
				return r;
			if (n < h)
				return r + n - l + 1;
			r += h - l;
			l *= 100;
			h *= 100;
		}
	}
}