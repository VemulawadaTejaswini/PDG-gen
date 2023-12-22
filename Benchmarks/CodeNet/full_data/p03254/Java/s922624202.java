import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long x = Long.parseLong(tokens[1]);
		tokens = in.nextLine().split(" ");
		List<Long> a = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			a.add(Long.parseLong(tokens[i]));
		}
		Collections.sort(a);

		long childrenNum = 0;
		for (int i = 0; i < N; ++i) {
			if (x - a.get(i) < 0) {
				break;
			}
			childrenNum++;
			x -= a.get(i);
		}
		if (x > 0) {
			childrenNum--;
		}
		if (childrenNum < 0) {
			childrenNum = 0;
		}
		System.out.println(childrenNum);

		in.close();
	}
}