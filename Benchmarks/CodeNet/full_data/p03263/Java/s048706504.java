import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt(), w = scanner.nextInt();
			int[][] a = new int[h][w];
			IntStream.range(0, h).forEach(i -> IntStream.range(0, w).forEach(j -> a[i][j] = scanner.nextInt()));
			List<Move> moves = new ArrayList<>();
			int prevX = -1, prevY = -1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (0 != (a[i][j] & 1)) {
						if ((prevX >= 0) && (prevY >= 0)) {
							moveTo(i, j, prevX, prevY, moves);
							prevX = -1;
							prevY = -1;
						} else {
							prevX = i;
							prevY = j;
						}
					}
				}
			}
			System.out.println(moves.size());
			moves.stream().forEach(System.out::println);
		}
	}

	/**
	 * (x1,y1)から(x2,y2)への移動方法をmovesに追加する
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param moves 移動方法の一覧
	 */
	private static void moveTo(int x1, int y1, int x2, int y2, List<Move> moves) {
		int xDiff = (x1 > x2) ? -1 : 1, yDiff = (y1 > y2) ? -1 : 1;
		for (int i = x1; i * xDiff < x2 * xDiff; i += xDiff) {
			moves.add(new Move(i, y1, i + xDiff, y1));
		}
		for (int j = y1; j * yDiff < y2 * yDiff; j += yDiff) {
			moves.add(new Move(x2, j, x2, j + yDiff));
		}
	}

	/**
	 * 移動方法を表すクラス
	 */
	private static class Move {
		int x1, y1, x2, y2;

		Move(int x1, int y1, int x2, int y2) {
			super();
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(x1 + 1).append(" ");
			sb.append(y1 + 1).append(" ");
			sb.append(x2 + 1).append(" ");
			sb.append(y2 + 1);
			return sb.toString();
		}
	}
}
