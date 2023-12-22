import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return - Integer.compare(i1, i2);
			}
		});
		
		for(int i=0; i<N; i++)
			q.add(sc.nextInt());
		
		for(int i=0; i<M; i++) {
			int max = q.poll();
			q.add(max/2);
		}
		long ans = 0;
		while(!q.isEmpty())
			ans += q.poll();
		
		System.out.println(ans);
		sc.close();
	}
}
