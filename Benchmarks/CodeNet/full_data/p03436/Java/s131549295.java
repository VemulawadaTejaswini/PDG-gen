import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int h, w;
	static char[][] s;
	static int[][] gragh;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static final int INF = Integer.MAX_VALUE;

	static class Pair {
		int x, y;
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		s = new char[h][w + 1];
		for(int i = 0 ; i < h ; i++) s[i] = sc.next().toCharArray();
		int black = 0;
		int white = 0;
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(s[i][j] == '#') black++;
				else white++;
			}
		}
		int dist = bfs();

		int ans = white - (dist + 1);
//		for(int i = 0 ; i < h ; i++) {
//			for(int j = 0 ; j < w ; j++) {
//				System.out.print(s[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i = 0 ; i < h ; i++) {
//			for(int j = 0 ; j < w ; j++) {
//				if(s[i][j] == '.') {
//					s[i][j] = '#';
//					ans++;
//				}
//			}
//		}
		System.out.println(ans);
	}

	public static int bfs() {
		Queue<Pair> que = new LinkedList<>();
		gragh = new int[h][w];
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				gragh[i][j] = INF;
			}
		}
		que.add(new Pair(0, 0));
		gragh[0][0] = 0;
		while(que.size() != 0) {
			Pair p = que.poll();
			if(p.x == h - 1 && p.y == w - 1) break;
			for(int i = 0 ; i < 4 ; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(0 <= nx && nx < h && 0 <= ny && ny < w && s[nx][ny] != '#' && gragh[nx][ny] == INF) {
					que.add(new Pair(nx, ny));
					gragh[nx][ny] = gragh[p.x][p.y] + 1;
					s[nx][ny] = (char)('0' + gragh[p.x][p.y] + 1);
				}
			}
		}
		return gragh[h - 1][w - 1];
	}

}
