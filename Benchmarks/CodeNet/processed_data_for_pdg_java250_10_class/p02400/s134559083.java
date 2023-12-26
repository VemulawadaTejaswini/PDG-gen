public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		scan.close();
		double dbPi = Math.PI;
		double outLine = 2 * dbPi * r;
		double area = dbPi * (r * r);
		System.out.printf("%.6f",area);
		System.out.printf(" " + "%.6f",outLine);
	}
}
