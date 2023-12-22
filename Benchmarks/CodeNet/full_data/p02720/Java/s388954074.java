import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue<Integer> queue = new LinkedList<>();		
		for(int i = 1; i < 10; i++){
			queue.add(i);
		}
		
		int k = scanner.nextInt();
		for(int i = 0; i < k - 1; i++) {
			int x = queue.poll();
			if(x % 10 != 0) {
				queue.add(10 * x + x % 10 - 1);
			}
			queue.add(10 * x + x % 10);
			if(x % 10 != 9) {
				queue.add(10 * x + x % 10 + 1);
			}
		}

		System.out.println(queue.poll());
		scanner.close();
	}

}
