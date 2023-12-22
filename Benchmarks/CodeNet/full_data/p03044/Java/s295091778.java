import java.util.Scanner;

public class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(sc.next());
		
		//ArrayList<Edge> edge = new ArrayList<>();
		int[][] dist = new int[N+1][N+1];
		
		for (int i = 1; i < N; i++) {
			int u = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next()) % 2 + 2;
			//edge.add(new Edge(u,v,w));
			//edge.add(new Edge(v,u,w));
			dist[u][v] = w;
			
		}
		int[] d = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			d[i] = search(dist, 1, i);
			System.out.println(d[i]%2);
		}
		
		
	}

	public static int search(int[][] map, int s, int g) {
		if(map[s][g] != 0)return map[s][g] % 2;
		else {
			for (int i = s+1; i < g; i++) {
				if(map[s][i] != 0)return map[s][i]+search(map, i, g);
			}
			return 0;
		}		
	}
}
