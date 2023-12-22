import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static char[][] c;
	static int H, W;
	static List<Point> p;
	static long ans = 0;
	static boolean[][] m;
	static long cnt1 = 0;
	static long cnt2 = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		String[] S = new String[H];
		for(int i = 0; i < H; i++) {
			S[i] = sc.next();
		}
		sc.close();
		c = new char[H][W];
		m = new boolean[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				m[i][j] = true;
			}
		}
		p = new ArrayList<Point>();
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				c[i][j] = S[i].charAt(j);
				if(c[i][j] == '#') {
					p.add(new Point(j, i));
				}
			}
		}
		for(int i = 0; i < p.size(); i++) {
			int x = p.get(i).x;
			int y = p.get(i).y;
			if(!m[y][x]) {
				continue;
			}
			m[y][x] = false;
			cnt1 = 0;
			cnt2 = 1;
			rec('#', x, y);
			ans += cnt1 * cnt2;
		}
		System.out.println(ans);
	}
	static void rec(char color, int x, int y) {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < W && ny >= 0 && ny < H) {
				if(color == '#' && m[ny][nx] && c[ny][nx] == '.') {
					m[ny][nx] = false;
					cnt1++;
					rec('.', nx, ny);
				}else if(color == '.' && m[ny][nx] && c[ny][nx] == '#') {
					m[ny][nx] = false;
					cnt2++;
					rec('#', nx, ny);
				}
			}
		}
	}
}