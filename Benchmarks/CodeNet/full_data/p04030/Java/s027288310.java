import java.util.*;
public class Main {
	public static void main(String[] a) {
		try (Scanner s = new Scanner(System.in)) {
			Stack<String> stack = new Stack<>();
			String text = s.nextLine();
			String[] strings = text.split("");
			for (String c : strings) {
				if (c.equals("B")) {
					if (stack.isEmpty() == false) {
						stack.pop();
					}
				} else {
					stack.push(c);
				}
			}
			stack.stream().forEach(System.out::print);
		}
	}
}
