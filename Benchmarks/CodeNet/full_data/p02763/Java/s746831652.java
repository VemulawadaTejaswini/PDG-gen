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
	Scanner scanner;



	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}


	private void run_case() {
		int N = scanner.nextInt();
		String str = scanner.next();

		List<SegmentTreeRSQ> list_st = new ArrayList<>();
		for (int i=0; i<26; i++) list_st.add(new SegmentTreeRSQ(1, N));
		// SegmentTreeRSQ st = new SegmentTreeRSQ(1, N);
		for (int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			int t = (int)list_st.get(idx).query(i + 1, i + 1);
			list_st.get(idx).update(i + 1, t + 1);
		}

		int Q = scanner.nextInt();
		StringBuilder str_sb = new StringBuilder(str);
		for (;Q-->0;) {
			// int[] arr = strToIntArray(scanner.nextLine());
			// String[] vals = scanner.nextLine().split("\\s+");

			int q = scanner.nextInt();

			if (q == 1) {
				int i = scanner.nextInt();
				char c = scanner.next().charAt(0);
				int n = str_sb.charAt(i-1) - 'a';
				int m = c - 'a';

				int t = (int)list_st.get(n).query(i, i);
				list_st.get(n).update(i, t - 1);

				str_sb.setCharAt(i-1, c);

				t = (int)list_st.get(m).query(i, i);
				list_st.get(m).update(i, t + 1);
			} else {
				int l = scanner.nextInt();
				int r = scanner.nextInt();
				int cnt = 0;
				for (int i=0; i<26; i++) {
					if (list_st.get(i).query(l, r) > 0) cnt ++;
				}
				System.out.println(cnt);
			}
		}
		return;
	}

	// int main() {
    // int N;
    // string S;
    // int Q;
    // cin >> N >> S >> Q;
    // for(int i = 0; i < N; ++i) {
    //     int n = S[i] - 'a';
    //     bit[n].add(i + 1, 1);
    // }
    // while(Q--) {
    //     int q; cin >> q;
    //     if(q == 1) {
    //         int i;
    //         char c;
    //         cin >> i >> c;
    //         int n = S[i-1] - 'a';
    //         int m = c - 'a';
    //         bit[n].add(i, -1);
    //         S[i-1] = c;
    //         bit[m].add(i, 1);
    //     } else {
    //         int l, r;
    //         cin >> l >> r;
    //         int cnt = 0;
    //         for(int i = 0; i < 26; ++i) {
    //             if(bit[i].sum(l, r)) cnt++;
    //         }
    //         cout << cnt << '\n';
    //     }
    // }


	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
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
