
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 007
	// https://atcoder.jp/contests/abc007/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int light = h * w;
		char[][] room = new char[h][w];
		int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
		Queue<Point> q = new LinkedList<>();
		int res = 0;
		
		for (int i = 0; i < h; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				room[i][j] = c;
				if (c == '#') {
					light--;
					q.offer(new Point(i, j));
				}
			}
		}
		
		while (!q.isEmpty()) {
			int size = q.size();
			res++;
			
			for (int i = 0; i < size; i++) {
				Point p = q.poll();
				for (int[] dir: dirs) {
					int dx = p.x + dir[0];
					int dy = p.y + dir[1];
					if ((0 <= dx) && (dx < h) && (0 <= dy) && (dy < w)) {
						if (room[dx][dy] != '#') {
							room[dx][dy] = '#';
							light--;
							q.offer(new Point(dx, dy));
						}
					}
				}
			}
		}
		
		System.out.println(res-1);
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
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}