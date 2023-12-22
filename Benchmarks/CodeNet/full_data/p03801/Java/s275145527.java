import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		TreeMap<Integer, Obj> map = new TreeMap<>();
		map.put(0, new Obj());
		long under = 0;
		for (int i = 0; i < n; i++) {
			Integer h = map.ceilingKey(a[i]);
			if (h == null) {
				Obj o = new Obj();
				o.i = i;
				o.size = 1;
				map.put(a[i], o);
			} else {
				Integer l = map.floorKey(a[i]);
				if (l == 0) {
					under += a[i];
				} else {
					map.get(l).size++;
				}
			}
		}

		long[] ans = new long[n];
		int sum = 0;
		Integer[] arr = map.keySet().toArray(new Integer[0]);
		for (int i = arr.length - 1; i > 0; i--) {
			Obj o = map.get(arr[i]);
			sum += o.size;
			ans[o.i] += (arr[i] - arr[i - 1]) * sum;
		}
		ans[0] += under;

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	static class Obj {
		int i, size;
	}
}
