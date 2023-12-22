import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] a = new int[M];
		int[] b = new int[M];
		int[] c = new int[M];
		for (int i=0;i<M;i++) {
			a[i] = Integer.parseInt(sc.next())-1;
			b[i] = Integer.parseInt(sc.next())-1;
			c[i] = -Integer.parseInt(sc.next());
		}

		long[] dist = new long[N];
		for (int i=1;i<N;i++) {
			dist[i] = Long.MAX_VALUE;
		}
		boolean flag = true;
		int ans_flag = 0;
		int cnt = 0;
		while (flag) {
			flag = false;
			for (int i=0;i<M;i++) {
				if (dist[a[i]] != Long.MAX_VALUE && dist[b[i]] > dist[a[i]] + c[i]) {
					dist[b[i]] = dist[a[i]] + c[i];
					flag = true;
				}
			}
			if (cnt==N+5) {
				ans_flag = 1;
				break;
			}
			cnt++;
		}
		if (ans_flag == 0) {
			System.out.println(-dist[N-1]);
		} else if (ans_flag == 1) {
			System.out.println("inf");
		}
	}
}