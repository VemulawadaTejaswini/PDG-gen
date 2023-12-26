public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double h = scan.nextDouble();
		double m = scan.nextDouble();
		double zishinKakudo = (Math.PI * h / 6.0) + (Math.PI * m / 6.0 / 60.0);
		double hunshinKakudo = Math.PI * 2.0 * m / 60.0;
		double diffOfKakudo = Math.abs(zishinKakudo - hunshinKakudo);
		double L = Math.pow(a, 2) + Math.pow(b, 2) - (2.0 * a * b * Math.cos(diffOfKakudo));
		double l = Math.sqrt(L);
		System.out.println(l);
	}
}
