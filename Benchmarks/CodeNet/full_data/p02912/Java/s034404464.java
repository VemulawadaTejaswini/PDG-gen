import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	int N, M;
	PriorityQueue<Integer> prices;

	Main() {
		sc = new Scanner(System.in);
		prices = new PriorityQueue<>(Comparator.reverseOrder());
	}
	
	void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		
		for (int i = 0; i < N; i++) prices.add(sc.nextInt());
		for (int i = 0; i < M; i++) {
			Iterator<Integer> it = prices.iterator();
			int p = it.next();
			it.remove();
			prices.add(p>>>1);
		}
		System.out.println(prices.stream().
			collect(Collectors.summingLong(p -> (long)p) ));
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}