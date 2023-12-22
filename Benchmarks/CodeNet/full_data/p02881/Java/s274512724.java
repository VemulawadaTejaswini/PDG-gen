import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long N = scanner.nextLong();
		long i = 1;
		long j = N;

		long l = N / 8;
		long l2 = N / 4;
		long l3 = N / 8 * 3;
		ArrayList<Long> array = new ArrayList<Long>();
		array.add(N - 1);
		for (long s = 1; s <= N / 8; s++) {
			if (N % s == 0)
				array.add((s - 1) + ((N / s) - 1));
			if (N % l == 0)
				array.add((l - 1) + ((N / l) - 1));
			if (N % l2 == 0)
				array.add((l2 - 1) + ((N / l2) - 1));
			if (N % l3 == 0)
				array.add((l3 - 1) + ((N / l3) - 1));
			l++;
			l2++;
			l3++;
		}
		Collections.sort(array);
		System.out.println(array.get(0));

	}
}