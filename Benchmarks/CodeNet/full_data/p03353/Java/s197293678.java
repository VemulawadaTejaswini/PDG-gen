import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int k = sc.nextInt();
			Queue<String> que = new PriorityQueue<>();
			int len = s.length();
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j <= len; j++) {
					que.add(s.substring(i, j));
				}
			}
			String ans = que.remove();
			int cnt = 1;
			while (true) {
				if (cnt == k)
					break;
				String next = que.remove();
				if (!next.equals(ans)) {
					cnt++;
					ans = next;
				}
			}
			System.out.println(ans);
		}
	}
}