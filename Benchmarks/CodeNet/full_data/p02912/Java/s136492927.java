import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		PriorityQueue pq = new PriorityQueue (N, new MyComparator());

		for (int index=0; index<N; index++) {
			pq.add(sc.nextInt());
		}
		for (int index=0; index<M; index++) {
			int num = (int) pq.poll();
			pq.add(num/2);
		}
		long total = 0;
		for (int index=0; index<N; index++) {
			total+=(int) pq.poll();
		}
		System.out.println(total);
	}
}

class MyComparator implements Comparator{
	@Override
	public int compare (Object arg0, Object arg1) {
		int x = (int) arg0;
		int y = (int) arg1;

		if (x<y) {
			return 1;
		} else if (x>y) {
			return -1;
		} else {
			return 0;
		}
	}
}
