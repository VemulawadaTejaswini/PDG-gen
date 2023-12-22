import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++)
			h[i] = in.nextInt();
		System.out.println(solve(n, h));
		in.close();
	}

	private static String solve(int n, int[] h) {
		h[0]--;
		for (int i = 1; i < n; i++)
			if (h[i] > h[i - 1])
				h[i]--;
			else if (h[i] < h[i - 1])
				return "No";
		return "Yes";
	}
}