import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] board = new String[H];
		boolean[] goodx = new boolean[110];
		boolean[] goody = new boolean[110];

		for (int i = 0; i < H; i++) {
			board[i] = sc.next();
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (board[i].charAt(j) == '#') {
					goodx[i] = true;
					goody[j] = true;
				}
			}
		}

		for (int i = 0; i < W; i++) {
			if (goodx[i]) {
				for (int j = 0; j < H; j++) {
					if (goody[j]) {
						System.out.print(board[i].charAt(j));
					}
				}
				System.out.println("");
			}
		}
	}
}