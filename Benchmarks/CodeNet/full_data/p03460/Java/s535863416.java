
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();

		List<Pos> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			// 白だったらどちらかにK移動すれば黒として扱える
			if ("W".equals(s.next())) {
				y += K;
			}
			// x,yでついの位置にあるものも同じ
			list.add(new Pos(x, y, K));
			list.add(new Pos(x + K, y + K, K));
		}
		
		int[][] space = new int[K * 2][K * 2];
		list.forEach(p -> ++space[p.x][p.y]);

		int [][] spaceSum = new int[K * 2][K + 1];
		for(int x = 0; x < 2 * K; x++){
			int sum = 0;
			for(int y = 0; y < K; y++){
				sum += space[x][y];
			}
			spaceSum[x][0] = sum;
			for(int y = K; y < 2 * K; y++){
				sum = sum - space[x][y - K] + space[x][y];
				spaceSum[x][y - K + 1] = sum;
			}
		}
		
		
		int max = 0;
		for (int y = 0; y < K + 1; y++) {
			int sum = 0;
			for (int x = 0; x < K; x++) {
				sum += spaceSum[x][y];
			}
			if (sum > max) {
				max = sum;
			}
			for(int x = K; x < 2 * K; x++){
				sum = sum - spaceSum[x - K][y] + spaceSum[x][y];
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

	public static class Pos {
		public final int x;
		public final int y;

		public Pos(int x, int y, int K) {
			this.x = x % (2 * K);
			this.y = y % (2 * K);
		}

		@Override
		public String toString() {
			return "Pos [x=" + x + ", y=" + y + "]";
		}
	}
}
