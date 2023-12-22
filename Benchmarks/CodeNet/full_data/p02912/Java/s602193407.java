import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]), m = Integer.parseInt(nm[1]);
		String[] line = br.readLine().split(" ");
		PriorityQueue<Integer> prices = new PriorityQueue<>(n, Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			prices.add(Integer.parseInt(line[i]));
		}
		for (int i = 0; i < m; i++) {
			prices.offer(prices.poll()/2);
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum+= prices.poll();
		}
		System.out.println(sum);
		br.close();
	}

}
