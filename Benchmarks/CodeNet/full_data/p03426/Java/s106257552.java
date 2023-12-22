import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inH = stdin.nextInt();
		int inW = stdin.nextInt();
		int max = inH * inW;

		int inD = stdin.nextInt();

		int[] ah = new int[max];
		int[] aw = new int[max];
		for (int h = 1; h <= inH; h++) {
			for (int w = 1; w <= inW; w++) {
				int inA = stdin.nextInt();
				ah[inA - 1] = h;
				aw[inA - 1] = w;
			}
		}

		int[][] pow = new int[max][];
		for (int a1 = 0; a1 < max; a1++) {
			pow[a1] = new int[max];
			for (int a2 = 0; a2 < a1; a2++) {
				int p = Math.abs(ah[a1] - ah[a2]) + Math.abs(aw[a1] - aw[a2]);
				pow[a1][a2] = p;
				pow[a2][a1] = p;
			}
		}

		int inQ = stdin.nextInt();
		for (int i = 0; i < inQ; i++) {
			int inL = stdin.nextInt();
			int inR = stdin.nextInt();

			long cost = 0;
			int prev = inL;
			for (int a = (inL + inD); a <= inR; a += inD) {
				cost += pow[prev - 1][a - 1];
				prev = a;
			}

			System.out.println(cost);
		}
	}

}
