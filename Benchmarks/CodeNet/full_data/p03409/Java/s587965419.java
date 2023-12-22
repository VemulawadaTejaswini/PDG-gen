import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		int rev;
		int cap;
		public Edge(int to, int rev, int cap) {
			this.to=to;
			this.rev=rev;
			this.cap=cap;
		}
	}

	class Axis{
		int x;
		int y;
		public Axis(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	ArrayList<ArrayList<Edge>> g = new ArrayList<ArrayList<Edge>>();
	boolean used[];
	public void run() {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int s = n+n;
		int t = s+1;
		used=new boolean[t+1];
		for(int i=0; i<t+1; i++) {
			g.add(new ArrayList<Edge>());
		}

		ArrayList<Axis> red = new ArrayList<Axis>();
		for(int i=0; i<n; i++) {
			red.add(new Axis(sc.nextInt(), sc.nextInt()));
		}

		ArrayList<Axis> blue = new ArrayList<Axis>();
		for(int i=0; i<n; i++) {
			blue.add(new Axis(sc.nextInt(), sc.nextInt()));
		}

		//red 0-n-1 blue n-2n-1
		//sからred
		for(int i=0; i<n; i++) {
			addFlow(s, i, 1);
		}
		//blueからt
		for(int i=n; i<2*n; i++) {
			addFlow(i, t, 1);
		}
		//redからblue
		for(int i=0; i<n; i++) {
			Axis r = red.get(i);
			for(int j=0; j<n; j++) {
				Axis b = blue.get(j);
				if(r.x<b.x && r.y<b.y) {
					addFlow(i, n+j, 1);
				}
			}
		}
		//計算
		int ans = maxFlow(s,t);
		System.out.println(ans);
		sc.close();
	}

	private int maxFlow(int s, int t) {
		int flow=0;
		while(true) {
			Arrays.fill(used, false);
			int f = dfs(s, t, Integer.MAX_VALUE);
			if(f==0) {
				break;
			}
			flow+=f;
		}
		return flow;
	}


	private int dfs(int s, int t, int f) {
		used[s]=true;
		if(s==t) {
			return f;
		}
		for(Edge e : g.get(s)) {
			if(!used[e.to] && e.cap>0) {
				int flow = dfs(e.to, t, Math.min(f, e.cap));
				if(flow>0) {
					e.cap -= flow;
					g.get(e.to).get(e.rev).cap += flow;
					return flow;
				}
			}
		}
		return 0;
	}

	private void addFlow(int from, int to, int cap) {
		g.get(from).add(new Edge(to, g.get(to).size(), cap));
		g.get(to).add(new Edge(from, g.get(from).size()-1, 0));
	}
}
