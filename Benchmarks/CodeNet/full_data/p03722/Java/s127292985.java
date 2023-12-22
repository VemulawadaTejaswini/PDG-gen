import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
			c[i] = -Integer.parseInt(sa[2]);
		}
		br.close();

		long[] d = new long[n];
		Arrays.fill(d, 1_000_000_000_000_000_000L);
		d[0] = 0;
		boolean upd = true;
		for (int i = 0; i <= n && upd; i++) {
			upd = false;
			for (int j = 0; j < m; j++) {
				long alt = d[a[j]] + c[j];
				if (d[b[j]] > alt) {
					d[b[j]] = alt;
					upd = true;
				}
			}
			if (i == n) {
				System.out.println("inf");
				return;
			}
		}
		System.out.println(-d[n - 1]);
	}
}
