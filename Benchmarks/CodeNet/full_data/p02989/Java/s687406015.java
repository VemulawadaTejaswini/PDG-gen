import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int nHalf = n / 2;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		final int numHalf = list.get(nHalf - 1);
		final int numHalfNext = list.get(nHalf);

		if (numHalf == numHalfNext) {
			System.out.print(0);
			return;
		}

		System.out.print(numHalfNext - numHalf);

	}

}