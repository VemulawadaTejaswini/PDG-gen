import java.util.Scanner;

public class Main {
	static int W, H;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		W = sc.nextInt();
		H = sc.nextInt();
		int N = sc.nextInt();
		int[]x = new int[N];
		int[]y = new int[N];
		int[]a = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		sc.close();
		int[][]c = new int[H][W];
		for(int i = 0; i < N; i++) {
			paint(x[i], y[i], a[i], c);
		}
		int cnt = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(c[i][j] == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	static void paint(int x, int y, int n, int[][]c) {
		if(n == 1) {
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < x; j++) {
					c[i][j] = 1;
				}
			}
		}else if(n == 2) {
			for(int i = 0; i < H; i++) {
				for(int j = x; j < W; j++) {
					c[i][j] = 1;
				}
			}
		}else if(n == 3) {
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < W; j++) {
					c[i][j] = 1;
				}
			}
		}else {
			for(int i = y; i < H; i++) {
				for(int j = 0; j < W; j++) {
					c[i][j] = 1;
				}
			}
		}
	}
}