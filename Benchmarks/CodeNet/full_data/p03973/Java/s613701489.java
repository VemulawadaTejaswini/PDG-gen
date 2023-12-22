import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		long ans = 0;
		int x = 1;
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				x++;
			}
			ans += (a[i] - 1) / x;
			if (x == 1) {
				x++;
			}
		}
		System.out.println(ans);
	}
}
