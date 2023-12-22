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
		for(int i=0; i<N; i++){
			points[i] = new Point(sc.nextLong(), sc.nextLong());
		}
		sc.close();
		
		long ans = Long.MAX_VALUE;
		
		Arrays.sort(points, (p1,p2) -> (int)(p1.x - p2.x));
		for(int i=0; i<N-K+1; i++){
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			for(int j=i; j<i+K; j++){
				max = Math.max(max, points[j].y);
				min = Math.min(min, points[j].y);
			}
			ans = Math.min(Math.abs((points[i+K-1].x-points[i].x)*(max-min)), ans);
		}
		
		
		Arrays.sort(points, (p1,p2) -> (int)(p1.y - p2.y));
		for(int i=0; i<N-K+1; i++){
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			for(int j=i; j<i+K; j++){
				max = Math.max(max, points[j].x);
				min = Math.min(min, points[j].x);
			}
			ans = Math.min(Math.abs((points[i+K-1].y-points[i].y)*(max-min)), ans);
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