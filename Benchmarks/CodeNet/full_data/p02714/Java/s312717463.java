//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		// int t = reader.ni();
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	private void run_case() {
		int n = reader.ni();
		String str = reader.ns();

		long res = 0;

		Set<Integer> idx_r = new HashSet<>();
		Set<Integer> idx_g = new HashSet<>();
		Set<Integer> idx_b = new HashSet<>();

		SegmentTreeRSQ st_r = new SegmentTreeRSQ(0, n);
		SegmentTreeRSQ st_g = new SegmentTreeRSQ(0, n);
		SegmentTreeRSQ st_b = new SegmentTreeRSQ(0, n);

		for (int i=0; i<n; i++) {
			char c = str.charAt(i);
			if (c == 'R') {
				idx_r.add(i);
				st_r.update(i, 1);
				for (int u : idx_g) {
					int dist = i - u;
					long t = st_b.query(0, u);
					long overlap = st_b.query(u - dist, u - dist);
					res += (t - overlap);
				}
				for (int u : idx_b) {
					int dist = i - u;
					long t = st_g.query(0, u);
					long overlap = st_g.query(u - dist, u - dist);
					res += (t - overlap);
				}
			} else if (c == 'G') {
				idx_g.add(i);
				st_g.update(i, 1);
				for (int u : idx_r) {
					int dist = i - u;
					long t = st_b.query(0, u);
					long overlap = st_b.query(u - dist, u - dist);
					res += (t - overlap);
				}
				for (int u : idx_b) {
					int dist = i - u;
					long t = st_r.query(0, u);
					long overlap = st_r.query(u - dist, u - dist);
					res += (t - overlap);
				}
			} else if (c == 'B') {
				idx_b.add(i);
				st_b.update(i, 1);
				for (int u : idx_r) {
					int dist = i - u;
					long t = st_g.query(0, u);
					long overlap = st_g.query(u - dist, u - dist);
					res += (t - overlap);
				}
				for (int u : idx_g) {
					int dist = i - u;
					long t = st_r.query(0, u);
					long overlap = st_r.query(u - dist, u - dist);
					res += (t - overlap);
				}
			}
		}

		System.out.println(res);
		return;
	}
}


class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}

class SegmentTreeRSQ {
	SegmentTreeRSQNode root = null;
    int[] nums;
	int inf = Integer.MAX_VALUE;

	public SegmentTreeRSQ(int start, int end) {
		root = new SegmentTreeRSQNode(start, end);
	}

	public void update(int i, long val) {
		if (root == null || i < root.start || i > root.end) return;
        update(root, i, val);
    }
    public void update(SegmentTreeRSQNode root, int i, long val) {
		if (root == null) return;
        if (root.start == i && root.end == i) root.sum = val;
        else {
            int mid = root.mid();
			// split
			// if (root.left == null) root.left = new SegmentTreeRSQNode(root.start, mid);
            // if (root.right == null) root.right = new SegmentTreeRSQNode(mid+1, root.end);
			// visit
            if (i <= mid) {
				if (root.left == null) root.left = new SegmentTreeRSQNode(root.start, mid);
				update(root.left, i, val);
            } else {
				if (root.right == null) root.right = new SegmentTreeRSQNode(mid+1, root.end);
				update(root.right, i, val);
			}
			// merge
			long sum_l = root.left != null ? root.left.sum : 0;
			long sum_r = root.right != null ? root.right.sum : 0;
			root.sum = sum_l + sum_r;
        }
    }

	public long query(int start, int end) {
        if (root == null) return 0;
        else return query(root, start, end);
    }
	public long query(SegmentTreeRSQNode root, int start, int end) {
		if (root == null) return 0;
        if (start > end) {
			return 0;
        } else if (root.start == start && root.end == end){
			return root.sum;
        } else {
            int mid = root.mid();
            if (end <= mid) { // in left
                return query(root.left, start, end);
            } else if (start >= mid+1) { // in right
                return query(root.right, start, end);
            } else {
				return query(root.left, start, mid) + query(root.right, mid+1, end);
            }
        }
    }
}

class SegmentTreeRSQNode {
	int inf = Integer.MAX_VALUE;
    public int start, end, min, max;
	public long sum;
    public SegmentTreeRSQNode left, right;
    public SegmentTreeRSQNode(int start, int end) {
        this.left = null;
        this.right = null;
        this.start = start;
        this.end = end;

        this.min = inf;
		this.max = -inf;
		this.sum = 0;
    }
	public int mid() {return this.start + (this.end - this.start) / 2;}
}
