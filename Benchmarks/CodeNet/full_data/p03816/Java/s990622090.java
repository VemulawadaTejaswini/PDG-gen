import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		sc.close();

		Collections.sort(a);

		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		deque.addAll(a);

		System.out.println(deque);

		while (hasSameOne(deque)) {
			deque = getUpdated(deque);
			System.out.println(deque);
		}

		System.out.println(deque.size());

	}

	private static ArrayDeque<Integer> getUpdated(ArrayDeque<Integer> deque) {
		int prev = deque.getFirst();
		deque.removeFirst();
		if (deque.getFirst().equals(prev)) {
			deque.removeFirst();
			deque.removeFirst();
			deque.addFirst(prev);;
			return deque;
		}
		deque.addLast(prev);
		return deque;
	}

	private static boolean hasSameOne(ArrayDeque<Integer> deque) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(deque);
		int prev = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			if(a.get(i).equals(prev)) {
				return true;
			}
			prev = a.get(i);
		}
		return false;
	}
}