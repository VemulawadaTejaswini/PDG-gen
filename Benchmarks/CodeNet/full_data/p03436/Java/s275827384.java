import java.util.LinkedList;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		char[][] map = new char[H][W];
		int count = 0;
		for(int i = 0;i < H;i++){
			String a = scan.next();
			for(int j = 0;j < W;j++){
				map[i][j] = a.charAt(j);
				if(map[i][j] == '.'){
					count++;
				}

			}
		}
		int INF = Integer.MAX_VALUE;
		int sx = 0;
		int sy = 0;
		int gx = W-1;
		int gy = H-1;

		int[][] d= new int[H][W]; 		//dp
		int[] dx = {1,0,-1,0};
		int[]dy = {0,1,0,-1};

		Pair pair ;
		LinkedList<Pair> queue = new LinkedList<Pair>();
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				d[i][j] = INF;					//通過していないかの判定
			}
		}
		pair = new Pair(sy, sx);
		queue.add(pair);
		d[sy][sx] = 0;

		while(!queue.isEmpty()){
			Pair x = new Pair();
			x = queue.removeFirst();
			if(x.from == gy && x.end == gx){
				break;
			}
			for(int i = 0;i < 4;i++){
				int nx = x.from + dx[i];
				int ny = x.end + dy[i];
				if(0 <= nx && nx < W && 0 <= ny && ny < H && map[ny][nx] != '#' && d[ny][nx] == INF){
					Pair go = new Pair(ny,nx);	
					queue.add(go);
					d[ny][nx] = d[x.from][x.end]+1;
				}
			}

		}
		if(d[gy][gx] == INF){
			System.out.println(-1);
			return;
		}
		System.out.println(count-d[gy][gx]-1);

	}
}

class Pair implements Comparable{
	int from;
	int end;
	public Pair(int s,int g) {
		this.from = s;
		this.end = g;
	}
	public Pair() {

	}
	@Override



	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}
