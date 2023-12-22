import java.util.Scanner;

public class Main {

	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for(int i = 0 ; i < h ; i++) {
			s[i] = sc.next().toCharArray();
		}
		int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
		int[] dy = {1, 0, -1, 1, -1, 1, 0, -1};
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(s[i][j] == '.') {
					int cnt = 0;
					for(int k = 0 ; k < 8 ; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if(0 <= nx && nx <= h - 1 && 0 <= ny && ny <= w - 1 && s[nx][ny] == '#') {
							cnt++;
						}
					}
					s[i][j] = (char)(cnt + '0');
				}
			}
		}
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
	}
}
