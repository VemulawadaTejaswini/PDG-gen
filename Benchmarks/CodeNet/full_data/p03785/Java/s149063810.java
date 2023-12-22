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
		int c = in.nextInt();
		int k = in.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; ++i) {
			t[i] = in.nextInt();
		}
		Arrays.sort(t);
		int p = 1, ind = 0, ans = 1;
		for (int i = 1; i < n; ++i) {
			if (p == c || t[i] - t[ind] > k) {
				p = 1;
				ind = i;
				++ans;
			} else {
				++p;
			}
		}
		out.println(ans);
	}
}