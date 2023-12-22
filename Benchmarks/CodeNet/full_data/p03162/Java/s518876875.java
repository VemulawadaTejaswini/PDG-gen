import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] stock = new int[N][3];
		for (int i = 0; i < N; i++) {
			stock[i][0] = scan.nextInt();
			stock[i][1] = scan.nextInt();
			stock[i][2] = scan.nextInt();
			scan.hasNextLine();
		}
		int prev = -1;
		int flag = -1;
		int t = 0;
		for (int i = 0; i < N; i++) {
			int max = -1;
			for (int j = 0; j < 3; j++) {
				if (j != prev) {
					if (stock[i][j] > max) {
						max = stock[i][j];
						flag = j;
					}
				}
			}
			prev = flag;
			t = t + max;
		}
		System.out.println(t);
		scan.close();
	}

}
