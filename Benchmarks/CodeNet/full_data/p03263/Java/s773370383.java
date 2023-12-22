
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int [][]grid;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		grid = new int [h][w];
		List <Point> List = new ArrayList<Point>();
		int odd = 0;
		
		for(int i = 0 ; i < h ;i++) {
			for(int j = 0 ; j < w ;j++) {
				grid[i][j] = Integer.parseInt(sc.next());
				if(grid[i][j] % 2 == 1) {
					odd++;
					List.add(new Point(i,j));
				}
			}
		}
		if(odd % 2 == 1) odd--;
		
		List<Point> ans = new ArrayList<Point>();
		
		int size = 0;
		
		for(int i = 0 ; i < odd/2 ;i++) {
			Point st = List.get(i*2);
			Point gl = List.get(i*2+1);
			size += Math.abs(st.X()-gl.X())+Math.abs(st.Y()-gl.Y());
		}
		System.out.println(size);

		
		for(int i = 0 ; i < odd/2 ;i++) {
			Point st = List.get(i*2);
			Point gl = List.get(i*2+1);
			solve(st,gl);
		}

	}
	
	static void solve(Point now, Point gl) {
		int nowx = now.X();
		int nowy = now.Y();
		int temp = 0;
		if(nowx != gl.X()) {
			if(nowx > gl.X()) temp--;
			else {temp++;}
			Point next = new Point(nowy,nowx+temp);
			System.out.println((now.Y()+1)+" "+(now.X()+1)+" "+(next.Y()+1)+" "+(next.X()+1));
			solve(next,gl);
		}
		if(nowy != gl.Y() && nowx == gl.X()) {
			if(nowy > gl.Y()) temp--;
			else {temp++;}
			Point next = new Point(nowy+temp,nowx);
			System.out.println((now.Y()+1)+" "+(now.X()+1)+" "+(next.Y()+1)+" "+(next.X()+1));
			solve(next,gl);
		}
		
		return;
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
