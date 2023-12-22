import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(solve(a));
		in.close();
	}

	private static String solve(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (sTry(a, i, j))
					return "Yes";
		return "No";
	}

	private static boolean sTry(int[] a, int i0, int i1) {
		int r[] = new int[a.length];
		r[0] = a[i0];
		r[1] = a[i1];
		for (int i = 2; i < a.length; i++)
			r[i] = r[i - 2] ^ r[i - 1];
		if ((r[0] ^ r[a.length - 2]) != r[a.length - 1])
			return false;
		Arrays.sort(a);
		Arrays.sort(r);
		for (int i = 0; i < a.length; i++)
			if (a[i] != r[i])
				return false;
		return true;
	}
}
