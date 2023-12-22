public class Main {
	BigInteger k;
	BigInteger a[];

	Main(BigInteger k, BigInteger a[]) {
		this.k = k;
		this.a = a;
	}

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int w = s.nextInt();
		int h = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();

		System.out.println(Main.calc(w, h, x, y));
	}

	public static String calc(long w, long h, long x, long y) {
		long cal = Math.max(Math.min((w - x) * h, x * h), Math.min(w * (h - y), w * h));
		boolean flg = false;
		if (cal == (w - x) * h) {
			if (cal == w * (h - y)) {
				flg = true;
			}
			if (cal == w * h) {
				flg = true;
			}
			if (cal == x * h) {
				flg = true;
			}
		}
		if (cal == x * h) {
			if (cal == w * (h - y)) {
				flg = true;
			}
			if (cal == w * h) {
				flg = true;
			}
			if (cal == (w - x) * h) {
				flg = true;

			}
		}
		return cal + " " + ((flg) ? "1" : "0");
	}

}