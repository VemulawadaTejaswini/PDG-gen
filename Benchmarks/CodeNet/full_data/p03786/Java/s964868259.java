import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new Main().solve(in, out);
		in.close();
		out.close();
	}
	
	public void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int ans = 0;
		long s = 0;
		for (int i = 0; i + 1 < n; ++i) {
			s += a[i];
			++ ans;
			if (a[i + 1] > 2 * s) {
				ans = 0;
			}
		}
		++ ans;
		out.println(ans);
	}
}