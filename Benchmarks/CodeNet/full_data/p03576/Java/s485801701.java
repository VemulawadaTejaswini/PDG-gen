import java.util.Arrays;
import java.util.Scanner;
 
/**
 *http://abc075.contest.atcoder.jp/tasks/abc075_d
 */
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		Point[] points = new Point[N];
		long[] xList = new long[N];
		long[] yList = new long[N];
		for(int i=0; i<N; i++){
			points[i] = new Point(sc.nextLong(), sc.nextLong());
			xList[i] = points[i].x;
			yList[i] = points[i].y;
		}
		sc.close();
		
		long ans = Long.MAX_VALUE;
		Arrays.sort(xList);
		Arrays.sort(yList);
		for(int xi=0; xi<N; xi++){
			for(int xj=xi+1; xj<N; xj++){
				for(int yi=0; yi<N; yi++){
					for(int yj=yi+1; yj<N; yj++){
						long xl = xList[xi];
						long xr = xList[xj];
						long yb = yList[yi];
						long yu = yList[yj];
						int num = 0;
						for(Point p:points){
							if(xl<=p.x && p.x<=xr && yb<=p.y && p.y<=yu){
								num++;
							}
						}
						if(num>=K){
							ans = Math.min(ans, (xr-xl)*(yu-yb));
						}
					}
				}
			}
		}
		System.out.println(ans);
 
	}
	
	static class Point{
		public Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
		long x;
		long y;
	}
 
}