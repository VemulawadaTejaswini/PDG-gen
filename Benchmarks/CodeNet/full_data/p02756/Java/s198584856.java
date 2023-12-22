import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst(str);
		int Q = Integer.parseInt(sc.next());
		String[][] s = new String[Q][3];
		for(int i = 0; i < Q; i++) {
			s[i][0] = sc.next();
			if(s[i][0].equals("1")) {
				s[i][1] = "0";
				s[i][2] = "0";
			} else {
				s[i][1] = sc.next();
				s[i][2] = sc.next();
			}
		}
		
		boolean order = true;
		
		for(int i = 0; i < Q; i++) {
			if(s[i][0].equals("1")) {
				order = !order;
			} else {
				boolean temp = order;
				if(s[i][1].equals("1")) {
					temp = !order;
				}
				if(temp) {
					deque.addLast(s[i][2]);
				} else {
					deque.addFirst(s[i][2]);
				}
			}
		}
		StringBuilder S = new StringBuilder("");
		int N = deque.size();
		for(int i = 0; i < N; i++) {
			S.append(deque.pollFirst());
		}
		if(order) {
			System.out.println(S);
		} else {
			System.out.println(S.reverse());
		}
	}
}
