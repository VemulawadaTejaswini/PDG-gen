import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int w = in.nextInt();
		int h = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		solve(w, h, x, y);
		in.close();
	}

	private static void solve(long w, long h, long x, long y) {
		System.out.println(w * h / 2.0);
		if (x * 2 == w && y * 2 == h)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
