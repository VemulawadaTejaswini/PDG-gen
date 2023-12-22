import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		Integer n = scan.nextInt();
		List<Integer> xList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			xList.add(scan.nextInt());
		}

		int xMax = xList.stream().mapToInt(x -> x).max().getAsInt();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < xMax; i++) {
			int p = 0;
			for (int j = 0; j < n; j++) {
				int x1 = xList.get(j);
				int x2 = i + 1;
				p += (x1 - x2) * (x1 - x2);
			}
			min = Math.min(p, min);
		}

		System.out.println(min);
		scan.close();
	}
}