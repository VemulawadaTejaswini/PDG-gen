import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
//https://abc007.contest.atcoder.jp/submissions/1889827
public class Main {
	static final int[] dx={0,1,0,-1}, dy={-1,0,1,0};
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt() + 2;
		int w = sc.nextInt() + 2;
		Point start = new Point(1, 1);
		Point goal = new Point(h-2, w-2);
		int all = 0;
		char[][] map = new char[h][w];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < w; i++) sb.append('#');
		map[0]=sb.toString().toCharArray();
		map[h-1]=sb.toString().toCharArray();
		for (int i = 1; i < h-1; i++) {
			map[i] = ("#"+sc.next()+"#").toCharArray();
			for(int j = 1; j < w-1; j++) {
				if(map[i][j] == '.') all++;
			}
		}
		ArrayDeque<Point> deque = new ArrayDeque<>();
		deque.add(start);

		int count = 0;
		map[1][1] = '#';
		int nx, ny;
		outer:for(;true;count++) {
			for(int i = deque.size(); i > 0; i--) {
				Point poll = deque.poll();
				if(poll.equals(goal)) {
					break outer;
				}
				for(int j = 0; j < 4; j++) {
					nx = poll.x+dx[j];
					ny = poll.y+dy[j];
					//if(nx < 0 || nx > h-1 || ny < 0 || ny > w-1) {

					//} else {
						if(map[nx][ny] == '.') {
							deque.add(new Point(nx,ny));
							map[nx][ny] = '#';
						}
					//}
				}
			}
		}
		System.out.println(all - count - 1);
	}
}