import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			arr[i] = o;
		}
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(br.readLine()) - 1;
			arr[a].list.add(arr[i]);
		}
		br.close();

		dfs(arr, arr[0]);
		System.out.println(arr[0].d);
	}

	static void dfs(Obj[] arr, Obj cur) {
		List<Obj> list = cur.list;
		if (!list.isEmpty()) {
			for (Obj next : list) {
				dfs(arr, next);
			}
			Collections.sort(list);
			int d = 0;
			for (int i = 0; i < list.size(); i++) {
				d = Math.max(d, list.get(i).d);
				d++;
			}
			cur.d = d;
		}
	}

	static class Obj implements Comparable<Obj> {
		int i, d;
		List<Obj> list = new ArrayList<>();

		@Override
		public int compareTo(Obj o) {
			return d - o.d;
		}
	}
}
