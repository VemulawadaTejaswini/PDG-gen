import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int x = in.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++)
			l[i] = in.nextInt();
		System.out.println(solve(n, x, l));
		in.close();
	}

	private static int solve(int n, int x, int[] l) {
		int d = 0;
		for (int i = 0; i < n; i++) {
			d += l[i];
			if (d > x)
				return i + 1;
		}
		return n + 1;
	}
}
