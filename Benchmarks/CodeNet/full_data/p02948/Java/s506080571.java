import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.a = Integer.parseInt(sa[0]);
			o.b = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr);

		int[] val = new int[m];
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < m; i++) {
			set.add(i);
		}
		for (int i = 0; i < n; i++) {
			Integer[] rem = set.headSet(m - arr[i].a + 1).toArray(new Integer[0]);
			for (int j = rem.length - 1; j >= 0; j--) {
				if (val[rem[j]] == 0) {
					val[rem[j]] = arr[i].b;
					set.remove(rem[j]);
					break;
				}
			}
		}

		long ans = 0;
		for (int i = 0; i < m; i++) {
			ans += val[i];
		}
		System.out.println(ans);
	}

	static class Obj implements Comparable<Obj> {
		int a, b;

		public int compareTo(Obj o) {
			return o.b - b;
		}
	}
}
