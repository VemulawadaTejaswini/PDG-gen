
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int [][]grid;
	static int h,w;
	static List<Point> ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		 
		 grid = new int [h+1][w+1];
		 
		 for(int i = 1 ; i <= h ;i++) {
			 for(int j = 1 ; j <= w ; j++) {
				 grid[i][j] = Integer.parseInt(sc.next());
			 }
		 }
		 
		 ans = new ArrayList<Point>();
		 boolean flag = false;
		 int dx = -1;
		 int dy = -1;
		 
		 for(int i = 1 ; i <= h ;i++) {
			 if(i % 2 == 1) {
				 for(int j = 0 ; j <= w ; j++) {
					 if(grid[i][j] % 2 == 1) {
						 if(flag) {
							 ans.add(new Point(dy,dx,i,j));
							 flag = false;
							 dy = -1; dx = -1;
						 }
						 else {
							 flag = true;
							 dy = i; dx = j;
						 }
					 }
					 else {
						 if(flag) {
							 ans.add(new Point(dy,dx,i,j));
							 dy = i ; dx = j;
						 }
					 }
				 }
			 }
			 else {
				 for(int j = w ; j >= 1 ; j--) {
					 if(grid[i][j] % 2 == 1) {
						 if(flag) {
							 ans.add(new Point(dy,dx,i,j));
							 flag = false;
							 dy = -1; dx = -1;
						 }
						 else {
							 flag = true;
							 dy = i; dx = j;
						 }
					 }
					 else {
						 if(flag) {
							 ans.add(new Point(dy,dx,i,j));
							 dy = i ; dx = j;
						 }
				}
			 }
		 }
	}
		System.out.println(ans.size());
		for(Point e : ans) {
			System.out.println(e.getY()+" "+e.getX()+" "+e.getYy()+" "+e.getXx());
		}
	}	
}
class Point {
	private int y;
	private int x;
	private int yy;
	private int xx;
	
	public Point (int y, int x , int yy, int xx) {
		this.y = y;
		this.x = x;
		this.yy = yy;
		this.xx = xx;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public int getYy() {
		return yy;
	}

	public int getXx() {
		return xx;
	}
	
	
}
