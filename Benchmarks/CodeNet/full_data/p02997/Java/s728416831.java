import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Edge> li = new ArrayList<>();
		int max = -1, idx = 0;
		for(int i = 1; i <= n / 2; i++) {
			int val = c2(n - i) + c2(i);
			if(max < val) {
				max = val;
				idx = i;
			}
		}
		//System.out.println(max + " " + idx);
		if(max < k) {
			System.out.println(-1);
			return;
		}
		for(int i = 0; i < idx; i++) {
			for(int j = idx; j < n; j++) {
				li.add(new Edge(i, j));
			}
		}
		for(int i = 0; i < idx -1 && max != k; i++) {
			for(int j = i + 1; j < idx -1 && max != k; j++) {
				li.add(new Edge(i, j));
				max--;
			}
		}
		for(int i = idx; i < n && max != k; i++) {
			for(int j = i + 1; j < n && max != k; j++) {
				li.add(new Edge(i, j));
				max--;
			}
		}
		if(k != max) System.out.println(-1);
		System.out.println(li.size());
		for(Edge e : li) {
			System.out.println((e.f + 1 )+ " " + (e.t + 1));
		}
	}
	
	int c2(int n) {
		if(n < 2) return 0;
		else return n * (n - 1) / 2;
	}
	
	class Edge{
		int f, t;
		Edge(int from, int to){
			f = from; t = to;
		}
	}
	
	class Work implements Comparable<Work>{
		int c, l;//cost, limit
		Work(int cost, int limit) {
			c = cost; l = limit;
		}
		@Override
		public int compareTo(Work arg0) {
			if(this.l != arg0.l) {
				return (this.l < arg0.l)?-1:1;
			}
			else if(this.c != arg0.c) {
				return (this.c < arg0.c)?-1:1;
			}
			return 0;
		}
	}

	long gcd(long a, long b) {
		long w;
		while(b != 0) {
			w = a % b;
			a = b;
			b = w;
		}
		return a;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
