import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int s = 0; s < 1 << (N / 2); ++s) {
			int ma = 0, mb = 0, cost = 0;
			for (int i = 0; i < 1 << (N / 2); ++i) {
				if ((s & (1 << i)) > 0) {
					ma += a[i];
					mb += b[i];
					cost += c[i];
				}
			}
			int key = Ma * mb - Mb * ma;
			if (map.containsKey(key)) {
				map.put(key, Math.min(map.get(key), cost));
			} else {
				map.put(key, cost);
			}
		}
		int ans = Integer.MAX_VALUE / 3;
		for (int s = 0; s < 1 << (N - N / 2); ++s) {
			int ma = 0, mb = 0, cost = 0;
			for (int i = 0; i < 1 << (N - N / 2); ++i) {
				if ((s & (1 << (N / 2 + i))) > 0) {
					ma += a[N / 2 + i];
					mb += b[N / 2 + i];
					cost += c[N / 2 + i];
				}
			}
			int key = -(Ma * mb - Mb * ma);
			if (map.containsKey(key) && cost + map.get(key) > 0) {
				ans = Math.min(ans, cost + map.get(key));
			}
		}
		System.out.println(ans >= Integer.MAX_VALUE / 4 ? -1 : ans);
	}
}