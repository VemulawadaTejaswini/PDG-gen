import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		sc.close();

		if (h % 3 == 0 || w % 3 == 0) {
			System.out.println(0);
			return;
		}
		long ans = Math.min(h, w);
		for (int i = 1; i < h; i++) {
			long a = w * i;
			long b = w / 2 * (h - i);
			long v = Math.abs(a - b);
			if (w % 2 == 1) {
				long c = (w / 2 + 1) * (h - i);
				v = Math.max(v, Math.abs(a - c));
			}
			ans = Math.min(ans, v);
		}
		for (int i = 1; i < w; i++) {
			long a = h * i;
			long b = h / 2 * (w - i);
			long v = Math.abs(a - b);
			if (h % 2 == 1) {
				long c = (h / 2 + 1) * (w - i);
				v = Math.max(v, Math.abs(a - c));
			}
			ans = Math.min(ans, v);
		}
		System.out.println(ans);
	}
}
