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
				if (p[(i + 1) / 2] > 0)
					p[i] = 2;
				for (int j = 2; i * j <= 100000; j++) {
					p[i * j] = -1;
				}
			}
		}
		int q = Integer.parseInt(sc.next());
		int ans;
		int l;
		int r;
		for (int i = 0; i < q; i++) {
			l = Integer.parseInt(sc.next());
			r = Integer.parseInt(sc.next());
			ans = 0;
			for (int j = l; j <= r; j += 2)
				if (p[j] == 2)
					ans++;
			out.println(ans);
		}
		out.flush();
	}
}