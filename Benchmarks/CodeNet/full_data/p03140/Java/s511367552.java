import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		int count = 0;
		for (int i = 0; i < n; i++) {
			char aChar = a.charAt(i);
			char bChar = b.charAt(i);
			char cChar = c.charAt(i);
			// System.out.println(count);

			if (aChar == bChar && bChar == cChar) {
				continue;
			}
			if (aChar != bChar && bChar != cChar && cChar != aChar) {
				count += 2;
				continue;
			}
			count++;

		}
		System.out.println(count);
	}
}