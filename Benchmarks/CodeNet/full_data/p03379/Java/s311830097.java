import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int tar = scanner.nextInt();
			a[i] = tar;
			list.add(tar);
		}
		Collections.sort(list);

		for (int i = 0; i < n; i++) {
			if (a[i] < list.get(n / 2))
				System.out.println(list.get(n / 2));
			else
				System.out.println(list.get(n / 2 - 1));
		}
		
	}
}
