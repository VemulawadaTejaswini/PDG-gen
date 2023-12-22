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
		    String s = sc.next();
		    grid[i] = s.toCharArray();
		}
		
		// 計算
		int result = 0;
		int cnt = 0;
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(grid[i][j] == '.') cnt++;
		    }
		}
		
		ArrayDeque<Point> q = new ArrayDeque<Point>();
		q.add(new Point(0, 0));
		int[][] dist = new int[h][w];
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		while(!q.isEmpty()){
		    Point p = q.poll();
		    if(p.x == w-1 && p.y == h-1){
		        break;
		    }
		    for(int i = 0; i < 4; i++){
		        int x = p.x + dx[i];
		        int y = p.y + dy[i];
		        if(x >= 0 && x < w && y >= 0 && y < h){
		            if(grid[y][x] == '.' && dist[y][x] == 0){
		                dist[y][x] = dist[p.y][p.x] + 1;
		                q.add(new Point(x, y));
		            }
		        }
		    }
		}
		if(dist[h-1][w-1] == 0){
		    result = -1;
		}else{
		    result = cnt - (dist[h-1][w-1] + 1);
		}
		
		// 出力
		System.out.println(result);
	}
}

class Point {
    int x;
    int y;
    
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}

