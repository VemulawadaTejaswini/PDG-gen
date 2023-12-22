import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int n;
	
	private long[] costs;
	
	private NodeList[] nodes;
	
	private class NodeList {
		private LinkedList<Integer> to;
		private LinkedList<Integer> value;
		
		public NodeList() {
			to = new LinkedList<Integer>();
			value = new LinkedList<Integer>();
		}
		
		public void add(int t, int v) {
			to.push(t);
			value.push(v);
		}
		
		public int getTo(int i) {
			return to.get(i);
		}
		
		public int getValue(int i) {
			return value.get(i);
		}
		
		public int size() {
			return to.size();
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		n = Integer.parseInt(sc.nextLine());

		nodes = new NodeList[n + 1];
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new NodeList();
		}
		
		for (int i = 0; i < (n - 1); i++) {
			String[] nico = sc.nextLine().split(" ");
			int from = Integer.parseInt(nico[0]);
			int to = Integer.parseInt(nico[1]);
			int val = Integer.parseInt(nico[2]);

			nodes[from].add(to, val);
			nodes[to].add(from, val);
		}

		String[] data = sc.nextLine().split(" ");
		int q = Integer.parseInt(data[0]);
		int k = Integer.parseInt(data[1]);
		
		costs = new long[n + 1];
		for (int i = 0; i < costs.length; i++) {
			costs[i] = -1;
		}
		costs[k] = 0;
		calc(k);

		for (int i = 0; i < q; i++) {
			String[] nico = sc.nextLine().split(" ");
			int from = Integer.parseInt(nico[0]);
			int to = Integer.parseInt(nico[1]);

			System.out.println(costs[from] + costs[to]);
		}
	}
	
	private void calc(int from) {
		for (int i = 0; i < nodes[from].size(); i++) {
			int index = nodes[from].getTo(i);
			if (costs[index] != -1) continue;
			
			costs[index] = costs[from] + nodes[from].getValue(i);
			calc(index);
		}
	}
}