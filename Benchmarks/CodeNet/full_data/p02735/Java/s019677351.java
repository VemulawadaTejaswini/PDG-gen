import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static String[] lines;
	static int H;
	static int W;
	static Point source;
	static Point dest;
	static int[][] min;
	
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
		
		source = new Point(1, 1);
		dest = new Point(H,W);
		
		
		min = new int[H+1][W+1];
		
		for(int r=1;r<=H;r++) {
			for(int c=1;c<=W;c++) {
				int add = lines[r-1].charAt(c-1)=='#'?1:0;
				if( r==1 && c==1 ) {
					min[r][c] = add;
					continue;
				}
				else if( r != 1 && c != 1) {
					min[r][c] = MIN(min[r-1][c],min[r][c-1]) + add;
				}
				else if( r ==1 && c != 1) {
					min[r][c] = min[r][c-1] + add;
				}
				else{
					min[r][c] = min[r-1][c] + add;
				}
			}
		}
		
		System.out.println(min[H][W]);
		
	}
	
	private static int MIN(int x,int y) {
		if( x > y) {
			return y;
		}
		return x;
	}
	
	
	
	static class Point {
		int x;
		int y;
		Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	
}	

