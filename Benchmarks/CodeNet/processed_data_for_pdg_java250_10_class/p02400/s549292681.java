public class Main {
	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		double l = 2 * r * Math.PI;
		double s = r * r * Math.PI;
		System.out.printf("%f %f",s,l);
		sc.close();
	}
}
