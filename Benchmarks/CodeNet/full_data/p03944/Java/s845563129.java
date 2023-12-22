import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(),H = sc.nextInt(),N = sc.nextInt();
		int[][] ary = new int[H][W];

		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();

			for(int n = 0;n < H;n++) {
				for(int m = 0;m < W;m++) {
					if(a == 1) {
						if(x > m) ary[n][m] = 1;
					}else if(a == 2) {
						if(x < m+1) ary[n][m] = 1;
					}else if(a == 3) {
						if(y > n) ary[n][m] = 1;
					}else {
						if(y < n+1) ary[n][m] = 1;
					}
				}
			}
		}

		int count = 0;
		for (int[] is : ary) {
			for (int p : is) {
				if(p == 0) count++;
			}
		}
		System.out.println(count);
	}
}