import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int W = scanner.nextInt();
		scanner.nextLine();

		char[] board = new char[H * W];

		for (int y = 0; y < H; y++) {
			String s = scanner.nextLine();
			char[] chars = s.toCharArray();
			for (int x = 0; x < W; x++) {
				board[W * y + x] = chars[x];
			}

		}

		int answer = 0;

		char[] currentBoard = board;

		while (!isFinish(currentBoard)) {
			answer++;
			char[] nextBoard = new char[H * W];
			initBoard(nextBoard);
			draw(currentBoard, nextBoard, H, W);
			currentBoard = nextBoard;
		}

		System.out.println(answer);
	}

	public static boolean isFinish(char[] board) {
		for (char a : board) {
			if (a == '.')
				return false;
		}
		return true;
	}

	public static void initBoard(char[] board) {
		Arrays.fill(board, '.');
	}

	public static void draw(char[] currentBoard, char[] nextBoard, int H, int W) {

		for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				if (currentBoard[H * y + x] == '#') {
					nextBoard[H * y + x] = '#';
					if (x < W - 1)
						nextBoard[H * y + x + 1] = '#';
					if (x > 0)
						nextBoard[H * y + x - 1] = '#';
					if (y < H - 1)
						nextBoard[H * (y + 1) + x] = '#';
					if (y > 0)
						nextBoard[H * (y - 1) + x] = '#';
				}
			}
		}

	}

}
