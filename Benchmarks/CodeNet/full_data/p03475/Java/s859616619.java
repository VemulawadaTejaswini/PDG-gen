import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int c[] = new int[n];
		int s[] = new int[n];
		int f[] = new int[n];
		for (int i = 1; i < n; i++) {
			c[i] = Integer.parseInt(sc.next());
			s[i] = Integer.parseInt(sc.next());
			f[i] = Integer.parseInt(sc.next());
		}
		for (int i = 1; i <= n; i++) {
			int t = 0;
			for (int j = i; j < n; j++) {
				if (t < s[j])
					t = s[j];
				else if ( t % f[j] != 0)
					t += f[j] - t % f[j];
				t += c[j];
			}
			out.println(t);
		}
		out.flush();
	}
}