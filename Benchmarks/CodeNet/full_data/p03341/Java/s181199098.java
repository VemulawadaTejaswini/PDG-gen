
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				String s = S.substring(i + 1);
				min = Math.min(min, s.replace("W", "").length());
			} else if (i == N - 1) {
				String s = S.substring(0, i);
				min = Math.min(min, s.replace("E", "").length());
			} else {
				String left = S.substring(0, i);
				String right = S.substring(i + 1, S.length());
				min = Math.min(min, left.replace("E", "").length() + right.replace("W", "").length());
			}
		}
		System.out.println(min);
		in.close();
	}
}