import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		int max = 0;
		String[][] maze = new String[h][w];
		for(int i = 0; i < h; i++) maze[i] = sc.next().split("");
		for (int sx = 0; sx < h; sx++) {
			for (int sy = 0; sy < w; sy++) {
				if(maze[sx][sy].equals("#")) continue;
				int[][] d = new int[h][w];
				for (int i = 0; i < h*w; i++) d[i%h][i/h] = 1000;
				d[sx][sy] = 0;
				point point = new point(sx, sy);
				Queue<point> que = new ArrayDeque<point>();
				que.add(point);
				while(0 != que.size()) {
					point p = que.poll();
					for(int i = 0; i < 4; i++) {
						int cx = p.x + dx[i];
						int cy = p.y + dy[i];
						if(cx >= 0 && cx <= h-1 && cy >= 0 && cy <= w-1 && !maze[cx][cy].equals("#")  && d[cx][cy] == 1000) {
							d[cx][cy] = d[p.x][p.y] + 1;
							que.add(new point(cx, cy));
						}
					}
				}
				for (int i = 0; i < h*w; i++) {
					if(d[i%h][i/h] < 1000) max = Math.max(max,d[i%h][i/h]);
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
	public static class point{
		int x; int y;
		point(int x,int y){
			this.x = x; this.y =y;
		}
	}
}