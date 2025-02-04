import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Deque<String> dq = new ArrayDeque<>();
		Arrays.stream(s.split("")).forEach(dq::addLast);
		int n = Integer.valueOf(sc.nextLine());
		boolean isReverse = false;
		for (int i = 0; i < n; i++) {
			String[] in = sc.nextLine().split(" ");
			if ("1".equals(in[0])) {
				// que反転
				isReverse = !isReverse;
			} else {
				// 向きを示す物が必要
				if ("1".equals(in[1]) == isReverse) {
					// 後ろ
					dq.addLast(in[2]);
				} else {
					// 前
					dq.addFirst(in[2]);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		int size = dq.size();
		for (int i = 0; i < size; i++) {
			if (isReverse) {
				sb.append(dq.pollLast());
			} else {
				sb.append(dq.pollFirst());
			}
		}

		System.out.println(sb.toString());
	}
}
