import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    grid[i] = sc.next().toCharArray();
		}
		
		// 計算
		int result = 0;
		ArrayDeque<Point> q = new ArrayDeque<Point>();
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(grid[i][j] == '#') continue;
		        q.add(new Point(i, j, 0));
		        int[][] visited = new int[h][w];
		        while(!q.isEmpty()){
		            Point now = q.poll();
		            int x = now.x;
		            int y = now.y;
		            int d = now.d;
		            if(visited[x][y] == 1) continue;
		            visited[x][y] = 1;
		            for(int k = 0; k < 4; k++){
		                if(x+dx[k] >= 0 && x+dx[k] < h && y+dy[k] >= 0 && y+dy[k] < w && grid[x+dx[k]][y+dy[k]] == '.' && visited[x+dx[k]][y+dy[k]] == 0){
		                    q.add(new Point(x+dx[k], y+dy[k], d+1));
		                    result = max(result, d+1);
		                }
		            }
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

class Point {
    int x;
    int y;
	int d;
    
    Point(int x, int y, int d){
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public String toString(){
        return "(" + x + ", " + y + "):" + d;
    }
}

