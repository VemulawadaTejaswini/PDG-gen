public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double t1 = (h + m / 60.0) / 12.0;
		double t2 = m / 60.0;
		double r = Math.toRadians(Math.abs(t2 - t1) * 360.0);
		double ans = a * a + b * b - 2 * a * b * Math.cos(r);
		System.out.println(Math.sqrt(ans));
	}
}
