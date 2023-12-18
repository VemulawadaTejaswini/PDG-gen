public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		int b = 3;
		a = sc.nextDouble();
		double num = Math.pow(a, b);
		int num2 = (int) num;
		System.out.println(num2);
		sc.close();
	}
}
