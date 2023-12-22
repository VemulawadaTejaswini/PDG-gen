import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		Obj[] arr1 = new Obj[n];
		Obj[] arr2 = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int l = Integer.parseInt(sa[0]);
			int r = Integer.parseInt(sa[1]);
			Obj o = new Obj();
			o.i = i;
			o.l = l;
			o.r = r;
			arr1[i] = o;
			arr2[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr1, (o1, o2) -> o1.r - o2.r);
		Arrays.parallelSort(arr2, (o1, o2) -> o2.l - o1.l);

		long ans1 = calc(arr1, arr2, n, false);
		long ans2 = calc(arr1, arr2, n, true);
		System.out.println(Math.max(ans1, ans2));
	}

	static long calc(Obj[] arr1, Obj[] arr2, int n, boolean start) {
		long ans = 0;
		boolean[] used = new boolean[n];
		int now = 0;
		boolean flg = start;
		int i = 0;
		int j = 0;
		while (i < n && j < n) {
			Obj o = arr1[i];
			if (used[o.i]) {
				i++;
			} else {
				if (!flg) {
					long val = now - o.r;
					if (val > 0) {
						ans += val;
						used[o.i] = true;
						flg = true;
						now = o.r;
					}
					i++;
				}
			}
			o = arr2[j];
			if (used[o.i]) {
				j++;
			} else {
				if (flg) {
					long val = o.l - now;
					if (val > 0) {
						ans += val;
						used[o.i] = true;
						flg = false;
						now = o.l;
					}
					j++;
				}
			}
		}
		ans += Math.abs(now);
		return ans;
	}

	static class Obj {
		int i, l, r;
	}
}
