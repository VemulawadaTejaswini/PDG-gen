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
		boolean f = true;
		int[][] map = new int [H][W];//# = 1
		for(int i=0;i<H;i++)Arrays.fill(map[i], 1010);
		for(int i=0;i<H;i++) {
			char[] C = sc.next().toCharArray();
			for(int j=0;j<W;j++) {
				if(C[j]=='#')map[i][j] = 0;
				else f = false;
			}
		}
		if(f) {out.println(0); return;}
		int t = 0;
		f = true;
		//#の隣接を埋める処理
		while(f) {
			f= false;
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					if(map[i][j]==t) {
						if(i>0)map[i-1][j]=min(map[i-1][j],t+1);
						if(j>0)map[i][j-1]=min(map[i][j-1],t+1);
						if(i<H-1)map[i+1][j]=min(map[i+1][j],t+1);
						if(j<W-1)map[i][j+1]=min(map[i][j+1],t+1);
						if(!f)f=true;
					}
				}
			}
			t++;
		}

		int max = 0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				max=Math.max(max,map[i][j]);
			}
		}
		out.println(max);
	}


	private int min(int a, int b) {
		return Math.min(a, b);
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