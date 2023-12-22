import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int height = Integer.parseInt(sc.next());
		int width  = Integer.parseInt(sc.next());

		boolean[][] board = new boolean[height + 2][width + 2];

		for (int i = 0; i < height; i++) {
			String s = sc.next();

			for (int j = 0; j < width; j++) {
				board[i + 1][j + 1] = (s.charAt(j) == '#');
			}
		}

		sc.close();


		int count = 0;
		boolean[][] nextboard = new boolean[height + 2][width + 2];

		while (true) {
			for (int i = 1; i < height + 1; i++) {
				for (int j = 1; j < width + 1; j++) {
					nextboard[i][j] =  board[i][j]
									|| board[i - 1][j]
									|| board[i + 1][j]
									|| board[i][j - 1]
									|| board[i][j + 1];
				}
			}

			for (int i = 1; i < height + 1; i++) {
				for (int j = 1; j < width + 1; j++) {
					board[i][j] = nextboard[i][j];
				}
			}

			count++;

			int number = 0;

			for (int i = 1; i < height + 1; i++) {
				for (int j = 1; j < width + 1; j++) {
					if (board[i][j]) number++;
				}
			}

			if (number == height * width) break;
		}

		System.out.println(count);
	}
}