import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		//		int price[] = new int[n];

		PriorityQueue<Integer> price = new PriorityQueue<>(Comparator.reverseOrder());
		for ( int i = 0; i < n; i++ ) {
			price.add(in.nextInt());
		}

		while ( m > 0 ) {
			Integer p = price.poll();
			p /= 2;
			m--;
			price.add(p);
		}
		
		long sum = 0;
		for ( Integer p : price ) {
			sum += p;
		}
		System.out.println(sum);

		in.close();
	}
}