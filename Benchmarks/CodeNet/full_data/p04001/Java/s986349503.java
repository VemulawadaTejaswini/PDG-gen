import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);
	
	static String s;
	public static void main(String[] args) {
		char[] nums = sc.next().toCharArray();
		int pattern = (int) Math.pow(2, nums.length-1);
		long sum = 0;
		for (int i = 0; i < pattern; i++) {
			sum += f(nums, i);
		}
		so.println(sum);
	}
	
	// (1234, 3) -> "1plus2plus34" ...(3(10) = 011(2))
	static long f(char[] nums, int bits) {
		StringBuilder sb = new StringBuilder();
		sb.append(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			if ((bits >> i-1 & 1) == 1)
				sb.append("plus");
			sb.append(nums[i]);
		}
		return parse(sb.toString());
	}
	
	// "1plus2plus34" -> 37 ...(1+2+34)
	static long parse(String eq) {
		String[] nums = eq.split("plus");
		long sum = Long.parseLong(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			sum += Long.parseLong(nums[i]);
		}
		return sum;
	}
}
