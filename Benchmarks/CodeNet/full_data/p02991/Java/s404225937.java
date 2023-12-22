import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer>[] edge = new ArrayList[N*3];
		for(int i = 0; i < N*3; i++)
			edge[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			edge[u].add(v+N);
			edge[u+N].add(v+2*N);
			edge[u+2*N].add(v);
		}
		int S = sc.nextInt()-1;
		int T = sc.nextInt()-1;
		int[] d = new int[N*3+1];
		Arrays.fill(d, 100000);
		d[S] = 0;
		Queue<Integer> q = new ArrayDeque<>();
		for(int i : edge[S]) {
		    q.offer(i);
		    d[i] = 1;
		}
		while(q.size() > 0) {
		    int x = q.poll();
		    for(int i : edge[x]) {
		        if(d[i] > d[x] + 1) {
		            d[i] = d[x] + 1;
		            q.offer(i);
		        }
		    }
		}
		System.out.println(d[T] % 3 == 0 ? d[T]/3 : -1);
	}

}