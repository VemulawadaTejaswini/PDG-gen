import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i <= 100001; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			list.get(a).add(b);
		}

		long sum = 0;
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				pq.add(list.get(i).get(j));
			}
			if (pq.isEmpty())
				continue;
			sum += pq.poll();
		}

		System.out.println(sum);
	}

}