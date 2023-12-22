import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		int board[][] = new int[h][w];
		Queue<Integer> qX = new LinkedList<Integer>();
		Queue<Integer> qY = new LinkedList<Integer>();
		qX.add(0);
		qY.add(0);
		int[] lR = { 1, 0, -1, 0 };
		int[] uD = { 0, 1, -1, 0 };
		while (!qX.isEmpty()) {
			int x = qX.poll();
			int y = qY.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = x + lR[i];
				int nextY = y + uD[i];
				if (!(nextX == 0 && nextY == 0) && 0 <= nextX && nextX < w && 0 <= nextY && nextY < h && s[nextY].charAt(nextX) == '.'
						&& board[nextY][nextX] == 0) {
					board[nextY][nextX] = board[y][x] + 1;
					qX.add(nextX);
					qY.add(nextY);
				}
			}
		}
		if (board[h - 1][w - 1] == 0) {
			System.out.println(-1);
			return;
		}
		int cout = 0;
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (s[j].charAt(i) == '.')
					cout++;
			}
		}
		System.out.println(cout - board[h - 1][w - 1] - 1);
	}
}