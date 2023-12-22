
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int s;
		int t;
		Pair(int s, int t){
			this.s=s;
			this.t=t;
		}
		@Override
		public String toString() {
			return "Pair [s=" + s + ", t=" + t + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + s;
			result = prime * result + t;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (s != other.s)
				return false;
			if (t != other.t)
				return false;
			return true;
		}
		private Main getOuterType() {
			return Main.this;
		}

	}

	HashMap<Pair, Integer>I = new HashMap<>();
	int color[][];
	boolean used[];
	boolean next[][];
	int N;
	int K = 0;
	int cs[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		ArrayList<ArrayList<Integer>> G = new ArrayList<ArrayList<Integer>>();
		ArrayList<Pair> vp = new ArrayList<Pair>();
		color=new int[N][N];
		used=new boolean[N];
		cs = new int[N];
		for(int i=0; i<N; i++) {
			G.add(new ArrayList<Integer>());
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				color[i][j]=0;
			}
			used[i]=false;
			cs[i]=0;
		}
		for(int i=0; i<N-1; i++) {
			int a = sc.nextInt();
			a--;
			int b = sc.nextInt();
			b--;
			G.get(a).add(b);
			G.get(b).add(a);
			vp.add(new Pair(a,b));
		}
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();

		used[0]=true;
		que.add(0);
		while(!que.isEmpty()) {
			int v = que.poll();
			if(K < G.get(v).size()) {
				K = G.get(v).size();
			}
			int cur=1;
			for(int u : G.get(v)) {
				if(used[u]) {
					continue;
				}
				if(cur == cs[v]) {
					cur++;
				}
				cs[u] = cur;
				I.put(new Pair(u,v), cur);
				I.put(new Pair(v,u), cur);
				cur++;
				used[u]=true;
				que.add(u);
			}
		}
		System.out.println(K);
		for(Pair p : vp) {
			System.out.println(I.get(p));
		}
		sc.close();
	}


}