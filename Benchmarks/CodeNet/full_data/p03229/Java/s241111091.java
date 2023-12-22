import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		Arrays.parallelSort(a);
		int mid = (a.length - 1) / 2;
		int l = 0;
		int r = a.length - 1;
		long ans = a[r] - a[mid];
		boolean rflg = true;
		while (l < mid && mid < r) {
			ans += a[r] - a[l];
			if (rflg) {
				r--;
			} else {
				l++;
			}
			rflg = !rflg;
		}
		if (a.length % 2 == 1) {
			mid = a.length / 2;
			l = 0;
			r = a.length - 1;
			long ans2 = a[mid] - a[l];
			rflg = false;
			while (l < mid && mid < r) {
				ans2 += a[r] - a[l];
				if (rflg) {
					r--;
				} else {
					l++;
				}
				rflg = !rflg;
			}
			ans = Math.max(ans, ans2);
		}
		System.out.println(ans);
	}
}
