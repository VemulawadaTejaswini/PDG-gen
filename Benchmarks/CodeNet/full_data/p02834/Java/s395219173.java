import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ans = 0;
		int N = scn.nextInt(), nige = scn.nextInt()-1, oni = scn.nextInt()-1;
		GraphWay[] GW = new GraphWay[N];
		for(int i = 0;i < N;i++) {
			GW[i] = new GraphWay();
		}
 		for(int i = 0;i < N-1;i++) {
 			int A = scn.nextInt()-1, B = scn.nextInt()-1;
 			GW[A].add(B, 1);
 			GW[B].add(A,1);
		}
 		int[]d = new int[N];
 		int[] prev = GraphArgo.dikstra(oni,d,GW);

 		ArrayList<Integer> way = new ArrayList<Integer>();
 		int s = nige;
 		while(s>-1) {
 			way.add(s);
 			s = prev[s];
 		}

 		int size = way.size();
 		if(size %2 == 0) {
 			ans += size/2 - 1;
 			nige = way.get(size/2 - 1);
 			GW[way.get(size/2-1)].remove(way.get(size/2));
 		}else {
 			ans += size/2;
 			nige = way.get(size/2 - 1);
 			GW[way.get(size/2-1)].remove(way.get(size/2));
 		}
 		prev = GraphArgo.dikstra(nige, d, GW);
 		int max = -1;
 		for(int i = 0;i < N;i++) {
 			if(d[i] == GraphArgo.INF)continue;
 			max = Math.max(max, d[i]);
 		}
 		ans += max;
 		System.out.println(ans);
	}


}

class GraphWay{//有向パス
	ArrayList<Pair> to;
	public GraphWay() {
		to = new ArrayList<Pair>();
	}

	void add(int t,int c) {
		to.add(new Pair(t,c));
	}

	void remove(int t) {
		for(int i = 0;i < to.size();i++) {
			if(to.get(i).first == t) {
				to.remove(i);
				return;
			}
		}
	}

	Iterable<Pair> getItr() {
		return to;
	}
}

class GraphArgo{
	static final int INF = Integer.MAX_VALUE;
	// -----2.2---------------------------------------------------------------------------//
	// -----ダイクストラ法---------------------------------------------------------//
	// 負の辺がない場合
	// 無向グラフでの実装
	public static int[] dikstra(int s,int[] d, GraphWay[] W) {// @param s:satrt d[]:distance W[]:ways
		PriorityQueue<Pair> PQ = new PriorityQueue<Pair>();//first:distance second:node
		int[] prever = new int[W.length];
		Arrays.fill(prever,-1);
		Arrays.fill(d, INF);
		d[s] = 0;
		PQ.add(new Pair(0,s));
		while(!PQ.isEmpty()) {
			Pair p = PQ.poll();
			int v = p.second;
			if(d[v] < p.first)continue;
			for(Pair w:W[v].getItr()) {
				int to = w.first;
				int cost = w.second;
				if(d[to] > d[v] + cost) {
					d[to] = d[v] + cost;
					PQ.add(new Pair(d[to],to));
					prever[to] = v;
				}
			}
		}
		return prever;
	}

}

class Pair implements Comparable<Pair>{
	int first,second;
	public Pair(int f,int s) {
		this.first = f;
		this.second = s;
	}
	@Override
	public int compareTo(Pair o) {//Comparatorを自由記述せよ(これはfirstが小さい順, secondが小さい順)
		if(this.first < o.first) {
			return -1;
		}
		if(this.first > o.first) {
			return 1;
		}
		if(this.second < o.second) {
			return -1;
		}
		if(this.second > o.second) {
			return 1;
		}

		return 0;
	}
}
