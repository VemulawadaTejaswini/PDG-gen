import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		long[][] c = new long[10][10];
		long INF = 10000000;
		WF wf = new WF(c, INF);
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				c[i][j] = sc.nextLong();
			}
		}
		long[][] min_c = wf.getAllDis();

		long min_maryoku = 0;
		int[][] A = new int[H][W];
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				A[i][j] = sc.nextInt();

				if(A[i][j] != -1 && A[i][j] != 1) {
					min_maryoku += min_c[A[i][j]][1];
				}
			}
		}

		System.out.println(min_maryoku);

	}

	//ワーシャルフロイド法
	public static class WF{
		long[][] d;
		long INF;

		public WF(long[][] d, long INF) {
			this.d = d;
			this.INF = INF;

			//初期化
			for(int i=0; i<d.length; i++) {
				Arrays.fill(d[i], INF);
			}

			//自分自身との距離を0に設定
			for(int i=0; i<d.length; i++) {
				d[i][i] = 0;
			}
		}

		//全頂点間の最短距離(重みに負の値あり)(ワーシャルフロイド法)(O(V^3))
		public long[][] getAllDis(){

			for(int k=0; k<d.length; k++) {
				for(int i=0; i<d.length; i++) {
					for(int j=0; j<d.length; j++) {
						if(d[i][k] != INF && d[k][j] != INF) {
							d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
						}
					}
				}
			}

			return d;
		}

		//負の閉路検出(O(V))
		public boolean isNegativeCycle() {
			for(int i=0; i<d.length; i++) {
				if(d[i][i] < 0) {
					return true;
				}
			}

			return false;
		}
	}
}
