import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Hen[] arr = new Hen[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.l = Integer.parseInt(sa[0]) - 1;
			h.r = Integer.parseInt(sa[1]) - 1;
			h.c = Integer.parseInt(sa[2]);
			arr[i] = h;
		}
		br.close();

		Arrays.parallelSort(arr);

		long[] d = new long[n];
		Arrays.fill(d, Long.MAX_VALUE);
		d[0] = 0;
		for (int i = 0; i < m; i++) {
			Hen h = arr[i];
			if (d[h.l] == Long.MAX_VALUE) {
				System.out.println(-1);
				return;
			}
			long alt = d[h.l] + h.c;
			for (int j = h.r; j > h.l; j--) {
				if (d[j] <= alt) {
					break;
				}
				d[j] = alt;
			}
		}
		if (d[n - 1] == Long.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(d[n - 1]);
		}
	}

	static class Hen implements Comparable<Hen> {
		int l, r, c;

		@Override
		public int compareTo(Hen o) {
			if (l != o.l) {
				return l - o.l;
			}
			if (c != o.c) {
				return c - o.c;
			}
			return r - o.r;
		}
	}
}
