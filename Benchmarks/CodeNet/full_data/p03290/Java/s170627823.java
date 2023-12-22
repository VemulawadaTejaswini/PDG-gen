import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = Integer.parseInt(sc.next());
		int g = Integer.parseInt(sc.next());

		int[] p = new int[11];
		int[] c = new int[11];

		int ans = Integer.MAX_VALUE;

		for (int i = 1; i <= d; i++) {
			p[i] = Integer.parseInt(sc.next());
			c[i] = Integer.parseInt(sc.next());
		}

		for (int i = d; i >= 1; i--) {
			int cnt =  0;
			int score = 0;
			boolean ok = false;
			for (int j = i; j >= 1; j--) {
				for (int k = 1; k <= p[j]; k++) {
					cnt++;
					score += 100 * j;
					if (k == p[j]) {
						score += c[d];
					}
					if (score >= g) {
						ok = true;
						break;
					}
				}
				if (ok) {
					break;
				}
			}
			if (ok) {
				ans = Math.min(cnt, ans);
			}
		}

		System.out.println(ans);
	}
}
