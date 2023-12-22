import java.util.Scanner;

public class Main {

	static int h, w;
	static char[][] a;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {-1, 0, 1, 0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		a = new char[h][w];
		for(int i = 0 ; i < h ; i++) a[i] = sc.next().toCharArray();
		int cnt = 0;
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(a[i][j] == '#') cnt++;
			}
		}
		if(cnt != h + w - 1) {
			System.out.println("Impossible");
			return;
		}
		if(dfs(0, 0)) System.out.println("Possible");
		else System.out.println("Impossible");
	}

	static boolean dfs(int x, int y) {
		if(x == h - 1 && y == w - 1) return true;
		for(int i = 0 ; i < 4 ; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(h - 1 < nx && w - 1 < ny) {
				return false;
			}
			if(0 <= nx && nx < h && 0 <= ny && ny < w && a[nx][ny] == '#' && (i == 2 || i == 3)) {
				a[x][y] = '.';
				if(dfs(nx, ny)) return true;
				a[x][y] = '#';
			} else if(0 <= nx && nx < h && 0 <= ny && ny < w && a[nx][ny] == '#' && (i == 0 || i == 1)) {
				return false;
			}
		}
		return false;
	}

}
