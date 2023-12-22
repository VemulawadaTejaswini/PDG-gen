import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		Queue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			for (int j = 0; j < b; j++) {
				pq.add(a);
			}
		}

		for (int i = 0; i < k - 1; i++) {
			pq.poll();
		}
		System.out.println(pq.poll());
	}

}
