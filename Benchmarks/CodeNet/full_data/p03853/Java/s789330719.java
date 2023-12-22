import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt();
		int W = scan.nextInt();

		char C[][] = new char[H][W];
		for (int i = 0; i < H; i++) {
			C[i] = scan.next().toCharArray();
		}
		for (int i = 0; i < 2 * H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print(C[i / 2][j]);
			}
			System.out.println();
		}
	}

}
