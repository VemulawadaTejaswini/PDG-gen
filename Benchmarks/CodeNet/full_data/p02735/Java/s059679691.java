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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		
	}
	
	private static void dfs(int traveledBlackNum,Point start) {
		
		if( traveledBlackNum >= ans ) {
			return;
		}
		
		if( start.equals(dest) ) {
			if ( traveledBlackNum < ans ) {
				ans = traveledBlackNum;
			}
			return;
		}
		
		//right;
		if( start.y < dest.y) {
			Point next = new Point(start.x,start.y+1);
			if( lines[start.x-1].charAt(start.y) == '#' ) {
				dfs (traveledBlackNum+1,next);
			}else {
				dfs(traveledBlackNum,next);
			}
		}
		//down
		if( start.x < dest.x ) {
			Point next = new Point(start.x+1,start.y);
			if( lines[start.x].charAt(start.y-1) == '#') {
				dfs(traveledBlackNum+1,next);
			}else {
				dfs(traveledBlackNum, next);
			}
		}
	}
	

}
