import java.math.*;
import java.util.*;

public class Main {
	static char maze[][] = new char[55][55];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int n = cin.nextInt();
			int m = cin.nextInt();
			int flag = 1;
			for(int i=0;i<=51;++i){
				for(int j=0;j<=51;++j){
					maze[i][j] = '.';
				}
			}
			for(int i=1;i<=n;++i){
				String s = cin.next();
				for(int j=1;j<=m;++j){
					maze[i][j] = s.charAt(j-1);
				}
			}
			for(int i=1;i<=n;++i){
				for(int j=1;j<=m;++j){
					if(maze[i][j]=='#'){
						if(check(i,j)==false){
							flag=0;
						}
					}
				}
			}
			if(flag==1) System.out.println("Yes");
			else System.out.println("No");
		}
	}
	public static boolean check(int x,int y){
		//System.out.println(maze[x+1][y]);
		if(maze[x-1][y]=='#'||maze[x+1][y]=='#'||maze[x][y-1]=='#'||maze[x][y+1]=='#')
			return true;
		return false;
	}
}