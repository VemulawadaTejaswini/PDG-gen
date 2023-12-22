import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int[] a = new int[h * w + 1];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				a[Integer.parseInt(sc.next())] = i * 1000 + j;
		int q = Integer.parseInt(sc.next());
		for (int i = 0; i < q; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			int ans = 0;
			int xd = a[l] / 1000;
			int yd = a[l] % 1000;
			while(true) {
				if (l == r) {
					out.println(ans);
					break;
				}
				int x = xd;
				int y = yd;
				l += d;
				xd = a[l] / 1000;
				yd = a[l] % 1000;
				ans += Math.abs(xd - x) + Math.abs(yd - y);
			}
		}
		out.flush();
	}
}