
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int h,w;
	static char [][] grid;
	static int [][]ans;
	static int INF = 1000000000;
	static Queue <Point> que;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		
		grid = new char [h][w];
		
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		ans = new int [h][w];	
		if(grid[0][0] == '#') {
			ans[0][0]++;
			grid[0][0] = '.';
		}
		if(grid[h-1][w-1] == '#') {
			ans[0][0]++;
			grid[h-1][w-1] = '.';
		}
		
		que = new ArrayDeque <Point>();
		
		for(int i = 0 ;i < h ; i++) {
			for(int j = 0 ; j < w ;j++) {
				if(!(i == 0 && j == 0)) {
					ans[i][j] = INF;
				}
			}
		}
		Point start = new Point (0,0);
		bfs(start);
		
		System.out.println(ans[h-1][w-1]);
		
	}
	
	static void bfs(Point p) {
		
		int []dx = {0,1};
		int []dy = {1,0};
		
		for(int i = 0 ;i <= 1 ;i++) {
			int py = p.getY() + dy[i];
			int px = p.getX() + dx[i];
			if(!jdg(py,px)) {
				continue;
			}
			if(grid[py][px] == '#') {
				ans[py][px] = Math.min(ans[py][px], ans[p.getY()][p.getX()] + 1);
			}
			else {
				ans[py][px] = Math.min(ans[py][px], ans[p.getY()][p.getX()]);
			}
			Point next = new Point(py,px);
			que.add(next);
		}
		if(que.size() == 0) {
			return;
		}
		bfs(que.poll());
	}
	
	static boolean jdg(int y, int x) {
		if(y < 0 || y >= h) {
			return false;
		}
		if(x < 0 || x >= w) {
			return false;
		}
		
		return true;
	}

}
class Point{
	private int y;
	private int x;
	
	public Point (int y , int x) {
		this.y = y;
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
}
