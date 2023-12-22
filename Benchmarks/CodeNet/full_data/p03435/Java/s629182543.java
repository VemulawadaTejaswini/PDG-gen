import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = scan.nextInt();
			}
		}
		boolean F = false;
		int A = 0;
		int B = 0;
		int C = 0;
		A = c[0][0]+c[1][0]+c[2][0];
		B = c[0][1]+c[1][1]+c[2][1];
		C = c[0][2]+c[1][2]+c[2][2];
		for (int i = 0; i < 4; i++) {
			if ((A-i) % 3 == 0 && (B-i) % 3 == 0 && (C-i) %3 == 0) {
				F = true;
			}
		}
		if (F) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
