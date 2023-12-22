import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(solve(sc.next(), sc.next()));
	}

	long solve(String A, String B) {
		Scanner sc = new Scanner(System.in);
		int n = A.length();
		String BBB = B + B + B;
		int[] prev1 = new int[BBB.length()];
		int[] next1 = new int[BBB.length()];
		for (int i = 0; i < BBB.length(); ++i) {
			if (BBB.charAt(i) == '1') {
				prev1[i] = i;
			} else {
				if (i > 0) {
					prev1[i] = prev1[i - 1];
				} else {
					prev1[i] = -1;
				}
			}
		}
		for (int i = BBB.length() - 1; i >= 0; --i) {
			if (BBB.charAt(i) == '1') {
				next1[i] = i;
			} else {
				if (i + 1 < BBB.length()) {
					next1[i] = next1[i + 1];
				} else {
					next1[i] = BBB.length();
				}
			}
		}

		long ans = Long.MAX_VALUE;
		out: for (int rot = -n; rot <= n; ++rot) {
			boolean[] distinct = new boolean[n];
			int n10 = 0, n01 = 0;
			for (int i = 0; i < n; ++i) {
				if (A.charAt(i) == BBB.charAt((i + n) + rot)) {
					continue;
				}
				distinct[i] = true;
				if (A.charAt(i) == '0') {
					++n01;
				} else {
					++n10;
				}
			}
			int[] left = new int[n];
			int[] right = new int[n];
			for (int i = 0; i < n; ++i) {
				if (!distinct[i])
					continue;
				if (prev1[(i + n) + rot] == -1 || next1[(i + n) + rot] == BBB.length()) {
					continue out;
				}
				left[i] = ((i + n) + rot) - prev1[(i + n) + rot];
				right[i] = next1[(i + n) + rot] - ((i + n) + rot);
				if (rot > 0) {
					left[i] = Math.max(0, left[i] - rot);
				} else {
					right[i] = Math.max(0, right[i] + rot);
				}
			}
			ans = Math.min(ans, 2 * f(left, right) + n10 + n01 + Math.abs(rot));
		}
		return (ans > 2 * n ? -1 : ans);
	}

	long f(int[] left, int[] right) {
		class Pair implements Comparable<Pair> {
			int left;
			int right;

			public Pair(int left_, int right_) {
				left = left_;
				right = right_;
			}

			public int compareTo(Pair o) {
				if (left != o.left)
					return Integer.compare(left, o.left);
				else
					return Integer.compare(right, o.right);
			};
		}
		int n = left.length;
		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			if (left[i] == 0 && right[i] == 0)
				continue;
			list.add(new Pair(left[i], right[i]));
		}
		Collections.sort(list);
		for (int i = (list.size() - 2); i >= 0; --i) {
			if (list.get(i).right <= list.get(i + 1).right) {
				list.remove(i);
			}
		}

		long ret = Long.MAX_VALUE;
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < list.size(); ++i) {
			pq.add(list.get(i));
		}
		Pair pre = null;
		while (!pq.isEmpty()) {
			Pair pair = pq.poll();
			if (pre == null) {
				ret = Math.min(ret, pair.right);
			} else {
				ret = Math.min(ret, pair.right + pre.left);
			}
			if (pq.isEmpty()) {
				ret = Math.min(ret, pair.left);
			}
			pre = pair;
		}
		return ret;
	}

	static class TaskD {
		public long solve(String a, String b) {
			String bbb = b + b + b;
			int[] prev1 = new int[bbb.length()];
			for (int i = 0; i < bbb.length(); ++i) {
				if (bbb.charAt(i) == '1')
					prev1[i] = i;
				else if (i > 0)
					prev1[i] = prev1[i - 1];
				else
					prev1[i] = -1;
			}
			int[] next1 = new int[bbb.length()];
			for (int i = bbb.length() - 1; i >= 0; --i) {
				if (bbb.charAt(i) == '1')
					next1[i] = i;
				else if (i + 1 < bbb.length())
					next1[i] = next1[i + 1];
				else
					next1[i] = bbb.length();
			}
			long res = Long.MAX_VALUE;
			int[] toRight = new int[a.length()];
			int[] nextByLeft = new int[a.length()];
			int[] firstByLeft = new int[a.length()];
			outer: for (int rot = 0; rot < a.length(); ++rot) {
				Arrays.fill(firstByLeft, -1);
				int n01 = 0;
				int n10 = 0;
				for (int i = 0; i < a.length(); ++i) {
					char c1 = a.charAt(i);
					char c2 = b.charAt((i + rot) % a.length());
					if (c1 == c2)
						continue;
					if (c1 == '0') {
						++n01;
						continue;
					}
					++n10;
					if (prev1[i + a.length()] < 0) {
						continue outer;
					}
					int left = i + a.length() - prev1[i + a.length()];
					int right = next1[i + a.length()] - (i + a.length());
					toRight[i] = right;
					nextByLeft[i] = firstByLeft[left];
					firstByLeft[left] = i;
				}
				res = Math.min(res, a.length() - 1 + cdist(a.length(), 1, rot) + n01 + n10);
				res = Math.min(res, a.length() - 1 + cdist(a.length(), -1, rot) + n01 + n10);
				int rightmost = 0;
				for (int leftmost = a.length() - 1; leftmost >= 0; --leftmost) {
					res = Math.min(res, cdist(a.length(), 0, -leftmost) + (rightmost + leftmost)
							+ cdist(a.length(), rightmost, rot) + n01 + n10);
					res = Math.min(res, cdist(a.length(), 0, rightmost) + (rightmost + leftmost)
							+ cdist(a.length(), -leftmost, rot) + n01 + n10);
					{
						int c = firstByLeft[leftmost];
						while (c >= 0) {
							rightmost = Math.max(rightmost, toRight[c]);
							c = nextByLeft[c];
						}
					}
				}
			}
			if (res == Long.MAX_VALUE)
				res = -1;
			return res;
		}

		private int cdist(int length, int p, int q) {
			if (p < 0)
				p += length;
			if (q < 0)
				q += length;
			return Math.min(Math.abs(p - q), length - Math.abs(p - q));
		}

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}