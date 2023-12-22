import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int count;
	static long[][] dp;
	static long[] numberArray;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		count = scan.nextInt();
		scan.nextLine();

		numberArray = Arrays.stream(scan.nextLine().split(" "))
				.mapToLong(Long::parseLong)
				.toArray();

		dp = new long[count + 1][count + 1];

		long result = dpMethod(new int[] { 0, 0 });

		println(result);
	}

	public static long dpMethod(int[] situation) {

		if (dp[situation[0]][situation[1]] != 0) {
			return dp[situation[0]][situation[1]];
		}

		if (situation[0] + situation[1] == count) {
			return 0;
		}

		long value = Math.max(
				numberArray[situation[0]] - dpMethod(
						new int[] { situation[0] + 1, situation[1] }),
				numberArray[count - 1 - situation[1]] - dpMethod(
						new int[] { situation[0], situation[1] + 1 }));

		dp[situation[0]][situation[1]] = value;

		return value;
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
