import java.util.*;

public class Main {

	public static void main(String args[]) {
		int rep = 1;
		if (args.length > 0) {
			rep = Integer.parseInt(args[0]);
		}
		(new Main()).__solve(rep);
	}

	void __solve(int rep) {

		try (Scanner cin = new Scanner(System.in);) {

			for (int i = 0; i < rep; ++i) {
				__solve(cin);
			}

		}

	}

	void __solve(Scanner cin) {

		int N = cin.nextInt();
		int E = cin.nextInt();
		long sum = 0;
		
		Node nodes[] = new Node[N];
		for( int i = 0; i < N; ++i ) {
			nodes[i] = new Node(cin.nextInt(), cin.nextInt());
			sum += nodes[i].pay;
		}

		for (int i = 0; i < E; ++i) {
			int F = cin.nextInt() - 1;
			int T = cin.nextInt() - 1;
			nodes[F].add(T);
			nodes[T].add(F);
		}
		
		long ret = Long.MAX_VALUE;
		boolean skip[] = new boolean[N];
		
		for( int i = 0; i < N; ++i ) {
			if( skip[i] ) { continue; }
			ret = Math.min(ret, solve(nodes, N, i, ret, skip));
		}
		
		System.out.println(ret + sum);

	}
	
	long solve(Node nodes[], int N, int start, long best, boolean skip[]) {
		boolean visited[] = new boolean[N];
		visited[start] = true;
		long ret = Math.max(0, nodes[start].req - nodes[start].pay);
		long total = nodes[start].pay;
		
		Set<Integer> reach = new HashSet<Integer>();
		nodes[start].merge(reach, visited);
		
		int rest = N - 1;
		boolean skipF = false;
		
		while( rest > 0 ) {
			List<Integer> add = new ArrayList<Integer>();
			long diff = Long.MAX_VALUE;
			for( int next : reach ) {
				if( visited[next] ) {
					throw new RuntimeException("implementation error...");
				}
				if( total + ret + nodes[next].pay >= nodes[next].req ) {
					total += nodes[next].pay;
					add.add(next);
				}
				else {
					diff = Math.min(diff, nodes[next].req - (total + ret + nodes[next].pay));
				}
			}
			if( add.isEmpty() ) {
				ret += diff;
				if( ret >= best ) { return best; }
				skipF = true;
				continue;
			}
			for( int next : add ) {
				visited[next] = true;
				if( skipF ) {
					skip[next] = true;
				}
			}
			for( int next : add ) {
				nodes[next].merge(reach, visited);
			}
			for( int next : add ) {
				reach.remove(next);
			}
			rest -= add.size();
			skipF = false;
		}
		
		return ret;
		
	}
	
	class Node {
		
		int req;
		int pay;
		
		List<Integer> edge;
		
		Node(int req, int pay) {
			this.req = req;
			this.pay = pay;
			edge = new ArrayList<Integer>();
		}
		
		void add(int target) {
			edge.add(target);
		}
		
		void merge(Set<Integer> reach, boolean visited[]) {
			for( int node : edge ) {
				if( visited[node] ) { continue; }
				reach.add(node);
			}
		}
		
	}
	
}
