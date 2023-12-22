import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] aa = new int[n];
		int[] bb = new int[n];
		System.arraycopy(a, 0, aa, 0, n);
		System.arraycopy(b, 0, bb, 0, n);
		Arrays.parallelSort(aa);
		Arrays.parallelSort(bb);

		int[] cnt = new int[n];
		int x = 0;
		for (int i = 0; i < n; i++) {
			while (x < n && aa[x] <= bb[i]) {
				x++;
			}
			cnt[i] = x;
		}

		boolean flg = false;
		for (int i = 0; i < n; i++) {
			if (cnt[i] < i + 1) {
				System.out.println("No");
				return;
			}
			if (cnt[i] > i + 1) {
				flg = true;
			}
		}
		if (flg) {
			System.out.println("Yes");
			return;
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n - 1; i++) {
			map.put(aa[i], bb[i + 1]);
		}
		map.put(aa[n - 1], bb[0]);

		int cnt2 = 0;
		for (int i = 0; i < n; i++) {
			int val = map.get(a[i]);
			if (val == b[i]) {
				cnt2++;
			}
		}
		if (cnt2 == n) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
