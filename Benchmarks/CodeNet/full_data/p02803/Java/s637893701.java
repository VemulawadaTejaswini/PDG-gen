import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int h = Integer.parseInt(s[0]);
		int w = Integer.parseInt(s[1]);
		String[][] maze = new String[h][w];
		for(int i = 0; i < h ; i++) {
			String height = br.readLine();
			for(int j = 0 ; j < w ; j++) {
				maze[i][j] = height.substring(j,j+1);
			}
		}
		
		int result = 0; 
		for(int i = 0; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(maze[i][j].equals(".")) {
					result = Math.max(result, bfs(maze,new Point(i,j),h,w));
				}
			}
		}
		System.out.println(result);
		
	}
	public static int bfs(String[][] maze,Point start,int h , int w) {
		int[][] moves = new int[h][w];
		for(int i = 0; i < h;i++) {
			for(int j = 0; j < w; j++) {
				moves[i][j] = Integer.MAX_VALUE;
			}
		}
		moves[start.getX()][start.getY()] =0;
		ArrayDeque dq = new ArrayDeque();
		Point[] dir = {new Point(0,1),new Point(1,0),new Point(-1,0),new Point(0,-1)}; 
		dq.add(start);
		
		while(dq.size() > 0) {
			Point p = (Point) dq.removeFirst();
			for(int i = 0 ; i < 4 ; i++) {
				
				if(canGo(maze,p.getX(),p.getY(),dir[i].getX(),dir[i].getY()) && 
						moves[p.getX()+dir[i].getX()][p.getY()+dir[i].getY()] == Integer.MAX_VALUE) {
					int nx = p.getX()+dir[i].getX();
					int ny = p.getY()+dir[i].getY();
					moves[nx][ny] = moves[p.getX()][p.getY()]+1;
					dq.add(new Point(nx,ny));
				}
			}
		}
		
		return getMax(moves, h, w);
	}
	public static boolean canGo(String[][] maze,int x,int y,int dx,int dy) {
		if (x +dx >= 0 && y + dy >= 0 && x +dx < maze.length && y+dy < maze[0].length) {
			return maze[x+dx][y+dy].equals(".");
		}
		return false;
	}
	public static int getMax(int[][] moves,int h,int w) {
		int result = -1;
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0; j < w ; j++) {
				if(moves[i][j] != Integer.MAX_VALUE) {
					result = Math.max(result, moves[i][j]);
				}
			}
		}
		return result;
	}
}

class Point {
	private int x;
	private int y;

	Point(int a, int b) {x=a; y=b;}

	int getX() {return x;}
	int getY() {return y;}
	void setX(int n) {x = n;}
	void setY(int n) {y = n;}
}
