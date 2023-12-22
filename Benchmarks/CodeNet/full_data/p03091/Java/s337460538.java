import java.util.*;

public class Main {
	public static class Node {
		int idx;
		ArrayList<Node> edges = new ArrayList<>();
		ArrayList<Integer> rev = new ArrayList<>();
		public Node(int idx) {
			this.idx = idx;
		}
		ArrayList<Integer> state = new ArrayList<>();
	}
	public static class Graph {
		int N;
		Node[] nodes;
		public Graph(int n) {
			N = n;
			nodes = new Node[N];
			for(int i=0; i<N; i++)
				nodes[i] = new Node(i);
		}
		
		public void addEdge(int a, int b) {
			nodes[a].edges.add(nodes[b]);
			nodes[b].edges.add(nodes[a]);
			nodes[a].rev.add(nodes[b].edges.size()-1);
			nodes[b].rev.add(nodes[a].edges.size()-1);
			nodes[a].state.add(0);
			nodes[b].state.add(0);
		}
		public void setState(Node n, int num, int state) {
			n.state.set(num, state);
			n.edges.get(num).state.set(n.rev.get(num), state);
		}
		public boolean findCircuit() {
			int start=-1;
			for(int i=0; i<N; i++) {
				int validNodeNum=0;
				for(int s : nodes[i].state)
					if(s==0)
						validNodeNum++;
				
				if(validNodeNum>0) {
					start=i;
					break;
				}
			}
			if(start<0)
				return false;
			
			return findCircuit(start);
		}

		public boolean findCircuit(int s) {
			HashSet<Integer> visited = new HashSet<>();
			ArrayList<Integer> n = new ArrayList<>();
			ArrayList<Integer> e = new ArrayList<>();
			n.add(s);
			Node c = nodes[s];
			int p = -1;
			while(!visited.contains(c.idx)) {
				for(int i=0; i<c.edges.size(); i++) {
					if(c.state.get(i)==0 && c.edges.get(i).idx != p) {
						setState(c, i, 1);
						e.add(i);
						visited.add(c.idx);
						p = c.idx;
						c = c.edges.get(i);
						n.add(c.idx);
						break;
					}
				}
			}
			int flag = 2;
			for(int i=n.size()-2; i>=0; i--) {
				setState(nodes[n.get(i)], e.get(i), flag);
				if(n.get(i)==s)
					flag=0;
			}
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Graph g = new Graph(N);
		for(int i=0; i<M; i++) {
			g.addEdge(sc.nextInt()-1, sc.nextInt()-1);
		}
		
		for(int i=0; i<3; i++) {
			if(!g.findCircuit()) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		System.out.println("Yes");
		sc.close();
	}
}
