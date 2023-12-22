import java.util.*;

public class Main {

	static int head = 0;

	static void f(int i, char[] r) {
		if (i == head) {
			if (r[i] == '9') {
				++head;
				f(i + 1, r);
				r[i] = (char) Math.max('0', r[i + 1] - 1);
			} else {
				++r[i];
			}
		} else if (r[i] == '9' || Math.abs(++r[i] - r[i + 1]) > 1) {
			f(i + 1, r);
			r[i] = (char) Math.max('0', r[i + 1] - 1);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] r = new char[11];
		Arrays.fill(r, '0');
		for (int k = s.nextInt(); k > 0; --k) {
			f(0, r);
		}
		System.out.println(new StringBuilder(String.valueOf(r))
				.reverse().toString().replaceFirst("^0+", ""));
	}
}
