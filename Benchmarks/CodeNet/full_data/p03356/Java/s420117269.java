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

		List<String> groups = new ArrayList<String>();
		boolean[] chk3 = new boolean[n];
		boolean[] chk4 = new boolean[m];

		Queue<Integer> q = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			if (chk[i] && !chk3[i]) {
				q.offer(i);
				StringBuilder sb = new StringBuilder();
				while (!q.isEmpty()) {
					int pp = q.poll();
					chk3[pp] = true;
					sb.append(pp);
					for (int j = 0; j < m; j++) {
						if (!chk4[j]) {
							if (xy[j][1] == pp) {
								q.offer(xy[j][0]);
								chk4[j] = true;
							}
							if (xy[j][0] == pp) {
								q.offer(xy[j][1]);
								chk4[j] = true;
							}
						}
					}
				}

				if (sb.toString().length() > 1) {
					groups.add(sb.toString());
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] == i) {
				cnt++;
			} else if (chk[i]) {
				for (String group : groups) {
					if (group.contains("" + i) && group.contains("" + p[i])) {
						for (int j = i + 1; j < n; j++) {
							if (p[j] == i) {
								p[j] = p[i];
								p[i] = i;
								break;
							}
						}

						cnt++;
						break;
					}
				}
			}
		}

		return "" + cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
