import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int q = scanner.nextInt();

		Deque<String> deque = new ArrayDeque<String>(Arrays.asList(s.split("")));

		boolean normal = true;
		boolean f;
		String c;
		for (int i = 0; i < q; i++) {
			if (scanner.nextInt() == 2) {
				f = scanner.nextInt() == 1;
				c = scanner.next();
				if (normal == f)
					deque.addFirst(c);
				else
					deque.addLast(c);
			} else
				normal = !normal;
		}

		String result = "";

		if (normal) {
			while (!deque.isEmpty())
				result += deque.removeFirst();
		} else {
			while (!deque.isEmpty())
				result += deque.removeLast();
		}

		System.out.println(result);

	}

}
