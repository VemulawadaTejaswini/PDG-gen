import java.util.*;

public class Main {

	static final int inf = 10000000;
	static char[][] grid = new char[21][21];
	static final int[] xmove = {1, -1, 0, 0};
	static final int[] ymove = {0, 0, -1, 1};


	private static int bfs(int x, int y) {
		// System.out.println(x + " " + y);

		int[][] dist = new int[21][21];
		int ans = 0;

		for(int i=0; i<21; i++) {
			for(int j=0; j<21; j++) {
				dist[i][j] = inf;
			}
		}
		dist[x][y] = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		q.add(y);
		while(!q.isEmpty()) {
			int xx = q.remove();
			int yy = q.remove();
			// System.out.println(xx + " " + yy);
			for(int i=0; i<4; i++) {
				int xxx = xx + xmove[i];
				int yyy = yy + ymove[i];
				// System.out.println(xxx + " " + yyy + " new");
				if(xxx >= 0 && yyy >= 0 && grid[xxx][yyy] == '.') {
					// System.out.println(dist[xx][yy]);
					// System.out.println(xxx + " " + yyy + " passed");
					int tmp = dist[xx][yy] + 1;
					if(tmp < dist[xxx][yyy]) {
						dist[xxx][yyy] = tmp;
						// System.out.println(dist[xxx][yyy] + " new");
						q.add(xxx);
						q.add(yyy);
					}
					// System.out.println("Added.");
				}
			}
		}
		// System.out.println("Queue done.");

		for(int i=0; i<21; i++) {
			for(int j=0; j<21; j++) {
				if(grid[i][j] == '.') {
					// System.out.println(dist[i][j]);
					ans = Math.max(ans, dist[i][j]);
				}
			}
		}
		// System.out.println("Done.");

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		// char[][] grid = new char[h+1][w+1];

		for(int i=0; i<h; i++) {
			String line = sc.nextLine();

			for(int j=0; j<w; j++) {
				grid[i][j] = line.charAt(j);
			}
		}
		// System.out.println(grid[2][1]);

		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(grid[i][j] != '#') {
					int tmp = bfs(i, j);
					// System.out.println(tmp);
					ans = Math.max(ans, tmp);
				}
			}	
		}
		System.out.println(ans);	
	}
}