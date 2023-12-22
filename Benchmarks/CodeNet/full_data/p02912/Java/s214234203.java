import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		PriorityQueue<Integer> yenQ = new PriorityQueue<>(Collections.reverseOrder());
		for (int i=0; i<N; i++) {
			yenQ.add(sc.nextInt());
		}
		
		for (int i=0; i<M; i++) {
			yenQ.add(yenQ.poll() / 2);
		}

		long sum = 0;
		for (Integer yen : yenQ) {
			sum += yen;
		}
		System.out.println(sum);
	}
}