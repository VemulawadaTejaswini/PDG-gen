import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int h = Integer.parseInt(s[0]);
		int w = Integer.parseInt(s[1]);
		String[] al = new String[h];
		for (int i = 0; i < h; i++) {
			al[i] = br.readLine();
		}
		br.close();

		List<String> list = new ArrayList<String>();
		String prev = al[0];
		list.add(prev);
		for (int i = 1; i < h; i++) {
			if (!prev.equals(al[i])) {
				prev = al[i];
				list.add(prev);
			}
		}

		PriorityQueue<Obj> pq = new PriorityQueue<Obj>();
		Obj[] array = new Obj[list.size()];
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			char pre = str.charAt(0);
			int cnt = 0;
			for (int j = 1; j < w; j++) {
				char ch = str.charAt(j);
				if (pre != ch) {
					pre = ch;
					cnt++;
				}
			}
			Obj o = new Obj();
			o.idx = i;
			while (cnt > 0) {
				cnt /= 2;
				o.cpx++;
			}
			array[i] = o;
			pq.add(o);
		}

		while (!pq.isEmpty()) {
			Obj cur = pq.poll();
			Obj l = null;
			Obj r = null;

			for (int i = cur.idx - 1; i >= 0; i--) {
				if (array[i] != null) {
					l = array[i];
					break;
				}
			}
			for (int i = cur.idx + 1; i < array.length; i++) {
				if (array[i] != null) {
					r = array[i];
					break;
				}
			}

			if (l == null) {
				if (r == null) {
					System.out.println(cur.cpx);
					break;
				} else {
					r.cpx = Math.max(cur.cpx, r.cpx) + 1;
					array[cur.idx] = null;
				}
			} else {
				if (r == null) {
					l.cpx = Math.max(cur.cpx, l.cpx) + 1;
					array[cur.idx] = null;
				} else {
					if (l.cpx < r.cpx) {
						l.cpx = Math.max(cur.cpx, l.cpx) + 1;
						array[cur.idx] = null;
					} else {
						r.cpx = Math.max(cur.cpx, r.cpx) + 1;
						array[cur.idx] = null;
					}
				}
			}
		}
	}

	static class Obj implements Comparable<Obj>{
		int idx, cpx;

		public int compareTo(Obj o) {
			return cpx - o.cpx;
		}
	}
}
