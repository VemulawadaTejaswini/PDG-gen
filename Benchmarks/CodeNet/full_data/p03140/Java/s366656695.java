import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String A = in.nextLine();
		String B = in.nextLine();
		String C = in.nextLine();
		in.close();

		System.out.println(diff(A, B, C));
	}

	static int diff(String A, String B, String C) {
		int result = 0;
		for (int i = 0; i < A.length(); ++i) {
			char a = A.charAt(i);
			char b = B.charAt(i);
			char c = C.charAt(i);
			if (a == b && b == c && c == a) {

			} else if (a == b || b == c || c == a) {
				result++;
			} else {
				result = result + 2;
			}
		}
		return result;
	}

}