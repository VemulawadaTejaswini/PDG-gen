import java.util.Scanner;

/**
 * 大岩達典 J4-170821<br>
 * D-ColouringDominos<br>
 * https://beta.atcoder.jp/contests/abc071/tasks/arc081_b
 * <br>
 * 教壇から見て左中央<br>
 * <br>
 */
public class Main {
	
	public static final int MAX = 1000000007;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int n = scanner.nextInt();
		final String upper = scanner.next();
		final String lower = scanner.next();
		scanner.close();
		
		long result = 0;
		int i = 0;
		boolean prevFlat;
		
		// 最初の部分
		if (n == 1) {
			i = 1;
			result = 3;
			prevFlat = false;
		} else {
			if (upper.charAt(0) == upper.charAt(1)) {
				result = 6;
				i = 2;
				prevFlat = true;
			} else {
				result = 3;
				i = 1;
				prevFlat = false;
			}
		}
		
		for (; i < n; i++) {
			if (i == n-1) {// 最後
				if (prevFlat) {
				} else {
					result *= 2;
					if (result >= MAX) result -= MAX;
				}
				
			} else {
				if (upper.charAt(i) == upper.charAt(i+1)) {
					// 横
					if (prevFlat) {
						result *= 3;
						if (result >= MAX) result -= MAX;
					} else {
						result *= 2;
					}
					if (result >= MAX) result -= MAX;
					i++;
					prevFlat = true;
				} else {
					// 縦
					if (!prevFlat) {
						result *= 2;
						if (result >= MAX) result -= MAX;
					}
					prevFlat = false;
				}
			}
			System.out.println(String.valueOf(i) + " "  + prevFlat + " " + result);
		}
		
		System.out.println(String.valueOf(result));
	}
}
