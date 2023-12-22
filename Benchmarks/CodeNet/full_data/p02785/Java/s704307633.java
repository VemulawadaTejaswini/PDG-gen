import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		ArrayList<Long> h = new ArrayList<>();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			long j = kb.nextLong();
			h.add(j);
		}
		Collections.sort(h);
		int count = 0;
		for (long e : h) {
			count += 1;
		}
		// System.out.println(count);
		for (long i = 0; i < k; i++) {
			h.remove(count - 1);
			count -= 1;
			if (count == 0)
				break;
		}
		// System.out.println(h);
		for (long e : h) {
			sum += e;
			//System.out.println(sum);
		}
		System.out.println(sum);

		kb.close();
	}

}
