import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Long> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextLong());
		}

		Collections.sort(list);

		long[] dif = new long[N-2];

		for (int i = 0; i < N-2; i++) {
			long min = list.get(i);
			long max = list.get(i+2);

			dif[i] = max - min;
		}

		Arrays.sort(dif);

		System.out.println(dif[0]);
	}
}
