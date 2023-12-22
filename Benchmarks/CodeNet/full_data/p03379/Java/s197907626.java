import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			List<Long> orglist = new ArrayList<>(n);
			for (int i = 0; i < n; i++) {
				orglist.add(scanner.nextLong());
			}

			List<Long> sortList = new ArrayList<>(orglist);
			Collections.sort(sortList);

			int pos = n / 2;
			long val1 = sortList.get(pos - 1);
			long val2 = sortList.get(pos);

			for (int i = 0; i < n; i++) {
				long val = orglist.get(i);
				if (val <= val1) {
					System.out.println(val2);
				} else {
					System.out.println(val1);
				}
			}
		}
	}
}
