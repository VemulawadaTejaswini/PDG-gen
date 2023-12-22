import java.util.*;
public class Main {
	//BFSで解く
	public static void main(String[] args) {
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, -1, 0, 1};
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char field[][] = new char[H][W];
		for(int i=0;i<H;i++) {
			String tmp = sc.next();
			for(int j=0;j<W;j++) {
				field[i][j]=tmp.charAt(j);
			}	
		}
		sc.close();
		
		Queue<Point> q = new ArrayDeque<Point>();
		q.add(new Point(0,0));
		
		int dist[][] = new int[H][W];
		for(int t[]:dist) Arrays.fill(t, Integer.MAX_VALUE);
		
		dist[0][0]=0;
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			for(int i=0;i<4;i++) {
				int x = now.x;
				int y = now.y;
				int d = dist[x][y];
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(0<=nx&&nx<H&&0<=ny&&ny<W&&field[nx][ny]=='.') {
					if(dist[nx][ny]!=Integer.MAX_VALUE)continue;
					dist[nx][ny]=dist[x][y]+1;
					q.offer(new Point(nx,ny));
				}else {
					continue;
				}
			}
		}
		
		int ans = 0;
		
		int white = 0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(field[i][j]=='.')white++;
			}
		}
		
		if(dist[H-1][W-1]==Integer.MAX_VALUE)ans = -1;
		else ans = white - (dist[H-1][W-1]+1);
		
		System.out.println(ans);
//		//debug:distの表示　
//		for(int i=0;i<H;i++) {
//			for(int j=0;j<W;j++) {
//				if(dist[i][j]==Integer.MAX_VALUE)System.out.print('#' + " ");
//				else System.out.print(dist[i][j]+" ");
//			}	
//			System.out.println();
//		}
	
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}