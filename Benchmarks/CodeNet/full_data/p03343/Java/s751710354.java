import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int q = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int x = k + q - 1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < x; i++) {
			min = Math.min(min, a[i]);
		}
		for (int i = n - x; i < n; i++) {
			min = Math.min(min, a[i]);
		}

		Arrays.parallelSort(a);

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] > min) {
				break;
			}
			int val = a[i + q - 1] - a[i];
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
