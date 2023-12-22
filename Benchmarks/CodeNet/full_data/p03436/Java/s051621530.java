import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int h;
		int w;
		Pair(int h, int w){
			this.h=h;
			this.w=w;
		}
	}

	char g[][];
	int d[][];
	int INF = 1001001001;
	int dw[] = {1,0,-1,0};
	int dh[] = {0,1,0,-1};
	int H;
	int W;
	public void run() {
		Scanner sc = new Scanner(System.in);
		H=sc.nextInt();
		W=sc.nextInt();
		g = new char[H][W];
		d = new int[H][W];
		int wc=0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				d[i][j]=INF;
			}
		}
		for(int i=0; i<H; i++) {
			g[i] = sc.next().toCharArray();
			for(int j=0; j<W; j++) {
				if(g[i][j]=='.') {
					wc++;
				}
			}
		}

		wc -= 2;

		bfs();

		if(d[H-1][W-1] == INF) {
			System.out.println(-1);
			sc.close();
			return;
		}

		wc -= d[H-1][W-1]-1;
		System.out.println(wc);

		sc.close();
	}

	private void bfs() {
		d[0][0]=0;
		ArrayDeque<Pair> q = new ArrayDeque<Pair>();
		q.add(new Pair(0,0));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			for(int i=0; i<4; i++) {
				int sh = p.h+dh[i];
				int sw = p.w+dw[i];
				if(sw<0 || sw>=W || sh<0 || sh >=H || g[sh][sw] == '#') continue;
				if(d[sh][sw] == INF) {
					q.add(new Pair(sh, sw));
					d[sh][sw] = d[p.h][p.w]+1;
				}
			}
		}
	}
}
