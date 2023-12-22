import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
//		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		solve(n, arr);
	}

	int n;
	int[] p;
	SegTree seg;

	public void solve(int n_, int[] p_) {
		n = n_;
		p = p_;
		seg = new SegTree(n);
		for (int i = 0; i < n; ++i) {
			seg.setNew(i, p[i]);
		}
		for (int i = seg.n - 2; i >= 0; --i) {
			seg.v[i] = seg.merge(seg.v[2 * i + 1], seg.v[2 * i + 2]);
		}
		ArrayList<Pair> ans = f(0, n);
		for (int i = 0; i < ans.size(); ++i) {
			System.out.print(ans.get(i).fi + " " + ans.get(i).se + (i == ans.size() - 1 ? "\n" : " "));
		}

		// [ 0 , INF ]
		// [0,INF],[1,INF]
	}

	class Pair implements Comparable<Pair> {
		int fi, se, col, inNum;

		public Pair(int fi_, int se_, int col_, int inNum_) {
			fi = fi_;
			se = se_;
			col = col_;
			inNum = inNum_;
		}

		public int compareTo(Pair o) {
			if (col == o.col) {
				return Integer.compare(inNum, o.inNum);
			} else {
				if (fi != o.fi) {
					return Integer.compare(fi, o.fi);
				} else {
					return Integer.compare(se, o.se);
				}
			}
		};
	}

	int gen = 0;

	ArrayList<Pair> f(int l, int r) {
		ArrayList<Pair> ret = new ArrayList<>();
		if (r - l <= 1)
			return ret;
		State sFirst = seg.query(l, r)[l % 2];
		State sSecond = seg.query(sFirst.id + 1, r)[1 - l % 2];
		++gen;
		Pair pair = new Pair(sFirst.v, sSecond.v, gen, 0);
		seg.del(sFirst.id);
		seg.del(sSecond.id);
		ArrayList<Pair> s1 = f(l, sFirst.id);
		ArrayList<Pair> s2 = f(sFirst.id + 1, sSecond.id);
		ArrayList<Pair> s3 = f(sSecond.id + 1, r);
		for (int i = 0; i < s1.size(); ++i) {
			s1.get(i).col = 1;
			s1.get(i).inNum = i;
		}
		for (int i = 0; i < s2.size(); ++i) {
			s2.get(i).col = 2;
			s2.get(i).inNum = i;
		}
		for (int i = 0; i < s3.size(); ++i) {
			s3.get(i).col = 3;
			s3.get(i).inNum = i;
		}
		ret.add(pair);
		ArrayList<Pair> tmp = new ArrayList<>();
		tmp.addAll(s1);
		tmp.addAll(s2);
		tmp.addAll(s3);
		Collections.sort(tmp);
		ret.addAll(tmp);
		return ret;
	}

	class State {
		int v, id, sz;

		public State(int v_, int id_, int sz_) {
			v = v_;
			id = id_;
			sz = sz_;
		}

		State min(State o) {
			if (v != o.v) {
				if (Integer.compare(v, o.v) == -1) {
					return this.copy();
				} else {
					return o.copy();
				}
			} else {
				if (v > Integer.MAX_VALUE / 100)
					return this.copy();
				throw new AssertionError();
			}
		}

		State copy() {
			return new State(v, id, sz);
		}
	}

	public class SegTree {

		int n;
		State[][] v;

		public SegTree(int n_) {
			n = 1;
			while (n < n_) {
				n *= 2;
			}
			v = new State[2 * n - 1][2];// 0:left,1:right
			for (int i = 0; i < v.length; ++i) {
				v[i] = new State[] { new State(Integer.MAX_VALUE / 10, -1, 1),
						new State(Integer.MAX_VALUE / 10, -1, 1) };
			}
		}

		void setNew(int k, int val) {
			v[k + n - 1][0] = new State(val, k, 1);
			v[k + n - 1][1] = new State(Integer.MAX_VALUE / 10, k, 1);
		}

		void del(int k) {
			k += n - 1;
			v[k][0] = new State(Integer.MAX_VALUE / 10, -1, 1);
			v[k][1] = new State(Integer.MAX_VALUE / 10, -1, 1);
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = merge(v[2 * k + 1], v[2 * k + 2]);
			}
		}

		State[] merge(State[] sl, State[] sr) {
			State[] ret = new State[2];
			int sz = sl[0].sz;
			int totsz = sl[0].sz + sr[0].sz;
			ret[0] = sl[0].min(sr[sz % 2]);
			ret[1] = sl[1].min(sr[1 - (sz % 2)]);
			ret[0].sz = totsz;
			ret[1].sz = totsz;
			return ret;
		}

		State[] query(int a, int b) {
			return query(a, b, 0, n, 0);
		}

		State[] query(int a, int b, int l, int r, int k) {
			if (a <= l && r <= b) {
				return v[k];
			} else if (b <= l || r <= a) {
				return new State[] { new State(Integer.MAX_VALUE / 10, -1, r - l),
						new State(Integer.MAX_VALUE / 10, -1, r - l) };
			} else {
				State[] sl = query(a, b, l, (l + r) / 2, 2 * k + 1);
				State[] sr = query(a, b, (l + r) / 2, r, 2 * k + 2);
				return merge(sl, sr);
			}
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}