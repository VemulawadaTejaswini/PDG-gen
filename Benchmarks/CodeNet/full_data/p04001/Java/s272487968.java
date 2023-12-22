import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.util.stream.IntStream.range;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] digits = sc.next().chars().map(i -> i-'0').toArray(); // 125 -> {1, 2, 5}

		int pattern = (int) Math.pow(2, digits.length-1);

		so.println(range(0, pattern).mapToLong(i -> calc(digits, i)).sum());
	}
	
	static long calc(int[] nums, int bits) {
		String eq = range(0, nums.length).
				    mapToObj(
				      i -> nums[i] + ((bits >> i & 1) == 1 ? "p" : "")
				    ).collect(Collectors.joining());
		
		return Arrays.stream(eq.split("p")).mapToLong(Long::parseLong).sum();
	}
}