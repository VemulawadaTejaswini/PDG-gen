
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int [][]grid;
	static int h,w;
	static List<int[]> path;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		
		path = new ArrayList<int[]> ();
		grid = new int [h+1][w+1];
		
		for(int i = 1 ; i <= h ;i++) {
			for(int j = 1 ; j <= w ;j++) {
				grid[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		search(1,1,false);
		
		int m = path.size();
		
		for(int i = 0 ; i < m ;i++) {
			System.out.println(path.get(i)[0]+" "+path.get(i)[1] +" "+path.get(i)[2]+" "+path.get(i)[3]);
		}
	}
	
	static void search(int nowY, int nowX, boolean flag) {
		if(nowY == h && nowX == w) return;
		
		if(grid[nowY][nowX] % 2 == 1 && !flag) {
			flag = true;
		}
		else if(grid[nowY][nowX] % 2 == 1 && flag) {
			flag = false;
		}
		
		if(nowY == h && nowX % 2 == 1) {
			if(flag) {
				int []a = new int [4];
				a[0] = nowY; a[1] = nowX ; a[2] = nowY ; a[3] = nowX+1;
				path.add(a);
			}
			search(nowY,nowX+1,flag);
		}
		else if(nowY == 1 && nowX % 2 == 0) {
			if(flag) {
				int []a = new int [4];
				a[0] = nowY; a[1] = nowX ; a[2] = nowY; a[3] = nowX+1;
				path.add(a);
			}
			search(nowY,nowX+1,flag);
		}
		else {
			if(nowX % 2 == 1) {
				if(flag) {
					int []a = new int [4];
					a[0] = nowY; a[1] = nowX ; a[2] = nowY + 1; a[3] = nowX;
					path.add(a);
				}
				search(nowY+1,nowX,flag);
			}
			else {
				if(flag) {
					int []a = new int [4];
					a[0] = nowY; a[1] = nowX ; a[2] = nowY + 1; a[3] = nowX;
					path.add(a);
				}
				search(nowY-1,nowX,flag);
			}
		}
	}
}

class Point{
	private int y ;
	private int x;
	
	public Point (int y, int x) {
		this.y = y;
		this.x = x;
	}
	
	public int X() {
		return x;
	}
	public int Y() {
		return y;
	}
	public void sX(int x) {
		this.x = x;
	}
	public void sY(int y) {
		this.y = y;
	}
	

}
