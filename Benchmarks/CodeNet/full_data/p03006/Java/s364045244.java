import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long h[][] = new long[n][2];
		int ans = 0, i, j;

		for (i = 0; i < n; i++) {
			for (j = 0; j < 2; j++) {
				h[i][j] = sc.nextInt();
			}
		}
		long p = 0, q = 0, pp[] = new long[n], pq[] = new long[n];
		for (i = 0; i < n - 1; i++) {
			if (i == 1) {
				pp[i] = p;
				pq[i] = q;
			}
			p = h[i + 1][0] - h[i][0];
			q = h[i + 1][1] - h[i][1];
			if (p != 0 || q != 0) {
				if (!(p == pp[i] && q == pq[i])) {
					pp[i] = p;
					pq[i] = q;
				}
			}
		}
		String s[] = new String[n];
		for (i = 0; i < pp.length; i++) {
			s[i] = pp[i] + "," + pq[i];
		}
		Arrays.sort(s);
		for (i = 0; i < pp.length - 1; i++) {
			if (!s[i].equals(s[i + 1]))ans++;
		}
		System.out.println(ans);
	}
}