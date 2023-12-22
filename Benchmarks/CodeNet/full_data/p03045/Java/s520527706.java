import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc077/tasks/arc084_b
 */
public class Main {

	static Node nodes[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		nodes = new Node[N];
		for(int i=0; i<N; i++) {
			nodes[i] = new Node(i);
		}

		for(int i=0; i<M; i++){
			Node x = nodes[Integer.parseInt(sc.next()) - 1];
			Node y = nodes[Integer.parseInt(sc.next()) - 1];
			int z = Integer.parseInt(sc.next());
			x.neighbor.put(y, z);
			y.neighbor.put(x, z);
		}
		sc.close();
		
		int ans = assignColor(nodes);
		System.out.println(ans);
	}
	
	static class Node{
		int id;
		Map<Node,Integer> neighbor = new HashMap<>();
		int color = -1;
		Node(int id){
			this.id = id;
		}
	}
	
	static int assignColor(Node[] nodeList){
		int color = 0;
		for(Node node:nodeList){
			if(node.color==-1){
				List<Node> que = new ArrayList<>();
				node.color = color;
				que.add(node);
				while(que.size()>0){
					for(Node n: que.remove(0).neighbor.keySet()){
						if(n.color==-1){
							n.color = color;
							que.add(n);
						}
					}
				}
				color++;
			}
		}
		return color;
	}


}