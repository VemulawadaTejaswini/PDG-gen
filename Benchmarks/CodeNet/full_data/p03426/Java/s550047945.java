import java.util.*;
// im sorry
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int D = in.nextInt();
		Point[] ary = new Point[H*W+1];
		for( int i = 0; i < H; i++ ) {
			for( int j = 0; j < W; j++ ) {
				int ind = in.nextInt();
				ary[ind] = new Point(i+1, j+1);
			}
		}
		int Q = in.nextInt();
		while(Q-->0){
			int total = 0;
			int L = in.nextInt();
			int R = in.nextInt();
			while( L != R ) {
				total += getPoints(ary[L].x,ary[L].y,ary[L+D].x,ary[L+D].y);
				L += D;
			}
			System.out.println(total);
		}
	}

	public static int getPoints( int i, int j, int x, int y ) {
		return Math.abs(x-i)+Math.abs(y-j);
	}

	public static class Point {
		int x, y;
		public Point( int x, int y ) {
			this.x = x;
			this.y = y;
		}
	}
}