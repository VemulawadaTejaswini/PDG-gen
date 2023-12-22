import java.awt.Point;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		char[][] s = new char[H+2][W+2];
		int[][] d = new int[H+2][W+2];
		int total = 0;
		for(int i = 1; i <= H; i++) {
			String S = sc.next();
			for(int j = 1; j <= W; j++) {
				s[i][j] = S.charAt(j-1);
				if(S.charAt(j-1) == '.')
					total++;
			}
			Arrays.fill(d[i], 10000);
		}
		Queue<Point> q = new ArrayDeque<>();
		q.add(new Point(1, 1));
		d[1][1] = 0;
		while(q.size() > 0) {
			Point p = q.poll();
			for(int i = 0; i < 4; i++) {
				if(s[p.y+dy[i]][p.x+dx[i]] == '.' && d[p.y+dy[i]][p.x+dx[i]] > d[p.y][p.x] + 1) {
					d[p.y+dy[i]][p.x+dx[i]] = d[p.y][p.x] + 1;
					q.offer(new Point(p.x+dx[i], p.y+dy[i]));		
				}
			}
		}
		if(d[H][W] == 10000)
			System.out.println(-1);
		else
			System.out.println(total - d[H][W] - 1);
	}

}