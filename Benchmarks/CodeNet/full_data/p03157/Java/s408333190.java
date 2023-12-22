import java.util.*;
public class Main{
	static int h;
	static int w;
	static char[][] c = new char[402][402];
	static boolean[][] visited = new boolean[402][402];
	static boolean[][] blvisited = new boolean[402][402];
	static int[][] dxy = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	static int ans = 0;
	static void rec(int x, int y, int cnt){
		if(c[x][y]=='.'){
			ans += cnt;
		}
		if((c[x][y]=='.' && c[x+1][y]!='#' && c[x-1][y]!='#' &&c[x][y+1]!='#' &&c[x][y-1]!='#') || (c[x][y]=='#' && c[x+1][y]!='.' && c[x-1][y]!='.' &&c[x][y+1]!='.' &&c[x][y-1]!='.')){
			return;
		}
		visited[x][y] = true;
		if(c[x][y]=='#'){
			blvisited[x][y] = true;
		}
		for(int i=0; i<4; i++){
			int x2 = x + dxy[i][0];
			int y2 = y + dxy[i][1];
			if(c[x][y]=='.' && c[x2][y2]=='#'){
				if(visited[x2][y2]==false){
					rec(x2, y2, cnt);
				}
			}
			if(c[x][y]=='#' && c[x2][y2]=='.'){
				if(visited[x2][y2]==false){
					rec(x2, y2, cnt+1);
				}
			}
		}
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		for(int i=1; i<h+1; i++){
			String s = sc.next();
			for(int j=1; j<w+1; j++){
				c[i][j] = s.charAt(j-1);
			}
		}
		for(int i=1; i<h+1; i++){
			for(int j=1; j<w+1; j++){
				if(c[i][j]=='#' && blvisited[i][j]==false){
					for(int k=1; k<h+1; k++){
						Arrays.fill(visited[k], false);
					}
					rec(i, j, 1);
				}
			}
		}
		System.out.println(ans);
	}
}