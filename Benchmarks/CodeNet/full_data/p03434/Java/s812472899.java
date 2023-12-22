import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		Collections.reverse(list);

		int alicePoint = 0;
		int bobPoint = 0;
		for (int j = 0; j < n; j++) {
			if ((j + 1) % 2 != 0) {
				alicePoint = alicePoint + list.get(j);
			} else {
				bobPoint = bobPoint + list.get(j);
			}
		}

		System.out.println(alicePoint - bobPoint);

	}

}
