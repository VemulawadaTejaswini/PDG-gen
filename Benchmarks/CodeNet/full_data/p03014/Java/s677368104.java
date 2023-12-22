import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int H = s.nextInt();
			final int W = s.nextInt();

			char[][] map = new char[H][];
			for (int h = 0; h < H; h++) {
				map[h] = s.next().toCharArray();
			}

			Map<String, Integer> column = new HashMap<>(H * W);
			for (int h = 0; h < H; h++) {
				int from = 0;
				int straight = 0;
				for (int w = 0; w < W; w++) {
					if (map[h][w] == '#') {
						column.put(h + "," + w, 0);
						for (int i = from; i < w; i++) {
							column.put(h + "," + i, straight);
						}
						from = w + 1;
						straight = 0;
						continue;
					}
					straight++;
				}
				for (int i = from; i < W; i++) {
					column.put(h + "," + i, straight);
				}
			}

			Map<String, Integer> row = new HashMap<>(H * W);
			for (int w = 0; w < W; w++) {
				int from = 0;
				int straight = 0;
				for (int h = 0; h < H; h++) {
					if (map[h][w] == '#') {
						row.put(h + "," + w, 0);
						for (int i = from; i < h; i++) {
							row.put(i + "," + w, straight);
						}
						from = h + 1;
						straight = 0;
						continue;
					}
					straight++;
				}
				for (int i = from; i < H; i++) {
					row.put(i + "," + w, straight);
				}
			}

			int max = 0;
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					if (map[h][w] == '#') {
						continue;
					}

					int tmp = -1;
					tmp += column.get(h + "," + w);
					tmp += row.get(h + "," + w);
					max = Math.max(max, tmp);
				}
			}
			System.out.println(max);
		}
	}
}
