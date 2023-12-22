import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	int n, m;
	int[] p;
	int[][] xy;
	boolean[] chk;

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			m = sc.nextInt();
			p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt() - 1;
			}
			xy = new int[m][2];
			chk = new boolean[n];
			for (int i = 0; i < m; i++) {
				xy[i][0] = sc.nextInt() - 1;
				xy[i][1] = sc.nextInt() - 1;
				chk[xy[i][0]] = true;
				chk[xy[i][1]] = true;
			}
			System.out.println(fnc());
		}
	}

	String fnc() {

		int cnt = 0;
		List<Integer> nums = new ArrayList<Integer>();
		boolean chk2 = false;

		for (int i = 0; i < n; i++) {
			if (p[i] == i) {
				cnt++;
			} else if (chk[i]) {
				nums.clear();
				chk2 = false;
				Queue<Integer> q = new ArrayDeque<Integer>();
				q.offer(p[i]);
				while (!q.isEmpty()) {
					int pp = q.poll();
					for (int j = 0; j < m; j++) {
						if (xy[j][1] == pp && !nums.contains(xy[j][0])) {
							if (xy[j][0] == i) {
								q.clear();
								chk2 = true;
								break;
							} else {
								q.offer(xy[j][0]);
								nums.add(xy[j][0]);
							}
						}
						if (xy[j][0] == pp && !nums.contains(xy[j][1])) {
							if (xy[j][1] == i) {
								q.clear();
								chk2 = true;
								break;
							} else {
								q.offer(xy[j][1]);
								nums.add(xy[j][1]);
							}
						}
					}
				}

				if (chk2) {
					cnt++;
					for (int j = 0; j < n; j++) {
						if (p[j] == i) {
							p[j] = p[i];
						}
					}
					p[i] = i;
				}
			}
		}

		return "" + cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
