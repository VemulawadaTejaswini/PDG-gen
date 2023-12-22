import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		long r = solve(n);
		System.out.println(r);
		in.close();
	}

	private static long solve(int n) {
		long r = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++)
				for (int k = 1; k <= n; k++) {
					r += gcm(i, gcm(j, k));
				}
		return r;
	}

	private static int gcm(int a, int b) {
		if (a < b)
			return gcm(b, a);
		if (a % b == 0)
			return b;
		return gcm(b, a % b);
	}

}