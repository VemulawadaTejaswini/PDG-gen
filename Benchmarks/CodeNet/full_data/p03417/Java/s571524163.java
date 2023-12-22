import java.util.Scanner;

public class Main {

	static boolean[][]  cards;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		cards = new boolean[x][y];
		long cnt = 0;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				getResult(i, -1, j, -1);
				getResult(i, -1, j, 0);
				getResult(i, -1, j, 1);
				getResult(i, 0, j, -1);
				getResult(i, 0, j, 0);
				getResult(i, 0, j, 1);
				getResult(i, 1, j, -1);
				getResult(i, 1, j, 0);
				getResult(i, 1, j, 1);
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if(cards[i][j]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		sc.close();
	}

	private static void getResult(int x, int i, int y, int j)
	{
		try {
			cards[x + i][y + j] = !cards[x + i][y + j];
		} catch (ArrayIndexOutOfBoundsException e) {

		}

	}



}
