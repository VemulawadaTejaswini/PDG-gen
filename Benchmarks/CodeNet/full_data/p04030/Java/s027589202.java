import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		Deque<Character> q = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'B') {
				q.offerLast(s.charAt(i));
			} else {
				if (q.isEmpty()) {

				} else {
					q.pollLast();
				}
			}
		}
		while (!q.isEmpty()) {
			System.out.print(q.pollFirst());
		}
		System.out.println();

	}
}