import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();

		int [][]A = new int[H + 2][W + 2];
		String []S = new String[H];
		for(int i = 0; i < H; i++) {
			S[i] = scan.next();
		}
		scan.close();
		for(int i = 0; i < H + 2; i++) {
			for(int j = 0; j < W + 2; j++) {
				A[i][j] = 0;
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i].substring(j, j + 1).equals("#")) {
					A[i + 1][j + 1] = 1;
				}
			}
		}

		for(int i = 1; i < H + 1; i++) {
			for(int j = 1; j < W + 1; j++) {
				if(A[i][j] == 1) {
					if(!(A[i - 1][j] == 1 || A[i + 1][j] == 1
							|| A[i][j - 1] == 1 || A[i][j + 1] == 1)) {
						System.out.println("No");
						System.exit(0);
					}
				}
			}
		}

		System.out.println("Yes");

	}
}