import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			o.p = Integer.parseInt(sa[i]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr);

		long ans = 0;
		TreeSet<Integer> set = new TreeSet<>();
		for (Obj o : arr) {
			int i = o.i;
			Integer l1 = set.lower(i);
			if (l1 == null) {
				l1 = -1;
			}
			Integer l2 = set.lower(l1);
			if (l2 == null) {
				l2 = -1;
			}

			Integer r1 = set.higher(i);
			if (r1 == null) {
				r1 = n;
			}
			Integer r2 = set.higher(r1);
			if (r2 == null) {
				r2 = n;
			}

			long val = (long) (l1 - l2) * (r1 - i) + (long) (i - l1) * (r2 - r1);
			ans += val * o.p;
			set.add(i);
		}
		System.out.println(ans);
	}

	static class Obj implements Comparable<Obj> {
		int i, p;

		@Override
		public int compareTo(Obj o) {
			return o.p - p;
		}
	}
}
