
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		long[] numline = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		Main main = new Main();
		Arrays.sort(numline);
		long numsMax = numline[line[0] - 1];
		long let = numline[0];
		if (line[0] > 1) {
			for (int i = 1; i < line[0]; i++) {
				let = main.GCD(numline[i], let);
			}
		}
		if (line[1] <= numsMax && line[1] % let == 0) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
		sc.close();
	}

	public long GCD(long num1, long num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return GCD(num2, num1 % num2);
		}
	}
}