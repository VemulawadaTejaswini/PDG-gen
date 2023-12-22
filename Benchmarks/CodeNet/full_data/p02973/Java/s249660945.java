import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(check(N, a));
	}

	private static int check(int N, int[] a) {
		List<Integer> mins = new ArrayList<>();
		for (int i = N - 1; i >= 0; i--) {
			if (mins.isEmpty()) {
				mins.add(a[i]);
				continue;
			}
			
			boolean found = false;
			for (int j = 0; j < mins.size(); j++) {
				final int min = mins.get(j);
				if (a[i] < min) {
					mins.set(j, a[i]);
					found = true;
					break;
				}
			}
			
			if (!found) {
				mins.add(a[i]);
			}
			
		}
		return mins.size();
	}

}