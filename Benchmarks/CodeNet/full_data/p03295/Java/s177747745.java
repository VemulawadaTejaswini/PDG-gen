import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static class Pair {
		int x, y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Pair[] p = new Pair[m];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			p[i] = new Pair(a, b);
		}
		// pをbiで昇順ソート
		Arrays.sort(p, new Comparator<Pair>() {
			@Override
			public int compare(Pair p1, Pair p2) {
				return p1.y - p2.y;
			}
		});
		int bridgeN = -1;
		int ans = 0;
		for(int i = 0; i < m; i++) {
			if(p[i].x > bridgeN) {
				bridgeN = p[i].y - 1;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
