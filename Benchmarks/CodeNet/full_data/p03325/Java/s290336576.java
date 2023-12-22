import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.println(solve(a));
		in.close();
	}

	private static int solve(int[] a) {
		int r = 0;
		for (int i = 0; i < a.length; i++)
			for (; a[i] % 2 == 0; a[i] /= 2)
				r++;
		return r;
	}
}