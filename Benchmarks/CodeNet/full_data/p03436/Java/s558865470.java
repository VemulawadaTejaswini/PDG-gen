import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int x;
	int y;
	int z;
	Point(int a,int b,int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		String[][] S = new String[H][W];

		int white = 0;
		for(int i = 0 ; i < H ; i++){
			String tmp = sc.next();
			for(int j = 0 ; j < W ; j++){
				S[i][j] = tmp.substring(j, j+1);

				if(S[i][j].equals(".")){
					white++;
				}
			}
		}

		sc.close();
/*

		for(int i = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				System.out.print(S[i][j] + " ");
			}
			System.out.println("");
		}
*/

		int sx = 0;
		int sy = 0;
		int gx = W-1;
		int gy = H-1;

		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};

		int[][] memo = new int[H][W];

		memo[sy][sx] = 1;

		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(sx,sy,0));

		int route = 10000 ;
		while(!queue.isEmpty()){
			Point p = queue.poll();

			for(int i = 0 ; i < 4 ; i++){
				int x = p.x + dx[i];
				int y = p.y + dy[i];
				int z = p.z + 1;

				if(x>=0 && x < W && y>=0 && y < H){
					if(!S[y][x].equals("#") && memo[y][x] == 0){
						queue.add(new Point(x,y,z));
						memo[y][x] = 1;
					}
				}
			}
			if(p.x == gx && p.y == gy){
				route = Math.min(route, p.z);
			}
		}
		if(route == 10000){
			System.out.println(-1);
		}
		else{
			System.out.println(white-route-1);
		}

	}

}