import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Obj> listL = new ArrayList<>(n);
		List<Obj> listR = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.i = i;
			o.l = Integer.parseInt(sa[0]);
			o.r = Integer.parseInt(sa[1]);
			o.v = o.r - o.l + 1;
			listL.add(o);
			listR.add(o);
		}
		br.close();

		int ans1 = 0;
		Obj obj1 = new Obj();
		for (int i = 0; i < n; i++) {
			Obj o = listL.get(i);
			if (o.v > ans1) {
				ans1 = o.v;
				obj1 = o;
			}
		}
		obj1.t = 1;

		int min = Integer.MAX_VALUE;
		Obj obj2 = null;
		for (int i = 0; i < n; i++) {
			Obj o = listL.get(i);
			if (o.t == 0) {
				int l = Math.max(obj1.l, o.l);
				int r = Math.min(obj1.r, o.r);
				int v = Math.max(r - l + 1, 0);
				if (v < min) {
					min = v;
					obj2 = o;
				}
			}
		}
		obj2.t = 2;

		int al1 = obj1.l;
		int ar1 = obj1.r;
		ans1 = Math.max(ar1 - al1 + 1, 0);
		int al2 = obj2.l;
		int ar2 = obj2.r;
		int ans2 = Math.max(ar2 - al2 + 1, 0);
		for (int i = 0; i < n; i++) {
			Obj o = listL.get(i);
			if (o.t == 0) {
				int l1 = Math.max(al1, o.l);
				int r1 = Math.min(ar1, o.r);
				int v1 = Math.max(r1 - l1 + 1, 0);
				int l2 = Math.max(al2, o.l);
				int r2 = Math.min(ar2, o.r);
				int v2 = Math.max(r2 - l2 + 1, 0);
				if (v1 + ans2 > ans1 + v2) {
					al1 = l1;
					ar1 = r1;
					ans1 = Math.max(ar1 - al1 + 1, 0);
				} else {
					al2 = l2;
					ar2 = r2;
					ans2 = Math.max(ar2 - al2 + 1, 0);
				}
			}
		}

		System.out.println(ans1 + ans2);
	}

	static class Obj {
		int i, l, r, v, t;
	}
}
