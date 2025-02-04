import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<Edge> edges = new ArrayList<>();
		//負の無限大
		long INF = -(long)(1e14);
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long c = sc.nextLong();

			edges.add(new Edge(a, b, c));
		}

		BF bf = new BF(N, edges, INF);
		long ans = bf.getMaxWeight(1, N);

		if(ans == INF) {
			System.out.println("inf");
		}else {
			System.out.println(ans);
		}

	}

	public static class BF{
		int V;
		List<Edge> edges;
		long[] weights;
		long INF;

		public BF(int V, List<Edge> e, long INF) {
			this.V = V;
			edges = e;
			weights = new long[V];
			this.INF = INF;
		}

		//負の辺ありの最短距離の重み(ベルマンフォード法)(O(VE))
		public long getMaxWeight(int start, int goal) {
			Arrays.fill(weights, INF);
			weights[start-1] = 0;

			for(int i=0; i<V; i++) {
				for(int j=0; j<edges.size(); j++) {
					Edge e = edges.get(j);

					//変更
					if(weights[e.from-1] != INF && weights[e.to-1] < weights[e.from-1] + e.weight) {
						weights[e.to-1] = weights[e.from-1] + e.weight;
//						System.out.println("weights[" + (e.to-1) + "] = " + (weights[e.from-1] + e.weight));

						//変更
						//正の閉路判定(あるときINFを返す)
						if(i == V-1) {
							return INF;
						}
					}
				}
			}

			return weights[goal-1];
		}

		//負の辺ありの最短距離の重みの集合(ベルマンフォード法)(O(VE))
		public long[] getMinWeightArray(int start) {
			Arrays.fill(weights, INF);
			weights[start-1] = 0;

			for(int i=0; i<V; i++) {
				for(int j=0; j<edges.size(); j++) {
					Edge e = edges.get(j);

					if(weights[e.from] != INF && weights[e.to] > weights[e.from] + e.weight) {
						weights[e.to] = weights[e.from] + e.weight;

						//負の閉路判定(あるときは空の配列を返す)
						if(i == V-1) {
							return new long[0];
						}
					}
				}
			}

			return weights;
		}
	}

	//エッジを表すクラス(一般的なグラフのエッジとは異なる)
	public static class Edge{
		int from;
		int to;
		long weight;

		public Edge(int f, int t, long w) {
			from = f;
			to = t;
			weight = w;
		}
	}

}
