import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.println(solve(n, k));
		in.close();
	}

	private static double solve(int n, int k) {
		double r = 0;
		for (int i = 1; i <= n; i++) {
			int p = i;
			double x = 1;
			x /= n;
			while (p < k) {
				p *= 2;
				x /= 2;
			}
			r += x;
		}
		return r;
	}
}