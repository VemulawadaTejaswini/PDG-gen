import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	Scanner sc = new Scanner(System.in);
	int H,W;
	int[][]_map;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		H = nextInt();
		W = nextInt();

		int[][] map = new int [H][W];//# = 1
		for(int i=0;i<H;i++) {
			char[] C = sc.next().toCharArray();
			for(int j=0;j<W;j++) {
				if(C[j]=='#')map[i][j] = 1;
			}
		}

		if(H==1&&W==1) {out.println(0); return;}
		_map = new int[H][W];
		//#の隣接を埋める処理
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(map[i][j]==1) {
					if(i>0)_map[i-1][j]=1;
					if(j>0)_map[i][j-1]=1;
					if(i<H-1)_map[i+1][j]=1;
					if(j<W-1)_map[i][j+1]=1;
					_map[i][j]=1;
				}
			}
		}

		int cnts[][] = new int[H][W];
		for(int i=0;i<H;i++)Arrays.fill(cnts[i], 1001);

		//左から右へ #に当たるまでカウントしcntsへ
		for(int i=0;i<H;i++) {
			int cnt=1001;
			for(int j=0;j<W;j++) {
				if(_map[i][j]==1) {
					cnts[i][j]=1;
					cnt=1;
				}else {
					cnts[i][j] = Math.min(cnts[i][j], cnt);
				}
				cnt++;
			}
		}

		//右から左へ
		for(int i=H-1;i>=0;i--) {
			int cnt=1001;
			for(int j=W-1;j>=0;j--) {
				if(_map[i][j]==1) {
					cnts[i][j]=1;
				}else {
					cnts[i][j] = Math.min(cnts[i][j], cnt);
				}
				cnt++;
			}
		}
		//上から下へ
		for(int i=0;i<W;i++) {
			int cnt=1001;
			for(int j=0;j<H;j++) {
				if(_map[i][j]==1) {
					cnts[i][j]=1;
					cnt=1;
				}else {
					cnts[i][j] = Math.min(cnts[i][j], cnt);
				}
				cnt++;
			}
		}

		//下から上へ
		for(int i=W-1;i>=0;i--) {
			int cnt=1001;
			for(int j=H-1;j>=0;j--) {
				if(_map[i][j]==1) {
					cnts[i][j]=1;
					cnt=1;
				}else {
					cnts[i][j] = Math.min(cnts[i][j], cnt);
				}
				cnt++;
			}
		}
/*
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				out.print(_map[i][j]);
			}
			out.println();
		}
*/
		int max = 0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				max=Math.max(max,cnts[i][j]);
			}
		}
		out.println(max);
	}


	private int nextInt() {
		return Integer.parseInt(next());
	}
	private long nextLong() {
		return Long.parseLong(next());
	}
	private String next() {
		return sc.next();
	}

}