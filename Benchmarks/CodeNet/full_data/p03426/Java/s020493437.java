import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();

		int[] x = new int[H*W+1];
		int[] y = new int[H*W+1];

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int a = sc.nextInt();
				x[a] = i;
				y[a] = j;
			}
		}

		int[] d = new int[H*W+1];
		for(int i = D+1; i < H*W; i++) {
			d[i] = d[i-D] + Math.abs(x[i] - x[i-D]) + Math.abs(y[i] - y[i-D]);
		}

		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(d[r] - d[l]);
		}
	}
}
