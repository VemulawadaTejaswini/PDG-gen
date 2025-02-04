import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	private class Node {
		public long pattern = 0;
		public int index;
		public LinkedList<Integer> children = new LinkedList<Integer>();
		public int parent = -1;
		
		public Node(int i) {
			this.index = i;
		}
		
		public void setParent(int K, int parent, int use, Node[] nodes) {
			this.pattern = K - use;
			this.parent = parent;
			int count = 1;
			if (parent != -1) {
				count++;
			}
			for (int n : children) {
				if (n == this.parent) {
					continue;
				}
				nodes[n].setParent(K, index, count, nodes);
				
				count++;
			}
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		Node[] nodes = new Node[N];
		for (int i=0; i<N; i++) {
			nodes[i] = new Node(i);
		}
		for (int i=0; i<N-1; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			nodes[a].children.add(b);
			nodes[b].children.add(a);
		}
		in.close();
		
		nodes[0].setParent(K, -1, 0, nodes);
		
		long patterns = 1;
		for (int i=0; i<N; i++) {
			patterns = (patterns * nodes[i].pattern) % 1_000_000_007;
		}
		
		System.out.println(patterns);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
