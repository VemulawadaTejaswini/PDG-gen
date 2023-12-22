import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	String S;
	LinkedList<Character> que;

	private void solve() {
		// input

		Scanner io = new Scanner(System.in);
		S = io.next();
		
		int ans = Integer.MAX_VALUE;
		for (int k = 97; k <= 122; k++) {
			char target = (char) k;
			que = new LinkedList<Character>();

			boolean same = true;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) != target) {
					same = false;
				}
				que.offer(S.charAt(i));
			}
			if (same) {
				System.out.println(0);
				return;
			}

			for (int i = S.length() - 1; i > 0; i--) {
				same = true;
				for (int j = 0; j < i; j++) {
					char next;
					if (que.peek() == target) {
						next = que.poll();
					} else {
						que.poll();
						next = que.peek();
					}
					if (next != target) {
						same = false;
					}
					que.offer(next);
				}
				
				que.poll();
				if(same){
					ans = Math.min(ans,S.length()-i);
					break;
				}
				
			}

		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
