
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long h = sc.nextLong();
			long w = sc.nextLong();

			if (h % 3 == 0 || w % 3 == 0) {
				System.out.println("0");
				return;
			}

			long ansA = Math.min(calcA(h, w), calcA(w, h));
			long ansB = Math.min(calcB(h, w), calcB(w, h));
			long ansC = Math.min(calcC(h, w), calcC(w, h));
			long ansD = calcB(w, h);
			System.out.println(Math.min(Math.min(ansA, ansB),Math.min(ansC, ansD)));

		}
	}

	private static long calcA(long h, long w) {
		long s1 = 0;
		long s2 = 0;
		long s3 = 0;

		s1 = ((w / 3) + 1) * h;
		long w2 = w - ((w / 3) + 1);
		s2 = w2 * (h / 2);
		long h2 = h - (h / 2);
		s3 = w2 * h2;

		if (s1 == 0 || s2 == 0 || s3 == 0) {
			return Long.MAX_VALUE;
		}

		return Math.max(s1, Math.max(s2, s3)) - Math.min(s1, Math.min(s2, s3));
	}

	private static long calcB(long h, long w) {

		long s1 = 0;
		long s2 = 0;
		long s3 = 0;

		s1 = (w / 3) * h;
		long w2 = w - (w / 3);
		s2 = w2 * (h / 2);
		long h2 = h - (h / 2);
		s3 = w2 * h2;

		if (s1 == 0 || s2 == 0 || s3 == 0) {
			return Long.MAX_VALUE;
		}

		return Math.max(s1, Math.max(s2, s3)) - Math.min(s1, Math.min(s2, s3));
	}

	private static long calcC(long h, long w) {

		long s1 = 0;
		long s2 = 0;
		long s3 = 0;

		s1 = (w / 2) * (h / 2);
		long w2 = w - (w / 2);
		long h2 = h - (h / 2);
		s2 = w * h2;
		s3 = h * w2;
		if (s1 == 0 || s2 == 0 || s3 == 0) {
			return Long.MAX_VALUE;
		}
		return Math.max(s1, Math.max(s2, s3)) - Math.min(s1, Math.min(s2, s3));
	}

}