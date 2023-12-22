import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		int max = 0;

		String[][] maze = new String[h][w];

		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				maze[i][j] = s.substring(j, j+1);
			}
		}

		for (int sx = 0; sx < h; sx++) {
			for (int sy = 0; sy < w; sy++) {
				for (int gx = 0; gx < h; gx++) {
					for (int gy = 0; gy < w; gy++) {
						int[][] d = new int[h][w];
						if(sx == gx && sy == gy) break;

						for(int i = 0; i < h; i++) {
							for(int j = 0; j < w; j++ ) {
								d[i][j] = 0;
							}
						}
						point point = new point(sx, sy);
						Queue<point> que = new ArrayDeque<point>();
						que.add(point);
						while(0 != que.size()) {
							point p = que.poll();
							if(p.x == gx && p.y == gy) break;
							for(int i = 0; i < 4; i++) {
								int cx = p.x + dx[i];
								int cy = p.y + dy[i];
								if(cx >= 0 && cx <= h-1 && cy >= 0 && cy <= w-1 && !maze[cx][cy].equals("#")  && d[cx][cy] == 0) {
									d[cx][cy] = d[p.x][p.y] + 1;
									que.add(new point(cx, cy));
								}
							}
						}
						max = Math.max(max, d[gx][gy]);

					}
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