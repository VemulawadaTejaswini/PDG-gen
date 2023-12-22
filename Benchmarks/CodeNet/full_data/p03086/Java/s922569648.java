import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		char[] c = sc.next().toCharArray();
		int max = 0;
		int count = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'A' || c[i] == 'C' || c[i] == 'G' || c[i] == 'T') {
				count += 1;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		sc.close();

		System.out.println(max);
	}
};