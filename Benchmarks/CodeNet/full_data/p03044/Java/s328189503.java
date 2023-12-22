import java.util.*;

public class Main {

	public static void printArray(int[] a, int N) {
		for (int i = 1; i < N; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[N]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] u = new int[N - 1];
		int[] v = new int[N - 1];
		int[] w = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}

		int[] c = new int[N + 1];
		int[] c2 = new int[N + 1];

		int cnt = 1;
		for (int i = 0; i < N - 1; i++) {
			int u_i = u[i];
			int v_i = v[i];
			int w_i = w[i];
			if (w[i] % 2 == 0) {
				int cu = c[u_i];
				int cv = c[v_i];
				if (cu == 0) {
					if (cv == 0) {
						c[u_i] = cnt;
						c[v_i] = cnt;
						cnt++;
					} else {
						c[u_i] = c[v_i];
					}
				} else {
					if (cv == 0) {
						c[v_i] = c[u_i];
					} else {
						if (c[v_i] < c[u_i]) {
							c2[c[u_i]] = c[v_i];
						}
						if (c[v_i] > c[u_i]) {
							c2[c[v_i]] = c[u_i];
						}
					}
				}
			} else {
				int cu = c[u_i];
				int cv = c[v_i];
				if (cu == 0) {
					if (cv == 0) {
						c[u_i] = cnt;
						c[v_i] = -cnt;
						cnt++;
					} else {
						c[u_i] = -c[v_i];
					}
				} else {
					if (cv == 0) {
						c[v_i] = -c[u_i];
					} else {
						if (c[v_i] < c[u_i]) {
							c2[c[u_i]] = -c[v_i];
						}
						if (c[v_i] > c[u_i]) {
							c2[c[v_i]] = -c[u_i];
						}
					}
				}
			}

			// printArray(c, N);
		}

		// System.out.println("--");
		// printArray(c2, N);
		// printArray(c, N);



		for (int i = 1; i < cnt; i++) {
			while (true) {
				int next = c2[i];
				int dir = 1;
				if (next == 0) break;
				if (next < 0) {
					next *= -1;
					dir *= -1;
				}
				if (c2[next] == 0) break;
				c2[i] = dir * c2[next];
			}
		}
		// printArray(c2, N);

		for (int i = 1; i <= N; i++) {
			int pos = c[i];
			int dir = 1;
			if (pos < 0) {
				pos *= -1;
				dir *= -1;
			}
			if (c2[pos] != 0) {
				c[i] = dir * c2[pos];
			}
		}
		// for (int i = 1; i <= N; i++) {
		// 	System.out.println(c[i] + ", " + c2[i]);
		// }

		// for (int i = 1; i <= N; i++) {
		// 	int pos = i;
		// 	int dir = 1;
		// 	while (c2[pos] != 0) {
		// 		int next = c2[pos];
		// 		if (next > 0) {
		// 			pos = next;
		// 		} else {
		// 			dir *= -1;
		// 			pos = -next;
		// 		}
		// 		c[i] = dir * c[-next];
		// 	}
		// }
		// System.out.println("--");
		// printArray(c, N);
		for (int i = 1; i <= N; i++) {
			if (c[i] >= 1) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}
}
