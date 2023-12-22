import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 整数
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		String str = sc.next();

		int i;
		int j;
		int k;
		int result = 0;

		// 総当たり。なお i<j<k を満たさない範囲は除外
		for (i = 0; i < str.length(); i++) {
			for (j = i + 1; j < str.length(); j++) {
				for (k = j + 1; k < str.length(); k++) {
					if (k - j != j - i) {
						if (str.charAt(i) != str.charAt(j)
								&& str.charAt(j) != str.charAt(k)
								&& str.charAt(i) != str.charAt(k)) {
							result++;
						}

					}
				}
			}
		}
		
		System.out.println(result);

	}

}