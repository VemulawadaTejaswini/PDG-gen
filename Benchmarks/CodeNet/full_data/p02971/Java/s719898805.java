import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		Integer[] ArrayA = new Integer[n];


		for (int i = 0; i < n; i++) {
			ArrayA[i] = sc.nextInt();
		}


		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<Integer>(Arrays.asList(ArrayA));
			list.remove(i);

			Collections.sort(list);
			Collections.reverse(list);

			System.out.println(list.get(0));

		}

	}
}
