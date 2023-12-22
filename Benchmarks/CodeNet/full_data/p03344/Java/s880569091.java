import java.util.*;

public class Main {

	public static void main(String args[]) {
		int rep = 1;
		if (args.length > 0) {
			if( args[0].equals("gen") ) {
				(new Main()).gen();
				return;
			}
			rep = Integer.parseInt(args[0]);
		}
		(new Main()).__solve(rep);
	}
	
	void gen() {
		int N = 100000;
		int E = 100000;
		Random rand = new Random();
		System.out.println(N + " " + E);
		for( int i = 0; i < N; ++i ) {
			int R = rand.nextInt(1000000000) + 1;
			int P = rand.nextInt(1000000000) + 1;
			System.out.println(R + " " + P);
		}
		for( int i = 0; i < E; ++i ) {
			int F = rand.nextInt(i + 1) + 1; 
			int T = i + 2;
			if( i == E - 1 ) {
				T = rand.nextInt(i + 1) + 1; 
			}
			System.out.println(F + " " + T);
		}
	}

	void __solve(int rep) {

		try (Scanner cin = new Scanner(System.in);) {

			for (int i = 0; i < rep; ++i) {
				TTinit();
				__solve(cin);
//				TTstep();
			}

		}

	}
	
	long TTstart;
	void TTinit() {
		TTstart = System.currentTimeMillis();
	}
	
	void TTstep() {
		System.err.println("step: " + (System.currentTimeMillis() - TTstart));
	}

	void __solve(Scanner cin) {
		
		int N = cin.nextInt();
		int E = cin.nextInt();
		long sum = 0;
		
		Pair pair[] = new Pair[N];
		
		long ret = 0;
		Node nodes[] = new Node[N];
		for( int i = 0; i < N; ++i ) {
			nodes[i] = new Node(cin.nextInt(), cin.nextInt());
			sum += nodes[i].pay;
			if( nodes[i].req > nodes[i].pay ) {
				ret = Math.max(ret, nodes[i].req - nodes[i].pay);
			}
			pair[i] = new Pair(i, Math.max(0, nodes[i].req - nodes[i].pay));
		}

		for (int i = 0; i < E; ++i) {
			int F = cin.nextInt() - 1;
			int T = cin.nextInt() - 1;
			nodes[F].add(T);
			nodes[T].add(F);
		}
		
		Arrays.sort(pair);
		for( int i = 0; i < Math.min(N, 16); ++i ) {
			ret = Math.min(ret, solve(nodes, N, pair[i].key, ret));
		}
		
		System.out.println(ret + sum);
		
	}
	
	long solve(Node nodes[], int N, int start, long best) {
		boolean visited[] = new boolean[N];
		visited[start] = true;
		long ret = Math.max(0, nodes[start].req - nodes[start].pay);
		if( ret >= best ) { return best; }
		long total = nodes[start].pay;
		
		Set<Integer> reach = new HashSet<Integer>();
		nodes[start].merge(reach, visited);
		
		int rest = N - 1;
		
		while( rest > 0 ) {
			List<Integer> add = new ArrayList<Integer>();
			long diff = best;
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
				continue;
			}
			for( int next : add ) {
				visited[next] = true;
			}
			for( int next : add ) {
				nodes[next].merge(reach, visited);
			}
			for( int next : add ) {
				reach.remove(next);
			}
			rest -= add.size();
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
	
	class Pair implements Comparable<Pair> {
		
		int key;
		int value;
		
		Pair(int key, int value) {
			this.key = key;
			this.value = value;
		}
		
		@Override
		public int compareTo(Pair p) {
			if( p.value > value ) { return -1; }
			if( p.value < value ) { return 1; }
			if( p.key > key ) { return -1; }
			if( p.key < key ) { return 1; }
			return 0;
		}
		
	}
	
}
