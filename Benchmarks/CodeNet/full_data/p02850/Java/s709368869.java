
import java.util.ArrayDeque;
import java.util.ArrayList;
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
	}
	ArrayList<ArrayList<Integer>> T = new ArrayList<ArrayList<Integer>>();
	int color[][];
	boolean used[];
	boolean next[][];
	int N;
	int max = -1;
	ArrayList<Pair> order = new ArrayList<Pair>();
	int parent[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		color=new int[N][N];
		used=new boolean[N];
		next= new boolean[N][N];
		parent = new int[N];
		for(int i=0; i<N; i++) {
			T.add(new ArrayList<Integer>());
		}
		for(int i=0; i<N-1; i++) {
			int a = sc.nextInt();
			a--;
			int b = sc.nextInt();
			b--;
			T.get(a).add(b);
			T.get(b).add(a);
			order.add(new Pair(a,b));
		}
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		used[0]=true;
		while(!queue.isEmpty()) {
			int s = queue.poll();
			ArrayList<Integer> p = T.get(s);
			int cnt=1;
			for(int i=0; i<p.size(); i++) {
				int t = p.get(i);
				if(! used[t]) {
					if(cnt == parent[s]) {
						cnt++;
					}
					color[s][t] = cnt;
					color[t][s] = cnt;
					parent[t]=cnt;
					cnt++;
					max=Math.max(max, color[s][t]);
					used[t]=true;
					queue.add(t);
				}
			}
		}
		System.out.println(max);
		for(int i=0; i<N-1; i++) {
			Pair p = order.get(i);
			System.out.println(color[p.s][p.t]);
		}
		sc.close();
	}


}
