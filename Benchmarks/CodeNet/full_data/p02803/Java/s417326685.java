
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	static char [][]grid;
	static int h,w;
	static int [][]graph;
	static char [][]map;
	static ArrayDeque<point> dq;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		

		grid = new char [h][w];
		
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0; j < s.length();j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		int ans = 0;
		
		for(int i = 0  ;i < h ;i++) {
			for(int j = 0 ; j < w ;j++) {
				map();
				if(map[i][j] == '#')  continue;
				else {
					dq = new ArrayDeque<point>();
					point st = new point(j,i);
					graph = new int[h][w];
					BFS(st);
					int max = searchMax(0);
					ans = Math.max(max, ans);
				}
			}
		}
		
		System.out.println(ans);
	}
	
	static void map() {
		map = new char [h][w];
		for(int i = 0 ; i < h ;i++) {
			for(int j = 0 ;j < w ;j++) {
				char c = grid[i][j]; 
				map[i][j] = c;
			}
		}
	}
	static void BFS(point e) {
		int []dx = {1,0,-1,0};
		int []dy = {0,1,0,-1};
		
		for(int i = 0 ;i < 4 ;i++) {
			int px = e.Getx() + dx[i];
			int py = e.Gety() + dy[i];
			if(!judge(py,px)) {
				continue;
			}
			else {
				graph[py][px] = graph[e.Gety()][e.Getx()] + 1;
				point f = new point(px,py);
				dq.addLast(f);
				map[py][px] = '#';
			}
		}
			if(dq.size() == 0) {
				return;
			}
		BFS(dq.pop());
		
		}
	
	static int searchMax(int temp) {
		for(int i = 0; i < h ;i++) {
			for(int j = 0 ; j< w ;j++) {
				temp = Math.max(graph[i][j], temp);
			}
		}
		return temp;
	}
	
	static boolean judge(int py , int px) {
		if(py < 0 || px < 0 || py >= h || px >= w) {
			return false;
		}
		if(map[py][px] == '#') {
			return false;
		}
		else {
			return true;
		}
	}
}

class point {
	private int x;
	private int y;
	
	public point (int x , int y){
		this.x = x;
		this.y = y;
	}
	
	public int Getx() {
		return x;
	}
	public int Gety() {
		return y;
	}
}

