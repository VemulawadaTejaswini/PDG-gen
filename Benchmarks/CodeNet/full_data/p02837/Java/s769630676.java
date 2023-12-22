import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] g = new int[N][N];
		// 初期化(i番目の人は証言していない)
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				g[i][j] = -1;
			}
		}
		// 証言の入力
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			for(int j = 0; j < A; j++) {
				int X = sc.nextInt(); // X番目の人に対して
				int Y = sc.nextInt(); // 正直者(1)か不親切(0)であるか証言する
				g[i][X - 1] = Y;			
			}
		}
		sc.close();

		// System.out.println("-------------------");
		// for(int i = 0; i < N; i++) {
		// 	System.out.print((i + 1) + " Number = ");
		// 	for(int j = 0; j < N; j++) {
		// 		System.out.print("[" + (j + 1) + "]" + String.format("%2d", g[i][j]) + " ");
		// 	}
		// 	System.out.println("");
		// }
		// System.out.println("N^2 = " + (1 << N));
		// System.out.println("-------------------");

		int r = 0;
		// N^2のループ
		for(int i = 0; i < (1 << N); i++) {
			int[] d = new int[N];
			for(int j = 0; j < N; j++) {
				d[j] = i >> j & 1;
			}

			boolean ok = true;
			for(int j = 0; j < N; j++) {
				// 正直者と割当した場合
				if(d[j] == 1) {
					for(int k = 0; k < N; k++) {
						if(g[j][k] == -1) continue;
						if(g[j][k] != d[k]) ok = false;
					}
				}
			}
			if(ok) r = Math.max(r, Integer.bitCount(i));
		}
		System.out.println(r);
	}
}
