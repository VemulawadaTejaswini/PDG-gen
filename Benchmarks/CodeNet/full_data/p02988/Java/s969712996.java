import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = in.nextInt();
		System.out.println(solve(p));
		in.close();
	}

	private static int solve(int[] p) {
		int r = 0;
		for (int i = 1; i < p.length - 1; i++)
			if (p[i - 1] < p[i] && p[i] <= p[i + 1])
				r++;
			else if (p[i] > p[i + 1] && p[i] <= p[i - 1])
				r++;
		return r;
	}
}
