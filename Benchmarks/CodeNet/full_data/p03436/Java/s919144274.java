import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();

		int map[][] = new int[h + 2][w + 2];

		Arrays.fill(map[0], 1);
		Arrays.fill(map[h + 1], 1);
		int defaultWalls = 0; 
		for (int i = 0; i < h; i++) {
			map[i + 1][0] = 1;
			map[i + 1][w + 1] = 1;
			String s = sc.nextLine();
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == '#') {
					map[i + 1][j + 1] = 1;
					defaultWalls++;
				}
			}
		}

		int cost[][] = new int[h + 2][w + 2];
		for (int i = 0; i < h + 2; i++) {
			Arrays.fill(cost[i],h*w*2);
		}
		
		PriorityQueue<E> queue = new PriorityQueue<E>();
		queue.add(new E(1,1,1));
		for (;;) {
			if(queue.isEmpty()){
				System.out.println(-1);
				return;
			}
			E now = queue.poll();
			if(now.cost >= cost[now.i][now.j]){
				continue;
			}
			cost[now.i][now.j] = now.cost;
			if(now.i == h && now.j == w){
				break;
			}
			
			int dx[] = {1,-1,0,0};
			int dy[] = {0,0,1,-1};

			for(int i = 0 ; i< 4; i++){
				int ii = now.i + dx[i];
				int jj = now.j + dy[i];
				if(map[ii][jj] == 0){
					if(now.cost + 1 < cost[ii][jj]){
						queue.add(new E(ii,jj,now.cost+1));
					}
				}
			}
		}
		System.out.println(h*w-cost[h][w]-defaultWalls);
	}

	class E implements Comparable<E> {
		int i;
		int j;
		int cost;

		E(int ii, int jj, int cc) {
			i = ii;
			j = jj;
			cost = cc;
		}

		@Override
		public int compareTo(E o) {
			return this.cost - o.cost;
		}
	}

}