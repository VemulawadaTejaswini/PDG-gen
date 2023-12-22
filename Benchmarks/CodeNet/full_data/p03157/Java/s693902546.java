import java.util.Scanner;
public class Main{
	static char[][] map;
	static int h;
	static int w;
	static int[] dx={0,0,-1,1};
	static int[] dy={1,-1,0,0};
	static boolean[][] ma;
	static long countw;
	static long countb;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		map=new char[h][w];
		ma=new boolean[h][w];
		for(int i=0; i<h; i++){
			String s=sc.next();
			map[i]=s.toCharArray();
		}
		long ans=0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				if(!ma[i][j]){
					countw=0;
					countb=0;
					dfs(i,j);
					ans+=countw*countb;
				}
			}
		}
		System.out.println(ans);
	}
	static void dfs(int x,int y){
		ma[x][y]=true;
		if(map[x][y]=='.'){
			countw++;
		}else{
			countb++;
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
