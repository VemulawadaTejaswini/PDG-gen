import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int K = sc.nextInt();

		System.out.println(solve(s, K));
	}

	public static String solve(String s, int K) {

		char[] chars = s.toCharArray();
		int lastIndex = -1;
		int length = chars.length;

		for(char i=0; i<length; i++) {
			char c = chars[i];
			int count = ('z' - c) + 1;
			if(K >= count) {
				chars[i] = 'a';
				K -= count;
			}
			else {
				lastIndex = i;
			}

			if(K <= 0) break;
		}

		if(K > 0 && lastIndex >= 0) {
			if(K > 26) K = K % 26;
			char c = (char)(builder.charAt(lastIndex) + K);
			chars[i] = c;
		}

		return String.valueOf(chars);
	}
}