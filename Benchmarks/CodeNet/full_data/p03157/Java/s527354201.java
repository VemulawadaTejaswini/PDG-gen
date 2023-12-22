import java.util.Scanner;
public class Main{
	static char[][] map;
	static int ans=0;
	static int h;
	static int w;
	static int[] dx={0,0,-1,1};
	static int[] dy={1,-1,0,0};
	static boolean[][] ma;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		map=new char[h][w];
		for(int i=0; i<h; i++){
			String s=sc.next();
			map[i]=s.toCharArray();
		}
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				if(map[i][j]=='#'){
					ma=new boolean[h][w];
					dfs(i,j);
				}
			}
		}
		System.out.println(ans);
	}
	static void dfs(int x,int y){
		ma[x][y]=true;
		if(map[x][y]=='.'){
			ans++;
		}
		for(int i=0; i<4; i++){
			if(check(x+dx[i],y+dy[i])){
				if((map[x][y]=='.' && map[x+dx[i]][y+dy[i]]=='#') || (map[x][y]=='#' && map[x+dx[i]][y+dy[i]]=='.')){
					dfs(x+dx[i],y+dy[i]);
				}
			}
		}
		return;
	}
	static boolean check(int x,int y){
		return x>=0 && x<h && y>=0 && y<w && !ma[x][y];
	}
}
