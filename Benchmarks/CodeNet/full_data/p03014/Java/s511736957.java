import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt(), w = in.nextInt();
		char[][] map = new char[h][w];
		in.nextLine();
		for ( int i = 0; i < h; i++ ) {
			map[i] = in.nextLine().toCharArray();
		}
		in.close();

		int[][] hmap = new int[h][w]; // 横方向
		int[][] vmap = new int[h][w]; // 縦方向
		int cnt = 0;
		
		// 横の処理
		for ( int r = 0; r < h; r++ ) {			
			for ( int c = 0; c < w; c++ ) {
				cnt = 0;
				while ( c + cnt < w && map[r][c + cnt] == '.' ) {
					cnt++;
				}
				for ( int i = c; i < c + cnt; i++ ) {
					hmap[r][i] = cnt;
				}
				c += cnt;
			}
		}

		// 縦の処理
		for ( int c = 0; c < w; c++ ) {
			for ( int r = 0; r < h; r++ ) {
				cnt = 0;
				while ( r + cnt < h && map[r + cnt][c] == '.' ) {
					cnt++;
				}
				for ( int i = r; i < r + cnt; i++ ) {
					vmap[i][c] = cnt;
				}
				r += cnt;
			}
		}

		int ans = 0;
		for ( int r = 0; r < h; r++ ) {
			for ( int c = 0; c < w; c++ ) {
				ans = Math.max(ans, hmap[r][c] + vmap[r][c] - 1);
			}
		}
		System.out.println(ans);
	}
}
