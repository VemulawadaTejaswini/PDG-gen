import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];
		for (int i = 0; i < n + 1; i++)
			a[i] = in.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = in.nextInt();
		System.out.println(solve(a, b));
		in.close();
	}

	private static long solve(int[] a, int[] b) {
		long r = 0;
		for (int i = 0; i < b.length; i++)
			for (int j = i; j <= i + 1; j++)
				if (a[j] > b[i]) {
					r += b[i];
					a[j] -= b[i];
					b[i] = 0;
				} else {
					r += a[j];
					b[i] -= a[j];
					a[j] = 0;
				}
		return r;
	}
}
