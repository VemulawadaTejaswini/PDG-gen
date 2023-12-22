
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] masu = new int[H][W];
		for(int i = 0; i < H; i++) {
			char[] tmp = sc.next().toCharArray();
			for(int j = 0; j < W; j++) {
				if(tmp[j] == '#') {
					masu[i][j] = 0;
				} else {
					masu[i][j] = 10000000;
				}
			}
		}
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(masu[i][j] == 10000000) {
						flag = true;
					}
				}
			}
			if(!flag) {
				break;
			}
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(0 < i) {
						masu[i - 1][j] = Math.min(masu[i - 1][j], masu[i][j] + 1);
					}
					if(i < H - 1) {
						masu[i + 1][j] = Math.min(masu[i + 1][j], masu[i][j] + 1);
					}
					if(0 < j) {
						masu[i][j - 1] = Math.min(masu[i][j - 1], masu[i][j] + 1);
					}
					if(j < W - 1) {
						masu[i][j + 1] = Math.min(masu[i][j + 1], masu[i][j] + 1);
					}
				}
			}
		}
		int max = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				max = Math.max(max, masu[i][j]);
			}
		}
		System.out.println(max);
	}

}
