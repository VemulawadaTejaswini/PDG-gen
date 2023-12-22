import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			int C = scan.nextInt();
			int[] price = new int[N];
			Queue<Integer>  pq = new PriorityQueue<>(N, Collections.reverseOrder());
			
			for (int i = 0; i < N; i++) {
				int p = scan.nextInt();
				pq.add(p);
			}

			for (int i = 0; i < C; i++) {
				int half = pq.poll()/2;
				pq.add(half);
			}
			
			Long sum = 0L;
			for(Integer p :pq) {
				sum+=p;
			}
			System.out.println(sum);
		}
	}
}