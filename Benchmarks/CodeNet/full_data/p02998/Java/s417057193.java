import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Obj[] arr = new Obj[n];
		Map<Integer, List<Obj>> mapx = new HashMap<>();
		Map<Integer, List<Obj>> mapy = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.x = sc.nextInt();
			o.y = sc.nextInt();
			arr[i] = o;

			List<Obj> listx = mapx.get(o.x);
			if (listx == null) {
				listx = new ArrayList<>();
				mapx.put(o.x, listx);
			}
			listx.add(o);

			List<Obj> listy = mapy.get(o.y);
			if (listy == null) {
				listy = new ArrayList<>();
				mapy.put(o.y, listy);
			}
			listy.add(o);
		}
		sc.close();

		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (!arr[i].used) {
				Queue<Obj> que = new ArrayDeque<>();
				que.add(arr[i]);
				arr[i].used = true;
				Set<Integer> setx = new HashSet<>();
				Set<Integer> sety = new HashSet<>();
				setx.add(arr[i].x);
				sety.add(arr[i].y);
				while (!que.isEmpty()) {
					Obj cur = que.poll();
					for (Obj next : mapx.get(cur.x)) {
						if (!next.used) {
							que.add(next);
							next.used = true;
							sety.add(next.y);
						}
					}
					for (Obj next : mapy.get(cur.y)) {
						if (!next.used) {
							que.add(next);
							next.used = true;
							setx.add(next.x);
						}
					}
				}
				ans += (long) setx.size() * sety.size();
			}
		}
		System.out.println(ans - n);
	}

	static class Obj {
		int x, y;
		boolean used;
	}
}
