import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] nums = IntStream.rangeClosed(input[0], input[1]).toArray();
		IntStream.range(0, nums.length).filter( i -> (i < input[2] || nums.length - 1 -input[2] < i) ).sorted().forEach(i -> System.out.println(nums[i]));
	}
}