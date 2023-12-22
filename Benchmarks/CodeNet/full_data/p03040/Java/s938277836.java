import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();

		PriorityQueue<Integer> qL = new PriorityQueue<Integer>(Comparator.reverseOrder());
		PriorityQueue<Integer> qR = new PriorityQueue<Integer>();
		long sumA = 0;
		long sumB = 0;

		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt();
			if (x == 1) {
				Integer a = sc.nextInt();
				sumB += sc.nextInt();
				qL.add(a);
				qR.add(a);
				if (qL.peek() > qR.peek()) {
					Integer tmpL = qL.poll();
					Integer tmpR = qL.poll();
					qL.add(tmpR);
					qR.add(tmpL);
					sumA += (tmpL - tmpR);
				}
			} else {
				Integer min = qL.peek();
				long sum = sumA + sumB;
				System.out.println(min + " " + sum);
			}
		}
	}
}
