import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int width = sc.nextInt();
		
		char[][] board = new char[height][width];
		
		for (int i = 0; i < height; i++) {
			String sCurr = sc.next();
			for (int j = 0; j < width; j++) {
				board[i][j] = sCurr.charAt(j);
			}
		}
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (!(board[i][j] == '#')) {
					boolean iLess = false;
					boolean iMore = false;
					boolean jLess = false;
					boolean jMore = false;
					int tempVal = 0;
					if (i - 1 >= 0) {
						iLess = true;
					} 
					if (i + 1 < board.length) {
						iMore = true;
					}
					if (j - 1 >= 0) {
						jLess = true;
					}
					if (j + 1 < board[0].length) {
						jMore = true;
					}
					if (iLess) {
						if (board[i - 1][j] == '#') {
							tempVal++;
						}
					}
					if (iMore) {
						if (board[i + 1][j] == '#') {
							tempVal++;
						}
					}
					if (jLess) {
						if (board[i][j - 1] == '#') {
							tempVal++;
						}
					}
					if (jMore) {
						if (board[i][j + 1] == '#') {
							tempVal++;
						}
					}
					if (iLess && jLess) {
						if (board[i - 1][j - 1] == '#') {
							tempVal++;
						}
					}
					if (iLess && jMore) {
						if (board[i - 1][j + 1] == '#') {
							tempVal++;
						}
					}
					if (iMore && jLess) {
						if (board[i + 1][j - 1] == '#') {
							tempVal++;
						}
					}
					if (iMore && jMore) {
						if (board[i + 1][j + 1] == '#') {
							tempVal++;
						}
					}
					board[i][j] = Integer.toString(tempVal).charAt(0);
				}
			}
		}
		for (int i = 0; i < height; i++) {
			String printString = "";
			for (int j = 0; j < width; j++) {
				printString += board[i][j];
			}
			System.out.println(printString);
		}
	}
}