

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt()-1;
		int t = sc.nextInt()-1;

		ArrayList<Node> graph = new ArrayList<Node>();

		for (int i=0;i<n;i++) {
			graph.add(new Node());
			graph.get(i).id=i;
		}

		for (int i=0;i<m;i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int a = sc.nextInt();
			int b = sc.nextInt();
			Edge e = new Edge();
			e.from=u;
			e.to=v;
			e.yen=a;
			e.snuke=b;
			Edge f = new Edge();
			f.from=v;
			f.to=u;
			f.yen=a;
			f.snuke=b;

			graph.get(u).edges.add(e);
			graph.get(v).edges.add(f);
		}


		TreeMap<Long,Node> map = new TreeMap<Long, Node>();
		for(int i=0;i<n;i++) {
			if (i != s) {
				graph.get(i).yen=(long)Math.pow(10, 14);

			} else {
				graph.get(i).yen=0;
			}
			map.put(graph.get(i).yen*n-Long.MAX_VALUE+i, graph.get(i));
		}


		while (!map.isEmpty()) {
			Node node = map.firstEntry().getValue();
			map.remove(map.firstEntry().getKey(), node);
			for (Edge e:node.edges) {
				Node toNode = graph.get(e.to);
				if (toNode.yen > node.yen+e.yen && map.containsKey(toNode.yen*n-Long.MAX_VALUE+toNode.id)) {
					map.remove(toNode.yen*n-Long.MAX_VALUE+toNode.id, toNode);
					toNode.yen = node.yen+e.yen;
					map.put(toNode.yen*n-Long.MAX_VALUE+toNode.id, toNode);
				}
			}
		}


		map = new TreeMap<Long, Node>();
		for(int i=0;i<n;i++) {
			if (i != t) {
				graph.get(i).snuke=(long)Math.pow(10, 14);

			} else {
				graph.get(i).snuke=0;
			}
			map.put(graph.get(i).snuke*n-Long.MAX_VALUE+i, graph.get(i));
		}

		while (!map.isEmpty()) {
			Node node = map.firstEntry().getValue();
			map.remove(map.firstEntry().getKey(), node);
			for (Edge e:node.edges) {
				Node toNode = graph.get(e.to);
				if (toNode.snuke > node.snuke+e.snuke && map.containsKey(toNode.snuke*n-Long.MAX_VALUE+toNode.id)) {
					map.remove(toNode.snuke*n-Long.MAX_VALUE+toNode.id, toNode);
					toNode.snuke = node.snuke+e.snuke;
					map.put(toNode.snuke*n-Long.MAX_VALUE+toNode.id, toNode);
				}
			}
		}

		long min = Long.MAX_VALUE;
		long[] ans = new long[n];
		for (int i=n-1;i>=0;i--) {
			min = Math.min(graph.get(i).yen+graph.get(i).snuke, min);
			ans[i] = min;
		}
		for (int i=0;i<n;i++) {
			System.out.println((long)Math.pow(10, 15)-ans[i]);
		}

	}



}


class Edge {
	int from;
	int to;
	long yen;
	long snuke;
}

class Node {
	int id;
	List<Edge> edges=new ArrayList<Edge>();
	long yen;
	long snuke;
}