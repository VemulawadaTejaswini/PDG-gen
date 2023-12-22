
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		PriorityQueue<String> list = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(list.poll());
		}
	}
}