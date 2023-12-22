import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] <= b[i]) {
				ans += a[i];
			} else {
				ans += b[i] - a[i];
			}
		}
		System.out.println(ans);
	}
}
