import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] maze = new char[n][m];
		boolean[][] visited = new boolean[n][m];
		int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		int white = 0;
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				char c = s.charAt(j);
				maze[i][j] = c;
				if (c == '.') { white++;}
			}
		}
		
		int step = 1;
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(0,0,1));
		
		while (!q.isEmpty()) {
			int size = q.size();
			// System.out.println(size);
			for (int i = 0; i < size; i++) {
				Point p = q.poll();
				int x = p.x;
				int y = p.y;
				
				visited[x][y] = true;
				
				if (x == (n - 1) && y == (m - 1)) {
					System.out.println(white - step);
					System.exit(0);
				}
				
				for (int[] dir: dirs) {
					int dx = x + dir[0];
					int dy = y + dir[1];
					
					if ((0 <= dx) && (dx <n) && 
						(0 <= dy) && (dy < m) && 
						maze[dx][dy] == '.' && 
						!visited[dx][dy]) {
						visited[dx][dy] = true;
						q.offer(new Point(dx, dy, step));
					}
				}
			}
			step++;
		}
		System.out.println(-1);
		
	}
	
    static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
	          e.printStackTrace();
	        }
	      }
	      return st.nextToken();
	    }
	
	    int nextInt() {
	      return Integer.parseInt(next());
	    }
	
	    long nextLong() {
	      return Long.parseLong(next());
	    }
	
	    double nextDouble() { 
	      return Double.parseDouble(next());
	    }
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}

class Point {
	public int x;
	public int y;
	public int step;
	public Point(int x, int y, int step) {
		this.x = x;
		this.y = y;
	}
}