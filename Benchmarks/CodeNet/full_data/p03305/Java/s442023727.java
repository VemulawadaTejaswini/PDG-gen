import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt()-1;
		int t = sc.nextInt()-1;
		
		List<E> map[] = new List[n];
		for(int i = 0; i < n ;i++){
			map[i] = new LinkedList<E>();
		}
		
		for(int i = 0; i < m ;i++){
			E e = new E();
			e.from = sc.nextInt()-1;
			e.to = sc.nextInt()-1;
			e.a = sc.nextInt();
			e.b = sc.nextInt();
			
			map[e.from].add(e);
			map[e.to].add(e);
		}
		
		
		long[] minE = new long[n];
		Arrays.fill(minE, Long.MAX_VALUE);
		{
			PriorityQueue<N> pq = new PriorityQueue<N>((x,y)-> Long.compare(x.cost, y.cost) );
			N init = new N();
			init.pos = s;
			init.cost  =0;
			pq.add(init);
			boolean visited[] = new boolean[n];
			for(;!pq.isEmpty();){
				N now = pq.poll();
				
				if(visited[now.pos]){
					continue;
				}
				visited[now.pos] = true;
				minE[now.pos] = now.cost;
				
				for(E e: map[now.pos]){
					
					int npos = e.from ^ e.to ^ now.pos;
					long ncos = now.cost + e.a;

					if(ncos < minE[npos]){
						minE[npos] = ncos;
						N next = new N();
						next.pos = npos;
						next.cost = ncos;
						pq.add(next);
					}
				}				
			}
		}
		long[] minS = new long[n];
		Arrays.fill(minS, Long.MAX_VALUE);
		{
			PriorityQueue<N> pq = new PriorityQueue<N>((x,y)-> Long.compare(x.cost, y.cost) );
			N init = new N();
			init.pos = t;
			init.cost  =0;
			pq.add(init);
			boolean visited[] = new boolean[n];
			for(;!pq.isEmpty();){
				N now = pq.poll();
				
				if(visited[now.pos]){
					continue;
				}
				visited[now.pos] = true;
				minS[now.pos] = now.cost;
				
				for(E e: map[now.pos]){
					
					int npos = e.from ^ e.to ^ now.pos;
					long ncos = now.cost + e.b;

					if(ncos < minS[npos]){
						minS[npos] = ncos;
						N next = new N();
						next.pos = npos;
						next.cost = ncos;
						pq.add(next);
					}
				}				
			}
		}
		
		long[] ansrev = new long[n];
		ansrev[0] = minE[n-1]+minS[n-1];
		for(int i = 1; i < n ;i++){
			ansrev[i] = Math.min(ansrev[i-1], minE[n-1-i]+minS[n-1-i]);
		}
		
		for(int i = n-1; i >=0; i --){
			System.out.println(1000000000000000L-ansrev[i]);
		}
		
	}
	
	class E{
		int from;
		int to;
		int a;
		int b;
	}
	
	class N{
		int pos;
		long cost;
	}
}
