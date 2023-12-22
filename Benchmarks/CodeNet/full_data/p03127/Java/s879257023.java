import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monsters = Integer.parseInt(sc.nextLine());
		long[] hp = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		sc.close();
		long ans = 0;
		Arrays.sort(hp);
		Main main = new Main();
		for (int i = 0; i < monsters -1; i++) {
			ans = main.GCD(ans, hp[i]);
		}

		System.out.println(ans);
	}

	public long GCD(long num1, long num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return GCD(num2, num1 % num2);
		}
	}


}