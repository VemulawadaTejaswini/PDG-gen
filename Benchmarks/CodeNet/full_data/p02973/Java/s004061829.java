import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> que = new ArrayDeque<>(N);
		for (int i = 0; i < N; i++) {
			que.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		int color = 0;
		while (!que.isEmpty()) {
			int last = 0;
			int size = que.size();
			for (int i = 0; i < size; i++) {
				int current = que.poll();
				if (last >= current) {
					que.add(current);
				} else {
					last = current;
				}
			}
			if (size == que.size()) {
				color += que.size();
				break;
			}
			color++;

		}
		System.out.println(color);
	}
}