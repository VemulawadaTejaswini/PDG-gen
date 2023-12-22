import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long ans = 0;
		for (int i = 0; i < n; i++) {
			long x = i + 1;
			for (int j = i; j >= 0; j--) {
				if (a[j] < a[i]) {
					x = i - j;
					break;
				}
			}
			long y = n - i;
			for (int j = i; j < n; j++) {
				if (a[j] < a[i]) {
					y = j - i;
					break;
				}
			}
			ans += x * y * a[i];
		}
		System.out.println(ans);
	}
}
