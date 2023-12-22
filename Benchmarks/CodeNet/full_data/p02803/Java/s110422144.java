import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt(), W = scn.nextInt();
		int d[][] = new int[H*W][H*W];
		boolean[] wall = new boolean[H*W];
		scn.nextLine();
		for(int i = 0;i < H;i++) {
			char[] ch = scn.nextLine().toCharArray();
			for(int j = 0;j < W;j++) {
				wall[W*i+j] = (ch[j]=='#')?true:false;
			}
		}

		for(int i = 0;i < H*W;i++) {
			Arrays.fill(d[i], INF);
		}
		for(int i = 0;i < H*W;i++) {
			if(wall[i])continue;
			d[i][i] = 0;
			if(i%W!=0) {
				if(!wall[i-1])d[i][i-1] = 1;
			}
			if(i%W!=W-1) {
				if(!wall[i+1])d[i][i+1] = 1;
			}
			if(i/W!=0) {
				if(!wall[i-W])d[i][i-W] = 1;
			}
			if(i/W!=H-1) {
				if(!wall[i+W])d[i][i+W] = 1;
			}
		}
		warshall_floyd(d);
		int max = 0;
		for(int i = 0;i < H*W;i++) {
			for(int j=0;j<H*W;j++) {
				if(d[i][j]!=INF) {
					max = Math.max(max, d[i][j]);
				}
			}
		}
		System.out.println(max);
	}


	public static void warshall_floyd(int[][] d) {// @param d[][]:最初の経路のコスト情報
		int V = d.length;
		for (int i = 0; i < V; i++) {
			d[i][i] = 0;
		}
		for (int k = 0; k < V; k++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					if (d[i][k] != INF && d[k][j] != INF)
						d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
	}

}
