import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
//		int w = Integer.parseInt(sa[1]);
		int n = Integer.parseInt(sa[2]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.x = Integer.parseInt(sa[0]);
			o.y = Integer.parseInt(sa[1]);
			o.z = o.y - o.x;
			arr[i] = o;
		}
		br.close();

		Arrays.sort(arr, (o1, o2) -> {
			if (o1.y != o2.y) {
				return o1.y - o2.y;
			}
			return o1.x - o2.x;
		});

		int ans = h;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(1, 1);
		for (Obj o : arr) {
			if (o.x > ans) {
				continue;
			}
			int val = map.floorEntry(o.x).getValue();
			if (o.z < val) {
				ans = o.x - 1;
			} else {
				map.put(o.x, Math.min(val, o.z - 1));
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int x, y, z;
	}
}
