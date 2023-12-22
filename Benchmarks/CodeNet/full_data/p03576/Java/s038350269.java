import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		long[] x = new long[n];
		long[] y = new long[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		long ans = Long.MAX_VALUE;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				for (int c = 0; c < n; c++) {
					for (int d = 0; d < n; d++) {
						int cnt = 0;
						for (int i = 0; i < n; i++) {
							if (x[a] <= x[i] && x[i] <= x[b]
									&& y[c] <= y[i] && y[i] <= y[d]) {
								cnt++;
							}
						}
						if (cnt >= k) {
							ans = Math.min(ans, Math.abs((x[b] - x[a]) * (y[d] - y[c])));
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
