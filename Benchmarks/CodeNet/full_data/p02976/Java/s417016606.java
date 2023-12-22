import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private class UnionField {
		public class Node {
			public int self = 0;
			public boolean even = true;
			public boolean isReverseToParent = false;
			public int real = -1;
			public int parent = 0;
			public LinkedList<Integer> children = new LinkedList<Integer>();
			
			public boolean isEven() {
				int count = children.size();
				if (even == false) {
					count++;
				}
				if (count % 2 == 0) {
					return true;
				} else {
					return false;
				}
			}
			
			public Node(int self, int parent) {
				this.self = self;
				this.parent = parent;
			}
			
			public void reverse() {
				this.even = !this.even;
			}
			
			public void reverseToParent(Node[] nodes) {
				this.isReverseToParent = !this.isReverseToParent;
				if (parent != self) {
					nodes[parent].reverseToParent(nodes);
				}
				
			}
			
			public void addChild(int node) {
				children.add(node);
			}
			
			public void setReal(Node[] nodes, int node) {
				this.real = node;
				
				ListIterator<Integer> it = children.listIterator();
				while (it.hasNext()) {
					int c = it.next();
					if (c == node) {
						it.remove();
					} else if (c != self) {
						nodes[c].setReal(nodes, self);
					}
				}
			}
		}
		
		public Node nodes[] = null;
		
		public UnionField(int size) {
			this.nodes = new Node[size];
			for (int i=0; i<this.nodes.length; i++) {
				this.nodes[i] = new Node(i, i);
			}
		}
		
		public int getRoot(int node) {
			int parent = this.nodes[node].parent;
			if (parent == node) {
				return node;
			} else {
				int root = getRoot(parent);
				this.nodes[node].parent = root;
				return root;
			}
		}
		
		public void union(int a, int b) {
			a = getRoot(a);
			b = getRoot(b);
			if (a != b) {
				this.nodes[a].parent = b;
			}
		}
		
		public boolean isSame(int a, int b) {
			a = getRoot(a);
			b = getRoot(b);
			return (a == b);
		}
	}
	private class Way {
		public int a;
		public int b;
		public Way(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public String toString() {
			return a + " " + b;
		}
	}
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		UnionField field = new UnionField(N);
		LinkedList<Way> unused = new LinkedList<Way>();
		for (int i=0; i<M; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			
			if (field.isSame(a, b)) {
				//System.err.println("Unused " + (a+1) + "," + (b+1));
				unused.add(new Way(a, b));
				field.nodes[a].reverse();
			} else {
				//System.err.println("Add " + (a+1) + "," + (b+1));
				field.union(a, b);
				field.nodes[a].addChild(b);
				field.nodes[b].addChild(a);
			}
		}
		in.close();
		field.nodes[0].setReal(field.nodes, 0);
		
		int count = 0;
		for (int i=0; i<N; i++) {
			if (field.nodes[i].isEven() == false) {
				count++;
				//System.err.println("odd  : " + (i+1));
			} else {
				//System.err.println("even : " + (i+1));
			}
		}
		if (count % 2 != 0) {
			System.out.println(-1);
			return;
		}

		for (int i=0; i<N; i++) {
			if (field.nodes[i].isEven() == false) {
				field.nodes[i].reverseToParent(field.nodes);
			}
		}
		for (int i=1; i<N; i++) {
			if (field.nodes[i].isReverseToParent) {
				System.out.println((i+1) + " " + (field.nodes[i].real));
			} else {
				System.out.println((field.nodes[i].real+1) + " " + (i+1));
			}
		}
		for (Way way : unused) {
			System.out.println(way);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
