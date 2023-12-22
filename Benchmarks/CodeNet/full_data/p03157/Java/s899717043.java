import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static char[][] c;
	static int H, W;
	static List<Point> p;
	static long ans = 0;
	static boolean[][] m;
	static int[][] g;
	static int cnt1 = 0;
	static int cnt2 = 0;
	static int[][] h;
	static Set<Integer> set1;
	static Set<Integer> set2;
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
		g = new int[H][W];
		h = new int[H][W];
		set1 = new HashSet<Integer>();
		set2 = new HashSet<Integer>();
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
			//System.out.println(y + " " + x);
			if(g[y][x] == 1) {
				continue;
			}
			g[y][x] = 1;
			h[y][x] = 1;
			m[y][x] = false;
			rec('#', x, y);

			int k = y * W + x;
			set2.add(k);
			cnt1 = set1.size();
			cnt2 = set2.size();

			//System.out.println(cnt1 +" " + cnt2);
			ans += cnt1 * cnt2;
			set1.clear();
			set2.clear();
		}
		System.out.println(ans);
	}
	static void init() {
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				h[i][j] = 0;
			}
		}
	}
	static void rec(char color, int x, int y) {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < W && ny >= 0 && ny < H) {
				if(color == '#' && m[ny][nx] && c[ny][nx] == '.') {
					int k = ny * W + nx;
					m[ny][nx] = false;
					set1.add(k);
					rec('.', nx, ny);
				}else if(color == '.' && m[ny][nx] && c[ny][nx] == '#') {
					g[ny][nx] = 1;
					m[ny][nx] = false;
					int k = ny * W + nx;
					set2.add(k);
					rec('#', nx, ny);
				}
			}
		}
	}
}