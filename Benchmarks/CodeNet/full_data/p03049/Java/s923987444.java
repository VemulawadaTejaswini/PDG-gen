
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static int countAB(final String text) {
		int count = 0;
		int index = 0;
		while (true) {
			index = text.indexOf("AB", index);
			if (index < 0)
				return count;
			count += 1;
			index += 2;
		}
	}

	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int N = in.nextInt();

		int beginsWithB = 0;
		int endsWithA = 0;
		int sum = 0;
		int both = 0;
		for (int i = 0; i < N; ++i) {
			final String si = in.next().trim();
			final boolean b = si.charAt(0) == 'B';
			final boolean a = si.charAt(si.length() - 1) == 'A';
			if (a && b) {
				++both;
			} else {
				if (a)
					++endsWithA;
				if (b)
					++beginsWithB;
			}
			sum += countAB(si);
		}

		sum += Math.min(endsWithA, beginsWithB);
		sum += Math.max(both - 1, 0);

		if (endsWithA != beginsWithB && both > 0)
			sum += 1;

		System.out.println(sum);
	}
}
