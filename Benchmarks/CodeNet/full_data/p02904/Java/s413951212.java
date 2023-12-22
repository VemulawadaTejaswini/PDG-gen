import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, k;
		if (TEST) {
			n = 10;
			k = 3;
		} else {
			n = in.nextInt();
			k = in.nextInt();
		}
		int[] p = new int[n];
		if (TEST) {
			for (int i = 0; i < n; i++)
				p[i] = i + 1;
			int c = (int) (Math.random() * 5);
			for (int i = 0; i < c; i++) {
				int a = (int) (Math.random() * n);
				int b = (int) (Math.random() * n);
				int t = p[a];
				p[a] = p[b];
				p[b] = t;
			}
			for (int i = 0; i < n; i++)
				System.out.print(p[i] + " ");
			System.out.println();
		} else {
			for (int i = 0; i < n; i++)
				p[i] = in.nextInt();
		}
		int r = 0;
		if (TEST) {
			r = testSolve(n, k, p);
			System.out.println(r);
			r = solve(n, k, p);
		} else
			r = solve(n, k, p);
		System.out.println(r);
		in.close();
	}

	private static int testSolve(int n, int k, int[] p) {
		int[][] t = new int[n - k + 1][n];
		for (int i = 0; i < t.length; i++) {
			t[i] = p.clone();
			Arrays.sort(t[i], i, i + k);
		}
		int r = 0;
		boolean[] f = new boolean[n];
		for (int i = 0; i < t.length; i++)
			if (f[i])
				continue;
			else {
				r++;
				for (int j = i + 1; j < t.length; j++) {
					f[j] = true;
					for (int x = 0; x < n; x++)
						if (t[i][x] != t[j][x]) {
							f[j] = false;
							break;
						}
				}
			}
		return r;
	}

	private static int solve(int n, int k, int[] p) {
		Deque<Integer> min = new ArrayDeque<>();
		Deque<Integer> max = new ArrayDeque<>();
		for (int i = 0; i < k; i++) {
			addMin(i, p, min);
			addMax(i, p, max);
		}
		boolean seq = false;
		if (min.size() == k)
			seq = true;
		int r = 1;
		for (int i = 0, j = k; j < n; i++, j++) {
			if (min.peekFirst() == i)
				min.pollFirst();
			if (max.peekFirst() == i)
				max.pollFirst();
			addMin(j, p, min);
			addMax(j, p, max);
			if (p[i] < p[min.peekFirst()] && j == max.peekFirst())
				continue;
			if (min.size() == k && seq)
				continue;
			r++;
			if (min.size() == k)
				seq = true;
//			System.out.println("-- " + i + " " + r);
		}
		return r;
	}

	private static void addMax(int e, int[] p, Deque<Integer> max) {
		while (!max.isEmpty()) {
			int r = max.peekLast();
			if (p[r] < p[e])
				max.pollLast();
			else
				break;
		}
		max.add(e);
	}

	private static void addMin(int e, int[] p, Deque<Integer> min) {
		while (!min.isEmpty()) {
			int r = min.peekLast();
			if (p[r] > p[e])
				min.pollLast();
			else
				break;
		}
		min.add(e);
	}
}