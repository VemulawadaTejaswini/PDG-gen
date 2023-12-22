import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			int query = in.nextInt();
			if (query == 1) {
				if (s.length() > 1) {
					String begin = s.substring(0, 1);
					String middle = s.substring(1, s.length() - 1);
					String end = s.substring(s.length() - 1, s.length());
					s = end + middle + begin;
				}
			} else {
				int f = in.nextInt();
				String c = in.next();
				if (f == 1) {
					s = c + s;
				} else {
					s = s + c;
				}
			}
		}
		System.out.println(s);
	}
}
