import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		LinkedList<Integer> deque = new LinkedList<>();
		for (int i = 0; i < n; ++i) {
			deque.addLast(scanner.nextInt());
		}
		int ret = findMaxSequence(deque, k);

		String out = String.valueOf(ret);

		System.out.print(out);
	}

	public static int findMaxSequence(LinkedList<Integer> deque, int k) {
		int n = deque.size();
		int min = Math.min(n, k);
		LinkedList<Integer> list = new LinkedList<>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= min; ++i) {
			for (int j = min - i; j >= 0; j--) {
				if (j == 0 && i == j) {
					break;
				}
				Deque<Integer> newDeque = (Deque<Integer>) deque.clone();
				list.clear();
				int a = i;
				int b = j;
				while (a > 0) {
					list.add(newDeque.pollFirst());
					a--;
				}
				while (b > 0) {
					list.add(newDeque.pollLast());
					b--;
				}
				Collections.sort(list);
				int remind = min - i - j;

				while (remind > 0 && !list.isEmpty() && list.peek() <= 0) {
					list.poll();
					remind--;
				}
				int newMax = 0;
				for (Integer integer : list)
					newMax += integer;
				if (max < newMax)
					max = newMax;
			}
		}
		return max < 0 ? 0 : max;
	}
}