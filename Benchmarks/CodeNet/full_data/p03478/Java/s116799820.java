import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 【問題概要】 11 以上 N 以下の整数のうち、10 進法で各桁の和が A 以上 B 以下であるものについて、総和を求めてください。
 *
 * @author tsuch
 *
 */

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main instance = new Main();
		instance.solve();
	}

	private void solve() {
		try {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = IntStream.rangeClosed(1, n).filter(c -> test(a, b, c)).sum();
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean test(int a, int b, int target) {
		int[] tmp = Stream.of(String.valueOf(target).split("")).mapToInt(Integer::parseInt).toArray();
		int d = Arrays.stream(tmp).sum();
		return a <= d && d <= b;
	}
}