import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		boolean[][] w = new boolean[H][W];
		int sy=0,sx=0;
		for(int i=0; i<H; i++) {
			char[] c = sc.next().toCharArray();
			for(int j=0; j<W; j++) {
				w[i][j] = c[j]=='#';
				if(c[j]=='S') {
					sy = i;
					sx = j;
				}
			}
		}

		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, -1, 0, 1};
		boolean[][] visited = new boolean[H][W];
		LinkedList<Long> q = new LinkedList<>();
		q.add(new Long(sy<<10 | sx));
		visited[sy][sx] = true;
		
		int nearest = 10000;
		
		while(!q.isEmpty()) {
			Long next = q.remove();
			int y = (int)((next>>10) & ((1<<10)-1));
			int x = (int)(next & ((1<<10)-1));
			int step = (int)(next>>20);
			
			int dis2Wall = Math.min(Math.min(y, H-1-y), Math.min(x, W-1-x));
			nearest = Math.min(nearest, dis2Wall);
			if(step<K) {
				for(int d=0; d<4; d++) {
					int ny = y + dy[d];
					int nx = x + dx[d];
					if(0<=ny && ny<H && 0<=nx && nx<W && !w[ny][nx] && !visited[ny][nx]) {
						q.add(new Long((step+1)<<20 | ny<<10 | nx));
						visited[ny][nx] = true;
					}
				}
			}
		}
		
		System.out.println((nearest+K-1)/K+1);
		sc.close();
	}
}
