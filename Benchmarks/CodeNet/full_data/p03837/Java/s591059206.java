import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * https://abc051.contest.atcoder.jp/tasks/abc051_d
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Node[] nodes = new Node[N];
		for(int i=0; i<N; i++) nodes[i] = new Node(i);
		for(int i=0; i<M; i++){
			Node a = nodes[sc.nextInt()-1];
			Node b = nodes[sc.nextInt()-1];
			int c = sc.nextInt();
			a.neighbor.put(b, c);
			b.neighbor.put(a, c);
		}
		sc.close();
		
		long costs[][] = getAllPairsMinimumCost(nodes, Long.MAX_VALUE);
		long ans = 0;
		for(int i=0; i<N; i++){
			Node n = nodes[i];
			for(Entry<Node, Integer> e: n.neighbor.entrySet()){
				Node nn = e.getKey();
				int c = e.getValue();
				if(costs[n.id][nn.id]<c){
					ans++;
				}
			}
		}
		
		System.out.println(ans/2);

	}
	
	static class Node{
		int id;
		Map<Node,Integer> neighbor = new HashMap<>();
		int status = -1;
		Node(int id){
			this.id = id;
		}
	}
	
	static long[][] getAllPairsMinimumCost(Node[] nodeList, long inf){
		final long[][] costs = new long[nodeList.length][nodeList.length];
		for(int i=0; i<nodeList.length; i++)
			for(int j=0; j<nodeList.length; j++)
				costs[i][j] = i==j ? 0 : inf;
		for(Node node: nodeList)
			for(Entry<Node,Integer> n:node.neighbor.entrySet())
				costs[node.id][n.getKey().id] = n.getValue();
		for(int k=0; k<nodeList.length; k++){
			for(int i=0; i<nodeList.length; i++){
				if(costs[i][k]==inf) continue;
				for(int j=0; j<nodeList.length; j++){
					if(costs[k][j]==inf) continue;
					costs[i][j] = Math.min(costs[i][j], costs[i][k]+costs[k][j]);
				}
			}
		}
		return costs;
	}

}