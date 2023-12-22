import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			int N = input.nextInt();
			int M = input.nextInt();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			
			for (int i = 0; i < N; ++i) {
				pq.add(input.nextInt());
			}
			
			while (M-- > 0) {
				int a = pq.poll();
				pq.add(a >> 1);
			}
			
			long cost = 0;
			while (pq.isEmpty() == false) {
				cost += pq.poll();
			}
			
			System.out.println(cost);
		}

	}

}
