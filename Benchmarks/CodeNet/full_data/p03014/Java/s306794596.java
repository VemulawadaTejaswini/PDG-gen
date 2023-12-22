import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();

		// 文字列の入力
		String[][] s = new String[h][w];

		for(int i=0;i<h;i++){
			String str = sc.next();
			s[i] = str.split("");
		}

		int cnt = 0;
		int[][] tate = new int[h][w];
		int[][] yoko = new int[h][w];

		for(int x=0;x<h;x++){
			cnt = 0;
			for(int y=0;y<w;y++){
				if(s[x][y].equals("."))cnt++;
				if(y+1<w&&s[x][y+1].equals(".")){

				} else {
					int z = y;
					while(z>-1&&!s[x][z].equals("#")){
						yoko[x][z]=cnt;
						z--;
					}
					cnt=0;
				}
			}
		}

		for(int y=0;y<w;y++){
			cnt = 0;
			for(int x=0;x<h;x++){
				if(s[x][y].equals("."))cnt++;
				if(x+1<h&&s[x+1][y].equals(".")){
				} else {
					int z = x;
					while(z>-1&&!s[z][y].equals("#")){
						tate[z][y]=cnt;
						z--;
					}
					cnt=0;
				}
			}
		}

		int ans = 0;

		for(int x=0;x<h;x++){
			for(int y=0;y<w;y++){
				if(!s[x][y].equals("#")){
					ans = Math.max(ans,tate[x][y]+yoko[x][y]-1);
				}
			}
		}

		// 出力
		System.out.println(ans);
	}
}