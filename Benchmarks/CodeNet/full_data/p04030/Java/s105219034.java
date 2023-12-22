import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Deque<Character> dq = new ArrayDeque<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'B') {
				if(!dq.isEmpty()) dq.pop();
				continue;
			}
			dq.push(c);
		}
		while(!dq.isEmpty()) {
			System.out.print(dq.poll());
		}
		System.out.println();
	}
}