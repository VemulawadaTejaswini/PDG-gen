import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt(), W = scn.nextInt(), A = scn.nextInt(), B = scn.nextInt();
		int[][] ans = new int[H][W];
		for(int h = 0;h < H;h++) {
			for(int w = 0;w < W;w++) {
				if(h < B) {
				System.out.print((w < A)?0:1);
				}else {
					System.out.print((w < A)?1:0);
				}
			}
			System.out.println();
		}
	}

}
