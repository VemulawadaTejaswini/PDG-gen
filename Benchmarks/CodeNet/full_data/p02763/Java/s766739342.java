//--- pE ---//
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

	public Solution() {
		reader = new Reader();

		// scanner.nextLine();
		try {
			while (reader.br.ready()) {
				run_case();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private void run_case() {
		int N = ni();
		String str = ns();

		// List<BIT> list_st = new ArrayList<>();
		List<SegmentTreeRSQ> list_st = new ArrayList<>();
		// for (int i=0; i<26; i++) list_st.add(new BIT(N+1));
		for (int i=0; i<26; i++) list_st.add(new SegmentTreeRSQ(1, N));
		// SegmentTreeRSQ st = new SegmentTreeRSQ(1, N);
		for (int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			int t = (int)list_st.get(idx).query(i + 1, i + 1);
			// list_st.get(idx).addVal(i, 1);
			list_st.get(idx).update(i + 1, t + 1);
		}

		int Q = ni();
		StringBuilder str_sb = new StringBuilder(str);
		for (;Q-->0;) {
			// int[] arr = strToIntArray(scanner.nextLine());
			// String[] vals = scanner.nextLine().split("\\s+");

			int q = ni();

			if (q == 1) {
				int i = ni();
				char c = ns().charAt(0);
				int n = str_sb.charAt(i-1) - 'a';
				int m = c - 'a';

				int t = (int)list_st.get(n).query(i, i);
				// list_st.get(n).addVal(i-1, -1);
				list_st.get(n).update(i, t-1);

				str_sb.setCharAt(i-1, c);

				t = (int)list_st.get(m).query(i, i);
				list_st.get(m).update(i, t+1);
				// list_st.get(m).addVal(i-1, 1);
			} else {
				int l = ni();
				int r = ni();
				int cnt = 0;
				for (int i=0; i<26; i++) {
					// if (list_st.get(i).getSum(l, r) > 0) cnt ++;
					if (list_st.get(i).query(l, r) > 0) cnt ++;
				}
				System.out.println(cnt);
			}
		}
		return;
	}

	private int ni() {
		return Integer.parseInt(reader.next());
	}

	private String ns() {
		return reader.next();
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

// class BIT {
// 	public long[] arr;
// 	public BIT(int n) {
// 		arr = new long[n];
// 	}
// 	public long getSum(int i) {
// 		long sum = 0;
// 		for(i++;i > 0;i -= i&-i)sum += arr[i];
// 		return sum;
// 	}
// 	public long getSum(int l, int r) {
// 		return getSum(r) - getSum(l-1);
// 	}
// 	public void addVal(int i, long v) {
// 		if(v == 0)return;
// 		int n = arr.length;
// 		for(i++;i < n;i += i&-i)arr[i] += v;
// 	}
// }
