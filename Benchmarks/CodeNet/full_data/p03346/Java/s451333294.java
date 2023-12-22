import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		boolean[] b = new boolean[n + 1];
		b[n] = true;
		boolean[] c = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			if (!c[p[i] - 1]) {
				b[p[i] - 1] = true;
			}
			c[p[i]] = true;
		}

		int max = 0;
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			if (b[i]) {
				max = Math.max(max, cnt);
				cnt = 1;
			} else {
				cnt++;
			}
		}
		System.out.println(n - max);
	}
}
