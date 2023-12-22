import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] f = new int[n];
		for (int i = 0; i < f.length; i++) {
			f[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);
		Arrays.parallelSort(f);

		long start = -1;
		long end = 1000000000000L;

		while (Math.abs(end - start) > 1) {
			long mid = (end + start) / 2;
			if (judge(a, f, mid, k)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		System.out.println(end);
	}

	static boolean judge(int[] a, int[] f, long val, long k) {
		long t = 0;
		for (int i = 0; i < a.length; i++) {
			long v = val / f[i];
			t += Math.max(a[a.length - 1 - i] - v, 0);
		}
		return t <= k;
	}
	static class Obj implements Comparable<Obj> {
		int a, f;
		long c;
		@Override
		public int compareTo(Obj o) {
			return Long.compare(o.c, c);
		}
	}
}
