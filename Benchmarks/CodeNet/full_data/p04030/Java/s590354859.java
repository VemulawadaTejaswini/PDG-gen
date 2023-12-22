import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)=='B') {
				if (stack.isEmpty()==false) {
					stack.pop();
				}
			} else {
				stack.add(s.charAt(i));
			}
		}
		Stack<Character> result = new Stack<Character>();
		while (stack.isEmpty()==false) {
			Character c = stack.pop();
			result.add(c);
		}
		while (result.isEmpty()==false) {
			System.out.print(result.pop());
		}
	}
}