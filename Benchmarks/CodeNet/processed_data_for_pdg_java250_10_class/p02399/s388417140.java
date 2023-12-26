public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double dbA = 1.00000 * a;
		int b = scan.nextInt();
		double dbB = 1.00000 * b;
		scan.close();
		int d = a / b;
		int r = a % b;
		double f = dbA / dbB;
		System.out.print(d + " " +r + " ");
		System.out.printf("%.5f", f);
	}
}
