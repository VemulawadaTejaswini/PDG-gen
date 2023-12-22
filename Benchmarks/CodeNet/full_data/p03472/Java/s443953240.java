import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		PriorityQueue<Integer> b = new PriorityQueue<Integer>();
		int max = 0; int count = 0;

		for(int i = 0; i < n; i++) {
			max = Math.max(max, sc.nextInt());
			b.add(-1*sc.nextInt());
		}

		while(h > 0) {
			if(!b.isEmpty() && -1*b.peek() > max) {
				h  += b.poll();
				count++;
			}else {
				double h_ = h;
				double max_ = max;
				count += Math.ceil(h_/max_);
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}