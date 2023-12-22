
import java.util.Scanner;

public class Main {

	public static long div = (long) (Math.pow(10, 9) + 7);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		long[][] masu = new long[x + 1][y + 1];
		for(int i = 0; i < x + 1; i++)
			for(int j = 0; j < y + 1; j++) {
				masu[i][j] = 0;
			}
		masu[0][0] = 1;
		for(int i = 0; i <= x; i++) {
			for(int j = 0; j <= y; j++) {
				if(i < x && j < y - 1) {
					masu[i + 1][j + 2] = (masu[i + 1][j + 2] + masu[i][j]) % div;
				}
				if(i < x - 1 && j < y) {
					masu[i + 2][j + 1] = (masu[i + 2][j + 1] + masu[i][j]) & div;
				}
			}
		}
		System.out.println(masu[x][y]);
	}

}
