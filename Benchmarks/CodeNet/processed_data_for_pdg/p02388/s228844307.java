public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		double numA = Math.pow(x, 3);
		int numB = (int) numA;
		System.out.println(numB);
		sc.close();
	}
}
