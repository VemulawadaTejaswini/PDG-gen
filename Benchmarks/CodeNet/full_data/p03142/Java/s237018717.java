import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private class Node {
		public int parentsCount = 0;
		public List<Integer> children = null;
		
		public int setParents = 0;
		public int trueParent = 0;
		public int trueDepth = 0;
		
		public Node() {
			children = new LinkedList<Integer>();
		}
		
		public void setDepth(int parent, int depth) {
			if (trueDepth < depth) {
				trueDepth = depth;
				trueParent = parent;
			}
			setParents++;
		}

		public int getDepth() {
			if (parentsCount > setParents) {
				return -1;
			}
			return trueDepth;
		}
		
		public int getTrueParent() {
			if (parentsCount > setParents) {
				return -1;
			}
			return trueParent;
		}
		
		public boolean isRoot() {
			if (parentsCount == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	private int getRoot(Node[] nodes) {
		int root = 0;
		for (root=1; root<nodes.length; root++) {
			if (nodes[root].isRoot()) {
				break;
			}
		}
		
		return root;
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		Node[] nodes = new Node[N+1];
		for (int i=0; i<N+1; i++) {
			nodes[i] = new Node();
		}
		
		for (int i=0; i<N+M-1; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			nodes[a].children.add(b);
			nodes[b].parentsCount++;
		}

		in.close();
		
		int root = getRoot(nodes);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(root);
		
		while (list.size() > 0) {
			int target = list.removeFirst();
			int depth = nodes[target].getDepth();
			
			for (Integer x : nodes[target].children) {
				nodes[x].setDepth(target, depth+1);
				if (nodes[x].getDepth() != -1 && nodes[x].children.size() > 0) {
					list.addFirst(x);
				}
			}
		}
		
		for (int i=1; i<N+1; i++) {
			System.out.println(nodes[i].trueParent);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
