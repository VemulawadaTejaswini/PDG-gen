
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int to;
		int w;
		Pair(int to, int w){
			this.to=to;
			this.w=w;
		}
	}

	int N;
	ArrayList<ArrayList<Pair>> g;
	public void run() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		g = new ArrayList<>();
		for(int i=0; i<N; i++) {
			g.add(new ArrayList<Pair>());
		}
		for(int i=0; i<N-1; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			v1--;
			v2--;
			int w = sc.nextInt();
			g.get(v1).add(new Pair(v2, w));
			g.get(v2).add(new Pair(v1, w));
		}
		bfs(0);
		sc.close();
	}

	private void bfs(int r) {
		boolean used[] = new boolean[N];
		int color[] = new int[N];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(r);
		used[r]=true;
		color[r]=1;
		long ans[] = new long[N];
		ans[r]=0;

		while(!q.isEmpty()) {
			int u = q.poll();
			for(int i=0; i<g.get(u).size(); i++) {
				Pair p = g.get(u).get(i);
				if(used[p.to]) continue;
				ans[p.to]=ans[u]+p.w;
				used[p.to]=true;
				q.add(p.to);
			}
		}

		for(int i=0; i<N; i++) {
			System.out.println(ans[i]%2);
		}
	}
}
