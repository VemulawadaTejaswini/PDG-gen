import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		int A[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int Q = sc.nextInt();
		int L[] = new int[Q];
		int R[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		for (int i = 0; i < Q; i++) {
			int count = 0;
			int x = L[i];
			int T = 0;
			int Y = 0;
			while (x != R[i]) {
				for (int j = 0; j < H; j++) {
					for (int k = 0; k < W; k++) {
						if (A[j][k] == x) {
							T = j;
							Y = k;
						}
					}
				}
				for (int j = 0; j < H; j++) {
					for (int k = 0; k < H; k++) {
						if (A[j][k] == x + D) {
							count += Math.abs(j - T) + Math.abs(k - Y);
							x += D;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}