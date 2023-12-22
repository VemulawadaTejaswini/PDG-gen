import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int c = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		Arrays.parallelSort(t);

		int ans = 0;
		int s = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (cnt == 0) {
				s = t[i];
			}
			if (s + k < t[i] || cnt == c) {
				ans++;
				s = t[i];
				cnt = 1;
			} else {
				cnt++;
			}
		}
		if (cnt > 0) {
			ans++;
		}
		System.out.println(ans);
	}
}
