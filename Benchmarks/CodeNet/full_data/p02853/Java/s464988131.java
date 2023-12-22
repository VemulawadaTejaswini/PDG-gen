
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x = in.nextInt();
		int y = in.nextInt();
		int r = solve(x, y);
		System.out.println(r);
		in.close();
	}

	private static int solve(int x, int y) {
		int r = 0;
		switch (x) {
		case 1:
			r += 300000;
			break;
		case 2:
			r += 200000;
			break;
		case 3:
			r += 100000;
		}
		switch (y) {
		case 1:
			r += 300000;
			break;
		case 2:
			r += 200000;
			break;
		case 3:
			r += 100000;
		}
		if (x == 1 && y == 1)
			r += 400000;
		return r;
	}
}