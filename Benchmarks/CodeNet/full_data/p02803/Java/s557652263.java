import java.util.*;
public class Main {
	static int w, h;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		w = sc.nextInt();
		h = sc.nextInt();
		char[][] map = new char[w][h];
		for(int i=0;i<w;i++) {
			String s = sc.next();
			for(int j=0;j<h;j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		int max = 0;
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				for(int x=0;x<w;x++) {
					for(int y=0;y<h;y++) {
						if(map[i][j]=='.' && map[x][y]=='.') {
							int res = bfs(map, i, j, x, y);
							if(res>max)
								max = res;
						}
					}
				}
			}
		}
		
		System.out.println(max);
	}
	static int bfs(char[][] arr, int sx, int sy, int gx, int gy) {
		int cnt = 0;
		int[][] dis = new int[w][h];
		boolean[][] vis = new boolean[w][h];
		for(int i=0;i<w;i++) {
			Arrays.fill(dis[i], 0);
			Arrays.fill(vis[i], false);
		}
		
		Queue<Integer> que = new LinkedList<>();
		que.offer(sx);
		que.offer(sy);
		vis[sx][sy] = true;
		
		int[] x = {-1, 0, 1, 0};
		int[] y = {0, 1, 0, -1};
		while(que.size()>0) {
			int a = que.poll();
			int b = que.poll();
			int d = dis[a][b]+1;
			
			for(int i=0;i<4;i++) {
				int na = a+x[i];
				int nb = b+y[i];
				
				if(0<=na && na<w && 0<=nb && nb<h && arr[na][nb]=='.' && !vis[na][nb]) {
					que.offer(na);
					que.offer(nb);
					dis[na][nb] = d;
					vis[na][nb] = true;
					
					if(na==gx && nb==gy)
						return dis[na][nb];
				}
			}
		}
		return 0;
	}
}
