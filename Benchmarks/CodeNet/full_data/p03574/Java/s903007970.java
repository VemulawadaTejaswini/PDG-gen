import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				s[i][j] = sc.next().charAt(j);
			}
		}
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(s[i][j] == '.') {
					int cnt = 0;
					int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
					int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
					for(int k = 0 ; k < 8 ; k++) {
						if(i + dx[k] >= 0 && i + dx[k] < h && j + dy[k] >= 0 && j + dy[k] < w) {
							if(s[i + dx[k]][j + dy[k]] == '#') {
								cnt++;
							}
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
