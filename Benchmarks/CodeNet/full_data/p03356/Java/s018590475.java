import java.util.ArrayDeque;
import java.util.Arrays;
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
		boolean[] chk4 = new boolean[m];
		boolean[] chk3 = new boolean[n];
		boolean chk2 = false;

		for (int i = 0; i < n; i++) {
			if (p[i] == i) {
				cnt++;
			} else if (chk[i]) {
				Arrays.fill(chk3, false);
				Arrays.fill(chk4, false);
				chk2 = false;
				Queue<Integer> q = new ArrayDeque<Integer>();
				q.offer(p[i]);
				while (!q.isEmpty()) {
					int pp = q.poll();
					for (int j = 0; j < m; j++) {
						if (!chk4[j]) {
							if (xy[j][1] == pp && !chk3[xy[j][0]]) {
								if (xy[j][0] == i) {
									q.clear();
									chk2 = true;
									break;
								} else {
									q.offer(xy[j][0]);
									chk3[xy[j][0]] = true;
									chk4[j] = true;
								}
							}
							if (xy[j][0] == pp && !chk3[xy[j][1]]) {
								if (xy[j][1] == i) {
									q.clear();
									chk2 = true;
									break;
								} else {
									q.offer(xy[j][1]);
									chk3[xy[j][1]] = true;
									chk4[j] = true;
								}
							}
						}
					}
				}

				if (chk2) {
					cnt++;
					for (int j = i + 1; j < n; j++) {
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
