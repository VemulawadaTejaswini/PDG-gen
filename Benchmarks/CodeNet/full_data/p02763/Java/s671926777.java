import java.util.*;

public class Main {
	static class Segment {
		static final int MAX = (int) Math.pow(2, 19);
		static int n;
		static int size;
		boolean segment[] = new boolean[MAX * 2 - 1];

		public static void setSize(int n) {
			Segment.n = n;
			size = 1;
			for (int i = 0; i < n; ++i) {
				if (n <= size)
					break;
				size *= 2;
			}
		}

		public boolean add(int index) {
			int leaf = size - 1 + index;
			if (segment[leaf])
				return false;
			segment[leaf] = true;
			while (leaf > 0) {
				leaf = parent(leaf);
				int left = left(leaf);
				int right = right(leaf);
				segment[leaf] = segment[left] | segment[right];
			}
			return true;
		}

		public boolean remove(int index) {
			int leaf = size - 1 + index;
			if (!segment[leaf])
				return false;
			segment[leaf] = false;
			while (leaf > 0) {
				leaf = parent(leaf);
				int left = left(leaf);
				int right = right(leaf);
				segment[leaf] = segment[left] | segment[right];
			}
			return true;
		}

		public int parent(int n) {
			return (n - 1) / 2;
		}

		public int left(int n) {
			return 2 * n + 1;
		}

		public int right(int n) {
			return 2 * n + 2;
		}

		public boolean query(int a, int b, int k, int l, int r) {
			if (r <= a || l >= b)
				return false;
			if (a <= l && r <= b)
				return segment[k];
			int left = left(k);
			int right = right(k);
			int mid = (r + l) / 2;
			boolean vl = query(a, b, left, l, mid);
			boolean vr = query(a, b, right, mid, r);
			return vl | vr;
		}

		public boolean query(int l, int r) {
			return query(l - 1, r, 0, 0, size);
		}

		public void show() {
			Queue<Integer> queue = new ArrayDeque<Integer>();
			int nsize = 2 * size - 1;
			queue.add(0);
			int h = 0;
			for (int i = 0; i < (size + 1) / 2; ++i)
				System.out.print(" ");
			System.out.println(" " + segment[0]);
			while (!queue.isEmpty()) {
				List<Integer> tmp = new ArrayList<Integer>();
				while (!queue.isEmpty()) {
					int cur = queue.poll();
					int left = left(cur);
					int right = right(cur);
					if (left < nsize)
						tmp.add(left);
					if (right < nsize)
						tmp.add(right);
				}
				int lleft = (int) Math.pow(2, h + 1) - 1;
				int len = (size + 1) / (lleft + 1);
				for (int node : tmp) {
					if ((lleft + 1) * 2 < nsize) {
						for (int i = 0; i < len; ++i)
							System.out.print("   ");
						if (node != lleft) {
							for (int i = 0; i < len; ++i)
								System.out.print("  ");
						}
					}
					System.out.print(" " + segment[node] + "(" + node + ")" + " ");
					queue.add(node);
				}
				System.out.println();
				++h;
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Segment.setSize(n);
		Segment pos[] = new Segment[26];
		for (int i = 0; i < 26; ++i)
			pos[i] = new Segment();
		String s = sc.next();
		char copy[] = s.toCharArray();
		for (int i = 0; i < n; ++i) {
			int t = (int) (copy[i] - 'a');
			pos[t].add(i);
		}
		// for (int i = 0; i < 26; ++i) {
		// 	char t = (char) (i + 'a');
		// 	System.out.println(t);
		// 	pos[i].show();
		// 	System.out.println();
		// }
		int q = sc.nextInt();
		for (int i = 0; i < q; ++i) {
			int type = sc.nextInt();
			if (type == 1) {
				int index = sc.nextInt() - 1;
				String c = sc.next();
				char tar = c.charAt(0);
				char cur = copy[index];
				if (cur != tar) {
					int t = (int) (cur - 'a');
					pos[t].remove(index);
					copy[index] = tar;
					t = (int) (tar - 'a');
					pos[t].add(index);
				}
			} else {
				int ans = 0;
				int l = sc.nextInt();
				int r = sc.nextInt();
				for (int j = 0; j < 26; ++j) {
					if (pos[j].query(l, r)) {
						ans++;
						char alp = (char) (j + 'a');
						System.out.print(alp + " ");
					}
				}
				System.out.println(ans);
			}
		}
		sc.close();
	}
}
