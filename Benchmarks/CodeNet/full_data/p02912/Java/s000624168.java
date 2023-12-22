import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < N; i++)
			pq.offer(sc.nextDouble());
		for(int i = 0; i < M; i++)
			pq.offer(pq.poll()/2);
		long ans = 0;
		int size = pq.size();
		for(int i = 0; i < size; i++)
			ans += pq.poll();
		System.out.println(ans);

	}

}