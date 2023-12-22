import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long h = Long.parseLong(str[1]);

		long a[] = new long[n];
		Long b[] = new Long[n];

		long maxA = 0;
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			a[i] = Long.parseLong(str[0]);
			b[i] = Long.parseLong(str[1]);

			maxA = Math.max(maxA, a[i]);
		}

		Arrays.sort(b, Comparator.reverseOrder());

		long count = 0;
		for (int i = 0; i < n; i++) {
			if (b[i] <= maxA)
				break;

			h -= b[i];
			count++;

			if (h <= 0)
				break;
		}

		while (h > 0) {
			h -= maxA;
			count++;
		}

		System.out.println(count);
	}
}
