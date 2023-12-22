import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int[] p = new int[100001];
		p[2] = 1;
		for (int i = 3; i <= 100000; i += 2) {
			if (p[i] != -1) {
				p[i] = 1;
				for (int j = 2; i * j <= 100000; j++) {
					p[i * j] = -1;
				}
			}
		}
		int q = Integer.parseInt(sc.next());
		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			for (int j = l; j <= r; j += 2)
				if (p[j] == 1 && p[(j + 1) / 2] == 1)
					ans[i]++;
		}
		for (int i = 0; i < q; i++)
			out.println(ans[i]);
		out.flush();
	}
}