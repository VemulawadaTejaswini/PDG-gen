import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		sc.close();
		int ans = 0;
		LinkedList<Character> stack = new LinkedList<Character>();
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == s.charAt(0))
				stack.addFirst(s.charAt(i));
			else {
				if (!stack.isEmpty()) {
					++ans;
					stack.getFirst();
					stack.removeFirst();
				}
			}
		}
		ans *= 2;
		System.out.println(ans);
	}

}
