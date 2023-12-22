import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] digits = sc.next().chars().map(i -> i-'0').toArray(); // 125 -> {1, 2, 5}

		int pattern = (int) Math.pow(2, digits.length-1);

		so.println(IntStream.range(0, pattern).mapToLong(i -> calc(digits, i)).sum());
	}

	static long calc(int[] nums, int bits) {
		long sum = 0;
		long buf = nums[0];

		for (int i=1; i<nums.length; i++) {
			if ((bits >> i-1 & 1) == 1) {
				sum += buf;
				buf = nums[i];

			} else {
				buf = buf*10 + nums[i];
			}
		}
		sum += buf;
		return sum;
	}
}