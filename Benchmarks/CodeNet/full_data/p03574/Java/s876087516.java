import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i=0;i<h;i++){
			s[i] = sc.next();
		}
		int[][] map = new int[h][w];
		int[] dx = {1,1,1,0,-1,-1,-1,0};
		int[] dy = {1,0,-1,-1,-1,0,1,1};
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(s[i].charAt(j)=='#'){
					map[i][j] = -1;
				}
			}
		}

		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]==-1){
					for(int k=0;k<8;k++){
						if(i+dy[k]<0 || i+dy[k]>=h || j+dx[k]<0 || j+dx[k]>=w){
							continue;
						}
						if(map[i+dy[k]][j+dx[k]]!=-1){
							map[i+dy[k]][j+dx[k]]+=1;
						}
					}
				}
			}
		}

		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]==-1){
					System.out.print("#");
				}
				else{
					System.out.print(map[i][j]);
				}
			}
			System.out.println();
		}
	}
}