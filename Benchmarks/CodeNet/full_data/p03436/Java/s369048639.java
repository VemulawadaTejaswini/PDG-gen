import java.util.*;
import java.io.*;
public class Main{
	static int yono = 0;
	static int[][] map;
	static char[][] q;
	static int h , w;
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		q = new char[h][w];
		map = new int[h][w];
		int point = 0;
		for(int i = 0 ; i < h ; i++){
			String ss = sc.next();
			for(int j = 0 ; j < w ; j++){
				q[i][j] = ss.charAt(j);
				if(q[i][j] == '.'){
					point++;
					map[i][j] = (int)Math.pow(10 , 5);
				}else{
					map[i][j] = -1;
				}
			}
		}
		sc.close();
		map[0][0] = 0;
		dfs(0 , 0 , map , 0);
		if(map[h - 1][w - 1] == Math.pow(10 , 5)) ou.println(-1);
		else ou.println(point - map[h - 1][w - 1] - 1);
		ou.flush();
	}
	static void dfs(int i , int j , int[][] ch , int where){
		yono++;
		if(i < 0 || i >= h || j < 0 || j >= w || ch[i][j] == -1 || q[i][j] == '#') return;
		if(where == 0) ch[0][0] = 0;
		if(where == 1) ch[i][j] = ch[i + 1][j] + 1;
		if(where == 2) ch[i][j] = ch[i - 1][j] + 1;
		if(where == 3) ch[i][j] = ch[i][j + 1] + 1;
		if(where == 4) ch[i][j] = ch[i][j - 1] + 1;
		if(i - 1 >= 0 && ch[i][j] + 1 < ch[i - 1][j]) dfs(i - 1 , j , ch , 1);
		if(i + 1 < h && ch[i][j] + 1 < ch[i + 1][j]) dfs(i + 1 , j , ch , 2);
		if(j - 1 >= 0 && ch[i][j] + 1 < ch[i][j - 1]) dfs(i , j - 1 , ch , 3);
		if(j + 1 < w && ch[i][j] + 1 < ch[i][j + 1]) dfs(i , j + 1 , ch , 4);
	}
}