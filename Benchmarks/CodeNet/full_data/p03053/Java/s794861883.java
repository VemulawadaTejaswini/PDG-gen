
import java.util.Scanner;

public class Main {
	
	static int h,w;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		
		char [][]map = new char [h][w];
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		int cnt = 0;
		boolean flag = true;
		
		while(true) {
			flag = true;
			for(int i = 0 ; i < h ;i++) {
				for(int j = 0 ; j < w ;j++) {
					if(map[i][j] == '.') {
						flag = false;
						break;
						}
					}
				}
			if(flag) {
				break;
			}
			
			for(int i = 0 ; i < h ;i++) {
				for(int j = 0 ; j < w ;j++) {
					if(map[i][j] == '#') {
							operation(i,j,map);
						}
					}
				}
			
			for(int i = 0 ; i < h ;i++) {
				for(int j = 0 ; j < w ;j++) {
					if(map[i][j] == '?') {
						map[i][j] = '#';
					}
				}
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
		
			
	
	static void operation(int sy, int sx, char[][]map) {
		int []dy = {0,1,0,-1};
		int []dx = {1,0,-1,0};
		
		for(int i = 0 ; i < 4 ;i++) {
			if(sy + dy[i] < 0 || sy + dy[i] >= h) {
				continue;
			}
			if(sx + dx[i] < 0 || sx + dx[i] >= w) {
				continue;
			}
			
			int py = sy + dy[i];
			int px = sx + dx[i];
			if(map[py][px] == '.') {
				map[py][px] = '?';
			}
		}
	}
}
