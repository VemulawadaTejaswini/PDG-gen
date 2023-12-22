import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int h = Integer.parseInt(sa[1]);
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, a[i]);
		}

		Arrays.parallelSort(b);
		List<Integer> list = new ArrayList<Integer>();
		int ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (b[i] < max) {
				break;
			}
			list.add(b[i]);
			h -= b[i];
			ans++;
			if (h <= 0) {
				System.out.println(ans);
				return;
			}
		}

		System.out.println(ans + (h + max - 1) / max);
	}
}
