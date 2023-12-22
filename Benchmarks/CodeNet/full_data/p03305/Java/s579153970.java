

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt()-1;
		int t = sc.nextInt()-1;

		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();

		for (int i=0;i<n;i++) {
			graph.add(new ArrayList<Edge>());
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

			graph.get(u).add(e);
			graph.get(v).add(f);
		}
		long [] yen = new long[n];
		long [] snuke = new long[n];
		TreeMap<Long,Integer> map = new TreeMap<Long, Integer>();
		for(int i=0;i<n;i++) {
			if (i != s) {
				yen[i]=(long)Math.pow(10, 14);

			} else {
				yen[i]=0;
			}
			map.put(yen[i]*n-Long.MAX_VALUE+i, i);
		}


		while (!map.isEmpty()) {
			int node = map.firstEntry().getValue();
			map.remove(map.firstEntry().getKey(), node);
			for (Edge e:graph.get(node)) {
				int toNode = e.to;
				if (yen[toNode] > yen[node]+e.yen && map.containsKey(yen[toNode]*n-Long.MAX_VALUE+toNode)) {
					map.remove(yen[toNode]*n-Long.MAX_VALUE+toNode, toNode);
					yen[toNode] = yen[node]+e.yen;
					map.put(yen[toNode]*n-Long.MAX_VALUE+toNode, toNode);
				}
			}
		}


		map = new TreeMap<Long, Integer>();
		for(int i=0;i<n;i++) {
			if (i != t) {
				snuke[i]=(long)Math.pow(10, 14);

			} else {
				snuke[i]=0;
			}
			map.put(snuke[i]*n-Long.MAX_VALUE+i, i);
		}

		while (!map.isEmpty()) {
			int node = map.firstEntry().getValue();
			map.remove(map.firstEntry().getKey(), node);
			for (Edge e:graph.get(node)) {
				int toNode = e.to;
				if (snuke[toNode] > snuke[node]+e.snuke && map.containsKey(snuke[toNode]*n-Long.MAX_VALUE+toNode)) {
					map.remove(snuke[toNode]*n-Long.MAX_VALUE+toNode, toNode);
					snuke[toNode] = snuke[node]+e.snuke;
					map.put(snuke[toNode]*n-Long.MAX_VALUE+toNode, toNode);
				}
			}
		}

		long min = Long.MAX_VALUE;
		long[] ans = new long[n];
		for (int i=n-1;i>=0;i--) {
			min = Math.min(yen[i]+snuke[i], min);
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
