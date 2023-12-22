import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l1 = scan.nextLine();
		String l2 = scan.nextLine();
		scan.close();

		long n = Long.valueOf(l1.split(" ")[0]);
		long k = Long.valueOf(l1.split(" ")[1]);
		String strH = l2;
		List<Long> h = new ArrayList<Long>();
		for (String element : strH.split(" ")) {
			h.add(Long.valueOf(element));
		}

		Collections.sort(h, Collections.reverseOrder());

		for (long i= 0; i < k; i++) {
			List<Long> buf = new ArrayList<Long>();
			boolean first = true;
			for (Long element : h) {
				if (first) {
					first = !first;
					continue;
				}

				buf.add(element);
			}
			h = buf;
			Collections.sort(h, Collections.reverseOrder());
		}

		long result = 0;
		for (Long element : h) {
			result += element;
		}

		System.out.println(result);
	}
}
