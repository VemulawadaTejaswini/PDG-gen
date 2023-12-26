public class Main {
	public static void main(String[] args) {
		double ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();
			double ak = (30 *  h) + (0.5 * m);
			double bk = 6 * m;
			double kakudo = Math.abs(ak - bk);
			System.err.println(kakudo);
			ak = a * a;
			bk = b * b;
			double tmp = 2 * a * b * Math.cos(Math.toRadians(kakudo));
			ans = ak + bk - tmp;
			System.err.println(tmp);
			ans = Math.sqrt(ans);
		System.out.println(ans);
		sc.close();
	}
}
