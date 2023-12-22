import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int ans ;
	static String[] lines;
	static int H;
	static int W;
	static Point source;
	static Point dest;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		String s = bw.readLine();
		String[] w = s.split("\\s+");
		H = Integer.parseInt(w[0]);
		W = Integer.parseInt(w[1]);
		lines = new String[H];
		
		for(int i=0;i<H;i++) {
			lines[i] = bw.readLine(); 
		}
		
		ans =  H  + W - 2;
		source = new Main.Point(1, 1);
		dest = new Main.Point(H,W);
		
		dfs(0,source);
		
		System.out.println(ans);
		
	}
	
	static class Point {
		int x;
		int y;
		Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static void dfs(int traveledBlackNum,Point start) {
		if( ans == 0) {
			return;
		}
		
		if( traveledBlackNum >= ans ) {
			return;
		}
		
		if( start.x == H && start.y == W ) {
			if ( traveledBlackNum < ans ) {
				ans = traveledBlackNum;
			}
			return;
		}
		
		//right;
		if( start.y < W) {
			Point next = new Point(start.x,start.y+1);
			if( lines[start.x-1].charAt(start.y) == '#' ) {
				dfs (traveledBlackNum+1,next);
			}else {
				dfs(traveledBlackNum,next);
			}
		}
		//down
		if( start.x < H ) {
			Point next = new Point(start.x+1,start.y);
			if( lines[start.x].charAt(start.y-1) == '#') {
				dfs(traveledBlackNum+1,next);
			}else {
				dfs(traveledBlackNum, next);
			}
		}
	}
	

}
