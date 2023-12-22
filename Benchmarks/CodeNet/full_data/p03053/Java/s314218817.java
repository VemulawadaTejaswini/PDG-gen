import java.util.*;

public class Main {
	static class Position {
		int y,x;
		int dis;
		public Position(int y, int x, int dis) {
			this.y = y;
			this.x = x;
			this.dis = dis;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H][];
		for(int i=0; i<H; i++)
			A[i] = sc.next().toCharArray();
		
		boolean[][] queued = new boolean[H][W];
		boolean[][] visited = new boolean[H][W];
		ArrayList<Position> que = new ArrayList<>();
		int cur = 0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(A[i][j] == '#') {
					que.add(new Position(i, j, 0));
					queued[i][j] = true;
				}
			}
		}
		
		int cnt = 0;
		
		final int[] dx = {1, 0, -1, 0};
		final int[] dy = {0, 1, 0, -1};
		
		int max = 0;
		while(cnt < H*W) {
			Position p = que.get(cur);
			if(!visited[p.y][p.x]) {
				for(int d=0; d<4; d++) {
					int ny = p.y + dy[d];
					int nx = p.x + dx[d];
					if(0<=ny && ny<H && 0<=nx && nx<W && !queued[ny][nx]) {
						que.add(new Position(ny, nx, p.dis+1));
						queued[ny][nx] = true;
					}
				}
				visited[p.y][p.x] = true;
				cnt++;
				max = p.dis;
			}
			cur++;
		}
		
		System.out.println(max);
		sc.close();
	}
}

