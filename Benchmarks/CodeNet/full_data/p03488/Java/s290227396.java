import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 081
	// https://atcoder.jp/contests/abc081/tasks
	final static int MOD = 10007;
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		int gx = sc.nextInt();
		int gy = sc.nextInt();
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(0, 0, 'E'));
		int pos = 0;
		
		while (!q.isEmpty() && pos <= s.length()) {
			int size = q.size();
			char command = (pos == s.length()) ? ' ' : s.charAt(pos);
			pos++;
			for (int i = 0; i < size; i++) {
				Point p = q.poll();
				int x = p.x;
				int y = p.y;
				
				char dir = p.dir;
				if (x == gx && y == gy && pos == s.length() + 1) {
					System.out.println("Yes");
					System.exit(0);
				}
				
				if (command == 'F') {
					if (dir == 'E') {
						q.offer(new Point(x + 1, y, dir));
					} else if (dir == 'W') {
						q.offer(new Point(x - 1, y, dir));
					} else if (dir == 'N') {
						q.offer(new Point(x, y + 1, dir));
					} else {
						q.offer(new Point(x, y - 1, dir));
					}
				} else {
					if (dir == 'E' || dir == 'W') {
						q.offer(new Point(x, y, 'N'));
						q.offer(new Point(x, y, 'S'));
					} else {
						q.offer(new Point(x, y, 'W'));
						q.offer(new Point(x, y, 'E'));
					}
				}
			}
		}
		System.out.println("No");
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
	char dir;
	public Point(int x, int y, char dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
}