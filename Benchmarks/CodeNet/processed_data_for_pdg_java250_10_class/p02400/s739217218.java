public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double r = sc.nextDouble();
		double mennseki = r * r * Math.PI;
		double ennshuu = 2 * r * Math.PI;
		System.out.printf("%f %f\n", mennseki, ennshuu);
	}
}
