public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = Double.parseDouble(scan.next());
		double area = r * r * Math.PI;
		double length = 2 * r * Math.PI;
		System.out.printf("%.6f %.6f",  area, length);
	}
}
