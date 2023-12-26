public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double H = scan.nextDouble();
		double M = scan.nextDouble();
		double Ax;
		double Ay;
		double Bx;
		double By;
		double AB;
		double AB2;
		double sita = H/12+M/60/12-M/60;
		double sita2;
		AB = Math.sqrt(A*A+B*B-2*A*B*Math.cos(2*Math.PI*sita));
		System.out.println(AB);
	}
}
