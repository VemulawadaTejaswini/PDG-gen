import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		Kouji[] arr = new Kouji[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Kouji o = new Kouji();
			o.s = Integer.parseInt(sa[0]);
			o.t = Integer.parseInt(sa[1]);
			o.x = Integer.parseInt(sa[2]);
			o.s = Math.max(o.s - o.x, 0);
			o.t = Math.max(o.t - o.x, 0);
			arr[i] = o;
		}
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < q; i++) {
			map.put(Integer.parseInt(br.readLine()), i);
		}
		br.close();

		Arrays.parallelSort(arr);

		int[] ans = new int[q];
		Arrays.fill(ans, -1);

		for (int i = 0; i < n; i++) {
			Kouji o = arr[i];
			SortedMap<Integer, Integer> sm = map.subMap(o.s, o.t);
			Integer[] keys = sm.keySet().toArray(new Integer[0]);
			for (Integer k : keys) {
				ans[sm.get(k)] = o.x;
				map.remove(k);
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	static class Kouji implements Comparable<Kouji> {
		int s, t, x;
		public String toString() {
			return "[" + s + "," + t + "," + x + "]";
		}

		public int compareTo(Kouji o) {
			return x - o.x;
		}
	}
}
