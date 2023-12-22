import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		ArrayList<AtomicInteger> list = new ArrayList<AtomicInteger>(n);

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
			list.add(i, new AtomicInteger(0));
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j + 1 + list.get(j).get() == a[i]) {
					list.get(j).incrementAndGet();
				}
			}
		}

		int max = 0;
		for (AtomicInteger ai : list) {
			max = Math.max(max, ai.get());
		}

		System.out.println(n - max);

	}

}
