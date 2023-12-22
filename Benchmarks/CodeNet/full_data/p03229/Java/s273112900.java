import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		A = new int[N];
	}

	int[] A;

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		A[cnt] = Integer.parseInt(str);
		cnt++;
	}

	public void solve() {
		Arrays.sort(A);
		// for (int i = 0; i < A.length; i++)
		// System.out.print(A[i] + " ");
		// System.out.println();
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		int l;
		int r;
		int direc;

		for (int i : A)
			a.add(i);
		l = a.peekFirst();
		r = a.pollFirst();
		direc = 1;
		int ans0 = 0;
		for (; a.size() > 0;) {
			if (direc == 1) {
				ans0 += Math.abs(a.peekLast() - l);
				l = a.pollLast();
				if (a.size() > 0) {
					ans0 += Math.abs(a.peekLast() - r);
					r = a.pollLast();
				}
				direc = 0;
			} else {
				ans0 += Math.abs(a.peekFirst() - l);
				l = a.pollFirst();
				if (a.size() > 0) {
					ans0 += Math.abs(a.peekFirst() - r);
					r = a.pollFirst();
				}
				direc = 1;
			}
		}

		for (int i : A)
			a.add(i);
		l = a.peekLast();
		r = a.pollLast();
		direc = 0;
		int ans1 = 0;
		for (; a.size() > 0;) {
			if (direc == 1) {
				ans1 += Math.abs(a.peekLast() - l);
				l = a.pollLast();
				if (a.size() > 0) {
					ans1 += Math.abs(a.peekLast() - r);
					r = a.pollLast();
				}
				direc = 0;
			} else {
				ans1 += Math.abs(a.peekFirst() - l);
				l = a.pollFirst();
				if (a.size() > 0) {
					ans1 += Math.abs(a.peekFirst() - r);
					r = a.pollFirst();
				}
				direc = 1;
			}
		}

		if (ans0 > ans1)
			System.out.println(ans0);
		else
			System.out.println(ans1);
	}
}