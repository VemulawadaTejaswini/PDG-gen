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

		StringBuilder builder = new StringBuilder(s);

		int lastIndex = -1;
		int length = s.length();
		for(char i=0; i<length; i++) {
			char c = builder.charAt(i);
			int count = ('z' - c) + 1;
			if(K >= count) {
				builder.setCharAt(i, 'a');
				K -= count;
			}
			else {
				lastIndex = i;
			}
		}

		if(K > 0 && lastIndex >= 0) {
			if(K > 26) K = K % 26;
			char c = (char)(builder.charAt(lastIndex) + K);
			builder.setCharAt(lastIndex, c);
		}

		return builder.toString();
	}
}