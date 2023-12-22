import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		ArrayDeque<Character> deque = new ArrayDeque<>();
		Character c = ' ';
		for (int i = 0; i < s.length; i++) {
			if (deque.isEmpty()) {
				deque.push(s[i]);
			} else {
				c = deque.peek();
				if (c == '(' && s[i] == ')') {
					deque.pop();
				} else {
					deque.push(s[i]);
				}
			}
		}
		String str1 = "", str2 = "";
		while (!deque.isEmpty()) {
			c = deque.poll();
			if (c == ')') {
				str1 += "(";
			} else {
				str2 += ")";
			}
		}
		sb.append(str1);
		sb.append(s);
		sb.append(str2);
		System.out.println(sb);
	}
}
