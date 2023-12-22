import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] A = new int[H][W];

		for (int i = 0; i < H; i++) {
			String line = sc.next();
			char[] chr = line.toCharArray();
			for (int j = 0; j < W; j++) {
				if (chr[j] == '#') {
					A[i][j] = 1;
				} else {
					A[i][j] = 0;
				}

			}
		}
		
		int count = 1;
		while (count > H*W) {
			int flg = -1;
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (A[i][j] == count) {
						A[i][j] += count;
						if (i-1 >= 0 && A[i-1][j] == 0) {
							A[i-1][j] += 1+count;
	                        flg += 1;
						}
						if (j-1 >= 0 && A[i][j-1] == 0) {
							A[i][j-1] += 1+count;
	                        flg += 1;
						}
						if (j+1 < W && A[i][j+1] == 0) {
							A[i][j+1] += 1+count;
	                        flg += 1;
						}
						if (i+1 < H && A[i+1][j] == 0) {
							A[i+1][j] += 1+count;
	                        flg += 1;
						}
					}
				}
			}
			
			if (flg == -1) {
				break;
			}
			++count;
		}
		
		System.out.println(count-1);
	}
}