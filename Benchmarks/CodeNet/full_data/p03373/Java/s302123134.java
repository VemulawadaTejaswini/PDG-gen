public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));
	}

	public static long calc(int a, int b, int c, int x, int y) {

		long res = Long.MAX_VALUE;
		// cの枚数のとりうる最大値
		long exmax = Math.max(x, y) * 2;
		for (int cn = 0; cn <= exmax; cn += 2) {
			long aVal = Math.max(a * (x - cn / 2), 0);
			long bVal = Math.max(b * (y - cn / 2), 0);
			long cVal = c * cn;
			res = Math.min(aVal + bVal + cVal, res);
		}
		return res;
	}

}