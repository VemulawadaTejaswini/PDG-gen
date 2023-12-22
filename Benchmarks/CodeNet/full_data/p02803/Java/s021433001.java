import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] S = new char[H][];
		for (int i = 0; i < H; i++) S[i] = sc.next().toCharArray();
		sc.close();

		int ans = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (S[i][j] == '#') continue;

				int[][] d = new int[H][W];
				int sy = i;
				int sx = j;
				int[] empty = new int[0];
				BiFunction<int[], int[], int[]> set = (dist, dirc) -> {
					int y = dist[0];
					int x = dist[1];
					int dx = x + dirc[0];
					int dy = y + dirc[1];
					if (sy == dy && sx == dx) return empty;
					if (dy < 0 || dx < 0 || H <= dy || W <= dx) return empty;
					if (S[dy][dx] != '.' || d[dy][dx] != 0) return empty;
					d[dy][dx] = d[y][x] + 1;
					return new int[] {dy, dx};
				};

				Queue<int[]> queue = new ArrayDeque<>();
				queue.add(new int[]{i, j});
				while (0 < queue.size()) {
					int[] p = queue.poll();
					if (p.length == 0) continue;
					queue.add(set.apply(p, new int[] {-1, 0}));
					queue.add(set.apply(p, new int[] {1, 0}));
					queue.add(set.apply(p, new int[] {0, -1}));
					queue.add(set.apply(p, new int[] {0, 1}));
				}

				int max = 0;
				for (int di = 0; di < H; di++)
					for (int dj = 0; dj < W; dj++)
						max = Math.max(max, d[di][dj]);
				ans = Math.max(ans, max);
			}
		}
		System.out.println(ans);
  }
}