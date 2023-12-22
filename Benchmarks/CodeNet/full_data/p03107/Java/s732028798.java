import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		sc.close();
		int ans = 0, p = 0;
		LinkedList<Integer> stack = new LinkedList<Integer>();
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == s.charAt(0))
				stack.addFirst(i - p);
			else {
				if (!stack.isEmpty()) {
					int tmp = stack.getFirst();
					if (tmp + 1 == i - p) {
						ans += 2;
						p += 2;
						stack.removeFirst();
					}
				}
			}
		}
		System.out.println(ans);
	}

}

