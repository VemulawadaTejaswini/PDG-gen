import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] cntm = new int[m];
		int[] cntx = new int[100001];
		for (int i = 0; i < n; i++) {
			cntm[x[i] % m]++;
			cntx[x[i]]++;
		}

		int ans = cntm[0] / 2;
		int m2 = (m + 1) / 2;
		if (m % 2 == 0) {
			ans += cntm[m2] / 2;
		}
		for (int i = 1; i < m2; i++) {
			if (cntm[i] < cntm[m - i]) {
				ans += cntm[i];
				int d = cntm[m - i] - cntm[i];
				d /= 2;
				int same = 0;
				for (int j = i; j < cntx.length; j+=m) {
					same += cntx[j] / 2;
				}
				ans += Math.min(same, d);
			} else {
				ans += cntm[m - i];
				int d = cntm[i] - cntm[m - i];
				d /= 2;
				int same = 0;
				for (int j = m - i; j < cntx.length; j+=m) {
					same += cntx[j] / 2;
				}
				ans += Math.min(same, d);
			}
		}
		System.out.println(ans);
	}
}
