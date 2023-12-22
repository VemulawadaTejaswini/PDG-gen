import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int d = Integer.parseInt(sa[1]);
		int a = Integer.parseInt(sa[2]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.x = Integer.parseInt(sa[0]);
			o.h = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, (o1, o2) -> o1.x - o2.x);

		long ans = 0;
		long now = 0;
		TreeMap<Integer, Long> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			Obj o = arr[i];
			Map<Integer, Long> map2 = map.headMap(o.x - d);
			for (Long val : map2.values()) {
				now -= val;
			}
			map2.clear();
			long rem = Math.max(o.h - now, 0);
			long cnt = (rem + a - 1) / a;
			ans += cnt;
			rem = a * cnt;
			now += rem;
			map.put(o.x + d, rem);
		}
		System.out.println(ans);
	}

	static class Obj {
		int x, h;
	}
}
