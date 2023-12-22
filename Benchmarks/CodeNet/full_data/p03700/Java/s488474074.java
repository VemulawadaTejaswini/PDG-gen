
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long a = sc.nextLong();
			long b = sc.nextLong();

			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}

			Arrays.sort(arr);
			int count = 0;
			int attackCount = 0;
			long[] tmpArr;
			do {
				attackCount++;
				count = 0;
				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] -= b;
					if (0 < arr[i]) count++;
				}
				arr[arr.length - 1] -= a;
				if (0 < arr[arr.length - 1]) count++;
				if (count == 0) break;

				tmpArr = new long[count];
				int i = 0;
				for (long j : arr) {
					if (0 < j) {
						tmpArr[i] = j;
						i++;
					}
				}
				arr = tmpArr;
				Arrays.sort(arr);
			} while (true);

			System.out.println(attackCount);
		}
	}
}