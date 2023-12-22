import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			if(stack.isEmpty())
				stack.add(s.charAt(i));
			else {
				char c = stack.peek();
				if(c != s.charAt(i))
					stack.add(s.charAt(i));
			}
		}
		
		System.out.println(stack.size());
	}
}
