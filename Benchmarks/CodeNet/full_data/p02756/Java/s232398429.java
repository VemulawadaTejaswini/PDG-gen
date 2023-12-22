import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		boolean mirror = false;
		Deque<String> q = new ArrayDeque<String>();
		q.addLast(S);

		for (int i = 0; i < Q; i++) {
			int Ti = sc.nextInt();
			if (Ti == 2) {
				int Fi = sc.nextInt();
				String Ci = sc.next();
				if (Fi == 1) {
					if (mirror == false) {
						q.addFirst(Ci);
					} else {
						q.addLast(Ci);
					}
				} else {
					if (mirror == false) {
						q.addLast(Ci);
					} else {
						q.addFirst(Ci);
					}
				}
			} else {
				mirror = !mirror;
			}
		}
		sc.close();
		int size=q.size();

		String ans = "";
		for (int i = 0; i < size; i++) {
			ans += q.poll();
		}
		System.out.println(ans);
	}
}
