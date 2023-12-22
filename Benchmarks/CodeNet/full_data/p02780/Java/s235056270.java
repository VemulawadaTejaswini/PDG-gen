import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		String[] strs1 = scan.nextLine().split(" ");
		String[] strs2 = scan.nextLine().split(" ");
		int n = Integer.parseInt(strs1[0]);
		int k = Integer.parseInt(strs1[1]);
		int[] p = Arrays.stream(strs2).mapToInt(str -> Integer.parseInt(str)).toArray();

		int sum = Arrays.stream(Arrays.copyOfRange(p, 0, k)).sum();
		int max = sum;
		for (int i = 0; i < n - k; i++) {
			sum = sum - p[i] + p[i + k];
			max = Math.max(sum, max);
		}
		double exp = (max + k) / 2.0;

		System.out.println(String.valueOf(exp));
		scan.close();
	}
}