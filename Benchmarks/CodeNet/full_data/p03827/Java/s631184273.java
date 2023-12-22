import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	/**
	 * Increment Decrement
	 * @param 1 ≦ N ≦ 100
	 * @param |S| = N
	 * @result max x
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();
			List<String> list = Arrays.asList(s.split(""));

			int x = 0;
			int ans = 0;
			for (String t : list) {
				if (t.equals("I")) {
					x ++;
					if (x > ans) {
						ans = x;
					}
				} else {
					x --;
				}
			}
			System.out.println(ans);
		}
	}
}
