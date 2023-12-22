import java.awt.Point;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] s = new int[H][W];
		int dots = 0;
		
		for (int h = 0; h < H; h++) {
			String line = sc.next();
			
			for (int w = 0; w < W; w++) {
				s[h][w] = line.charAt(w) == '.' ? 0 : -1;
				if (s[h][w] == 0) dots++;
			}
		}
		
		Queue<Point> queue = new ArrayDeque<>();
	    /* Point(2, 3) -> s[3][2] (x, y -> w, h) */
		
		queue.add(new Point(0, 0));
		s[0][0] = 1;
		
		int[] mx = {0, 1, 0, -1};
		int[] my = {1, 0, -1, 0};
		
		while (!queue.isEmpty()) {
			Point current = queue.poll();
			int cx = current.x;
			int cy = current.y;
			
			for (int i = 0; i < my.length; i++) {
				int nx = cx + mx[i];
				int ny = cy + my[i];
				
				if (inRange(nx, 0, W) && inRange(ny, 0, H) && s[ny][nx] == 0) {
					s[ny][nx] = s[cy][cx] + 1;
					queue.add(new Point(nx, ny));
				}
			}
		}
		
		so.println(s[H-1][W-1] == 0 ? -1: dots-s[H-1][W-1]);
	}
	
	static boolean inRange(int x, int l, int r) {
		return l <= x && x < r;
	}
}
