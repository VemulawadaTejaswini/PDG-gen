import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	private class Point {
		int x, y;
		int dist = 0;
		public Point(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
	
	private int H;
	private int W;
	private int[] map;
 
	public int get(int x, int y) {
		if (x<0||y<0||x>=W||y>=H) {
			return 0;
		} else {
			return map[y*W+x];
		}
	}
	
	public void solve() {
		LinkedList<Point> next = new LinkedList<Main.Point>();
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		W = in.nextInt();
		
		map = new int[H*W];
		Arrays.fill(map, -1);
		
		for (int y=0; y<H; y++) {
			String line = in.next();
			for (int x=0; x<W; x++) {
				if (line.charAt(x) == '#') {
					// black
					map[y*W+x] = 0;
					next.add(new Point(x, y, 0));
				}
			}
		}
		in.close();
		
		int max = 0;
		while (next.isEmpty() == false) {
			Point p = next.removeLast();
			for (int d=-1; d<=1; d+=2) {
				int dx = p.x + d;
				int dy = p.y;
				if (get(dx, dy) == -1) {
					map[dy*W+dx] = p.dist+1;
					next.addFirst(new Point(dx, dy, p.dist+1));
					max = p.dist+1;
				}
			}
			for (int d=-1; d<=1; d+=2) {
				int dx = p.x;
				int dy = p.y + d;
				if (get(dx, dy) == -1) {
					map[dy*W+dx] = p.dist+1;
					next.addFirst(new Point(dx, dy, p.dist+1));
					max = p.dist+1;
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}