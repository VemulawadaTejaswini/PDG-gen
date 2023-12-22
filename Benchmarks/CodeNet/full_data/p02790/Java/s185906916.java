import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			StringBuilder ab = new StringBuilder();
			for(int i = 0 ; i < b ; i++) {
				ab.append(a);
			}
			StringBuilder ba = new StringBuilder();
			for(int i = 0 ; i < a ; i++) {
				ba.append(b);
			}
			PriorityQueue<String> q = new PriorityQueue<>();
			q.add(ab.toString());
			q.add(ba.toString());

			System.out.println(q.peek());
		}

	}

}
